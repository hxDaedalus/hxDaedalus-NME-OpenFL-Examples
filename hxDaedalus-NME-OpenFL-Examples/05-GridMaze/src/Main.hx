
import hxDaedalus.ai.EntityAI;
import hxDaedalus.ai.PathFinder;
import hxDaedalus.ai.trajectory.LinearPathSampler;
import hxDaedalus.data.ConstraintSegment;
import hxDaedalus.data.Edge;
import hxDaedalus.data.Mesh;
import hxDaedalus.data.Object;
import hxDaedalus.data.math.Point2D;
import hxDaedalus.data.math.RandGenerator;
import hxDaedalus.data.Vertex;
import hxDaedalus.factories.RectMesh;
import hxDaedalus.view.SimpleView;
import openfl.display.Bitmap;
import openfl.display.BitmapData;

import flash.Lib;
import flash.display.Sprite;
import flash.display.Bitmap;
import flash.display.BitmapData;
import flash.events.Event;
import flash.events.MouseEvent;
import flash.events.KeyboardEvent;


class Main extends Sprite
{
    
    var mesh : Mesh;
    var meshView : SimpleView;
    var pathView : SimpleView;
    
    var entityAI : EntityAI;
    var pathfinder : PathFinder;
    var path : Array<Float>;
    var pathSampler : LinearPathSampler;
    
    var newPath:Bool = false;
	
	var rows:Int = 15;
	var cols:Int = 15;

	var meshBMD:BitmapData;
	var pathBMD:BitmapData;
	var pathSprite:Sprite;
	var meshSprite:Sprite;
	
    
    public static function main():Void {
        Lib.current.addChild(new Main());
    }
    
    public function new() {
        super();
        
		// build a rectangular 2 polygons mesh of 600x600
        mesh = RectMesh.buildRectangle(600, 600);
        
        // create two viewports
		pathSprite = new Sprite();
		meshSprite = new Sprite();
        
		pathView = new SimpleView(pathSprite.graphics);
		meshView = new SimpleView(meshSprite.graphics);
        
		GridMaze.generate(600, 600, cols, rows);
		mesh.insertObject(GridMaze.object);
		
		meshBMD = new BitmapData(600, 600, true, 0);
		addChild(new Bitmap(meshBMD));
		
		pathBMD = new BitmapData(600, 600, true, 0);
		addChild(new Bitmap(pathBMD));
		
        meshView.constraintsWidth = 4;
		meshView.drawMesh(mesh);
		stampSprite(meshSprite, meshBMD);
		
		// we need an entity
        entityAI = new EntityAI();
        // set radius as size for your entity
        entityAI.radius = GridMaze.tileWidth * .3;
        // set a position
        entityAI.x = GridMaze.tileWidth / 2;
        entityAI.y = GridMaze.tileHeight / 2;
        
        // show entity on screen
        pathView.drawEntity(entityAI);
		stampSprite(pathSprite, pathBMD);
        
        // now configure the pathfinder
        pathfinder = new PathFinder();
        pathfinder.entity = entityAI;  // set the entity  
        pathfinder.mesh = mesh;  // set the mesh  
        
        // we need a vector to store the path
        path = new Array<Float>();
        
        // then configure the path sampler
        pathSampler = new LinearPathSampler();
        pathSampler.entity = entityAI;
        pathSampler.samplingDistance = GridMaze.tileWidth * .7;
        pathSampler.path = path;
        
        // click/drag
        Lib.current.stage.addEventListener(MouseEvent.MOUSE_DOWN, onMouseDown);
        Lib.current.stage.addEventListener(MouseEvent.MOUSE_UP, onMouseUp);
        
        // animate
        Lib.current.stage.addEventListener(Event.ENTER_FRAME, onEnterFrame);
        
        // key presses
        Lib.current.stage.addEventListener(KeyboardEvent.KEY_DOWN, onKeyDown);
	}
    
	function stampSprite(sprite:Sprite, bitmapData:BitmapData, clearBefore:Bool = false) {
		if (clearBefore) bitmapData.fillRect(bitmapData.rect, 0);
		bitmapData.draw(sprite);
	}
	
    function onMouseUp( event: MouseEvent ): Void {
		newPath = false;
    }
    
    function onMouseDown( event: MouseEvent ): Void {
        newPath = true;
    }
    
    function onEnterFrame( event: Event ): Void {
        if ( newPath ) {
			pathView.graphics.clear();
			
			// find path !
            pathfinder.findPath( stage.mouseX, stage.mouseY, path );
            
			// show path on screen
            pathView.drawPath( path );
            
			// reset the path sampler to manage new generated path
            pathSampler.reset();
			
			// show entity position on screen
			pathView.drawEntity(entityAI);
			stampSprite(pathSprite, pathBMD, true);
        }
        
        // animate !
        if ( pathSampler.hasNext ) {
            // move entity
            pathSampler.next();            
			
			// show entity position on screen
			pathView.drawEntity(entityAI);
			stampSprite(pathSprite, pathBMD);
        }
    }
    
    function onKeyDown( event:KeyboardEvent ): Void {
        if( event.keyCode == 27 ) {  // ESC
		#if flash
			flash.system.System.exit(1);
		#elseif sys
			Sys.exit(1);
		#end
        } else if (event.keyCode == 32) { // SPACE
			reset(true);
		} else if (event.keyCode == 13) { // ENTER
			reset(false);
		}
    }

	function reset(newMaze:Bool = false):Void {
		var seed = Std.int(Math.random() * 10000 + 1000);
		if (newMaze) {
			mesh = RectMesh.buildRectangle(600, 600);
			GridMaze.generate(600, 600, 30, 30, seed);
			GridMaze.object.scaleX = .92;
			GridMaze.object.scaleY = .92;
			GridMaze.object.x = 23;
			GridMaze.object.y = 23;
			mesh.insertObject(GridMaze.object);
		}
        entityAI.radius = GridMaze.tileWidth * .27;
		meshView.drawMesh(mesh, true);
        pathSampler.samplingDistance = GridMaze.tileWidth * .7;
		stampSprite(meshSprite, meshBMD, true);
		pathfinder.mesh = mesh;
		entityAI.x = GridMaze.tileWidth / 2;
		entityAI.y = GridMaze.tileHeight / 2;
		pathView.drawEntity(entityAI, true);
		stampSprite(pathSprite, pathBMD, true);
		path = [];
		pathSampler.path = path;
	}
}
