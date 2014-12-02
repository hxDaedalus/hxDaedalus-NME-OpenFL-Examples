package hxDaedalus.data;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Mesh extends haxe.lang.HxObject
{
	static 
	{
		hxDaedalus.data.Mesh.INC = 0;
	}
	public    Mesh(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    Mesh(double width, double height)
	{
		hxDaedalus.data.Mesh.__hx_ctor_hxDaedalus_data_Mesh(this, width, height);
	}
	
	
	public static   void __hx_ctor_hxDaedalus_data_Mesh(hxDaedalus.data.Mesh __temp_me19, double width, double height)
	{
		__temp_me19.__objectsUpdateInProgress = false;
		__temp_me19.__edgesToCheck = null;
		__temp_me19.__centerVertex = null;
		__temp_me19._objects = null;
		__temp_me19._constraintShapes = null;
		__temp_me19._faces = null;
		__temp_me19._edges = null;
		__temp_me19._vertices = null;
		__temp_me19._clipping = false;
		__temp_me19._height = ((double) (((int) (0.0) )) );
		__temp_me19._width = ((double) (((int) (0.0) )) );
		int _0 = hxDaedalus.data.Mesh.INC;
		__temp_me19._id = _0;
		hxDaedalus.data.Mesh.INC++;
		__temp_me19._width = width;
		__temp_me19._height = height;
		__temp_me19._clipping = true;
		haxe.root.Array<hxDaedalus.data.Vertex> _1 = new haxe.root.Array<hxDaedalus.data.Vertex>();
		__temp_me19._vertices = _1;
		haxe.root.Array<hxDaedalus.data.Edge> _2 = new haxe.root.Array<hxDaedalus.data.Edge>();
		__temp_me19._edges = _2;
		haxe.root.Array<hxDaedalus.data.Face> _3 = new haxe.root.Array<hxDaedalus.data.Face>();
		__temp_me19._faces = _3;
		haxe.root.Array<hxDaedalus.data.ConstraintShape> _4 = new haxe.root.Array<hxDaedalus.data.ConstraintShape>();
		__temp_me19._constraintShapes = _4;
		haxe.root.Array<hxDaedalus.data.Object> _5 = new haxe.root.Array<hxDaedalus.data.Object>();
		__temp_me19._objects = _5;
		haxe.root.Array<hxDaedalus.data.Edge> _6 = new haxe.root.Array<hxDaedalus.data.Edge>();
		__temp_me19.__edgesToCheck = _6;
	}
	
	
	public static  int INC;
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new hxDaedalus.data.Mesh(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new hxDaedalus.data.Mesh(((double) (haxe.lang.Runtime.toDouble(arr.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(arr.__get(1))) ));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public  int _id;
	
	public  double _width;
	
	public  double _height;
	
	public  boolean _clipping;
	
	public  haxe.root.Array<hxDaedalus.data.Vertex> _vertices;
	
	public  haxe.root.Array<hxDaedalus.data.Edge> _edges;
	
	public  haxe.root.Array<hxDaedalus.data.Face> _faces;
	
	public  haxe.root.Array<hxDaedalus.data.ConstraintShape> _constraintShapes;
	
	public  haxe.root.Array<hxDaedalus.data.Object> _objects;
	
	public  hxDaedalus.data.Vertex __centerVertex;
	
	public  haxe.root.Array<hxDaedalus.data.Edge> __edgesToCheck;
	
	public   double get_height()
	{
		double _0 = this._height;
		return _0;
	}
	
	
	public   double get_width()
	{
		double _0 = this._width;
		return _0;
	}
	
	
	public   boolean get_clipping()
	{
		boolean _0 = this._clipping;
		return _0;
	}
	
	
	public   boolean set_clipping(boolean value)
	{
		this._clipping = value;
		return value;
	}
	
	
	public   int get_id()
	{
		int _0 = this._id;
		return _0;
	}
	
	
	public   void dispose()
	{
		while (true)
		{
			int _0 = this._vertices.length;
			boolean _1 = ( _0 > 0 );
			boolean _2 =  ! (_1) ;
			if (_2) 
			{
				break;
			}
			
			this._vertices.pop().dispose();
		}
		
		haxe.root.Array<hxDaedalus.data.Vertex> _3 = null;
		this._vertices = _3;
		while (true)
		{
			int _4 = this._edges.length;
			boolean _5 = ( _4 > 0 );
			boolean _6 =  ! (_5) ;
			if (_6) 
			{
				break;
			}
			
			this._edges.pop().dispose();
		}
		
		haxe.root.Array<hxDaedalus.data.Edge> _7 = null;
		this._edges = _7;
		while (true)
		{
			int _8 = this._faces.length;
			boolean _9 = ( _8 > 0 );
			boolean _10 =  ! (_9) ;
			if (_10) 
			{
				break;
			}
			
			this._faces.pop().dispose();
		}
		
		haxe.root.Array<hxDaedalus.data.Face> _11 = null;
		this._faces = _11;
		while (true)
		{
			int _12 = this._constraintShapes.length;
			boolean _13 = ( _12 > 0 );
			boolean _14 =  ! (_13) ;
			if (_14) 
			{
				break;
			}
			
			this._constraintShapes.pop().dispose();
		}
		
		haxe.root.Array<hxDaedalus.data.ConstraintShape> _15 = null;
		this._constraintShapes = _15;
		while (true)
		{
			int _16 = this._objects.length;
			boolean _17 = ( _16 > 0 );
			boolean _18 =  ! (_17) ;
			if (_18) 
			{
				break;
			}
			
			this._objects.pop().dispose();
		}
		
		haxe.root.Array<hxDaedalus.data.Object> _19 = null;
		this._objects = _19;
		haxe.root.Array<hxDaedalus.data.Edge> _20 = null;
		this.__edgesToCheck = _20;
		this.__centerVertex = null;
	}
	
	
	public   haxe.root.Array<hxDaedalus.data.ConstraintShape> get___constraintShapes()
	{
		haxe.root.Array<hxDaedalus.data.ConstraintShape> _0 = this._constraintShapes;
		return _0;
	}
	
	
	public   void buildFromRecord(java.lang.String rec)
	{
		haxe.root.Array<java.lang.String> _0 = haxe.lang.StringExt.split(rec, ";");
		haxe.root.Array positions = ((haxe.root.Array) (_0) );
		int i = 0;
		while (true)
		{
			int _1 = positions.length;
			boolean _2 = ( i < _1 );
			boolean _3 =  ! (_2) ;
			if (_3) 
			{
				break;
			}
			
			haxe.root.Array _4 = positions;
			java.lang.Object _5 = _4.__get(i);
			double _6 = haxe.root.Std.parseFloat(haxe.lang.Runtime.toString(_5));
			haxe.root.Array _7 = positions;
			int _8 = ( i + 1 );
			java.lang.Object _9 = _7.__get(_8);
			double _10 = haxe.root.Std.parseFloat(haxe.lang.Runtime.toString(_9));
			haxe.root.Array _11 = positions;
			int _12 = ( i + 2 );
			java.lang.Object _13 = _11.__get(_12);
			double _14 = haxe.root.Std.parseFloat(haxe.lang.Runtime.toString(_13));
			haxe.root.Array _15 = positions;
			int _16 = ( i + 3 );
			java.lang.Object _17 = _15.__get(_16);
			double _18 = haxe.root.Std.parseFloat(haxe.lang.Runtime.toString(_17));
			this.insertConstraintSegment(_6, _10, _14, _18);
			i += 4;
		}
		
	}
	
	
	public   void insertObject(hxDaedalus.data.Object object)
	{
		hxDaedalus.data.ConstraintShape _0 = object.get_constraintShape();
		boolean _1 = ( _0 != null );
		if (_1) 
		{
			this.deleteObject(object);
		}
		
		hxDaedalus.data.ConstraintShape _2 = new hxDaedalus.data.ConstraintShape();
		hxDaedalus.data.ConstraintShape shape = _2;
		hxDaedalus.data.ConstraintSegment segment = null;
		haxe.root.Array<java.lang.Object> _3 = object.get_coordinates();
		haxe.root.Array<java.lang.Object> coordinates = _3;
		hxDaedalus.data.math.Matrix2D _4 = object.get_matrix();
		hxDaedalus.data.math.Matrix2D m = _4;
		object.updateMatrixFromValues();
		double x1 = 0.0;
		double y1 = 0.0;
		double x2 = 0.0;
		double y2 = 0.0;
		double transfx1 = 0.0;
		double transfy1 = 0.0;
		double transfx2 = 0.0;
		double transfy2 = 0.0;
		int i = 0;
		while (true)
		{
			int _5 = coordinates.length;
			boolean _6 = ( i < _5 );
			boolean _7 =  ! (_6) ;
			if (_7) 
			{
				break;
			}
			
			haxe.root.Array<java.lang.Object> _8 = coordinates;
			double _9 = ((double) (haxe.lang.Runtime.toDouble(_8.__get(i))) );
			x1 = _9;
			haxe.root.Array<java.lang.Object> _10 = coordinates;
			int _11 = ( i + 1 );
			double _12 = ((double) (haxe.lang.Runtime.toDouble(_10.__get(_11))) );
			y1 = _12;
			haxe.root.Array<java.lang.Object> _13 = coordinates;
			int _14 = ( i + 2 );
			double _15 = ((double) (haxe.lang.Runtime.toDouble(_13.__get(_14))) );
			x2 = _15;
			haxe.root.Array<java.lang.Object> _16 = coordinates;
			int _17 = ( i + 3 );
			double _18 = ((double) (haxe.lang.Runtime.toDouble(_16.__get(_17))) );
			y2 = _18;
			double _19 = m.transformX(x1, y1);
			transfx1 = _19;
			double _20 = m.transformY(x1, y1);
			transfy1 = _20;
			double _21 = m.transformX(x2, y2);
			transfx2 = _21;
			double _22 = m.transformY(x2, y2);
			transfy2 = _22;
			hxDaedalus.data.ConstraintSegment _23 = this.insertConstraintSegment(transfx1, transfy1, transfx2, transfy2);
			segment = _23;
			boolean _24 = ( segment != null );
			if (_24) 
			{
				segment.fromShape = shape;
				shape.segments.push(segment);
			}
			
			i += 4;
		}
		
		this._constraintShapes.push(shape);
		object.set_constraintShape(shape);
		boolean _25 = this.__objectsUpdateInProgress;
		boolean _26 =  ! (_25) ;
		if (_26) 
		{
			this._objects.push(object);
		}
		
	}
	
	
	public   void deleteObject(hxDaedalus.data.Object object)
	{
		hxDaedalus.data.ConstraintShape _0 = object.get_constraintShape();
		boolean _1 = ( _0 == null );
		if (_1) 
		{
			return ;
		}
		
		hxDaedalus.data.ConstraintShape _2 = object.get_constraintShape();
		this.deleteConstraintShape(_2);
		object.set_constraintShape(null);
		boolean _3 = this.__objectsUpdateInProgress;
		boolean _4 =  ! (_3) ;
		if (_4) 
		{
			int _5 = this._objects.indexOf(object, null);
			int index = _5;
			this._objects.splice(index, 1);
		}
		
	}
	
	
	public  boolean __objectsUpdateInProgress;
	
	public   void updateObjects()
	{
		this.__objectsUpdateInProgress = true;
		{
			int _g1 = 0;
			int _0 = this._objects.length;
			int _g = _0;
			while (true)
			{
				boolean _1 = ( _g1 < _g );
				boolean _2 =  ! (_1) ;
				if (_2) 
				{
					break;
				}
				
				int _3 = _g1++;
				int i = _3;
				haxe.root.Array<hxDaedalus.data.Object> _4 = this._objects;
				boolean _5 = _4.__get(i).get_hasChanged();
				if (_5) 
				{
					haxe.root.Array<hxDaedalus.data.Object> _6 = this._objects;
					hxDaedalus.data.Object _7 = _6.__get(i);
					this.deleteObject(_7);
					haxe.root.Array<hxDaedalus.data.Object> _8 = this._objects;
					hxDaedalus.data.Object _9 = _8.__get(i);
					this.insertObject(_9);
					haxe.root.Array<hxDaedalus.data.Object> _10 = this._objects;
					_10.__get(i).set_hasChanged(false);
				}
				
			}
			
		}
		
		this.__objectsUpdateInProgress = false;
	}
	
	
	public   hxDaedalus.data.ConstraintShape insertConstraintShape(haxe.root.Array<java.lang.Object> coordinates)
	{
		hxDaedalus.data.ConstraintShape _0 = new hxDaedalus.data.ConstraintShape();
		hxDaedalus.data.ConstraintShape shape = _0;
		hxDaedalus.data.ConstraintSegment segment = null;
		int i = 0;
		while (true)
		{
			int _1 = coordinates.length;
			boolean _2 = ( i < _1 );
			boolean _3 =  ! (_2) ;
			if (_3) 
			{
				break;
			}
			
			haxe.root.Array<java.lang.Object> _4 = coordinates;
			double _5 = ((double) (haxe.lang.Runtime.toDouble(_4.__get(i))) );
			haxe.root.Array<java.lang.Object> _6 = coordinates;
			int _7 = ( i + 1 );
			double _8 = ((double) (haxe.lang.Runtime.toDouble(_6.__get(_7))) );
			haxe.root.Array<java.lang.Object> _9 = coordinates;
			int _10 = ( i + 2 );
			double _11 = ((double) (haxe.lang.Runtime.toDouble(_9.__get(_10))) );
			haxe.root.Array<java.lang.Object> _12 = coordinates;
			int _13 = ( i + 3 );
			double _14 = ((double) (haxe.lang.Runtime.toDouble(_12.__get(_13))) );
			hxDaedalus.data.ConstraintSegment _15 = this.insertConstraintSegment(_5, _8, _11, _14);
			segment = _15;
			boolean _16 = ( segment != null );
			if (_16) 
			{
				segment.fromShape = shape;
				shape.segments.push(segment);
			}
			
			i += 4;
		}
		
		this._constraintShapes.push(shape);
		return shape;
	}
	
	
	public   void deleteConstraintShape(hxDaedalus.data.ConstraintShape shape)
	{
		{
			int _g1 = 0;
			int _0 = shape.segments.length;
			int _g = _0;
			while (true)
			{
				boolean _1 = ( _g1 < _g );
				boolean _2 =  ! (_1) ;
				if (_2) 
				{
					break;
				}
				
				int _3 = _g1++;
				int i = _3;
				haxe.root.Array<hxDaedalus.data.ConstraintSegment> _4 = shape.segments;
				hxDaedalus.data.ConstraintSegment _5 = _4.__get(i);
				this.deleteConstraintSegment(_5);
			}
			
		}
		
		shape.dispose();
		int _6 = this._constraintShapes.indexOf(shape, null);
		this._constraintShapes.splice(_6, 1);
	}
	
	
	public   hxDaedalus.data.ConstraintSegment insertConstraintSegment(double x1, double y1, double x2, double y2)
	{
		int _0 = this.findPositionFromBounds(x1, y1);
		int p1pos = _0;
		int _1 = this.findPositionFromBounds(x2, y2);
		int p2pos = _1;
		double newX1 = x1;
		double newY1 = y1;
		double newX2 = x2;
		double newY2 = y2;
		boolean _4 = this._clipping;
		boolean _7 = false;
		if (_4) 
		{
			boolean _5 = ( p1pos != 0 );
			boolean _2 = _5;
			boolean _6 =  ! (_2) ;
			boolean _3 = _6;
			if (_3) 
			{
				_7 = ( p2pos != 0 );
			}
			 else 
			{
				_7 = true;
			}
			
		}
		 else 
		{
			_7 = false;
		}
		
		if (_7) 
		{
			hxDaedalus.data.math.Point2D _8 = new hxDaedalus.data.math.Point2D(((java.lang.Object) (null) ), ((java.lang.Object) (null) ));
			hxDaedalus.data.math.Point2D intersectPoint = _8;
			boolean _9 = ( p1pos != 0 );
			boolean _10 = false;
			if (_9) 
			{
				_10 = ( p2pos != 0 );
			}
			 else 
			{
				_10 = false;
			}
			
			if (_10) 
			{
				boolean _11 = ( x1 <= 0 );
				boolean _16 = false;
				if (_11) 
				{
					_16 = ( x2 <= 0 );
				}
				 else 
				{
					_16 = false;
				}
				
				boolean _17 =  ! (_16) ;
				boolean _25 = false;
				if (_17) 
				{
					double _22 = this._width;
					double _18 = _22;
					double _12 = _18;
					boolean _23 = ( x1 >= _12 );
					boolean _19 = _23;
					boolean _14 = _19;
					if (_14) 
					{
						double _24 = this._width;
						double _20 = _24;
						double _15 = _20;
						double _13 = _15;
						_25 = ( x2 >= _13 );
					}
					 else 
					{
						_25 = false;
					}
					
				}
				 else 
				{
					_25 = true;
				}
				
				boolean _26 =  ! (_25) ;
				boolean _33 = false;
				if (_26) 
				{
					boolean _32 = ( y1 <= 0 );
					boolean _27 = _32;
					boolean _21 = _27;
					if (_21) 
					{
						_33 = ( y2 <= 0 );
					}
					 else 
					{
						_33 = false;
					}
					
				}
				 else 
				{
					_33 = true;
				}
				
				boolean _34 =  ! (_33) ;
				boolean _38 = false;
				if (_34) 
				{
					double _35 = this._height;
					double _28 = _35;
					boolean _36 = ( y1 >= _28 );
					boolean _30 = _36;
					if (_30) 
					{
						double _37 = this._height;
						double _31 = _37;
						double _29 = _31;
						_38 = ( y2 >= _29 );
					}
					 else 
					{
						_38 = false;
					}
					
				}
				 else 
				{
					_38 = true;
				}
				
				if (_38) 
				{
					return null;
				}
				
				boolean _39 = ( p1pos == 8 );
				boolean _41 = false;
				if (_39) 
				{
					_41 = ( p2pos == 4 );
				}
				 else 
				{
					_41 = false;
				}
				
				boolean _42 =  ! (_41) ;
				boolean _44 = false;
				if (_42) 
				{
					boolean _43 = ( p1pos == 4 );
					boolean _40 = _43;
					if (_40) 
					{
						_44 = ( p2pos == 8 );
					}
					 else 
					{
						_44 = false;
					}
					
				}
				 else 
				{
					_44 = true;
				}
				
				if (_44) 
				{
					double _45 = this._height;
					haxe.root.Array<java.lang.Object> _46 = null;
					hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, ((double) (0) ), ((double) (0) ), ((double) (0) ), _45, intersectPoint, _46, null);
					double _47 = intersectPoint.x;
					newX1 = _47;
					double _48 = intersectPoint.y;
					newY1 = _48;
					double _49 = this._width;
					double _50 = this._width;
					double _51 = this._height;
					haxe.root.Array<java.lang.Object> _52 = null;
					hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, _49, ((double) (0) ), _50, _51, intersectPoint, _52, null);
					double _53 = intersectPoint.x;
					newX2 = _53;
					double _54 = intersectPoint.y;
					newY2 = _54;
				}
				 else 
				{
					boolean _55 = ( p1pos == 2 );
					boolean _57 = false;
					if (_55) 
					{
						_57 = ( p2pos == 6 );
					}
					 else 
					{
						_57 = false;
					}
					
					boolean _58 =  ! (_57) ;
					boolean _60 = false;
					if (_58) 
					{
						boolean _59 = ( p1pos == 6 );
						boolean _56 = _59;
						if (_56) 
						{
							_60 = ( p2pos == 2 );
						}
						 else 
						{
							_60 = false;
						}
						
					}
					 else 
					{
						_60 = true;
					}
					
					if (_60) 
					{
						double _61 = this._width;
						haxe.root.Array<java.lang.Object> _62 = null;
						hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, ((double) (0) ), ((double) (0) ), _61, ((double) (0) ), intersectPoint, _62, null);
						double _63 = intersectPoint.x;
						newX1 = _63;
						double _64 = intersectPoint.y;
						newY1 = _64;
						double _65 = this._height;
						double _66 = this._width;
						double _67 = this._height;
						haxe.root.Array<java.lang.Object> _68 = null;
						hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, ((double) (0) ), _65, _66, _67, intersectPoint, _68, null);
						double _69 = intersectPoint.x;
						newX2 = _69;
						double _70 = intersectPoint.y;
						newY2 = _70;
					}
					 else 
					{
						boolean _71 = ( p1pos == 2 );
						boolean _73 = false;
						if (_71) 
						{
							_73 = ( p2pos == 8 );
						}
						 else 
						{
							_73 = false;
						}
						
						boolean _74 =  ! (_73) ;
						boolean _76 = false;
						if (_74) 
						{
							boolean _75 = ( p1pos == 8 );
							boolean _72 = _75;
							if (_72) 
							{
								_76 = ( p2pos == 2 );
							}
							 else 
							{
								_76 = false;
							}
							
						}
						 else 
						{
							_76 = true;
						}
						
						if (_76) 
						{
							double _77 = this._width;
							haxe.root.Array<java.lang.Object> _78 = null;
							boolean _79 = hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, ((double) (0) ), ((double) (0) ), _77, ((double) (0) ), intersectPoint, _78, null);
							if (_79) 
							{
								double _80 = intersectPoint.x;
								newX1 = _80;
								double _81 = intersectPoint.y;
								newY1 = _81;
								double _82 = this._height;
								haxe.root.Array<java.lang.Object> _83 = null;
								hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, ((double) (0) ), ((double) (0) ), ((double) (0) ), _82, intersectPoint, _83, null);
								double _84 = intersectPoint.x;
								newX2 = _84;
								double _85 = intersectPoint.y;
								newY2 = _85;
							}
							 else 
							{
								return null;
							}
							
						}
						 else 
						{
							boolean _86 = ( p1pos == 2 );
							boolean _88 = false;
							if (_86) 
							{
								_88 = ( p2pos == 4 );
							}
							 else 
							{
								_88 = false;
							}
							
							boolean _89 =  ! (_88) ;
							boolean _91 = false;
							if (_89) 
							{
								boolean _90 = ( p1pos == 4 );
								boolean _87 = _90;
								if (_87) 
								{
									_91 = ( p2pos == 2 );
								}
								 else 
								{
									_91 = false;
								}
								
							}
							 else 
							{
								_91 = true;
							}
							
							if (_91) 
							{
								double _92 = this._width;
								haxe.root.Array<java.lang.Object> _93 = null;
								boolean _94 = hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, ((double) (0) ), ((double) (0) ), _92, ((double) (0) ), intersectPoint, _93, null);
								if (_94) 
								{
									double _95 = intersectPoint.x;
									newX1 = _95;
									double _96 = intersectPoint.y;
									newY1 = _96;
									double _97 = this._width;
									double _98 = this._width;
									double _99 = this._height;
									haxe.root.Array<java.lang.Object> _100 = null;
									hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, _97, ((double) (0) ), _98, _99, intersectPoint, _100, null);
									double _101 = intersectPoint.x;
									newX2 = _101;
									double _102 = intersectPoint.y;
									newY2 = _102;
								}
								 else 
								{
									return null;
								}
								
							}
							 else 
							{
								boolean _103 = ( p1pos == 6 );
								boolean _105 = false;
								if (_103) 
								{
									_105 = ( p2pos == 4 );
								}
								 else 
								{
									_105 = false;
								}
								
								boolean _106 =  ! (_105) ;
								boolean _108 = false;
								if (_106) 
								{
									boolean _107 = ( p1pos == 4 );
									boolean _104 = _107;
									if (_104) 
									{
										_108 = ( p2pos == 6 );
									}
									 else 
									{
										_108 = false;
									}
									
								}
								 else 
								{
									_108 = true;
								}
								
								if (_108) 
								{
									double _109 = this._height;
									double _110 = this._width;
									double _111 = this._height;
									haxe.root.Array<java.lang.Object> _112 = null;
									boolean _113 = hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, ((double) (0) ), _109, _110, _111, intersectPoint, _112, null);
									if (_113) 
									{
										double _114 = intersectPoint.x;
										newX1 = _114;
										double _115 = intersectPoint.y;
										newY1 = _115;
										double _116 = this._width;
										double _117 = this._width;
										double _118 = this._height;
										haxe.root.Array<java.lang.Object> _119 = null;
										hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, _116, ((double) (0) ), _117, _118, intersectPoint, _119, null);
										double _120 = intersectPoint.x;
										newX2 = _120;
										double _121 = intersectPoint.y;
										newY2 = _121;
									}
									 else 
									{
										return null;
									}
									
								}
								 else 
								{
									boolean _122 = ( p1pos == 8 );
									boolean _124 = false;
									if (_122) 
									{
										_124 = ( p2pos == 6 );
									}
									 else 
									{
										_124 = false;
									}
									
									boolean _125 =  ! (_124) ;
									boolean _127 = false;
									if (_125) 
									{
										boolean _126 = ( p1pos == 6 );
										boolean _123 = _126;
										if (_123) 
										{
											_127 = ( p2pos == 8 );
										}
										 else 
										{
											_127 = false;
										}
										
									}
									 else 
									{
										_127 = true;
									}
									
									if (_127) 
									{
										double _128 = this._height;
										double _129 = this._width;
										double _130 = this._height;
										haxe.root.Array<java.lang.Object> _131 = null;
										boolean _132 = hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, ((double) (0) ), _128, _129, _130, intersectPoint, _131, null);
										if (_132) 
										{
											double _133 = intersectPoint.x;
											newX1 = _133;
											double _134 = intersectPoint.y;
											newY1 = _134;
											double _135 = this._height;
											haxe.root.Array<java.lang.Object> _136 = null;
											hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, ((double) (0) ), ((double) (0) ), ((double) (0) ), _135, intersectPoint, _136, null);
											double _137 = intersectPoint.x;
											newX2 = _137;
											double _138 = intersectPoint.y;
											newY2 = _138;
										}
										 else 
										{
											return null;
										}
										
									}
									 else 
									{
										boolean firstDone = false;
										boolean secondDone = false;
										double _139 = this._width;
										haxe.root.Array<java.lang.Object> _140 = null;
										boolean _141 = hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, ((double) (0) ), ((double) (0) ), _139, ((double) (0) ), intersectPoint, _140, null);
										if (_141) 
										{
											double _142 = intersectPoint.x;
											newX1 = _142;
											double _143 = intersectPoint.y;
											newY1 = _143;
											firstDone = true;
										}
										
										double _144 = this._width;
										double _145 = this._width;
										double _146 = this._height;
										haxe.root.Array<java.lang.Object> _147 = null;
										boolean _148 = hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, _144, ((double) (0) ), _145, _146, intersectPoint, _147, null);
										if (_148) 
										{
											boolean _149 =  ! (firstDone) ;
											if (_149) 
											{
												double _150 = intersectPoint.x;
												newX1 = _150;
												double _151 = intersectPoint.y;
												newY1 = _151;
												firstDone = true;
											}
											 else 
											{
												double _152 = intersectPoint.x;
												newX2 = _152;
												double _153 = intersectPoint.y;
												newY2 = _153;
												secondDone = true;
											}
											
										}
										
										boolean _158 =  ! (secondDone) ;
										boolean _164 = false;
										if (_158) 
										{
											double _159 = this._height;
											double _154 = _159;
											double _160 = this._width;
											double _155 = _160;
											double _161 = this._height;
											double _156 = _161;
											haxe.root.Array<java.lang.Object> _162 = null;
											haxe.root.Array<java.lang.Object> _157 = _162;
											haxe.root.Array<java.lang.Object> _163 = _157;
											_164 = hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, ((double) (0) ), _154, _155, _156, intersectPoint, _163, null);
										}
										 else 
										{
											_164 = false;
										}
										
										if (_164) 
										{
											boolean _165 =  ! (firstDone) ;
											if (_165) 
											{
												double _166 = intersectPoint.x;
												newX1 = _166;
												double _167 = intersectPoint.y;
												newY1 = _167;
												firstDone = true;
											}
											 else 
											{
												double _168 = intersectPoint.x;
												newX2 = _168;
												double _169 = intersectPoint.y;
												newY2 = _169;
												secondDone = true;
											}
											
										}
										
										boolean _172 =  ! (secondDone) ;
										boolean _176 = false;
										if (_172) 
										{
											double _173 = this._height;
											double _170 = _173;
											haxe.root.Array<java.lang.Object> _174 = null;
											haxe.root.Array<java.lang.Object> _171 = _174;
											haxe.root.Array<java.lang.Object> _175 = _171;
											_176 = hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, ((double) (0) ), ((double) (0) ), ((double) (0) ), _170, intersectPoint, _175, null);
										}
										 else 
										{
											_176 = false;
										}
										
										if (_176) 
										{
											double _177 = intersectPoint.x;
											newX2 = _177;
											double _178 = intersectPoint.y;
											newY2 = _178;
										}
										
										boolean _179 =  ! (firstDone) ;
										if (_179) 
										{
											return null;
										}
										
									}
									
								}
								
							}
							
						}
						
					}
					
				}
				
			}
			 else 
			{
				boolean _180 = ( p1pos == 2 );
				boolean _181 =  ! (_180) ;
				boolean _182 = false;
				if (_181) 
				{
					_182 = ( p2pos == 2 );
				}
				 else 
				{
					_182 = true;
				}
				
				if (_182) 
				{
					double _183 = this._width;
					haxe.root.Array<java.lang.Object> _184 = null;
					hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, ((double) (0) ), ((double) (0) ), _183, ((double) (0) ), intersectPoint, _184, null);
				}
				 else 
				{
					boolean _185 = ( p1pos == 4 );
					boolean _186 =  ! (_185) ;
					boolean _187 = false;
					if (_186) 
					{
						_187 = ( p2pos == 4 );
					}
					 else 
					{
						_187 = true;
					}
					
					if (_187) 
					{
						double _188 = this._width;
						double _189 = this._width;
						double _190 = this._height;
						haxe.root.Array<java.lang.Object> _191 = null;
						hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, _188, ((double) (0) ), _189, _190, intersectPoint, _191, null);
					}
					 else 
					{
						boolean _192 = ( p1pos == 6 );
						boolean _193 =  ! (_192) ;
						boolean _194 = false;
						if (_193) 
						{
							_194 = ( p2pos == 6 );
						}
						 else 
						{
							_194 = true;
						}
						
						if (_194) 
						{
							double _195 = this._height;
							double _196 = this._width;
							double _197 = this._height;
							haxe.root.Array<java.lang.Object> _198 = null;
							hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, ((double) (0) ), _195, _196, _197, intersectPoint, _198, null);
						}
						 else 
						{
							boolean _199 = ( p1pos == 8 );
							boolean _200 =  ! (_199) ;
							boolean _201 = false;
							if (_200) 
							{
								_201 = ( p2pos == 8 );
							}
							 else 
							{
								_201 = true;
							}
							
							if (_201) 
							{
								double _202 = this._height;
								haxe.root.Array<java.lang.Object> _203 = null;
								hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, ((double) (0) ), ((double) (0) ), ((double) (0) ), _202, intersectPoint, _203, null);
							}
							 else 
							{
								double _204 = this._width;
								haxe.root.Array<java.lang.Object> _205 = null;
								boolean _206 = hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, ((double) (0) ), ((double) (0) ), _204, ((double) (0) ), intersectPoint, _205, null);
								boolean _207 =  ! (_206) ;
								if (_207) 
								{
									double _208 = this._width;
									double _209 = this._width;
									double _210 = this._height;
									haxe.root.Array<java.lang.Object> _211 = null;
									boolean _212 = hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, _208, ((double) (0) ), _209, _210, intersectPoint, _211, null);
									boolean _213 =  ! (_212) ;
									if (_213) 
									{
										double _214 = this._height;
										double _215 = this._width;
										double _216 = this._height;
										haxe.root.Array<java.lang.Object> _217 = null;
										boolean _218 = hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, ((double) (0) ), _214, _215, _216, intersectPoint, _217, null);
										boolean _219 =  ! (_218) ;
										if (_219) 
										{
											double _220 = this._height;
											haxe.root.Array<java.lang.Object> _221 = null;
											hxDaedalus.data.math.Geom2D.intersections2segments(x1, y1, x2, y2, ((double) (0) ), ((double) (0) ), ((double) (0) ), _220, intersectPoint, _221, null);
										}
										
									}
									
								}
								
							}
							
						}
						
					}
					
				}
				
				boolean _222 = ( p1pos == 0 );
				if (_222) 
				{
					newX1 = x1;
					newY1 = y1;
				}
				 else 
				{
					newX1 = x2;
					newY1 = y2;
				}
				
				double _223 = intersectPoint.x;
				newX2 = _223;
				double _224 = intersectPoint.y;
				newY2 = _224;
			}
			
		}
		
		hxDaedalus.data.Vertex _225 = this.insertVertex(newX1, newY1);
		hxDaedalus.data.Vertex vertexDown = _225;
		boolean _226 = ( vertexDown == null );
		if (_226) 
		{
			return null;
		}
		
		hxDaedalus.data.Vertex _227 = this.insertVertex(newX2, newY2);
		hxDaedalus.data.Vertex vertexUp = _227;
		boolean _228 = ( vertexUp == null );
		if (_228) 
		{
			return null;
		}
		
		boolean _229 = ( vertexDown == vertexUp );
		if (_229) 
		{
			return null;
		}
		
		hxDaedalus.iterators.FromVertexToOutgoingEdges _230 = new hxDaedalus.iterators.FromVertexToOutgoingEdges();
		hxDaedalus.iterators.FromVertexToOutgoingEdges iterVertexToOutEdges = _230;
		hxDaedalus.data.Vertex currVertex = null;
		hxDaedalus.data.Edge currEdge = null;
		int i = 0;
		hxDaedalus.data.ConstraintSegment _231 = new hxDaedalus.data.ConstraintSegment();
		hxDaedalus.data.ConstraintSegment segment = _231;
		hxDaedalus.data.Edge _232 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge tempEdgeDownUp = _232;
		hxDaedalus.data.Edge _233 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge tempSdgeUpDown = _233;
		tempEdgeDownUp.setDatas(vertexDown, tempSdgeUpDown, null, null, true, true);
		tempSdgeUpDown.setDatas(vertexUp, tempEdgeDownUp, null, null, true, true);
		haxe.root.Array<hxDaedalus.data.Edge> _234 = new haxe.root.Array<hxDaedalus.data.Edge>();
		haxe.root.Array<hxDaedalus.data.Edge> intersectedEdges = _234;
		haxe.root.Array<hxDaedalus.data.Edge> _235 = new haxe.root.Array<hxDaedalus.data.Edge>();
		haxe.root.Array<hxDaedalus.data.Edge> leftBoundingEdges = _235;
		haxe.root.Array<hxDaedalus.data.Edge> _236 = new haxe.root.Array<hxDaedalus.data.Edge>();
		haxe.root.Array<hxDaedalus.data.Edge> rightBoundingEdges = _236;
		hxDaedalus.data.math.Intersection currObjet = null;
		hxDaedalus.data.math.Point2D _237 = new hxDaedalus.data.math.Point2D(((java.lang.Object) (null) ), ((java.lang.Object) (null) ));
		hxDaedalus.data.math.Point2D pIntersect = _237;
		hxDaedalus.data.Edge edgeLeft = null;
		hxDaedalus.data.Edge newEdgeDownUp = null;
		hxDaedalus.data.Edge newEdgeUpDown = null;
		boolean done = false;
		currVertex = vertexDown;
		hxDaedalus.data.math.Intersection _238 = hxDaedalus.data.math.Intersection.EVertex(currVertex);
		currObjet = _238;
		{
			label1:
			while (true)
			{
				boolean _239 =  ! (true) ;
				if (_239) 
				{
					break;
				}
				
				done = false;
				switch (haxe.root.Type.enumIndex(currObjet))
				{
					case 0:
					{
						hxDaedalus.data.Vertex vertex = ((hxDaedalus.data.Vertex) (currObjet.params.__get(0)) );
						{
							currVertex = vertex;
							iterVertexToOutEdges.set_fromVertex(currVertex);
							while (true)
							{
								hxDaedalus.data.Edge _240 = iterVertexToOutEdges.next();
								currEdge = _240;
								hxDaedalus.data.Edge _241 = currEdge;
								boolean _242 = ( _241 != null );
								boolean _243 =  ! (_242) ;
								if (_243) 
								{
									break;
								}
								
								hxDaedalus.data.Vertex _244 = currEdge.get_destinationVertex();
								boolean _245 = ( _244 == vertexUp );
								if (_245) 
								{
									boolean _246 = currEdge.get_isConstrained();
									boolean _247 =  ! (_246) ;
									if (_247) 
									{
										currEdge.set_isConstrained(true);
										currEdge.get_oppositeEdge().set_isConstrained(true);
									}
									
									currEdge.addFromConstraintSegment(segment);
									haxe.root.Array<hxDaedalus.data.ConstraintSegment> _248 = currEdge.fromConstraintSegments;
									currEdge.get_oppositeEdge().fromConstraintSegments = _248;
									vertexDown.addFromConstraintSegment(segment);
									vertexUp.addFromConstraintSegment(segment);
									segment.addEdge(currEdge);
									return segment;
								}
								
								hxDaedalus.data.Vertex _249 = currEdge.get_destinationVertex();
								double _250 = hxDaedalus.data.math.Geom2D.distanceSquaredVertexToEdge(_249, tempEdgeDownUp);
								boolean _251 = ( _250 <= 0.0001 );
								if (_251) 
								{
									boolean _252 = currEdge.get_isConstrained();
									boolean _253 =  ! (_252) ;
									if (_253) 
									{
										currEdge.set_isConstrained(true);
										currEdge.get_oppositeEdge().set_isConstrained(true);
									}
									
									currEdge.addFromConstraintSegment(segment);
									haxe.root.Array<hxDaedalus.data.ConstraintSegment> _254 = currEdge.fromConstraintSegments;
									currEdge.get_oppositeEdge().fromConstraintSegments = _254;
									vertexDown.addFromConstraintSegment(segment);
									segment.addEdge(currEdge);
									hxDaedalus.data.Vertex _255 = currEdge.get_destinationVertex();
									vertexDown = _255;
									tempEdgeDownUp.set_originVertex(vertexDown);
									hxDaedalus.data.math.Intersection _256 = hxDaedalus.data.math.Intersection.EVertex(vertexDown);
									currObjet = _256;
									done = true;
									break;
								}
								
							}
							
							if (done) 
							{
								boolean _257 =  ! (true) ;
								if (_257) 
								{
									break label1;
								}
								 else 
								{
									continue;
								}
								
							}
							
							iterVertexToOutEdges.set_fromVertex(currVertex);
							while (true)
							{
								hxDaedalus.data.Edge _258 = iterVertexToOutEdges.next();
								currEdge = _258;
								hxDaedalus.data.Edge _259 = currEdge;
								boolean _260 = ( _259 != null );
								boolean _261 =  ! (_260) ;
								if (_261) 
								{
									break;
								}
								
								hxDaedalus.data.Edge _262 = currEdge.get_nextLeftEdge();
								currEdge = _262;
								haxe.root.Array<java.lang.Object> _263 = null;
								boolean _264 = hxDaedalus.data.math.Geom2D.intersections2edges(currEdge, tempEdgeDownUp, pIntersect, _263, null);
								if (_264) 
								{
									boolean _265 = currEdge.get_isConstrained();
									if (_265) 
									{
										double _266 = pIntersect.x;
										double _267 = pIntersect.y;
										hxDaedalus.data.Vertex _268 = this.splitEdge(currEdge, _266, _267);
										vertexDown = _268;
										iterVertexToOutEdges.set_fromVertex(currVertex);
										while (true)
										{
											hxDaedalus.data.Edge _269 = iterVertexToOutEdges.next();
											currEdge = _269;
											hxDaedalus.data.Edge _270 = currEdge;
											boolean _271 = ( _270 != null );
											boolean _272 =  ! (_271) ;
											if (_272) 
											{
												break;
											}
											
											hxDaedalus.data.Vertex _273 = currEdge.get_destinationVertex();
											boolean _274 = ( _273 == vertexDown );
											if (_274) 
											{
												currEdge.set_isConstrained(true);
												currEdge.get_oppositeEdge().set_isConstrained(true);
												currEdge.addFromConstraintSegment(segment);
												haxe.root.Array<hxDaedalus.data.ConstraintSegment> _275 = currEdge.fromConstraintSegments;
												currEdge.get_oppositeEdge().fromConstraintSegments = _275;
												segment.addEdge(currEdge);
												break;
											}
											
										}
										
										currVertex.addFromConstraintSegment(segment);
										tempEdgeDownUp.set_originVertex(vertexDown);
										hxDaedalus.data.math.Intersection _276 = hxDaedalus.data.math.Intersection.EVertex(vertexDown);
										currObjet = _276;
									}
									 else 
									{
										intersectedEdges.push(currEdge);
										hxDaedalus.data.Edge _277 = currEdge.get_nextLeftEdge();
										leftBoundingEdges.unshift(_277);
										hxDaedalus.data.Edge _278 = currEdge.get_prevLeftEdge();
										rightBoundingEdges.push(_278);
										hxDaedalus.data.Edge _279 = currEdge.get_oppositeEdge();
										currEdge = _279;
										hxDaedalus.data.math.Intersection _280 = hxDaedalus.data.math.Intersection.EEdge(currEdge);
										currObjet = _280;
									}
									
									break;
								}
								
							}
							
						}
						
						break;
					}
					
					
					case 1:
					{
						hxDaedalus.data.Edge edge = ((hxDaedalus.data.Edge) (currObjet.params.__get(0)) );
						{
							currEdge = edge;
							hxDaedalus.data.Edge _281 = currEdge.get_nextLeftEdge();
							edgeLeft = _281;
							hxDaedalus.data.Vertex _282 = edgeLeft.get_destinationVertex();
							boolean _283 = ( _282 == vertexUp );
							if (_283) 
							{
								hxDaedalus.data.Edge _284 = edgeLeft.get_nextLeftEdge();
								leftBoundingEdges.unshift(_284);
								rightBoundingEdges.push(edgeLeft);
								hxDaedalus.data.Edge _285 = new hxDaedalus.data.Edge();
								newEdgeDownUp = _285;
								hxDaedalus.data.Edge _286 = new hxDaedalus.data.Edge();
								newEdgeUpDown = _286;
								newEdgeDownUp.setDatas(vertexDown, newEdgeUpDown, null, null, true, true);
								newEdgeUpDown.setDatas(vertexUp, newEdgeDownUp, null, null, true, true);
								leftBoundingEdges.push(newEdgeDownUp);
								rightBoundingEdges.push(newEdgeUpDown);
								haxe.root.Array<hxDaedalus.data.Edge> _287 = intersectedEdges;
								haxe.root.Array<hxDaedalus.data.Edge> _288 = leftBoundingEdges;
								haxe.root.Array<hxDaedalus.data.Edge> _289 = rightBoundingEdges;
								this.insertNewConstrainedEdge(segment, newEdgeDownUp, _287, _288, _289);
								return segment;
							}
							 else 
							{
								hxDaedalus.data.Vertex _290 = edgeLeft.get_destinationVertex();
								double _291 = hxDaedalus.data.math.Geom2D.distanceSquaredVertexToEdge(_290, tempEdgeDownUp);
								boolean _292 = ( _291 <= 0.0001 );
								if (_292) 
								{
									hxDaedalus.data.Edge _293 = edgeLeft.get_nextLeftEdge();
									leftBoundingEdges.unshift(_293);
									rightBoundingEdges.push(edgeLeft);
									hxDaedalus.data.Edge _294 = new hxDaedalus.data.Edge();
									newEdgeDownUp = _294;
									hxDaedalus.data.Edge _295 = new hxDaedalus.data.Edge();
									newEdgeUpDown = _295;
									newEdgeDownUp.setDatas(vertexDown, newEdgeUpDown, null, null, true, true);
									hxDaedalus.data.Vertex _296 = edgeLeft.get_destinationVertex();
									newEdgeUpDown.setDatas(_296, newEdgeDownUp, null, null, true, true);
									leftBoundingEdges.push(newEdgeDownUp);
									rightBoundingEdges.push(newEdgeUpDown);
									haxe.root.Array<hxDaedalus.data.Edge> _297 = intersectedEdges;
									haxe.root.Array<hxDaedalus.data.Edge> _298 = leftBoundingEdges;
									haxe.root.Array<hxDaedalus.data.Edge> _299 = rightBoundingEdges;
									this.insertNewConstrainedEdge(segment, newEdgeDownUp, _297, _298, _299);
									int _300 = intersectedEdges.length;
									intersectedEdges.splice(0, _300);
									int _301 = leftBoundingEdges.length;
									leftBoundingEdges.splice(0, _301);
									int _302 = rightBoundingEdges.length;
									rightBoundingEdges.splice(0, _302);
									hxDaedalus.data.Vertex _303 = edgeLeft.get_destinationVertex();
									vertexDown = _303;
									tempEdgeDownUp.set_originVertex(vertexDown);
									hxDaedalus.data.math.Intersection _304 = hxDaedalus.data.math.Intersection.EVertex(vertexDown);
									currObjet = _304;
								}
								 else 
								{
									haxe.root.Array<java.lang.Object> _305 = null;
									boolean _306 = hxDaedalus.data.math.Geom2D.intersections2edges(edgeLeft, tempEdgeDownUp, pIntersect, _305, null);
									if (_306) 
									{
										boolean _307 = edgeLeft.get_isConstrained();
										if (_307) 
										{
											double _308 = pIntersect.x;
											double _309 = pIntersect.y;
											hxDaedalus.data.Vertex _310 = this.splitEdge(edgeLeft, _308, _309);
											currVertex = _310;
											iterVertexToOutEdges.set_fromVertex(currVertex);
											while (true)
											{
												hxDaedalus.data.Edge _311 = iterVertexToOutEdges.next();
												currEdge = _311;
												hxDaedalus.data.Edge _312 = currEdge;
												boolean _313 = ( _312 != null );
												boolean _314 =  ! (_313) ;
												if (_314) 
												{
													break;
												}
												
												hxDaedalus.data.Vertex _315 = currEdge.get_destinationVertex();
												haxe.root.Array<hxDaedalus.data.Edge> _316 = leftBoundingEdges;
												hxDaedalus.data.Vertex _317 = _316.__get(0).get_originVertex();
												boolean _318 = ( _315 == _317 );
												if (_318) 
												{
													leftBoundingEdges.unshift(currEdge);
												}
												
												hxDaedalus.data.Vertex _319 = currEdge.get_destinationVertex();
												haxe.root.Array<hxDaedalus.data.Edge> _320 = rightBoundingEdges;
												int _321 = rightBoundingEdges.length;
												int _322 = ( _321 - 1 );
												hxDaedalus.data.Vertex _323 = _320.__get(_322).get_destinationVertex();
												boolean _324 = ( _319 == _323 );
												if (_324) 
												{
													hxDaedalus.data.Edge _325 = currEdge.get_oppositeEdge();
													rightBoundingEdges.push(_325);
												}
												
											}
											
											hxDaedalus.data.Edge _326 = new hxDaedalus.data.Edge();
											newEdgeDownUp = _326;
											hxDaedalus.data.Edge _327 = new hxDaedalus.data.Edge();
											newEdgeUpDown = _327;
											newEdgeDownUp.setDatas(vertexDown, newEdgeUpDown, null, null, true, true);
											newEdgeUpDown.setDatas(currVertex, newEdgeDownUp, null, null, true, true);
											leftBoundingEdges.push(newEdgeDownUp);
											rightBoundingEdges.push(newEdgeUpDown);
											haxe.root.Array<hxDaedalus.data.Edge> _328 = intersectedEdges;
											haxe.root.Array<hxDaedalus.data.Edge> _329 = leftBoundingEdges;
											haxe.root.Array<hxDaedalus.data.Edge> _330 = rightBoundingEdges;
											this.insertNewConstrainedEdge(segment, newEdgeDownUp, _328, _329, _330);
											int _331 = intersectedEdges.length;
											intersectedEdges.splice(0, _331);
											int _332 = leftBoundingEdges.length;
											leftBoundingEdges.splice(0, _332);
											int _333 = rightBoundingEdges.length;
											rightBoundingEdges.splice(0, _333);
											vertexDown = currVertex;
											tempEdgeDownUp.set_originVertex(vertexDown);
											hxDaedalus.data.math.Intersection _334 = hxDaedalus.data.math.Intersection.EVertex(vertexDown);
											currObjet = _334;
										}
										 else 
										{
											intersectedEdges.push(edgeLeft);
											hxDaedalus.data.Edge _335 = edgeLeft.get_nextLeftEdge();
											leftBoundingEdges.unshift(_335);
											hxDaedalus.data.Edge _336 = edgeLeft.get_oppositeEdge();
											currEdge = _336;
											hxDaedalus.data.math.Intersection _337 = hxDaedalus.data.math.Intersection.EEdge(currEdge);
											currObjet = _337;
										}
										
									}
									 else 
									{
										hxDaedalus.data.Edge _338 = edgeLeft.get_nextLeftEdge();
										edgeLeft = _338;
										haxe.root.Array<java.lang.Object> _339 = null;
										hxDaedalus.data.math.Geom2D.intersections2edges(edgeLeft, tempEdgeDownUp, pIntersect, _339, null);
										boolean _340 = edgeLeft.get_isConstrained();
										if (_340) 
										{
											double _341 = pIntersect.x;
											double _342 = pIntersect.y;
											hxDaedalus.data.Vertex _343 = this.splitEdge(edgeLeft, _341, _342);
											currVertex = _343;
											iterVertexToOutEdges.set_fromVertex(currVertex);
											while (true)
											{
												hxDaedalus.data.Edge _344 = iterVertexToOutEdges.next();
												currEdge = _344;
												hxDaedalus.data.Edge _345 = currEdge;
												boolean _346 = ( _345 != null );
												boolean _347 =  ! (_346) ;
												if (_347) 
												{
													break;
												}
												
												hxDaedalus.data.Vertex _348 = currEdge.get_destinationVertex();
												haxe.root.Array<hxDaedalus.data.Edge> _349 = leftBoundingEdges;
												hxDaedalus.data.Vertex _350 = _349.__get(0).get_originVertex();
												boolean _351 = ( _348 == _350 );
												if (_351) 
												{
													leftBoundingEdges.unshift(currEdge);
												}
												
												hxDaedalus.data.Vertex _352 = currEdge.get_destinationVertex();
												haxe.root.Array<hxDaedalus.data.Edge> _353 = rightBoundingEdges;
												int _354 = rightBoundingEdges.length;
												int _355 = ( _354 - 1 );
												hxDaedalus.data.Vertex _356 = _353.__get(_355).get_destinationVertex();
												boolean _357 = ( _352 == _356 );
												if (_357) 
												{
													hxDaedalus.data.Edge _358 = currEdge.get_oppositeEdge();
													rightBoundingEdges.push(_358);
												}
												
											}
											
											hxDaedalus.data.Edge _359 = new hxDaedalus.data.Edge();
											newEdgeDownUp = _359;
											hxDaedalus.data.Edge _360 = new hxDaedalus.data.Edge();
											newEdgeUpDown = _360;
											newEdgeDownUp.setDatas(vertexDown, newEdgeUpDown, null, null, true, true);
											newEdgeUpDown.setDatas(currVertex, newEdgeDownUp, null, null, true, true);
											leftBoundingEdges.push(newEdgeDownUp);
											rightBoundingEdges.push(newEdgeUpDown);
											haxe.root.Array<hxDaedalus.data.Edge> _361 = intersectedEdges;
											haxe.root.Array<hxDaedalus.data.Edge> _362 = leftBoundingEdges;
											haxe.root.Array<hxDaedalus.data.Edge> _363 = rightBoundingEdges;
											this.insertNewConstrainedEdge(segment, newEdgeDownUp, _361, _362, _363);
											int _364 = intersectedEdges.length;
											intersectedEdges.splice(0, _364);
											int _365 = leftBoundingEdges.length;
											leftBoundingEdges.splice(0, _365);
											int _366 = rightBoundingEdges.length;
											rightBoundingEdges.splice(0, _366);
											vertexDown = currVertex;
											tempEdgeDownUp.set_originVertex(vertexDown);
											hxDaedalus.data.math.Intersection _367 = hxDaedalus.data.math.Intersection.EVertex(vertexDown);
											currObjet = _367;
										}
										 else 
										{
											intersectedEdges.push(edgeLeft);
											hxDaedalus.data.Edge _368 = edgeLeft.get_prevLeftEdge();
											rightBoundingEdges.push(_368);
											hxDaedalus.data.Edge _369 = edgeLeft.get_oppositeEdge();
											currEdge = _369;
											hxDaedalus.data.math.Intersection _370 = hxDaedalus.data.math.Intersection.EEdge(currEdge);
											currObjet = _370;
										}
										
									}
									
								}
								
							}
							
						}
						
						break;
					}
					
					
					case 2:
					{
						hxDaedalus.data.Face face = ((hxDaedalus.data.Face) (currObjet.params.__get(0)) );
						{
						}
						
						break;
					}
					
					
					case 3:
					{
						{
						}
						
						break;
					}
					
					
				}
				
			}
			
		}
		
		return segment;
	}
	
	
	public   void insertNewConstrainedEdge(hxDaedalus.data.ConstraintSegment fromSegment, hxDaedalus.data.Edge edgeDownUp, haxe.root.Array<hxDaedalus.data.Edge> intersectedEdges, haxe.root.Array<hxDaedalus.data.Edge> leftBoundingEdges, haxe.root.Array<hxDaedalus.data.Edge> rightBoundingEdges)
	{
		this._edges.push(edgeDownUp);
		hxDaedalus.data.Edge _0 = edgeDownUp.get_oppositeEdge();
		this._edges.push(_0);
		edgeDownUp.addFromConstraintSegment(fromSegment);
		haxe.root.Array<hxDaedalus.data.ConstraintSegment> _1 = edgeDownUp.fromConstraintSegments;
		edgeDownUp.get_oppositeEdge().fromConstraintSegments = _1;
		fromSegment.addEdge(edgeDownUp);
		edgeDownUp.get_originVertex().addFromConstraintSegment(fromSegment);
		edgeDownUp.get_destinationVertex().addFromConstraintSegment(fromSegment);
		haxe.root.Array<hxDaedalus.data.Edge> _2 = intersectedEdges;
		this.untriangulate(_2);
		haxe.root.Array<hxDaedalus.data.Edge> _3 = leftBoundingEdges;
		this.triangulate(_3, true);
		haxe.root.Array<hxDaedalus.data.Edge> _4 = rightBoundingEdges;
		this.triangulate(_4, true);
	}
	
	
	public   void deleteConstraintSegment(hxDaedalus.data.ConstraintSegment segment)
	{
		int i = 0;
		haxe.root.Array<hxDaedalus.data.Vertex> _0 = new haxe.root.Array<hxDaedalus.data.Vertex>();
		haxe.root.Array<hxDaedalus.data.Vertex> vertexToDelete = _0;
		hxDaedalus.data.Edge edge = null;
		hxDaedalus.data.Vertex vertex = null;
		haxe.root.Array<hxDaedalus.data.ConstraintSegment> fromConstraintSegment = null;
		{
			int _g1 = 0;
			int _1 = segment.get_edges().length;
			int _g = _1;
			while (true)
			{
				boolean _2 = ( _g1 < _g );
				boolean _3 =  ! (_2) ;
				if (_3) 
				{
					break;
				}
				
				int _4 = _g1++;
				int i1 = _4;
				haxe.root.Array<hxDaedalus.data.Edge> _5 = segment.get_edges();
				hxDaedalus.data.Edge _6 = _5.__get(i1);
				edge = _6;
				edge.removeFromConstraintSegment(segment);
				int _7 = edge.fromConstraintSegments.length;
				boolean _8 = ( _7 == 0 );
				if (_8) 
				{
					edge.set_isConstrained(false);
					edge.get_oppositeEdge().set_isConstrained(false);
				}
				
				hxDaedalus.data.Vertex _9 = edge.get_originVertex();
				vertex = _9;
				vertex.removeFromConstraintSegment(segment);
				vertexToDelete.push(vertex);
			}
			
		}
		
		hxDaedalus.data.Vertex _10 = edge.get_destinationVertex();
		vertex = _10;
		vertex.removeFromConstraintSegment(segment);
		vertexToDelete.push(vertex);
		{
			int _g11 = 0;
			int _11 = vertexToDelete.length;
			int _g2 = _11;
			while (true)
			{
				boolean _12 = ( _g11 < _g2 );
				boolean _13 =  ! (_12) ;
				if (_13) 
				{
					break;
				}
				
				int _14 = _g11++;
				int i2 = _14;
				haxe.root.Array<hxDaedalus.data.Vertex> _15 = vertexToDelete;
				hxDaedalus.data.Vertex _16 = _15.__get(i2);
				this.deleteVertex(_16);
			}
			
		}
		
		segment.dispose();
	}
	
	
	public   void check()
	{
		{
			int _g1 = 0;
			int _0 = this._edges.length;
			int _g = _0;
			while (true)
			{
				boolean _1 = ( _g1 < _g );
				boolean _2 =  ! (_1) ;
				if (_2) 
				{
					break;
				}
				
				int _3 = _g1++;
				int i = _3;
				haxe.root.Array<hxDaedalus.data.Edge> _4 = this._edges;
				hxDaedalus.data.Edge _5 = _4.__get(i).get_nextLeftEdge();
				boolean _6 = ( _5 == null );
				if (_6) 
				{
					haxe.Log.trace.__hx_invoke2_o(0.0, "!!! missing nextLeftEdge", 0.0, new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"hxDaedalus.data.Mesh", "Mesh.hx", "check"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (793) )) )})));
					return ;
				}
				
			}
			
		}
		
		haxe.Log.trace.__hx_invoke2_o(0.0, "check OK", 0.0, new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"hxDaedalus.data.Mesh", "Mesh.hx", "check"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (797) )) )})));
	}
	
	
	public   hxDaedalus.data.Vertex insertVertex(double x, double y)
	{
		boolean _0 = ( x < 0 );
		boolean _1 =  ! (_0) ;
		boolean _3 = false;
		if (_1) 
		{
			_3 = ( y < 0 );
		}
		 else 
		{
			_3 = true;
		}
		
		boolean _4 =  ! (_3) ;
		boolean _8 = false;
		if (_4) 
		{
			double _7 = this._width;
			double _5 = _7;
			double _2 = _5;
			_8 = ( x > _2 );
		}
		 else 
		{
			_8 = true;
		}
		
		boolean _9 =  ! (_8) ;
		boolean _11 = false;
		if (_9) 
		{
			double _10 = this._height;
			double _6 = _10;
			_11 = ( y > _6 );
		}
		 else 
		{
			_11 = true;
		}
		
		if (_11) 
		{
			return null;
		}
		
		int _12 = this.__edgesToCheck.length;
		this.__edgesToCheck.splice(0, _12);
		hxDaedalus.data.math.Intersection _13 = hxDaedalus.data.math.Geom2D.locatePosition(x, y, this);
		hxDaedalus.data.math.Intersection inObject = _13;
		hxDaedalus.data.Vertex newVertex = null;
		switch (haxe.root.Type.enumIndex(inObject))
		{
			case 0:
			{
				hxDaedalus.data.Vertex vertex = ((hxDaedalus.data.Vertex) (inObject.params.__get(0)) );
				newVertex = vertex;
				break;
			}
			
			
			case 1:
			{
				hxDaedalus.data.Edge edge = ((hxDaedalus.data.Edge) (inObject.params.__get(0)) );
				{
					hxDaedalus.data.Vertex _14 = this.splitEdge(edge, x, y);
					newVertex = _14;
				}
				
				break;
			}
			
			
			case 2:
			{
				hxDaedalus.data.Face face = ((hxDaedalus.data.Face) (inObject.params.__get(0)) );
				{
					hxDaedalus.data.Vertex _15 = this.splitFace(face, x, y);
					newVertex = _15;
				}
				
				break;
			}
			
			
			case 3:
			{
				{
				}
				
				break;
			}
			
			
		}
		
		this.restoreAsDelaunay();
		return newVertex;
	}
	
	
	public   hxDaedalus.data.Edge flipEdge(hxDaedalus.data.Edge edge)
	{
		hxDaedalus.data.Edge eBot_Top = edge;
		hxDaedalus.data.Edge _0 = edge.get_oppositeEdge();
		hxDaedalus.data.Edge eTop_Bot = _0;
		hxDaedalus.data.Edge _1 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eLeft_Right = _1;
		hxDaedalus.data.Edge _2 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eRight_Left = _2;
		hxDaedalus.data.Edge _3 = eBot_Top.get_nextLeftEdge();
		hxDaedalus.data.Edge eTop_Left = _3;
		hxDaedalus.data.Edge _4 = eTop_Left.get_nextLeftEdge();
		hxDaedalus.data.Edge eLeft_Bot = _4;
		hxDaedalus.data.Edge _5 = eTop_Bot.get_nextLeftEdge();
		hxDaedalus.data.Edge eBot_Right = _5;
		hxDaedalus.data.Edge _6 = eBot_Right.get_nextLeftEdge();
		hxDaedalus.data.Edge eRight_Top = _6;
		hxDaedalus.data.Vertex _7 = eBot_Top.get_originVertex();
		hxDaedalus.data.Vertex vBot = _7;
		hxDaedalus.data.Vertex _8 = eTop_Bot.get_originVertex();
		hxDaedalus.data.Vertex vTop = _8;
		hxDaedalus.data.Vertex _9 = eLeft_Bot.get_originVertex();
		hxDaedalus.data.Vertex vLeft = _9;
		hxDaedalus.data.Vertex _10 = eRight_Top.get_originVertex();
		hxDaedalus.data.Vertex vRight = _10;
		hxDaedalus.data.Face _11 = eBot_Top.get_leftFace();
		hxDaedalus.data.Face fLeft = _11;
		hxDaedalus.data.Face _12 = eTop_Bot.get_leftFace();
		hxDaedalus.data.Face fRight = _12;
		hxDaedalus.data.Face _13 = new hxDaedalus.data.Face();
		hxDaedalus.data.Face fBot = _13;
		hxDaedalus.data.Face _14 = new hxDaedalus.data.Face();
		hxDaedalus.data.Face fTop = _14;
		this._edges.push(eLeft_Right);
		this._edges.push(eRight_Left);
		this._faces.push(fTop);
		this._faces.push(fBot);
		boolean _15 = edge.get_isReal();
		boolean _16 = edge.get_isConstrained();
		eLeft_Right.setDatas(vLeft, eRight_Left, eRight_Top, fTop, _15, _16);
		boolean _17 = edge.get_isReal();
		boolean _18 = edge.get_isConstrained();
		eRight_Left.setDatas(vRight, eLeft_Right, eLeft_Bot, fBot, _17, _18);
		fTop.setDatas(eLeft_Right, null);
		fBot.setDatas(eRight_Left, null);
		hxDaedalus.data.Edge _19 = vTop.get_edge();
		boolean _20 = ( _19 == eTop_Bot );
		if (_20) 
		{
			vTop.setDatas(eTop_Left, null);
		}
		
		hxDaedalus.data.Edge _21 = vBot.get_edge();
		boolean _22 = ( _21 == eBot_Top );
		if (_22) 
		{
			vBot.setDatas(eBot_Right, null);
		}
		
		eTop_Left.set_nextLeftEdge(eLeft_Right);
		eTop_Left.set_leftFace(fTop);
		eLeft_Bot.set_nextLeftEdge(eBot_Right);
		eLeft_Bot.set_leftFace(fBot);
		eBot_Right.set_nextLeftEdge(eRight_Left);
		eBot_Right.set_leftFace(fBot);
		eRight_Top.set_nextLeftEdge(eTop_Left);
		eRight_Top.set_leftFace(fTop);
		eBot_Top.dispose();
		eTop_Bot.dispose();
		int _23 = this._edges.indexOf(eBot_Top, null);
		this._edges.splice(_23, 1);
		int _24 = this._edges.indexOf(eTop_Bot, null);
		this._edges.splice(_24, 1);
		fLeft.dispose();
		fRight.dispose();
		int _25 = this._faces.indexOf(fLeft, null);
		this._faces.splice(_25, 1);
		int _26 = this._faces.indexOf(fRight, null);
		this._faces.splice(_26, 1);
		return eRight_Left;
	}
	
	
	public   hxDaedalus.data.Vertex splitEdge(hxDaedalus.data.Edge edge, double x, double y)
	{
		int _0 = this.__edgesToCheck.length;
		this.__edgesToCheck.splice(0, _0);
		hxDaedalus.data.Edge eLeft_Right = edge;
		hxDaedalus.data.Edge _1 = eLeft_Right.get_oppositeEdge();
		hxDaedalus.data.Edge eRight_Left = _1;
		hxDaedalus.data.Edge _2 = eLeft_Right.get_nextLeftEdge();
		hxDaedalus.data.Edge eRight_Top = _2;
		hxDaedalus.data.Edge _3 = eRight_Top.get_nextLeftEdge();
		hxDaedalus.data.Edge eTop_Left = _3;
		hxDaedalus.data.Edge _4 = eRight_Left.get_nextLeftEdge();
		hxDaedalus.data.Edge eLeft_Bot = _4;
		hxDaedalus.data.Edge _5 = eLeft_Bot.get_nextLeftEdge();
		hxDaedalus.data.Edge eBot_Right = _5;
		hxDaedalus.data.Vertex _6 = eTop_Left.get_originVertex();
		hxDaedalus.data.Vertex vTop = _6;
		hxDaedalus.data.Vertex _7 = eLeft_Right.get_originVertex();
		hxDaedalus.data.Vertex vLeft = _7;
		hxDaedalus.data.Vertex _8 = eBot_Right.get_originVertex();
		hxDaedalus.data.Vertex vBot = _8;
		hxDaedalus.data.Vertex _9 = eRight_Left.get_originVertex();
		hxDaedalus.data.Vertex vRight = _9;
		hxDaedalus.data.Face _10 = eLeft_Right.get_leftFace();
		hxDaedalus.data.Face fTop = _10;
		hxDaedalus.data.Face _11 = eRight_Left.get_leftFace();
		hxDaedalus.data.Face fBot = _11;
		double _12 = vLeft.get_pos().x;
		double _13 = ( _12 - x );
		double _14 = vLeft.get_pos().x;
		double _15 = ( _14 - x );
		double _16 = ( _13 * _15 );
		double _17 = vLeft.get_pos().y;
		double _18 = ( _17 - y );
		double _19 = vLeft.get_pos().y;
		double _20 = ( _19 - y );
		double _21 = ( _18 * _20 );
		double _22 = ( _16 + _21 );
		boolean _23 = ( _22 <= 0.0001 );
		if (_23) 
		{
			return vLeft;
		}
		
		double _24 = vRight.get_pos().x;
		double _25 = ( _24 - x );
		double _26 = vRight.get_pos().x;
		double _27 = ( _26 - x );
		double _28 = ( _25 * _27 );
		double _29 = vRight.get_pos().y;
		double _30 = ( _29 - y );
		double _31 = vRight.get_pos().y;
		double _32 = ( _31 - y );
		double _33 = ( _30 * _32 );
		double _34 = ( _28 + _33 );
		boolean _35 = ( _34 <= 0.0001 );
		if (_35) 
		{
			return vRight;
		}
		
		hxDaedalus.data.Vertex _36 = new hxDaedalus.data.Vertex();
		hxDaedalus.data.Vertex vCenter = _36;
		hxDaedalus.data.Edge _37 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eTop_Center = _37;
		hxDaedalus.data.Edge _38 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eCenter_Top = _38;
		hxDaedalus.data.Edge _39 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eBot_Center = _39;
		hxDaedalus.data.Edge _40 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eCenter_Bot = _40;
		hxDaedalus.data.Edge _41 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eLeft_Center = _41;
		hxDaedalus.data.Edge _42 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eCenter_Left = _42;
		hxDaedalus.data.Edge _43 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eRight_Center = _43;
		hxDaedalus.data.Edge _44 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eCenter_Right = _44;
		hxDaedalus.data.Face _45 = new hxDaedalus.data.Face();
		hxDaedalus.data.Face fTopLeft = _45;
		hxDaedalus.data.Face _46 = new hxDaedalus.data.Face();
		hxDaedalus.data.Face fBotLeft = _46;
		hxDaedalus.data.Face _47 = new hxDaedalus.data.Face();
		hxDaedalus.data.Face fBotRight = _47;
		hxDaedalus.data.Face _48 = new hxDaedalus.data.Face();
		hxDaedalus.data.Face fTopRight = _48;
		this._vertices.push(vCenter);
		this._edges.push(eCenter_Top);
		this._edges.push(eTop_Center);
		this._edges.push(eCenter_Left);
		this._edges.push(eLeft_Center);
		this._edges.push(eCenter_Bot);
		this._edges.push(eBot_Center);
		this._edges.push(eCenter_Right);
		this._edges.push(eRight_Center);
		this._faces.push(fTopRight);
		this._faces.push(fBotRight);
		this._faces.push(fBotLeft);
		this._faces.push(fTopLeft);
		boolean _49 = fTop.get_isReal();
		hxDaedalus.data.Edge _50 = null;
		if (_49) 
		{
			_50 = eCenter_Top;
		}
		 else 
		{
			_50 = eCenter_Bot;
		}
		
		vCenter.setDatas(_50, null);
		vCenter.get_pos().x = x;
		vCenter.get_pos().y = y;
		hxDaedalus.data.math.Point2D _51 = vCenter.get_pos();
		hxDaedalus.data.math.Geom2D.projectOrthogonaly(_51, eLeft_Right);
		boolean _52 = fTop.get_isReal();
		eCenter_Top.setDatas(vCenter, eTop_Center, eTop_Left, fTopLeft, _52, null);
		boolean _53 = fTop.get_isReal();
		eTop_Center.setDatas(vTop, eCenter_Top, eCenter_Right, fTopRight, _53, null);
		boolean _54 = edge.get_isReal();
		boolean _55 = edge.get_isConstrained();
		eCenter_Left.setDatas(vCenter, eLeft_Center, eLeft_Bot, fBotLeft, _54, _55);
		boolean _56 = edge.get_isReal();
		boolean _57 = edge.get_isConstrained();
		eLeft_Center.setDatas(vLeft, eCenter_Left, eCenter_Top, fTopLeft, _56, _57);
		boolean _58 = fBot.get_isReal();
		eCenter_Bot.setDatas(vCenter, eBot_Center, eBot_Right, fBotRight, _58, null);
		boolean _59 = fBot.get_isReal();
		eBot_Center.setDatas(vBot, eCenter_Bot, eCenter_Left, fBotLeft, _59, null);
		boolean _60 = edge.get_isReal();
		boolean _61 = edge.get_isConstrained();
		eCenter_Right.setDatas(vCenter, eRight_Center, eRight_Top, fTopRight, _60, _61);
		boolean _62 = edge.get_isReal();
		boolean _63 = edge.get_isConstrained();
		eRight_Center.setDatas(vRight, eCenter_Right, eCenter_Bot, fBotRight, _62, _63);
		boolean _64 = fTop.get_isReal();
		fTopLeft.setDatas(eCenter_Top, _64);
		boolean _65 = fBot.get_isReal();
		fBotLeft.setDatas(eCenter_Left, _65);
		boolean _66 = fBot.get_isReal();
		fBotRight.setDatas(eCenter_Bot, _66);
		boolean _67 = fTop.get_isReal();
		fTopRight.setDatas(eCenter_Right, _67);
		hxDaedalus.data.Edge _68 = vLeft.get_edge();
		boolean _69 = ( _68 == eLeft_Right );
		if (_69) 
		{
			vLeft.setDatas(eLeft_Center, null);
		}
		
		hxDaedalus.data.Edge _70 = vRight.get_edge();
		boolean _71 = ( _70 == eRight_Left );
		if (_71) 
		{
			vRight.setDatas(eRight_Center, null);
		}
		
		eTop_Left.set_nextLeftEdge(eLeft_Center);
		eTop_Left.set_leftFace(fTopLeft);
		eLeft_Bot.set_nextLeftEdge(eBot_Center);
		eLeft_Bot.set_leftFace(fBotLeft);
		eBot_Right.set_nextLeftEdge(eRight_Center);
		eBot_Right.set_leftFace(fBotRight);
		eRight_Top.set_nextLeftEdge(eTop_Center);
		eRight_Top.set_leftFace(fTopRight);
		boolean _72 = eLeft_Right.get_isConstrained();
		if (_72) 
		{
			haxe.root.Array<hxDaedalus.data.ConstraintSegment> _73 = eLeft_Right.fromConstraintSegments;
			haxe.root.Array<hxDaedalus.data.ConstraintSegment> fromSegments = _73;
			haxe.root.Array<hxDaedalus.data.ConstraintSegment> _74 = fromSegments.slice(0, null);
			eLeft_Center.fromConstraintSegments = _74;
			haxe.root.Array<hxDaedalus.data.ConstraintSegment> _75 = eLeft_Center.fromConstraintSegments;
			eCenter_Left.fromConstraintSegments = _75;
			haxe.root.Array<hxDaedalus.data.ConstraintSegment> _76 = fromSegments.slice(0, null);
			eCenter_Right.fromConstraintSegments = _76;
			haxe.root.Array<hxDaedalus.data.ConstraintSegment> _77 = eCenter_Right.fromConstraintSegments;
			eRight_Center.fromConstraintSegments = _77;
			haxe.root.Array<hxDaedalus.data.Edge> edges = null;
			int index = 0;
			{
				int _g1 = 0;
				int _78 = eLeft_Right.fromConstraintSegments.length;
				int _g = _78;
				while (true)
				{
					boolean _79 = ( _g1 < _g );
					boolean _80 =  ! (_79) ;
					if (_80) 
					{
						break;
					}
					
					int _81 = _g1++;
					int i = _81;
					haxe.root.Array<hxDaedalus.data.ConstraintSegment> _82 = eLeft_Right.fromConstraintSegments;
					haxe.root.Array<hxDaedalus.data.Edge> _83 = _82.__get(i).get_edges();
					edges = _83;
					int _84 = edges.indexOf(eLeft_Right, null);
					index = _84;
					boolean _85 = ( index != -1 );
					if (_85) 
					{
						edges.splice(index, 1);
						edges.insert(index, eLeft_Center);
						int _86 = ( index + 1 );
						edges.insert(_86, eCenter_Right);
					}
					 else 
					{
						int _87 = edges.indexOf(eRight_Left, null);
						int index2 = _87;
						edges.splice(index2, 1);
						edges.insert(index2, eRight_Center);
						edges.insert(index2, eCenter_Left);
					}
					
				}
				
			}
			
			haxe.root.Array<hxDaedalus.data.ConstraintSegment> _88 = fromSegments.slice(0, null);
			vCenter.set_fromConstraintSegments(_88);
		}
		
		eLeft_Right.dispose();
		eRight_Left.dispose();
		int _89 = this._edges.indexOf(eLeft_Right, null);
		this._edges.splice(_89, 1);
		int _90 = this._edges.indexOf(eRight_Left, null);
		this._edges.splice(_90, 1);
		fTop.dispose();
		fBot.dispose();
		int _91 = this._faces.indexOf(fTop, null);
		this._faces.splice(_91, 1);
		int _92 = this._faces.indexOf(fBot, null);
		this._faces.splice(_92, 1);
		this.__centerVertex = vCenter;
		this.__edgesToCheck.push(eTop_Left);
		this.__edgesToCheck.push(eLeft_Bot);
		this.__edgesToCheck.push(eBot_Right);
		this.__edgesToCheck.push(eRight_Top);
		return vCenter;
	}
	
	
	public   hxDaedalus.data.Vertex splitFace(hxDaedalus.data.Face face, double x, double y)
	{
		int _0 = this.__edgesToCheck.length;
		this.__edgesToCheck.splice(0, _0);
		hxDaedalus.data.Edge _1 = face.get_edge();
		hxDaedalus.data.Edge eTop_Left = _1;
		hxDaedalus.data.Edge _2 = eTop_Left.get_nextLeftEdge();
		hxDaedalus.data.Edge eLeft_Right = _2;
		hxDaedalus.data.Edge _3 = eLeft_Right.get_nextLeftEdge();
		hxDaedalus.data.Edge eRight_Top = _3;
		hxDaedalus.data.Vertex _4 = eTop_Left.get_originVertex();
		hxDaedalus.data.Vertex vTop = _4;
		hxDaedalus.data.Vertex _5 = eLeft_Right.get_originVertex();
		hxDaedalus.data.Vertex vLeft = _5;
		hxDaedalus.data.Vertex _6 = eRight_Top.get_originVertex();
		hxDaedalus.data.Vertex vRight = _6;
		hxDaedalus.data.Vertex _7 = new hxDaedalus.data.Vertex();
		hxDaedalus.data.Vertex vCenter = _7;
		hxDaedalus.data.Edge _8 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eTop_Center = _8;
		hxDaedalus.data.Edge _9 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eCenter_Top = _9;
		hxDaedalus.data.Edge _10 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eLeft_Center = _10;
		hxDaedalus.data.Edge _11 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eCenter_Left = _11;
		hxDaedalus.data.Edge _12 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eRight_Center = _12;
		hxDaedalus.data.Edge _13 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eCenter_Right = _13;
		hxDaedalus.data.Face _14 = new hxDaedalus.data.Face();
		hxDaedalus.data.Face fTopLeft = _14;
		hxDaedalus.data.Face _15 = new hxDaedalus.data.Face();
		hxDaedalus.data.Face fBot = _15;
		hxDaedalus.data.Face _16 = new hxDaedalus.data.Face();
		hxDaedalus.data.Face fTopRight = _16;
		this._vertices.push(vCenter);
		this._edges.push(eTop_Center);
		this._edges.push(eCenter_Top);
		this._edges.push(eLeft_Center);
		this._edges.push(eCenter_Left);
		this._edges.push(eRight_Center);
		this._edges.push(eCenter_Right);
		this._faces.push(fTopLeft);
		this._faces.push(fBot);
		this._faces.push(fTopRight);
		vCenter.setDatas(eCenter_Top, null);
		vCenter.get_pos().x = x;
		vCenter.get_pos().y = y;
		eTop_Center.setDatas(vTop, eCenter_Top, eCenter_Right, fTopRight, null, null);
		eCenter_Top.setDatas(vCenter, eTop_Center, eTop_Left, fTopLeft, null, null);
		eLeft_Center.setDatas(vLeft, eCenter_Left, eCenter_Top, fTopLeft, null, null);
		eCenter_Left.setDatas(vCenter, eLeft_Center, eLeft_Right, fBot, null, null);
		eRight_Center.setDatas(vRight, eCenter_Right, eCenter_Left, fBot, null, null);
		eCenter_Right.setDatas(vCenter, eRight_Center, eRight_Top, fTopRight, null, null);
		fTopLeft.setDatas(eCenter_Top, null);
		fBot.setDatas(eCenter_Left, null);
		fTopRight.setDatas(eCenter_Right, null);
		eTop_Left.set_nextLeftEdge(eLeft_Center);
		eTop_Left.set_leftFace(fTopLeft);
		eLeft_Right.set_nextLeftEdge(eRight_Center);
		eLeft_Right.set_leftFace(fBot);
		eRight_Top.set_nextLeftEdge(eTop_Center);
		eRight_Top.set_leftFace(fTopRight);
		face.dispose();
		int _17 = this._faces.indexOf(face, null);
		this._faces.splice(_17, 1);
		this.__centerVertex = vCenter;
		this.__edgesToCheck.push(eTop_Left);
		this.__edgesToCheck.push(eLeft_Right);
		this.__edgesToCheck.push(eRight_Top);
		return vCenter;
	}
	
	
	public   void restoreAsDelaunay()
	{
		hxDaedalus.data.Edge edge = null;
		while (true)
		{
			int _0 = this.__edgesToCheck.length;
			boolean _1 = ( _0 > 0 );
			boolean _2 =  ! (_1) ;
			if (_2) 
			{
				break;
			}
			
			hxDaedalus.data.Edge _3 = this.__edgesToCheck.shift();
			edge = _3;
			boolean _5 = edge.get_isReal();
			boolean _9 = false;
			if (_5) 
			{
				boolean _8 = edge.get_isConstrained();
				boolean _6 = _8;
				boolean _4 = _6;
				_9 =  ! (_4) ;
			}
			 else 
			{
				_9 = false;
			}
			
			boolean _11 = false;
			if (_9) 
			{
				boolean _10 = hxDaedalus.data.math.Geom2D.isDelaunay(edge);
				boolean _7 = _10;
				_11 =  ! (_7) ;
			}
			 else 
			{
				_11 = false;
			}
			
			if (_11) 
			{
				hxDaedalus.data.Vertex _12 = edge.get_nextLeftEdge().get_destinationVertex();
				hxDaedalus.data.Vertex _13 = this.__centerVertex;
				boolean _14 = ( _12 == _13 );
				if (_14) 
				{
					hxDaedalus.data.Edge _15 = edge.get_nextRightEdge();
					this.__edgesToCheck.push(_15);
					hxDaedalus.data.Edge _16 = edge.get_prevRightEdge();
					this.__edgesToCheck.push(_16);
				}
				 else 
				{
					hxDaedalus.data.Edge _17 = edge.get_nextLeftEdge();
					this.__edgesToCheck.push(_17);
					hxDaedalus.data.Edge _18 = edge.get_prevLeftEdge();
					this.__edgesToCheck.push(_18);
				}
				
				this.flipEdge(edge);
			}
			
		}
		
	}
	
	
	public   boolean deleteVertex(hxDaedalus.data.Vertex vertex)
	{
		int i = 0;
		boolean freeOfConstraint = false;
		hxDaedalus.iterators.FromVertexToOutgoingEdges _0 = new hxDaedalus.iterators.FromVertexToOutgoingEdges();
		hxDaedalus.iterators.FromVertexToOutgoingEdges iterEdges = _0;
		iterEdges.set_fromVertex(vertex);
		iterEdges.realEdgesOnly = false;
		hxDaedalus.data.Edge edge = null;
		haxe.root.Array<hxDaedalus.data.Edge> _1 = new haxe.root.Array<hxDaedalus.data.Edge>();
		haxe.root.Array<hxDaedalus.data.Edge> outgoingEdges = _1;
		int _2 = vertex.get_fromConstraintSegments().length;
		boolean _3 = ( _2 == 0 );
		freeOfConstraint = _3;
		haxe.root.Array<hxDaedalus.data.Edge> _4 = new haxe.root.Array<hxDaedalus.data.Edge>();
		haxe.root.Array<hxDaedalus.data.Edge> bound = _4;
		boolean realA = false;
		boolean realB = false;
		haxe.root.Array<hxDaedalus.data.Edge> _5 = new haxe.root.Array<hxDaedalus.data.Edge>(new hxDaedalus.data.Edge[]{});
		haxe.root.Array<hxDaedalus.data.Edge> boundA = _5;
		haxe.root.Array<hxDaedalus.data.Edge> _6 = new haxe.root.Array<hxDaedalus.data.Edge>(new hxDaedalus.data.Edge[]{});
		haxe.root.Array<hxDaedalus.data.Edge> boundB = _6;
		if (freeOfConstraint) 
		{
			while (true)
			{
				hxDaedalus.data.Edge _7 = iterEdges.next();
				edge = _7;
				hxDaedalus.data.Edge _8 = edge;
				boolean _9 = ( _8 != null );
				boolean _10 =  ! (_9) ;
				if (_10) 
				{
					break;
				}
				
				outgoingEdges.push(edge);
				hxDaedalus.data.Edge _11 = edge.get_nextLeftEdge();
				bound.push(_11);
			}
			
		}
		 else 
		{
			haxe.root.Array<hxDaedalus.data.Edge> edges = null;
			{
				int _g1 = 0;
				int _12 = vertex.get_fromConstraintSegments().length;
				int _g = _12;
				while (true)
				{
					boolean _13 = ( _g1 < _g );
					boolean _14 =  ! (_13) ;
					if (_14) 
					{
						break;
					}
					
					int _15 = _g1++;
					int i1 = _15;
					haxe.root.Array<hxDaedalus.data.ConstraintSegment> _16 = vertex.get_fromConstraintSegments();
					haxe.root.Array<hxDaedalus.data.Edge> _17 = _16.__get(i1).get_edges();
					edges = _17;
					haxe.root.Array<hxDaedalus.data.Edge> _18 = edges;
					hxDaedalus.data.Vertex _19 = _18.__get(0).get_originVertex();
					boolean _24 = ( _19 == vertex );
					boolean _25 =  ! (_24) ;
					boolean _31 = false;
					if (_25) 
					{
						haxe.root.Array<hxDaedalus.data.Edge> _26 = edges;
						haxe.root.Array<hxDaedalus.data.Edge> _20 = _26;
						int _27 = edges.length;
						int _21 = _27;
						int _28 = ( _21 - 1 );
						int _22 = _28;
						haxe.root.Array<hxDaedalus.data.Edge> _29 = _20;
						hxDaedalus.data.Vertex _30 = _29.__get(_22).get_destinationVertex();
						hxDaedalus.data.Vertex _23 = _30;
						_31 = ( _23 == vertex );
					}
					 else 
					{
						_31 = true;
					}
					
					if (_31) 
					{
						return false;
					}
					
				}
				
			}
			
			int count = 0;
			while (true)
			{
				hxDaedalus.data.Edge _32 = iterEdges.next();
				edge = _32;
				hxDaedalus.data.Edge _33 = edge;
				boolean _34 = ( _33 != null );
				boolean _35 =  ! (_34) ;
				if (_35) 
				{
					break;
				}
				
				outgoingEdges.push(edge);
				boolean _36 = edge.get_isConstrained();
				if (_36) 
				{
					count++;
					boolean _37 = ( count > 2 );
					if (_37) 
					{
						return false;
					}
					
				}
				
			}
			
			haxe.root.Array<hxDaedalus.data.Edge> _38 = new haxe.root.Array<hxDaedalus.data.Edge>();
			boundA = _38;
			haxe.root.Array<hxDaedalus.data.Edge> _39 = new haxe.root.Array<hxDaedalus.data.Edge>();
			boundB = _39;
			hxDaedalus.data.Edge constrainedEdgeA = null;
			hxDaedalus.data.Edge constrainedEdgeB = null;
			hxDaedalus.data.Edge _40 = new hxDaedalus.data.Edge();
			hxDaedalus.data.Edge edgeA = _40;
			hxDaedalus.data.Edge _41 = new hxDaedalus.data.Edge();
			hxDaedalus.data.Edge edgeB = _41;
			this._edges.push(edgeA);
			this._edges.push(edgeB);
			{
				int _g11 = 0;
				int _42 = outgoingEdges.length;
				int _g2 = _42;
				while (true)
				{
					boolean _43 = ( _g11 < _g2 );
					boolean _44 =  ! (_43) ;
					if (_44) 
					{
						break;
					}
					
					int _45 = _g11++;
					int i2 = _45;
					haxe.root.Array<hxDaedalus.data.Edge> _46 = outgoingEdges;
					hxDaedalus.data.Edge _47 = _46.__get(i2);
					edge = _47;
					boolean _48 = edge.get_isConstrained();
					if (_48) 
					{
						boolean _49 = ( constrainedEdgeA == null );
						if (_49) 
						{
							hxDaedalus.data.Vertex _50 = edge.get_destinationVertex();
							edgeB.setDatas(_50, edgeA, null, null, true, true);
							boundA.push(edgeA);
							hxDaedalus.data.Edge _51 = edge.get_nextLeftEdge();
							boundA.push(_51);
							boundB.push(edgeB);
							constrainedEdgeA = edge;
						}
						 else 
						{
							boolean _52 = ( constrainedEdgeB == null );
							if (_52) 
							{
								hxDaedalus.data.Vertex _53 = edge.get_destinationVertex();
								edgeA.setDatas(_53, edgeB, null, null, true, true);
								hxDaedalus.data.Edge _54 = edge.get_nextLeftEdge();
								boundB.push(_54);
								constrainedEdgeB = edge;
							}
							
						}
						
					}
					 else 
					{
						boolean _55 = ( constrainedEdgeA == null );
						if (_55) 
						{
							hxDaedalus.data.Edge _56 = edge.get_nextLeftEdge();
							boundB.push(_56);
						}
						 else 
						{
							boolean _57 = ( constrainedEdgeB == null );
							if (_57) 
							{
								hxDaedalus.data.Edge _58 = edge.get_nextLeftEdge();
								boundA.push(_58);
							}
							 else 
							{
								hxDaedalus.data.Edge _59 = edge.get_nextLeftEdge();
								boundB.push(_59);
							}
							
						}
						
					}
					
				}
				
			}
			
			boolean _60 = constrainedEdgeA.get_leftFace().get_isReal();
			realA = _60;
			boolean _61 = constrainedEdgeB.get_leftFace().get_isReal();
			realB = _61;
			haxe.root.Array<hxDaedalus.data.ConstraintSegment> _62 = constrainedEdgeA.fromConstraintSegments.slice(0, null);
			edgeA.fromConstraintSegments = _62;
			haxe.root.Array<hxDaedalus.data.ConstraintSegment> _63 = edgeA.fromConstraintSegments;
			edgeB.fromConstraintSegments = _63;
			int index = 0;
			{
				int _g12 = 0;
				int _64 = vertex.get_fromConstraintSegments().length;
				int _g3 = _64;
				while (true)
				{
					boolean _65 = ( _g12 < _g3 );
					boolean _66 =  ! (_65) ;
					if (_66) 
					{
						break;
					}
					
					int _67 = _g12++;
					int i3 = _67;
					haxe.root.Array<hxDaedalus.data.ConstraintSegment> _68 = vertex.get_fromConstraintSegments();
					haxe.root.Array<hxDaedalus.data.Edge> _69 = _68.__get(i3).get_edges();
					edges = _69;
					int _70 = edges.indexOf(constrainedEdgeA, null);
					index = _70;
					boolean _71 = ( index != -1 );
					if (_71) 
					{
						int _72 = ( index - 1 );
						edges.splice(_72, 2);
						int _73 = ( index - 1 );
						edges.insert(_73, edgeA);
					}
					 else 
					{
						int _74 = edges.indexOf(constrainedEdgeB, null);
						int _75 = ( _74 - 1 );
						int index2 = _75;
						edges.splice(index2, 2);
						edges.insert(index2, edgeB);
					}
					
				}
				
			}
			
		}
		
		hxDaedalus.data.Face faceToDelete = null;
		{
			int _g13 = 0;
			int _76 = outgoingEdges.length;
			int _g4 = _76;
			while (true)
			{
				boolean _77 = ( _g13 < _g4 );
				boolean _78 =  ! (_77) ;
				if (_78) 
				{
					break;
				}
				
				int _79 = _g13++;
				int i4 = _79;
				haxe.root.Array<hxDaedalus.data.Edge> _80 = outgoingEdges;
				hxDaedalus.data.Edge _81 = _80.__get(i4);
				edge = _81;
				hxDaedalus.data.Face _82 = edge.get_leftFace();
				faceToDelete = _82;
				int _83 = this._faces.indexOf(faceToDelete, null);
				this._faces.splice(_83, 1);
				faceToDelete.dispose();
				hxDaedalus.data.Edge _84 = edge.get_nextLeftEdge();
				edge.get_destinationVertex().set_edge(_84);
				hxDaedalus.data.Edge _85 = edge.get_oppositeEdge();
				int _86 = this._edges.indexOf(_85, null);
				this._edges.splice(_86, 1);
				edge.get_oppositeEdge().dispose();
				int _87 = this._edges.indexOf(edge, null);
				this._edges.splice(_87, 1);
				edge.dispose();
			}
			
		}
		
		int _88 = this._vertices.indexOf(vertex, null);
		this._vertices.splice(_88, 1);
		vertex.dispose();
		if (freeOfConstraint) 
		{
			haxe.root.Array<hxDaedalus.data.Edge> _89 = bound;
			this.triangulate(_89, true);
		}
		 else 
		{
			haxe.root.Array<hxDaedalus.data.Edge> _90 = boundA;
			this.triangulate(_90, realA);
			haxe.root.Array<hxDaedalus.data.Edge> _91 = boundB;
			this.triangulate(_91, realB);
		}
		
		return true;
	}
	
	
	public   void untriangulate(haxe.root.Array<hxDaedalus.data.Edge> edgesList)
	{
		int i = 0;
		haxe.ds.ObjectMap<hxDaedalus.data.Vertex, java.lang.Object> _2 = null;
		{
			haxe.ds.ObjectMap<hxDaedalus.data.Vertex, java.lang.Object> _1 = new haxe.ds.ObjectMap<hxDaedalus.data.Vertex, java.lang.Object>();
			haxe.ds.ObjectMap<hxDaedalus.data.Vertex, java.lang.Object> _0 = _1;
			_2 = _0;
		}
		
		haxe.ds.ObjectMap<hxDaedalus.data.Vertex, java.lang.Object> verticesCleaned = _2;
		hxDaedalus.data.Edge currEdge = null;
		hxDaedalus.data.Edge outEdge = null;
		{
			int _g1 = 0;
			int _3 = edgesList.length;
			int _g = _3;
			while (true)
			{
				boolean _4 = ( _g1 < _g );
				boolean _5 =  ! (_4) ;
				if (_5) 
				{
					break;
				}
				
				int _6 = _g1++;
				int i1 = _6;
				haxe.root.Array<hxDaedalus.data.Edge> _7 = edgesList;
				hxDaedalus.data.Edge _8 = _7.__get(i1);
				currEdge = _8;
				java.lang.Object _10 = null;
				{
					hxDaedalus.data.Vertex _9 = currEdge.get_originVertex();
					hxDaedalus.data.Vertex key = _9;
					_10 = verticesCleaned.get(key);
				}
				
				boolean _11 = ( _10 == null );
				if (_11) 
				{
					hxDaedalus.data.Edge _12 = currEdge.get_prevLeftEdge().get_oppositeEdge();
					currEdge.get_originVertex().set_edge(_12);
					{
						hxDaedalus.data.Vertex _13 = currEdge.get_originVertex();
						hxDaedalus.data.Vertex k = _13;
						verticesCleaned.set(k, true);
						boolean __temp_expr120 = true;
					}
					
				}
				
				java.lang.Object _15 = null;
				{
					hxDaedalus.data.Vertex _14 = currEdge.get_destinationVertex();
					hxDaedalus.data.Vertex key1 = _14;
					_15 = verticesCleaned.get(key1);
				}
				
				boolean _16 = ( _15 == null );
				if (_16) 
				{
					hxDaedalus.data.Edge _17 = currEdge.get_nextLeftEdge();
					currEdge.get_destinationVertex().set_edge(_17);
					{
						hxDaedalus.data.Vertex _18 = currEdge.get_destinationVertex();
						hxDaedalus.data.Vertex k1 = _18;
						verticesCleaned.set(k1, true);
						boolean __temp_expr121 = true;
					}
					
				}
				
				hxDaedalus.data.Face _19 = currEdge.get_leftFace();
				int _20 = this._faces.indexOf(_19, null);
				this._faces.splice(_20, 1);
				currEdge.get_leftFace().dispose();
				int _21 = edgesList.length;
				int _22 = ( _21 - 1 );
				boolean _23 = ( i1 == _22 );
				if (_23) 
				{
					hxDaedalus.data.Face _24 = currEdge.get_rightFace();
					int _25 = this._faces.indexOf(_24, null);
					this._faces.splice(_25, 1);
					currEdge.get_rightFace().dispose();
				}
				
			}
			
		}
		
		{
			int _g11 = 0;
			int _26 = edgesList.length;
			int _g2 = _26;
			while (true)
			{
				boolean _27 = ( _g11 < _g2 );
				boolean _28 =  ! (_27) ;
				if (_28) 
				{
					break;
				}
				
				int _29 = _g11++;
				int i2 = _29;
				haxe.root.Array<hxDaedalus.data.Edge> _30 = edgesList;
				hxDaedalus.data.Edge _31 = _30.__get(i2);
				currEdge = _31;
				hxDaedalus.data.Edge _32 = currEdge.get_oppositeEdge();
				int _33 = this._edges.indexOf(_32, null);
				this._edges.splice(_33, 1);
				int _34 = this._edges.indexOf(currEdge, null);
				this._edges.splice(_34, 1);
				currEdge.get_oppositeEdge().dispose();
				currEdge.dispose();
			}
			
		}
		
	}
	
	
	public   void triangulate(haxe.root.Array<hxDaedalus.data.Edge> bound, boolean isReal)
	{
		int _0 = bound.length;
		boolean _1 = ( _0 < 2 );
		if (_1) 
		{
			haxe.Log.trace.__hx_invoke2_o(0.0, "BREAK ! the hole has less than 2 edges", 0.0, new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"hxDaedalus.data.Mesh", "Mesh.hx", "triangulate"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (1395) )) )})));
			return ;
		}
		 else 
		{
			int _2 = bound.length;
			boolean _3 = ( _2 == 2 );
			if (_3) 
			{
				haxe.Log.trace.__hx_invoke2_o(0.0, "BREAK ! the hole has only 2 edges", 0.0, new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"hxDaedalus.data.Mesh", "Mesh.hx", "triangulate"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (1402) )) )})));
				{
					haxe.root.Array<hxDaedalus.data.Edge> _4 = bound;
					int _5 = _4.__get(0).get_originVertex().get_id();
					java.lang.String _6 = ( "  - edge0: " + _5 );
					java.lang.String _7 = ( _6 + " -> " );
					haxe.root.Array<hxDaedalus.data.Edge> _8 = bound;
					int _9 = _8.__get(0).get_destinationVertex().get_id();
					java.lang.String _10 = ( _7 + _9 );
					java.lang.Object value = _10;
					haxe.Log.trace.__hx_invoke2_o(0.0, value, 0.0, new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"hxDaedalus.data.Mesh", "Mesh.hx", "triangulate"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (1403) )) )})));
				}
				
				{
					haxe.root.Array<hxDaedalus.data.Edge> _11 = bound;
					int _12 = _11.__get(1).get_originVertex().get_id();
					java.lang.String _13 = ( "  - edge1: " + _12 );
					java.lang.String _14 = ( _13 + " -> " );
					haxe.root.Array<hxDaedalus.data.Edge> _15 = bound;
					int _16 = _15.__get(1).get_destinationVertex().get_id();
					java.lang.String _17 = ( _14 + _16 );
					java.lang.Object value1 = _17;
					haxe.Log.trace.__hx_invoke2_o(0.0, value1, 0.0, new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"hxDaedalus.data.Mesh", "Mesh.hx", "triangulate"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (1404) )) )})));
				}
				
				return ;
			}
			 else 
			{
				int _18 = bound.length;
				boolean _19 = ( _18 == 3 );
				if (_19) 
				{
					hxDaedalus.data.Face _20 = new hxDaedalus.data.Face();
					hxDaedalus.data.Face f = _20;
					haxe.root.Array<hxDaedalus.data.Edge> _21 = bound;
					hxDaedalus.data.Edge _22 = _21.__get(0);
					f.setDatas(_22, isReal);
					this._faces.push(f);
					haxe.root.Array<hxDaedalus.data.Edge> _23 = bound;
					_23.__get(0).set_leftFace(f);
					haxe.root.Array<hxDaedalus.data.Edge> _24 = bound;
					_24.__get(1).set_leftFace(f);
					haxe.root.Array<hxDaedalus.data.Edge> _25 = bound;
					_25.__get(2).set_leftFace(f);
					haxe.root.Array<hxDaedalus.data.Edge> _26 = bound;
					haxe.root.Array<hxDaedalus.data.Edge> _27 = bound;
					hxDaedalus.data.Edge _28 = _27.__get(1);
					_26.__get(0).set_nextLeftEdge(_28);
					haxe.root.Array<hxDaedalus.data.Edge> _29 = bound;
					haxe.root.Array<hxDaedalus.data.Edge> _30 = bound;
					hxDaedalus.data.Edge _31 = _30.__get(2);
					_29.__get(1).set_nextLeftEdge(_31);
					haxe.root.Array<hxDaedalus.data.Edge> _32 = bound;
					haxe.root.Array<hxDaedalus.data.Edge> _33 = bound;
					hxDaedalus.data.Edge _34 = _33.__get(0);
					_32.__get(2).set_nextLeftEdge(_34);
				}
				 else 
				{
					haxe.root.Array<hxDaedalus.data.Edge> _35 = bound;
					hxDaedalus.data.Edge _36 = _35.__get(0);
					hxDaedalus.data.Edge baseEdge = _36;
					hxDaedalus.data.Vertex _37 = baseEdge.get_originVertex();
					hxDaedalus.data.Vertex vertexA = _37;
					hxDaedalus.data.Vertex _38 = baseEdge.get_destinationVertex();
					hxDaedalus.data.Vertex vertexB = _38;
					hxDaedalus.data.Vertex vertexC = null;
					hxDaedalus.data.Vertex vertexCheck = null;
					hxDaedalus.data.math.Point2D _39 = new hxDaedalus.data.math.Point2D(((java.lang.Object) (null) ), ((java.lang.Object) (null) ));
					hxDaedalus.data.math.Point2D circumcenter = _39;
					double radiusSquared = 0.0;
					double distanceSquared = 0.0;
					boolean isDelaunay = false;
					int index = 0;
					int i = 0;
					{
						int _g1 = 2;
						int _40 = bound.length;
						int _g = _40;
						while (true)
						{
							boolean _41 = ( _g1 < _g );
							boolean _42 =  ! (_41) ;
							if (_42) 
							{
								break;
							}
							
							int _43 = _g1++;
							int i1 = _43;
							haxe.root.Array<hxDaedalus.data.Edge> _44 = bound;
							hxDaedalus.data.Vertex _45 = _44.__get(i1).get_originVertex();
							vertexC = _45;
							double _46 = vertexC.get_pos().x;
							double _47 = vertexC.get_pos().y;
							int _48 = hxDaedalus.data.math.Geom2D.getRelativePosition2(_46, _47, baseEdge);
							boolean _49 = ( _48 == 1 );
							if (_49) 
							{
								index = i1;
								isDelaunay = true;
								double _50 = vertexA.get_pos().x;
								double _51 = vertexA.get_pos().y;
								double _52 = vertexB.get_pos().x;
								double _53 = vertexB.get_pos().y;
								double _54 = vertexC.get_pos().x;
								double _55 = vertexC.get_pos().y;
								hxDaedalus.data.math.Geom2D.getCircumcenter(_50, _51, _52, _53, _54, _55, circumcenter);
								double _56 = vertexA.get_pos().x;
								double _57 = circumcenter.x;
								double _58 = ( _56 - _57 );
								double _59 = vertexA.get_pos().x;
								double _60 = circumcenter.x;
								double _61 = ( _59 - _60 );
								double _62 = ( _58 * _61 );
								double _63 = vertexA.get_pos().y;
								double _64 = circumcenter.y;
								double _65 = ( _63 - _64 );
								double _66 = vertexA.get_pos().y;
								double _67 = circumcenter.y;
								double _68 = ( _66 - _67 );
								double _69 = ( _65 * _68 );
								double _70 = ( _62 + _69 );
								radiusSquared = _70;
								radiusSquared -= 0.0001;
								{
									int _g3 = 2;
									int _71 = bound.length;
									int _g2 = _71;
									while (true)
									{
										boolean _72 = ( _g3 < _g2 );
										boolean _73 =  ! (_72) ;
										if (_73) 
										{
											break;
										}
										
										int _74 = _g3++;
										int j = _74;
										boolean _75 = ( j != i1 );
										if (_75) 
										{
											haxe.root.Array<hxDaedalus.data.Edge> _76 = bound;
											hxDaedalus.data.Vertex _77 = _76.__get(j).get_originVertex();
											vertexCheck = _77;
											double _78 = vertexCheck.get_pos().x;
											double _79 = circumcenter.x;
											double _80 = ( _78 - _79 );
											double _81 = vertexCheck.get_pos().x;
											double _82 = circumcenter.x;
											double _83 = ( _81 - _82 );
											double _84 = ( _80 * _83 );
											double _85 = vertexCheck.get_pos().y;
											double _86 = circumcenter.y;
											double _87 = ( _85 - _86 );
											double _88 = vertexCheck.get_pos().y;
											double _89 = circumcenter.y;
											double _90 = ( _88 - _89 );
											double _91 = ( _87 * _90 );
											double _92 = ( _84 + _91 );
											distanceSquared = _92;
											boolean _93 = ( distanceSquared < radiusSquared );
											if (_93) 
											{
												isDelaunay = false;
												break;
											}
											
										}
										
									}
									
								}
								
								if (isDelaunay) 
								{
									break;
								}
								
							}
							
						}
						
					}
					
					boolean _94 =  ! (isDelaunay) ;
					if (_94) 
					{
						haxe.Log.trace.__hx_invoke2_o(0.0, "NO DELAUNAY FOUND", 0.0, new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"hxDaedalus.data.Mesh", "Mesh.hx", "triangulate"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (1475) )) )})));
						java.lang.String s = "";
						{
							int _g11 = 0;
							int _95 = bound.length;
							int _g4 = _95;
							while (true)
							{
								boolean _96 = ( _g11 < _g4 );
								boolean _97 =  ! (_96) ;
								if (_97) 
								{
									break;
								}
								
								int _98 = _g11++;
								int i2 = _98;
								haxe.root.Array<hxDaedalus.data.Edge> _99 = bound;
								double _100 = _99.__get(i2).get_originVertex().get_pos().x;
								java.lang.String _101 = ( haxe.lang.Runtime.toString(_100) + " , " );
								s += _101;
								haxe.root.Array<hxDaedalus.data.Edge> _102 = bound;
								double _103 = _102.__get(i2).get_originVertex().get_pos().y;
								java.lang.String _104 = ( haxe.lang.Runtime.toString(_103) + " , " );
								s += _104;
								haxe.root.Array<hxDaedalus.data.Edge> _105 = bound;
								double _106 = _105.__get(i2).get_destinationVertex().get_pos().x;
								java.lang.String _107 = ( haxe.lang.Runtime.toString(_106) + " , " );
								s += _107;
								haxe.root.Array<hxDaedalus.data.Edge> _108 = bound;
								double _109 = _108.__get(i2).get_destinationVertex().get_pos().y;
								java.lang.String _110 = ( haxe.lang.Runtime.toString(_109) + " , " );
								s += _110;
							}
							
						}
						
						index = 2;
					}
					
					hxDaedalus.data.Edge edgeA = null;
					hxDaedalus.data.Edge edgeAopp = null;
					hxDaedalus.data.Edge edgeB = null;
					hxDaedalus.data.Edge edgeBopp = null;
					haxe.root.Array<hxDaedalus.data.Edge> boundA = null;
					haxe.root.Array<hxDaedalus.data.Edge> boundM = null;
					haxe.root.Array<hxDaedalus.data.Edge> boundB = null;
					int _111 = bound.length;
					int _112 = ( _111 - 1 );
					boolean _113 = ( index < _112 );
					if (_113) 
					{
						hxDaedalus.data.Edge _114 = new hxDaedalus.data.Edge();
						edgeA = _114;
						hxDaedalus.data.Edge _115 = new hxDaedalus.data.Edge();
						edgeAopp = _115;
						this._edges.push(edgeA);
						this._edges.push(edgeAopp);
						edgeA.setDatas(vertexA, edgeAopp, null, null, isReal, false);
						haxe.root.Array<hxDaedalus.data.Edge> _116 = bound;
						hxDaedalus.data.Vertex _117 = _116.__get(index).get_originVertex();
						edgeAopp.setDatas(_117, edgeA, null, null, isReal, false);
						haxe.root.Array<hxDaedalus.data.Edge> _118 = bound.slice(index, null);
						boundA = _118;
						boundA.push(edgeA);
						haxe.root.Array<hxDaedalus.data.Edge> _119 = boundA;
						this.triangulate(_119, isReal);
					}
					
					boolean _120 = ( index > 2 );
					if (_120) 
					{
						hxDaedalus.data.Edge _121 = new hxDaedalus.data.Edge();
						edgeB = _121;
						hxDaedalus.data.Edge _122 = new hxDaedalus.data.Edge();
						edgeBopp = _122;
						this._edges.push(edgeB);
						this._edges.push(edgeBopp);
						haxe.root.Array<hxDaedalus.data.Edge> _123 = bound;
						hxDaedalus.data.Vertex _124 = _123.__get(1).get_originVertex();
						edgeB.setDatas(_124, edgeBopp, null, null, isReal, false);
						haxe.root.Array<hxDaedalus.data.Edge> _125 = bound;
						hxDaedalus.data.Vertex _126 = _125.__get(index).get_originVertex();
						edgeBopp.setDatas(_126, edgeB, null, null, isReal, false);
						haxe.root.Array<hxDaedalus.data.Edge> _127 = bound.slice(1, index);
						boundB = _127;
						boundB.push(edgeBopp);
						haxe.root.Array<hxDaedalus.data.Edge> _128 = boundB;
						this.triangulate(_128, isReal);
					}
					
					boolean _129 = ( index == 2 );
					if (_129) 
					{
						haxe.root.Array<hxDaedalus.data.Edge> _130 = bound;
						hxDaedalus.data.Edge _131 = _130.__get(1);
						haxe.root.Array<hxDaedalus.data.Edge> _132 = new haxe.root.Array<hxDaedalus.data.Edge>(new hxDaedalus.data.Edge[]{baseEdge, _131, edgeAopp});
						boundM = _132;
					}
					 else 
					{
						int _133 = bound.length;
						int _134 = ( _133 - 1 );
						boolean _135 = ( index == _134 );
						if (_135) 
						{
							haxe.root.Array<hxDaedalus.data.Edge> _136 = bound;
							hxDaedalus.data.Edge _137 = _136.__get(index);
							haxe.root.Array<hxDaedalus.data.Edge> _138 = new haxe.root.Array<hxDaedalus.data.Edge>(new hxDaedalus.data.Edge[]{baseEdge, edgeB, _137});
							boundM = _138;
						}
						 else 
						{
							haxe.root.Array<hxDaedalus.data.Edge> _139 = new haxe.root.Array<hxDaedalus.data.Edge>(new hxDaedalus.data.Edge[]{baseEdge, edgeB, edgeAopp});
							boundM = _139;
						}
						
					}
					
					haxe.root.Array<hxDaedalus.data.Edge> _140 = boundM;
					this.triangulate(_140, isReal);
				}
				
			}
			
		}
		
	}
	
	
	public   int findPositionFromBounds(double x, double y)
	{
		boolean _0 = ( x <= 0 );
		if (_0) 
		{
			boolean _1 = ( y <= 0 );
			if (_1) 
			{
				return 1;
			}
			 else 
			{
				double _2 = this._height;
				boolean _3 = ( y >= _2 );
				if (_3) 
				{
					return 7;
				}
				 else 
				{
					return 8;
				}
				
			}
			
		}
		 else 
		{
			double _4 = this._width;
			boolean _5 = ( x >= _4 );
			if (_5) 
			{
				boolean _6 = ( y <= 0 );
				if (_6) 
				{
					return 3;
				}
				 else 
				{
					double _7 = this._height;
					boolean _8 = ( y >= _7 );
					if (_8) 
					{
						return 5;
					}
					 else 
					{
						return 4;
					}
					
				}
				
			}
			 else 
			{
				boolean _9 = ( y <= 0 );
				if (_9) 
				{
					return 2;
				}
				 else 
				{
					double _10 = this._height;
					boolean _11 = ( y >= _10 );
					if (_11) 
					{
						return 6;
					}
					 else 
					{
						return 0;
					}
					
				}
				
			}
			
		}
		
	}
	
	
	public   void debug()
	{
		int i = 0;
		{
			int _g1 = 0;
			int _0 = this._vertices.length;
			int _g = _0;
			while (true)
			{
				boolean _1 = ( _g1 < _g );
				boolean _2 =  ! (_1) ;
				if (_2) 
				{
					break;
				}
				
				int _3 = _g1++;
				int i1 = _3;
				{
					haxe.root.Array<hxDaedalus.data.Vertex> _4 = this._vertices;
					int _5 = _4.__get(i1).get_id();
					java.lang.String _6 = ( "-- vertex " + _5 );
					java.lang.Object value = _6;
					haxe.Log.trace.__hx_invoke2_o(0.0, value, 0.0, new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"hxDaedalus.data.Mesh", "Mesh.hx", "debug"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (1567) )) )})));
				}
				
				{
					haxe.root.Array<hxDaedalus.data.Vertex> _7 = this._vertices;
					int _8 = _7.__get(i1).get_edge().get_id();
					java.lang.String _9 = ( "  edge " + _8 );
					java.lang.String _10 = ( _9 + " - " );
					haxe.root.Array<hxDaedalus.data.Vertex> _11 = this._vertices;
					hxDaedalus.data.Edge _12 = _11.__get(i1).get_edge();
					java.lang.String _13 = haxe.root.Std.string(_12);
					java.lang.String _14 = ( _10 + _13 );
					java.lang.Object value1 = _14;
					haxe.Log.trace.__hx_invoke2_o(0.0, value1, 0.0, new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"hxDaedalus.data.Mesh", "Mesh.hx", "debug"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (1568) )) )})));
				}
				
				{
					haxe.root.Array<hxDaedalus.data.Vertex> _15 = this._vertices;
					boolean _16 = _15.__get(i1).get_edge().get_isReal();
					java.lang.String _17 = haxe.root.Std.string(_16);
					java.lang.String _18 = ( "  edge isReal: " + _17 );
					java.lang.Object value2 = _18;
					haxe.Log.trace.__hx_invoke2_o(0.0, value2, 0.0, new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"hxDaedalus.data.Mesh", "Mesh.hx", "debug"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (1569) )) )})));
				}
				
			}
			
		}
		
		{
			int _g11 = 0;
			int _19 = this._edges.length;
			int _g2 = _19;
			while (true)
			{
				boolean _20 = ( _g11 < _g2 );
				boolean _21 =  ! (_20) ;
				if (_21) 
				{
					break;
				}
				
				int _22 = _g11++;
				int i2 = _22;
				{
					haxe.root.Array<hxDaedalus.data.Edge> _23 = this._edges;
					hxDaedalus.data.Edge _24 = _23.__get(i2);
					java.lang.String _25 = haxe.root.Std.string(_24);
					java.lang.String _26 = ( "-- edge " + _25 );
					java.lang.Object value3 = _26;
					haxe.Log.trace.__hx_invoke2_o(0.0, value3, 0.0, new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"hxDaedalus.data.Mesh", "Mesh.hx", "debug"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (1572) )) )})));
				}
				
				{
					haxe.root.Array<hxDaedalus.data.Edge> _27 = this._edges;
					int _28 = _27.__get(i2).get_id();
					java.lang.String _29 = ( "  isReal " + _28 );
					java.lang.String _30 = ( _29 + " - " );
					haxe.root.Array<hxDaedalus.data.Edge> _31 = this._edges;
					boolean _32 = _31.__get(i2).get_isReal();
					java.lang.String _33 = haxe.root.Std.string(_32);
					java.lang.String _34 = ( _30 + _33 );
					java.lang.Object value4 = _34;
					haxe.Log.trace.__hx_invoke2_o(0.0, value4, 0.0, new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"hxDaedalus.data.Mesh", "Mesh.hx", "debug"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (1573) )) )})));
				}
				
				{
					haxe.root.Array<hxDaedalus.data.Edge> _35 = this._edges;
					hxDaedalus.data.Edge _36 = _35.__get(i2).get_nextLeftEdge();
					java.lang.String _37 = haxe.root.Std.string(_36);
					java.lang.String _38 = ( "  nextLeftEdge " + _37 );
					java.lang.Object value5 = _38;
					haxe.Log.trace.__hx_invoke2_o(0.0, value5, 0.0, new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"hxDaedalus.data.Mesh", "Mesh.hx", "debug"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (1574) )) )})));
				}
				
				{
					haxe.root.Array<hxDaedalus.data.Edge> _39 = this._edges;
					hxDaedalus.data.Edge _40 = _39.__get(i2).get_oppositeEdge();
					java.lang.String _41 = haxe.root.Std.string(_40);
					java.lang.String _42 = ( "  oppositeEdge " + _41 );
					java.lang.Object value6 = _42;
					haxe.Log.trace.__hx_invoke2_o(0.0, value6, 0.0, new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"hxDaedalus.data.Mesh", "Mesh.hx", "debug"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (1575) )) )})));
				}
				
			}
			
		}
		
	}
	
	
	@Override public   double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef122 = true;
			switch (field.hashCode())
			{
				case 1487441478:
				{
					if (field.equals("_height")) 
					{
						__temp_executeDef122 = false;
						this._height = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 94650:
				{
					if (field.equals("_id")) 
					{
						__temp_executeDef122 = false;
						this._id = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -1462071097:
				{
					if (field.equals("_width")) 
					{
						__temp_executeDef122 = false;
						this._width = ((double) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef122) 
			{
				return super.__hx_setField_f(field, value, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef123 = true;
			switch (field.hashCode())
			{
				case -542726801:
				{
					if (field.equals("__objectsUpdateInProgress")) 
					{
						__temp_executeDef123 = false;
						this.__objectsUpdateInProgress = haxe.lang.Runtime.toBool(value);
						return value;
					}
					
					break;
				}
				
				
				case 918617282:
				{
					if (field.equals("clipping")) 
					{
						__temp_executeDef123 = false;
						this.set_clipping(haxe.lang.Runtime.toBool(value));
						return value;
					}
					
					break;
				}
				
				
				case 367204343:
				{
					if (field.equals("__edgesToCheck")) 
					{
						__temp_executeDef123 = false;
						this.__edgesToCheck = ((haxe.root.Array<hxDaedalus.data.Edge>) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 94650:
				{
					if (field.equals("_id")) 
					{
						__temp_executeDef123 = false;
						this._id = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 1431196217:
				{
					if (field.equals("__centerVertex")) 
					{
						__temp_executeDef123 = false;
						this.__centerVertex = ((hxDaedalus.data.Vertex) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -1462071097:
				{
					if (field.equals("_width")) 
					{
						__temp_executeDef123 = false;
						this._width = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 698575829:
				{
					if (field.equals("_objects")) 
					{
						__temp_executeDef123 = false;
						this._objects = ((haxe.root.Array<hxDaedalus.data.Object>) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 1487441478:
				{
					if (field.equals("_height")) 
					{
						__temp_executeDef123 = false;
						this._height = ((double) (haxe.lang.Runtime.toDouble(value)) );
						return value;
					}
					
					break;
				}
				
				
				case -1416138866:
				{
					if (field.equals("_constraintShapes")) 
					{
						__temp_executeDef123 = false;
						this._constraintShapes = ((haxe.root.Array<hxDaedalus.data.ConstraintShape>) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 1009135137:
				{
					if (field.equals("_clipping")) 
					{
						__temp_executeDef123 = false;
						this._clipping = haxe.lang.Runtime.toBool(value);
						return value;
					}
					
					break;
				}
				
				
				case -1478010697:
				{
					if (field.equals("_faces")) 
					{
						__temp_executeDef123 = false;
						this._faces = ((haxe.root.Array<hxDaedalus.data.Face>) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -1893623464:
				{
					if (field.equals("_vertices")) 
					{
						__temp_executeDef123 = false;
						this._vertices = ((haxe.root.Array<hxDaedalus.data.Vertex>) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -1478841001:
				{
					if (field.equals("_edges")) 
					{
						__temp_executeDef123 = false;
						this._edges = ((haxe.root.Array<hxDaedalus.data.Edge>) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef123) 
			{
				return super.__hx_setField(field, value, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		{
			boolean __temp_executeDef124 = true;
			switch (field.hashCode())
			{
				case 95458899:
				{
					if (field.equals("debug")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("debug"))) );
					}
					
					break;
				}
				
				
				case -1221029593:
				{
					if (field.equals("height")) 
					{
						__temp_executeDef124 = false;
						return this.get_height();
					}
					
					break;
				}
				
				
				case -1886126431:
				{
					if (field.equals("findPositionFromBounds")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("findPositionFromBounds"))) );
					}
					
					break;
				}
				
				
				case 113126854:
				{
					if (field.equals("width")) 
					{
						__temp_executeDef124 = false;
						return this.get_width();
					}
					
					break;
				}
				
				
				case -569584212:
				{
					if (field.equals("triangulate")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("triangulate"))) );
					}
					
					break;
				}
				
				
				case 918617282:
				{
					if (field.equals("clipping")) 
					{
						__temp_executeDef124 = false;
						return this.get_clipping();
					}
					
					break;
				}
				
				
				case 776199539:
				{
					if (field.equals("untriangulate")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("untriangulate"))) );
					}
					
					break;
				}
				
				
				case 3355:
				{
					if (field.equals("id")) 
					{
						__temp_executeDef124 = false;
						return this.get_id();
					}
					
					break;
				}
				
				
				case -687999185:
				{
					if (field.equals("deleteVertex")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("deleteVertex"))) );
					}
					
					break;
				}
				
				
				case -1648731889:
				{
					if (field.equals("__constraintShapes")) 
					{
						__temp_executeDef124 = false;
						return this.get___constraintShapes();
					}
					
					break;
				}
				
				
				case 206143175:
				{
					if (field.equals("restoreAsDelaunay")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("restoreAsDelaunay"))) );
					}
					
					break;
				}
				
				
				case 94650:
				{
					if (field.equals("_id")) 
					{
						__temp_executeDef124 = false;
						return this._id;
					}
					
					break;
				}
				
				
				case 403916951:
				{
					if (field.equals("splitFace")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("splitFace"))) );
					}
					
					break;
				}
				
				
				case -1462071097:
				{
					if (field.equals("_width")) 
					{
						__temp_executeDef124 = false;
						return this._width;
					}
					
					break;
				}
				
				
				case 403890167:
				{
					if (field.equals("splitEdge")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("splitEdge"))) );
					}
					
					break;
				}
				
				
				case 1487441478:
				{
					if (field.equals("_height")) 
					{
						__temp_executeDef124 = false;
						return this._height;
					}
					
					break;
				}
				
				
				case 1850794954:
				{
					if (field.equals("flipEdge")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("flipEdge"))) );
					}
					
					break;
				}
				
				
				case 1009135137:
				{
					if (field.equals("_clipping")) 
					{
						__temp_executeDef124 = false;
						return this._clipping;
					}
					
					break;
				}
				
				
				case 826126781:
				{
					if (field.equals("insertVertex")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("insertVertex"))) );
					}
					
					break;
				}
				
				
				case -1893623464:
				{
					if (field.equals("_vertices")) 
					{
						__temp_executeDef124 = false;
						return this._vertices;
					}
					
					break;
				}
				
				
				case 94627080:
				{
					if (field.equals("check")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("check"))) );
					}
					
					break;
				}
				
				
				case -1478841001:
				{
					if (field.equals("_edges")) 
					{
						__temp_executeDef124 = false;
						return this._edges;
					}
					
					break;
				}
				
				
				case 997368875:
				{
					if (field.equals("deleteConstraintSegment")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("deleteConstraintSegment"))) );
					}
					
					break;
				}
				
				
				case -1478010697:
				{
					if (field.equals("_faces")) 
					{
						__temp_executeDef124 = false;
						return this._faces;
					}
					
					break;
				}
				
				
				case 1763944460:
				{
					if (field.equals("insertNewConstrainedEdge")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("insertNewConstrainedEdge"))) );
					}
					
					break;
				}
				
				
				case -1416138866:
				{
					if (field.equals("_constraintShapes")) 
					{
						__temp_executeDef124 = false;
						return this._constraintShapes;
					}
					
					break;
				}
				
				
				case -1434164003:
				{
					if (field.equals("insertConstraintSegment")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("insertConstraintSegment"))) );
					}
					
					break;
				}
				
				
				case 698575829:
				{
					if (field.equals("_objects")) 
					{
						__temp_executeDef124 = false;
						return this._objects;
					}
					
					break;
				}
				
				
				case 528495257:
				{
					if (field.equals("deleteConstraintShape")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("deleteConstraintShape"))) );
					}
					
					break;
				}
				
				
				case 1431196217:
				{
					if (field.equals("__centerVertex")) 
					{
						__temp_executeDef124 = false;
						return this.__centerVertex;
					}
					
					break;
				}
				
				
				case -1190234165:
				{
					if (field.equals("insertConstraintShape")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("insertConstraintShape"))) );
					}
					
					break;
				}
				
				
				case 367204343:
				{
					if (field.equals("__edgesToCheck")) 
					{
						__temp_executeDef124 = false;
						return this.__edgesToCheck;
					}
					
					break;
				}
				
				
				case 1139367947:
				{
					if (field.equals("updateObjects")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("updateObjects"))) );
					}
					
					break;
				}
				
				
				case 859648560:
				{
					if (field.equals("get_height")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("get_height"))) );
					}
					
					break;
				}
				
				
				case -542726801:
				{
					if (field.equals("__objectsUpdateInProgress")) 
					{
						__temp_executeDef124 = false;
						return this.__objectsUpdateInProgress;
					}
					
					break;
				}
				
				
				case 1150076829:
				{
					if (field.equals("get_width")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("get_width"))) );
					}
					
					break;
				}
				
				
				case -891426614:
				{
					if (field.equals("deleteObject")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("deleteObject"))) );
					}
					
					break;
				}
				
				
				case -1004437621:
				{
					if (field.equals("get_clipping")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("get_clipping"))) );
					}
					
					break;
				}
				
				
				case 622699352:
				{
					if (field.equals("insertObject")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("insertObject"))) );
					}
					
					break;
				}
				
				
				case 544555007:
				{
					if (field.equals("set_clipping")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("set_clipping"))) );
					}
					
					break;
				}
				
				
				case -784041559:
				{
					if (field.equals("buildFromRecord")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("buildFromRecord"))) );
					}
					
					break;
				}
				
				
				case -1249338716:
				{
					if (field.equals("get_id")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("get_id"))) );
					}
					
					break;
				}
				
				
				case -42945384:
				{
					if (field.equals("get___constraintShapes")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("get___constraintShapes"))) );
					}
					
					break;
				}
				
				
				case 1671767583:
				{
					if (field.equals("dispose")) 
					{
						__temp_executeDef124 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("dispose"))) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef124) 
			{
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		{
			boolean __temp_executeDef125 = true;
			switch (field.hashCode())
			{
				case 1487441478:
				{
					if (field.equals("_height")) 
					{
						__temp_executeDef125 = false;
						return this._height;
					}
					
					break;
				}
				
				
				case -1221029593:
				{
					if (field.equals("height")) 
					{
						__temp_executeDef125 = false;
						return this.get_height();
					}
					
					break;
				}
				
				
				case -1462071097:
				{
					if (field.equals("_width")) 
					{
						__temp_executeDef125 = false;
						return this._width;
					}
					
					break;
				}
				
				
				case 113126854:
				{
					if (field.equals("width")) 
					{
						__temp_executeDef125 = false;
						return this.get_width();
					}
					
					break;
				}
				
				
				case 94650:
				{
					if (field.equals("_id")) 
					{
						__temp_executeDef125 = false;
						return ((double) (this._id) );
					}
					
					break;
				}
				
				
				case 3355:
				{
					if (field.equals("id")) 
					{
						__temp_executeDef125 = false;
						return ((double) (this.get_id()) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef125) 
			{
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		{
			boolean __temp_executeDef126 = true;
			switch (field.hashCode())
			{
				case 95458899:
				{
					if (field.equals("debug")) 
					{
						__temp_executeDef126 = false;
						this.debug();
					}
					
					break;
				}
				
				
				case 859648560:
				{
					if (field.equals("get_height")) 
					{
						__temp_executeDef126 = false;
						return this.get_height();
					}
					
					break;
				}
				
				
				case -1886126431:
				{
					if (field.equals("findPositionFromBounds")) 
					{
						__temp_executeDef126 = false;
						return this.findPositionFromBounds(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ));
					}
					
					break;
				}
				
				
				case 1150076829:
				{
					if (field.equals("get_width")) 
					{
						__temp_executeDef126 = false;
						return this.get_width();
					}
					
					break;
				}
				
				
				case -569584212:
				{
					if (field.equals("triangulate")) 
					{
						__temp_executeDef126 = false;
						this.triangulate(((haxe.root.Array<hxDaedalus.data.Edge>) (dynargs.__get(0)) ), haxe.lang.Runtime.toBool(dynargs.__get(1)));
					}
					
					break;
				}
				
				
				case -1004437621:
				{
					if (field.equals("get_clipping")) 
					{
						__temp_executeDef126 = false;
						return this.get_clipping();
					}
					
					break;
				}
				
				
				case 776199539:
				{
					if (field.equals("untriangulate")) 
					{
						__temp_executeDef126 = false;
						this.untriangulate(((haxe.root.Array<hxDaedalus.data.Edge>) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 544555007:
				{
					if (field.equals("set_clipping")) 
					{
						__temp_executeDef126 = false;
						return this.set_clipping(haxe.lang.Runtime.toBool(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case -687999185:
				{
					if (field.equals("deleteVertex")) 
					{
						__temp_executeDef126 = false;
						return this.deleteVertex(((hxDaedalus.data.Vertex) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case -1249338716:
				{
					if (field.equals("get_id")) 
					{
						__temp_executeDef126 = false;
						return this.get_id();
					}
					
					break;
				}
				
				
				case 206143175:
				{
					if (field.equals("restoreAsDelaunay")) 
					{
						__temp_executeDef126 = false;
						this.restoreAsDelaunay();
					}
					
					break;
				}
				
				
				case 1671767583:
				{
					if (field.equals("dispose")) 
					{
						__temp_executeDef126 = false;
						this.dispose();
					}
					
					break;
				}
				
				
				case 403916951:
				{
					if (field.equals("splitFace")) 
					{
						__temp_executeDef126 = false;
						return this.splitFace(((hxDaedalus.data.Face) (dynargs.__get(0)) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(2))) ));
					}
					
					break;
				}
				
				
				case -42945384:
				{
					if (field.equals("get___constraintShapes")) 
					{
						__temp_executeDef126 = false;
						return this.get___constraintShapes();
					}
					
					break;
				}
				
				
				case 403890167:
				{
					if (field.equals("splitEdge")) 
					{
						__temp_executeDef126 = false;
						return this.splitEdge(((hxDaedalus.data.Edge) (dynargs.__get(0)) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(2))) ));
					}
					
					break;
				}
				
				
				case -784041559:
				{
					if (field.equals("buildFromRecord")) 
					{
						__temp_executeDef126 = false;
						this.buildFromRecord(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case 1850794954:
				{
					if (field.equals("flipEdge")) 
					{
						__temp_executeDef126 = false;
						return this.flipEdge(((hxDaedalus.data.Edge) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 622699352:
				{
					if (field.equals("insertObject")) 
					{
						__temp_executeDef126 = false;
						this.insertObject(((hxDaedalus.data.Object) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 826126781:
				{
					if (field.equals("insertVertex")) 
					{
						__temp_executeDef126 = false;
						return this.insertVertex(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ));
					}
					
					break;
				}
				
				
				case -891426614:
				{
					if (field.equals("deleteObject")) 
					{
						__temp_executeDef126 = false;
						this.deleteObject(((hxDaedalus.data.Object) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 94627080:
				{
					if (field.equals("check")) 
					{
						__temp_executeDef126 = false;
						this.check();
					}
					
					break;
				}
				
				
				case 1139367947:
				{
					if (field.equals("updateObjects")) 
					{
						__temp_executeDef126 = false;
						this.updateObjects();
					}
					
					break;
				}
				
				
				case 997368875:
				{
					if (field.equals("deleteConstraintSegment")) 
					{
						__temp_executeDef126 = false;
						this.deleteConstraintSegment(((hxDaedalus.data.ConstraintSegment) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case -1190234165:
				{
					if (field.equals("insertConstraintShape")) 
					{
						__temp_executeDef126 = false;
						return this.insertConstraintShape(((haxe.root.Array<java.lang.Object>) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 1763944460:
				{
					if (field.equals("insertNewConstrainedEdge")) 
					{
						__temp_executeDef126 = false;
						this.insertNewConstrainedEdge(((hxDaedalus.data.ConstraintSegment) (dynargs.__get(0)) ), ((hxDaedalus.data.Edge) (dynargs.__get(1)) ), ((haxe.root.Array<hxDaedalus.data.Edge>) (dynargs.__get(2)) ), ((haxe.root.Array<hxDaedalus.data.Edge>) (dynargs.__get(3)) ), ((haxe.root.Array<hxDaedalus.data.Edge>) (dynargs.__get(4)) ));
					}
					
					break;
				}
				
				
				case 528495257:
				{
					if (field.equals("deleteConstraintShape")) 
					{
						__temp_executeDef126 = false;
						this.deleteConstraintShape(((hxDaedalus.data.ConstraintShape) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case -1434164003:
				{
					if (field.equals("insertConstraintSegment")) 
					{
						__temp_executeDef126 = false;
						return this.insertConstraintSegment(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(3))) ));
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef126) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		return null;
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("__objectsUpdateInProgress");
		baseArr.push("__edgesToCheck");
		baseArr.push("__centerVertex");
		baseArr.push("_objects");
		baseArr.push("_constraintShapes");
		baseArr.push("_faces");
		baseArr.push("_edges");
		baseArr.push("_vertices");
		baseArr.push("_clipping");
		baseArr.push("_height");
		baseArr.push("_width");
		baseArr.push("_id");
		baseArr.push("__constraintShapes");
		baseArr.push("id");
		baseArr.push("clipping");
		baseArr.push("width");
		baseArr.push("height");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


