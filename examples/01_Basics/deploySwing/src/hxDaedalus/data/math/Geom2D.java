package hxDaedalus.data.math;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Geom2D extends haxe.lang.HxObject
{
	static 
	{
		hxDaedalus.data.math.Geom2D.__samples = new haxe.root.Array<hxDaedalus.data.Vertex>();
		hxDaedalus.data.math.Geom2D.__circumcenter = new hxDaedalus.data.math.Point2D(((java.lang.Object) (null) ), ((java.lang.Object) (null) ));
	}
	public    Geom2D(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    Geom2D()
	{
		hxDaedalus.data.math.Geom2D.__hx_ctor_hxDaedalus_data_math_Geom2D(this);
	}
	
	
	public static   void __hx_ctor_hxDaedalus_data_math_Geom2D(hxDaedalus.data.math.Geom2D __temp_me28)
	{
		{
		}
		
	}
	
	
	public static  hxDaedalus.data.math.RandGenerator _randGen;
	
	public static  haxe.root.Array<hxDaedalus.data.Vertex> __samples;
	
	public static   hxDaedalus.data.math.Intersection locatePosition(double x, double y, hxDaedalus.data.Mesh mesh)
	{
		hxDaedalus.data.math.RandGenerator _1 = hxDaedalus.data.math.Geom2D._randGen;
		boolean _2 = ( _1 == null );
		if (_2) 
		{
			hxDaedalus.data.math.RandGenerator _3 = new hxDaedalus.data.math.RandGenerator(((java.lang.Object) (null) ), ((java.lang.Object) (null) ), ((java.lang.Object) (null) ));
			hxDaedalus.data.math.Geom2D._randGen = _3;
		}
		
		double _4 = ( x * 10 );
		double _5 = ( 4 * y );
		int _6 = ((int) (( _4 + _5 )) );
		hxDaedalus.data.math.Geom2D._randGen.set_seed(_6);
		int i = 0;
		int _7 = hxDaedalus.data.math.Geom2D.__samples.length;
		hxDaedalus.data.math.Geom2D.__samples.splice(0, _7);
		int _10 = 0;
		{
			int _8 = mesh._vertices.length;
			double _9 = java.lang.Math.pow(((double) (_8) ), 0.333333333333333315);
			double x1 = _9;
			_10 = ((int) (x1) );
		}
		
		int numSamples = _10;
		hxDaedalus.data.math.Geom2D._randGen.rangeMin = 0;
		int _11 = mesh._vertices.length;
		int _12 = ( _11 - 1 );
		hxDaedalus.data.math.Geom2D._randGen.rangeMax = _12;
		{
			int _g = 0;
			while (true)
			{
				boolean _13 = ( _g < numSamples );
				boolean _14 =  ! (_13) ;
				if (_14) 
				{
					break;
				}
				
				int _15 = _g++;
				int i1 = _15;
				int _16 = hxDaedalus.data.math.Geom2D._randGen.next();
				int _rnd = _16;
				boolean _19 = ( _rnd < 0 );
				boolean _20 =  ! (_19) ;
				boolean _23 = false;
				if (_20) 
				{
					int _21 = mesh._vertices.length;
					int _17 = _21;
					int _22 = ( _17 - 1 );
					int _18 = _22;
					_23 = ( _rnd > _18 );
				}
				 else 
				{
					_23 = true;
				}
				
				java.lang.String _24 = ( "_rnd: " + _rnd );
				java.lang.Object _25 = new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"hxDaedalus.data.math.Geom2D", "Geom2D.hx", "locatePosition"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (67) )) )}));
				hxDaedalus.debug.Debug.assertFalse(_23, _24, _25);
				haxe.root.Array<hxDaedalus.data.Vertex> _26 = mesh._vertices;
				haxe.root.Array<hxDaedalus.data.Vertex> _27 = null;
				boolean _28 = ( _26 == _27 );
				int _29 = mesh._vertices.length;
				java.lang.String _30 = ( "vertices: " + _29 );
				java.lang.Object _31 = new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"hxDaedalus.data.math.Geom2D", "Geom2D.hx", "locatePosition"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (68) )) )}));
				hxDaedalus.debug.Debug.assertFalse(_28, _30, _31);
				haxe.root.Array<hxDaedalus.data.Vertex> _32 = mesh._vertices;
				hxDaedalus.data.Vertex _33 = _32.__get(_rnd);
				hxDaedalus.data.math.Geom2D.__samples.push(_33);
			}
			
		}
		
		hxDaedalus.data.Vertex currVertex = null;
		hxDaedalus.data.math.Point2D currVertexPos = null;
		double distSquared = 0.0;
		double _34 = java.lang.Double.POSITIVE_INFINITY;
		double minDistSquared = _34;
		hxDaedalus.data.Vertex closedVertex = null;
		{
			int _g1 = 0;
			while (true)
			{
				boolean _35 = ( _g1 < numSamples );
				boolean _36 =  ! (_35) ;
				if (_36) 
				{
					break;
				}
				
				int _37 = _g1++;
				int i2 = _37;
				haxe.root.Array<hxDaedalus.data.Vertex> _38 = hxDaedalus.data.math.Geom2D.__samples;
				hxDaedalus.data.Vertex _39 = _38.__get(i2);
				currVertex = _39;
				hxDaedalus.data.math.Point2D _40 = currVertex.get_pos();
				currVertexPos = _40;
				double _41 = currVertexPos.x;
				double _42 = ( _41 - x );
				double _43 = currVertexPos.x;
				double _44 = ( _43 - x );
				double _45 = ( _42 * _44 );
				double _46 = currVertexPos.y;
				double _47 = ( _46 - y );
				double _48 = currVertexPos.y;
				double _49 = ( _48 - y );
				double _50 = ( _47 * _49 );
				double _51 = ( _45 + _50 );
				distSquared = _51;
				boolean _52 = ( distSquared < minDistSquared );
				if (_52) 
				{
					minDistSquared = distSquared;
					closedVertex = currVertex;
				}
				
			}
			
		}
		
		hxDaedalus.data.Face currFace = null;
		hxDaedalus.iterators.FromVertexToHoldingFaces _53 = new hxDaedalus.iterators.FromVertexToHoldingFaces();
		hxDaedalus.iterators.FromVertexToHoldingFaces iterFace = _53;
		iterFace.set_fromVertex(closedVertex);
		hxDaedalus.data.Face _54 = iterFace.next();
		currFace = _54;
		haxe.ds.ObjectMap<hxDaedalus.data.Face, java.lang.Object> _56 = null;
		{
			haxe.ds.ObjectMap<hxDaedalus.data.Face, java.lang.Object> _55 = new haxe.ds.ObjectMap<hxDaedalus.data.Face, java.lang.Object>();
			haxe.ds.ObjectMap<hxDaedalus.data.Face, java.lang.Object> _0 = _55;
			_56 = _0;
		}
		
		haxe.ds.ObjectMap<hxDaedalus.data.Face, java.lang.Object> faceVisited = _56;
		hxDaedalus.data.Edge currEdge = null;
		hxDaedalus.iterators.FromFaceToInnerEdges _57 = new hxDaedalus.iterators.FromFaceToInnerEdges();
		hxDaedalus.iterators.FromFaceToInnerEdges iterEdge = _57;
		hxDaedalus.data.math.Intersection _58 = hxDaedalus.data.math.Intersection.ENull;
		hxDaedalus.data.math.Intersection objectContainer = _58;
		int relativPos = 0;
		int numIter = 0;
		while (true)
		{
			java.lang.Object _61 = faceVisited.get(currFace);
			boolean _62 = ( ! (haxe.lang.Runtime.toBool(_61)) );
			boolean _64 = false;
			if (_62) 
			{
				hxDaedalus.data.math.Intersection _63 = hxDaedalus.data.math.Geom2D.isInFace(x, y, currFace);
				hxDaedalus.data.math.Intersection _59 = _63;
				objectContainer = _59;
				hxDaedalus.data.math.Intersection _60 = objectContainer;
				hxDaedalus.data.math.Intersection _g2 = _60;
				switch (haxe.root.Type.enumIndex(_g2))
				{
					case 3:
					{
						_64 = true;
						break;
					}
					
					
					default:
					{
						_64 = false;
						break;
					}
					
				}
				
			}
			 else 
			{
				_64 = true;
			}
			
			boolean _65 =  ! (_64) ;
			if (_65) 
			{
				break;
			}
			
			faceVisited.get(currFace);
			numIter++;
			boolean _66 = ( numIter == 50 );
			if (_66) 
			{
				haxe.Log.trace.__hx_invoke2_o(0.0, "WALK TAKE MORE THAN 50 LOOP", 0.0, new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"hxDaedalus.data.math.Geom2D", "Geom2D.hx", "locatePosition"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (107) )) )})));
			}
			
			iterEdge.set_fromFace(currFace);
			while (true)
			{
				hxDaedalus.data.Edge _67 = iterEdge.next();
				currEdge = _67;
				boolean _68 = ( currEdge == null );
				if (_68) 
				{
					haxe.Log.trace.__hx_invoke2_o(0.0, "KILL PATH", 0.0, new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"hxDaedalus.data.math.Geom2D", "Geom2D.hx", "locatePosition"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (((double) (115) )) )})));
					hxDaedalus.data.math.Intersection _69 = hxDaedalus.data.math.Intersection.ENull;
					return _69;
				}
				
				int _70 = hxDaedalus.data.math.Geom2D.getRelativePosition(x, y, currEdge);
				relativPos = _70;
				boolean _71 = ( relativPos == 1 );
				boolean _72 =  ! (_71) ;
				boolean _73 = false;
				if (_72) 
				{
					_73 = ( relativPos == 0 );
				}
				 else 
				{
					_73 = true;
				}
				
				boolean _74 =  ! (_73) ;
				if (_74) 
				{
					break;
				}
				
			}
			
			hxDaedalus.data.Face _75 = currEdge.get_rightFace();
			currFace = _75;
		}
		
		return objectContainer;
	}
	
	
	public static   boolean isCircleIntersectingAnyConstraint(double x, double y, double radius, hxDaedalus.data.Mesh mesh)
	{
		boolean _2 = ( x <= 0 );
		boolean _3 =  ! (_2) ;
		boolean _6 = false;
		if (_3) 
		{
			double _5 = mesh.get_width();
			double _4 = _5;
			double _1 = _4;
			_6 = ( x >= _1 );
		}
		 else 
		{
			_6 = true;
		}
		
		boolean _7 =  ! (_6) ;
		boolean _9 = false;
		if (_7) 
		{
			_9 = ( y <= 0 );
		}
		 else 
		{
			_9 = true;
		}
		
		boolean _10 =  ! (_9) ;
		boolean _12 = false;
		if (_10) 
		{
			double _11 = mesh.get_height();
			double _8 = _11;
			_12 = ( y >= _8 );
		}
		 else 
		{
			_12 = true;
		}
		
		if (_12) 
		{
			return true;
		}
		
		hxDaedalus.data.math.Intersection _13 = hxDaedalus.data.math.Geom2D.locatePosition(x, y, mesh);
		hxDaedalus.data.math.Intersection loc = _13;
		hxDaedalus.data.Face face = null;
		switch (haxe.root.Type.enumIndex(loc))
		{
			case 0:
			{
				hxDaedalus.data.Vertex vertex = ((hxDaedalus.data.Vertex) (loc.params.__get(0)) );
				{
					hxDaedalus.data.Face _14 = vertex.get_edge().get_leftFace();
					face = _14;
				}
				
				break;
			}
			
			
			case 1:
			{
				hxDaedalus.data.Edge edge = ((hxDaedalus.data.Edge) (loc.params.__get(0)) );
				{
					hxDaedalus.data.Face _15 = edge.get_leftFace();
					face = _15;
				}
				
				break;
			}
			
			
			case 2:
			{
				hxDaedalus.data.Face face_ = ((hxDaedalus.data.Face) (loc.params.__get(0)) );
				face = face_;
				break;
			}
			
			
			case 3:
			{
				face = null;
				break;
			}
			
			
		}
		
		double _16 = ( radius * radius );
		double radiusSquared = _16;
		hxDaedalus.data.math.Point2D pos = null;
		double distSquared = 0.0;
		hxDaedalus.data.math.Point2D _17 = face.get_edge().get_originVertex().get_pos();
		pos = _17;
		double _18 = pos.x;
		double _19 = ( _18 - x );
		double _20 = pos.x;
		double _21 = ( _20 - x );
		double _22 = ( _19 * _21 );
		double _23 = pos.y;
		double _24 = ( _23 - y );
		double _25 = pos.y;
		double _26 = ( _25 - y );
		double _27 = ( _24 * _26 );
		double _28 = ( _22 + _27 );
		distSquared = _28;
		boolean _29 = ( distSquared <= radiusSquared );
		if (_29) 
		{
			return true;
		}
		
		hxDaedalus.data.math.Point2D _30 = face.get_edge().get_nextLeftEdge().get_originVertex().get_pos();
		pos = _30;
		double _31 = pos.x;
		double _32 = ( _31 - x );
		double _33 = pos.x;
		double _34 = ( _33 - x );
		double _35 = ( _32 * _34 );
		double _36 = pos.y;
		double _37 = ( _36 - y );
		double _38 = pos.y;
		double _39 = ( _38 - y );
		double _40 = ( _37 * _39 );
		double _41 = ( _35 + _40 );
		distSquared = _41;
		boolean _42 = ( distSquared <= radiusSquared );
		if (_42) 
		{
			return true;
		}
		
		hxDaedalus.data.math.Point2D _43 = face.get_edge().get_nextLeftEdge().get_nextLeftEdge().get_originVertex().get_pos();
		pos = _43;
		double _44 = pos.x;
		double _45 = ( _44 - x );
		double _46 = pos.x;
		double _47 = ( _46 - x );
		double _48 = ( _45 * _47 );
		double _49 = pos.y;
		double _50 = ( _49 - y );
		double _51 = pos.y;
		double _52 = ( _51 - y );
		double _53 = ( _50 * _52 );
		double _54 = ( _48 + _53 );
		distSquared = _54;
		boolean _55 = ( distSquared <= radiusSquared );
		if (_55) 
		{
			return true;
		}
		
		haxe.root.Array<hxDaedalus.data.Edge> _56 = new haxe.root.Array<hxDaedalus.data.Edge>();
		haxe.root.Array<hxDaedalus.data.Edge> edgesToCheck = _56;
		hxDaedalus.data.Edge _57 = face.get_edge();
		edgesToCheck.push(_57);
		hxDaedalus.data.Edge _58 = face.get_edge().get_nextLeftEdge();
		edgesToCheck.push(_58);
		hxDaedalus.data.Edge _59 = face.get_edge().get_nextLeftEdge().get_nextLeftEdge();
		edgesToCheck.push(_59);
		hxDaedalus.data.Edge edge1 = null;
		hxDaedalus.data.math.Point2D pos1 = null;
		hxDaedalus.data.math.Point2D pos2 = null;
		haxe.ds.ObjectMap<hxDaedalus.data.Edge, java.lang.Object> _61 = null;
		{
			haxe.ds.ObjectMap<hxDaedalus.data.Edge, java.lang.Object> _60 = new haxe.ds.ObjectMap<hxDaedalus.data.Edge, java.lang.Object>();
			haxe.ds.ObjectMap<hxDaedalus.data.Edge, java.lang.Object> _0 = _60;
			_61 = _0;
		}
		
		haxe.ds.ObjectMap<hxDaedalus.data.Edge, java.lang.Object> checkedEdges = _61;
		boolean intersecting = false;
		while (true)
		{
			int _62 = edgesToCheck.length;
			boolean _63 = ( _62 > 0 );
			boolean _64 =  ! (_63) ;
			if (_64) 
			{
				break;
			}
			
			hxDaedalus.data.Edge _65 = edgesToCheck.pop();
			edge1 = _65;
			{
				checkedEdges.set(edge1, true);
				boolean __temp_expr142 = true;
			}
			
			hxDaedalus.data.math.Point2D _66 = edge1.get_originVertex().get_pos();
			pos1 = _66;
			hxDaedalus.data.math.Point2D _67 = edge1.get_destinationVertex().get_pos();
			pos2 = _67;
			double _68 = pos1.x;
			double _69 = pos1.y;
			double _70 = pos2.x;
			double _71 = pos2.y;
			haxe.root.Array<java.lang.Object> _72 = null;
			boolean _73 = hxDaedalus.data.math.Geom2D.intersectionsSegmentCircle(_68, _69, _70, _71, x, y, radius, _72);
			intersecting = _73;
			if (intersecting) 
			{
				boolean _74 = edge1.get_isConstrained();
				if (_74) 
				{
					return true;
				}
				 else 
				{
					hxDaedalus.data.Edge _75 = edge1.get_oppositeEdge().get_nextLeftEdge();
					edge1 = _75;
					java.lang.Object _76 = checkedEdges.get(edge1);
					boolean _79 = ( ! (haxe.lang.Runtime.toBool(_76)) );
					boolean _86 = false;
					if (_79) 
					{
						java.lang.Object _78 = null;
						{
							hxDaedalus.data.Edge _84 = edge1.get_oppositeEdge();
							hxDaedalus.data.Edge _80 = _84;
							hxDaedalus.data.Edge _77 = _80;
							hxDaedalus.data.Edge key = _77;
							java.lang.Object _85 = checkedEdges.get(key);
							java.lang.Object _81 = _85;
							_78 = _81;
						}
						
						_86 = ( ! (haxe.lang.Runtime.toBool(_78)) );
					}
					 else 
					{
						_86 = false;
					}
					
					boolean _93 = false;
					if (_86) 
					{
						int _91 = edgesToCheck.indexOf(edge1, null);
						int _87 = _91;
						int _82 = _87;
						int _92 =  - (1) ;
						int _88 = _92;
						int _83 = _88;
						_93 = ( _82 == _83 );
					}
					 else 
					{
						_93 = false;
					}
					
					boolean _96 = false;
					if (_93) 
					{
						hxDaedalus.data.Edge _94 = edge1.get_oppositeEdge();
						hxDaedalus.data.Edge _89 = _94;
						int _95 = edgesToCheck.indexOf(_89, null);
						int _90 = _95;
						_96 = ( _90 == -1 );
					}
					 else 
					{
						_96 = false;
					}
					
					if (_96) 
					{
						edgesToCheck.push(edge1);
					}
					
					hxDaedalus.data.Edge _97 = edge1.get_nextLeftEdge();
					edge1 = _97;
					java.lang.Object _98 = checkedEdges.get(edge1);
					boolean _101 = ( ! (haxe.lang.Runtime.toBool(_98)) );
					boolean _108 = false;
					if (_101) 
					{
						java.lang.Object _100 = null;
						{
							hxDaedalus.data.Edge _106 = edge1.get_oppositeEdge();
							hxDaedalus.data.Edge _102 = _106;
							hxDaedalus.data.Edge _99 = _102;
							hxDaedalus.data.Edge key1 = _99;
							java.lang.Object _107 = checkedEdges.get(key1);
							java.lang.Object _103 = _107;
							_100 = _103;
						}
						
						_108 = ( ! (haxe.lang.Runtime.toBool(_100)) );
					}
					 else 
					{
						_108 = false;
					}
					
					boolean _115 = false;
					if (_108) 
					{
						int _113 = edgesToCheck.indexOf(edge1, null);
						int _109 = _113;
						int _104 = _109;
						int _114 =  - (1) ;
						int _110 = _114;
						int _105 = _110;
						_115 = ( _104 == _105 );
					}
					 else 
					{
						_115 = false;
					}
					
					boolean _118 = false;
					if (_115) 
					{
						hxDaedalus.data.Edge _116 = edge1.get_oppositeEdge();
						hxDaedalus.data.Edge _111 = _116;
						int _117 = edgesToCheck.indexOf(_111, null);
						int _112 = _117;
						_118 = ( _112 == -1 );
					}
					 else 
					{
						_118 = false;
					}
					
					if (_118) 
					{
						edgesToCheck.push(edge1);
					}
					
				}
				
			}
			
		}
		
		return false;
	}
	
	
	public static   int getDirection(double x1, double y1, double x2, double y2, double x3, double y3)
	{
		double _0 = ( x3 - x1 );
		double _1 = ( y2 - y1 );
		double _2 = ( _0 * _1 );
		double _3 = ( y3 - y1 );
		double _4 =  - (x2) ;
		double _5 = ( _4 + x1 );
		double _6 = ( _3 * _5 );
		double _7 = ( _2 + _6 );
		double dot = _7;
		boolean _8 = ( dot == 0 );
		int _10 = 0;
		if (_8) 
		{
			_10 = 0;
		}
		 else 
		{
			boolean _9 = ( dot > 0 );
			if (_9) 
			{
				_10 = 1;
			}
			 else 
			{
				_10 = -1;
			}
			
		}
		
		return _10;
	}
	
	
	public static   int getDirection2(double x1, double y1, double x2, double y2, double x3, double y3)
	{
		double _0 = ( x3 - x1 );
		double _1 = ( y2 - y1 );
		double _2 = ( _0 * _1 );
		double _3 = ( y3 - y1 );
		double _4 =  - (x2) ;
		double _5 = ( _4 + x1 );
		double _6 = ( _3 * _5 );
		double _7 = ( _2 + _6 );
		double dot = _7;
		boolean _8 = ( dot == 0 );
		if (_8) 
		{
			return 0;
		}
		 else 
		{
			boolean _9 = ( dot > 0 );
			if (_9) 
			{
				double _10 = hxDaedalus.data.math.Geom2D.distanceSquaredPointToLine(x3, y3, x1, y1, x2, y2);
				boolean _11 = ( _10 <= 0.0001 );
				if (_11) 
				{
					return 0;
				}
				 else 
				{
					return 1;
				}
				
			}
			 else 
			{
				double _12 = hxDaedalus.data.math.Geom2D.distanceSquaredPointToLine(x3, y3, x1, y1, x2, y2);
				boolean _13 = ( _12 <= 0.0001 );
				if (_13) 
				{
					return 0;
				}
				 else 
				{
					return -1;
				}
				
			}
			
		}
		
	}
	
	
	public static   int getRelativePosition(double x, double y, hxDaedalus.data.Edge eUp)
	{
		double _0 = eUp.get_originVertex().get_pos().x;
		double _1 = eUp.get_originVertex().get_pos().y;
		double _2 = eUp.get_destinationVertex().get_pos().x;
		double _3 = eUp.get_destinationVertex().get_pos().y;
		int _4 = hxDaedalus.data.math.Geom2D.getDirection(_0, _1, _2, _3, x, y);
		return _4;
	}
	
	
	public static   int getRelativePosition2(double x, double y, hxDaedalus.data.Edge eUp)
	{
		double _0 = eUp.get_originVertex().get_pos().x;
		double _1 = eUp.get_originVertex().get_pos().y;
		double _2 = eUp.get_destinationVertex().get_pos().x;
		double _3 = eUp.get_destinationVertex().get_pos().y;
		int _4 = hxDaedalus.data.math.Geom2D.getDirection2(_0, _1, _2, _3, x, y);
		return _4;
	}
	
	
	public static   hxDaedalus.data.math.Intersection isInFace(double x, double y, hxDaedalus.data.Face polygon)
	{
		hxDaedalus.data.math.Intersection _0 = hxDaedalus.data.math.Intersection.ENull;
		hxDaedalus.data.math.Intersection result = _0;
		hxDaedalus.data.Edge _1 = polygon.get_edge();
		hxDaedalus.data.Edge e1_2 = _1;
		hxDaedalus.data.Edge _2 = e1_2.get_nextLeftEdge();
		hxDaedalus.data.Edge e2_3 = _2;
		hxDaedalus.data.Edge _3 = e2_3.get_nextLeftEdge();
		hxDaedalus.data.Edge e3_1 = _3;
		int _4 = hxDaedalus.data.math.Geom2D.getRelativePosition(x, y, e1_2);
		boolean _6 = ( _4 >= 0 );
		boolean _10 = false;
		if (_6) 
		{
			int _9 = hxDaedalus.data.math.Geom2D.getRelativePosition(x, y, e2_3);
			int _7 = _9;
			int _5 = _7;
			_10 = ( _5 >= 0 );
		}
		 else 
		{
			_10 = false;
		}
		
		boolean _12 = false;
		if (_10) 
		{
			int _11 = hxDaedalus.data.math.Geom2D.getRelativePosition(x, y, e3_1);
			int _8 = _11;
			_12 = ( _8 >= 0 );
		}
		 else 
		{
			_12 = false;
		}
		
		if (_12) 
		{
			hxDaedalus.data.Vertex _13 = e1_2.get_originVertex();
			hxDaedalus.data.Vertex v1 = _13;
			hxDaedalus.data.Vertex _14 = e2_3.get_originVertex();
			hxDaedalus.data.Vertex v2 = _14;
			hxDaedalus.data.Vertex _15 = e3_1.get_originVertex();
			hxDaedalus.data.Vertex v3 = _15;
			double _16 = v1.get_pos().x;
			double x1 = _16;
			double _17 = v1.get_pos().y;
			double y1 = _17;
			double _18 = v2.get_pos().x;
			double x2 = _18;
			double _19 = v2.get_pos().y;
			double y2 = _19;
			double _20 = v3.get_pos().x;
			double x3 = _20;
			double _21 = v3.get_pos().y;
			double y3 = _21;
			double _22 = ( x1 - x );
			double _23 = ( x1 - x );
			double _24 = ( _22 * _23 );
			double _25 = ( y1 - y );
			double _26 = ( y1 - y );
			double _27 = ( _25 * _26 );
			double _28 = ( _24 + _27 );
			double v_v1squaredLength = _28;
			double _29 = ( x2 - x );
			double _30 = ( x2 - x );
			double _31 = ( _29 * _30 );
			double _32 = ( y2 - y );
			double _33 = ( y2 - y );
			double _34 = ( _32 * _33 );
			double _35 = ( _31 + _34 );
			double v_v2squaredLength = _35;
			double _36 = ( x3 - x );
			double _37 = ( x3 - x );
			double _38 = ( _36 * _37 );
			double _39 = ( y3 - y );
			double _40 = ( y3 - y );
			double _41 = ( _39 * _40 );
			double _42 = ( _38 + _41 );
			double v_v3squaredLength = _42;
			double _43 = ( x2 - x1 );
			double _44 = ( x2 - x1 );
			double _45 = ( _43 * _44 );
			double _46 = ( y2 - y1 );
			double _47 = ( y2 - y1 );
			double _48 = ( _46 * _47 );
			double _49 = ( _45 + _48 );
			double v1_v2squaredLength = _49;
			double _50 = ( x3 - x2 );
			double _51 = ( x3 - x2 );
			double _52 = ( _50 * _51 );
			double _53 = ( y3 - y2 );
			double _54 = ( y3 - y2 );
			double _55 = ( _53 * _54 );
			double _56 = ( _52 + _55 );
			double v2_v3squaredLength = _56;
			double _57 = ( x1 - x3 );
			double _58 = ( x1 - x3 );
			double _59 = ( _57 * _58 );
			double _60 = ( y1 - y3 );
			double _61 = ( y1 - y3 );
			double _62 = ( _60 * _61 );
			double _63 = ( _59 + _62 );
			double v3_v1squaredLength = _63;
			double _64 = ( x - x1 );
			double _65 = ( x2 - x1 );
			double _66 = ( _64 * _65 );
			double _67 = ( y - y1 );
			double _68 = ( y2 - y1 );
			double _69 = ( _67 * _68 );
			double _70 = ( _66 + _69 );
			double dot_v_v1v2 = _70;
			double _71 = ( x - x2 );
			double _72 = ( x3 - x2 );
			double _73 = ( _71 * _72 );
			double _74 = ( y - y2 );
			double _75 = ( y3 - y2 );
			double _76 = ( _74 * _75 );
			double _77 = ( _73 + _76 );
			double dot_v_v2v3 = _77;
			double _78 = ( x - x3 );
			double _79 = ( x1 - x3 );
			double _80 = ( _78 * _79 );
			double _81 = ( y - y3 );
			double _82 = ( y1 - y3 );
			double _83 = ( _81 * _82 );
			double _84 = ( _80 + _83 );
			double dot_v_v3v1 = _84;
			double _85 = ( dot_v_v1v2 * dot_v_v1v2 );
			double _86 = ( _85 / v1_v2squaredLength );
			double _87 = ( v_v1squaredLength - _86 );
			double v_e1_2squaredLength = _87;
			double _88 = ( dot_v_v2v3 * dot_v_v2v3 );
			double _89 = ( _88 / v2_v3squaredLength );
			double _90 = ( v_v2squaredLength - _89 );
			double v_e2_3squaredLength = _90;
			double _91 = ( dot_v_v3v1 * dot_v_v3v1 );
			double _92 = ( _91 / v3_v1squaredLength );
			double _93 = ( v_v3squaredLength - _92 );
			double v_e3_1squaredLength = _93;
			boolean _94 = ( v_e1_2squaredLength <= 0.0001 );
			boolean closeTo_e1_2 = _94;
			boolean _95 = ( v_e2_3squaredLength <= 0.0001 );
			boolean closeTo_e2_3 = _95;
			boolean _96 = ( v_e3_1squaredLength <= 0.0001 );
			boolean closeTo_e3_1 = _96;
			if (closeTo_e1_2) 
			{
				if (closeTo_e3_1) 
				{
					hxDaedalus.data.math.Intersection _97 = hxDaedalus.data.math.Intersection.EVertex(v1);
					result = _97;
				}
				 else 
				{
					if (closeTo_e2_3) 
					{
						hxDaedalus.data.math.Intersection _98 = hxDaedalus.data.math.Intersection.EVertex(v2);
						result = _98;
					}
					 else 
					{
						hxDaedalus.data.math.Intersection _99 = hxDaedalus.data.math.Intersection.EEdge(e1_2);
						result = _99;
					}
					
				}
				
			}
			 else 
			{
				if (closeTo_e2_3) 
				{
					if (closeTo_e3_1) 
					{
						hxDaedalus.data.math.Intersection _100 = hxDaedalus.data.math.Intersection.EVertex(v3);
						result = _100;
					}
					 else 
					{
						hxDaedalus.data.math.Intersection _101 = hxDaedalus.data.math.Intersection.EEdge(e2_3);
						result = _101;
					}
					
				}
				 else 
				{
					if (closeTo_e3_1) 
					{
						hxDaedalus.data.math.Intersection _102 = hxDaedalus.data.math.Intersection.EEdge(e3_1);
						result = _102;
					}
					 else 
					{
						hxDaedalus.data.math.Intersection _103 = hxDaedalus.data.math.Intersection.EFace(polygon);
						result = _103;
					}
					
				}
				
			}
			
		}
		
		return result;
	}
	
	
	public static   boolean clipSegmentByTriangle(double s1x, double s1y, double s2x, double s2y, double t1x, double t1y, double t2x, double t2y, double t3x, double t3y, hxDaedalus.data.math.Point2D pResult1, hxDaedalus.data.math.Point2D pResult2)
	{
		int side1_1 = 0;
		int side1_2 = 0;
		int _0 = hxDaedalus.data.math.Geom2D.getDirection(t1x, t1y, t2x, t2y, s1x, s1y);
		side1_1 = _0;
		int _1 = hxDaedalus.data.math.Geom2D.getDirection(t1x, t1y, t2x, t2y, s2x, s2y);
		side1_2 = _1;
		boolean _2 = ( side1_1 <= 0 );
		boolean _3 = false;
		if (_2) 
		{
			_3 = ( side1_2 <= 0 );
		}
		 else 
		{
			_3 = false;
		}
		
		if (_3) 
		{
			return false;
		}
		
		int side2_1 = 0;
		int side2_2 = 0;
		int _4 = hxDaedalus.data.math.Geom2D.getDirection(t2x, t2y, t3x, t3y, s1x, s1y);
		side2_1 = _4;
		int _5 = hxDaedalus.data.math.Geom2D.getDirection(t2x, t2y, t3x, t3y, s2x, s2y);
		side2_2 = _5;
		boolean _6 = ( side2_1 <= 0 );
		boolean _7 = false;
		if (_6) 
		{
			_7 = ( side2_2 <= 0 );
		}
		 else 
		{
			_7 = false;
		}
		
		if (_7) 
		{
			return false;
		}
		
		int side3_1 = 0;
		int side3_2 = 0;
		int _8 = hxDaedalus.data.math.Geom2D.getDirection(t3x, t3y, t1x, t1y, s1x, s1y);
		side3_1 = _8;
		int _9 = hxDaedalus.data.math.Geom2D.getDirection(t3x, t3y, t1x, t1y, s2x, s2y);
		side3_2 = _9;
		boolean _10 = ( side3_1 <= 0 );
		boolean _11 = false;
		if (_10) 
		{
			_11 = ( side3_2 <= 0 );
		}
		 else 
		{
			_11 = false;
		}
		
		if (_11) 
		{
			return false;
		}
		
		boolean _12 = ( side1_1 >= 0 );
		boolean _13 = false;
		if (_12) 
		{
			_13 = ( side2_1 >= 0 );
		}
		 else 
		{
			_13 = false;
		}
		
		boolean _16 = false;
		if (_13) 
		{
			_16 = ( side3_1 >= 0 );
		}
		 else 
		{
			_16 = false;
		}
		
		boolean _19 = false;
		if (_16) 
		{
			boolean _17 = ( side1_2 >= 0 );
			boolean _14 = _17;
			boolean _15 = false;
			if (_14) 
			{
				boolean _18 = ( side2_2 >= 0 );
				_15 = _18;
			}
			 else 
			{
				_15 = false;
			}
			
			if (_15) 
			{
				_19 = ( side3_2 >= 0 );
			}
			 else 
			{
				_19 = false;
			}
			
		}
		 else 
		{
			_19 = false;
		}
		
		if (_19) 
		{
			pResult1.x = s1x;
			pResult1.y = s1y;
			pResult2.x = s2x;
			pResult2.y = s2y;
			return true;
		}
		
		int n = 0;
		haxe.root.Array<java.lang.Object> _20 = null;
		boolean _21 = hxDaedalus.data.math.Geom2D.intersections2segments(s1x, s1y, s2x, s2y, t1x, t1y, t2x, t2y, pResult1, _20, null);
		if (_21) 
		{
			n++;
		}
		
		boolean _22 = ( n == 0 );
		if (_22) 
		{
			haxe.root.Array<java.lang.Object> _23 = null;
			boolean _24 = hxDaedalus.data.math.Geom2D.intersections2segments(s1x, s1y, s2x, s2y, t2x, t2y, t3x, t3y, pResult1, _23, null);
			if (_24) 
			{
				n++;
			}
			
		}
		 else 
		{
			haxe.root.Array<java.lang.Object> _25 = null;
			boolean _26 = hxDaedalus.data.math.Geom2D.intersections2segments(s1x, s1y, s2x, s2y, t2x, t2y, t3x, t3y, pResult2, _25, null);
			if (_26) 
			{
				double _27 =  - (0.01) ;
				double _28 = pResult1.x;
				double _29 = pResult2.x;
				double _30 = ( _28 - _29 );
				boolean _34 = ( _27 > _30 );
				boolean _35 =  ! (_34) ;
				boolean _46 = false;
				if (_35) 
				{
					double _43 = pResult1.x;
					double _36 = _43;
					double _31 = _36;
					double _44 = pResult2.x;
					double _37 = _44;
					double _32 = _37;
					double _45 = ( _31 - _32 );
					double _38 = _45;
					double _33 = _38;
					_46 = ( _33 > 0.01 );
				}
				 else 
				{
					_46 = true;
				}
				
				boolean _47 =  ! (_46) ;
				boolean _59 = false;
				if (_47) 
				{
					double _55 =  - (0.01) ;
					double _48 = _55;
					double _39 = _48;
					double _56 = pResult1.y;
					double _49 = _56;
					double _40 = _49;
					double _57 = pResult2.y;
					double _50 = _57;
					double _41 = _50;
					double _58 = ( _40 - _41 );
					double _51 = _58;
					double _42 = _51;
					_59 = ( _39 > _42 );
				}
				 else 
				{
					_59 = true;
				}
				
				boolean _60 =  ! (_59) ;
				boolean _64 = false;
				if (_60) 
				{
					double _61 = pResult1.y;
					double _52 = _61;
					double _62 = pResult2.y;
					double _53 = _62;
					double _63 = ( _52 - _53 );
					double _54 = _63;
					_64 = ( _54 > 0.01 );
				}
				 else 
				{
					_64 = true;
				}
				
				if (_64) 
				{
					n++;
				}
				
			}
			
		}
		
		boolean _65 = ( n == 0 );
		if (_65) 
		{
			haxe.root.Array<java.lang.Object> _66 = null;
			boolean _67 = hxDaedalus.data.math.Geom2D.intersections2segments(s1x, s1y, s2x, s2y, t3x, t3y, t1x, t1y, pResult1, _66, null);
			if (_67) 
			{
				n++;
			}
			
		}
		 else 
		{
			boolean _68 = ( n == 1 );
			if (_68) 
			{
				haxe.root.Array<java.lang.Object> _69 = null;
				boolean _70 = hxDaedalus.data.math.Geom2D.intersections2segments(s1x, s1y, s2x, s2y, t3x, t3y, t1x, t1y, pResult2, _69, null);
				if (_70) 
				{
					double _71 =  - (0.01) ;
					double _72 = pResult1.x;
					double _73 = pResult2.x;
					double _74 = ( _72 - _73 );
					boolean _78 = ( _71 > _74 );
					boolean _79 =  ! (_78) ;
					boolean _90 = false;
					if (_79) 
					{
						double _87 = pResult1.x;
						double _80 = _87;
						double _75 = _80;
						double _88 = pResult2.x;
						double _81 = _88;
						double _76 = _81;
						double _89 = ( _75 - _76 );
						double _82 = _89;
						double _77 = _82;
						_90 = ( _77 > 0.01 );
					}
					 else 
					{
						_90 = true;
					}
					
					boolean _91 =  ! (_90) ;
					boolean _103 = false;
					if (_91) 
					{
						double _99 =  - (0.01) ;
						double _92 = _99;
						double _83 = _92;
						double _100 = pResult1.y;
						double _93 = _100;
						double _84 = _93;
						double _101 = pResult2.y;
						double _94 = _101;
						double _85 = _94;
						double _102 = ( _84 - _85 );
						double _95 = _102;
						double _86 = _95;
						_103 = ( _83 > _86 );
					}
					 else 
					{
						_103 = true;
					}
					
					boolean _104 =  ! (_103) ;
					boolean _108 = false;
					if (_104) 
					{
						double _105 = pResult1.y;
						double _96 = _105;
						double _106 = pResult2.y;
						double _97 = _106;
						double _107 = ( _96 - _97 );
						double _98 = _107;
						_108 = ( _98 > 0.01 );
					}
					 else 
					{
						_108 = true;
					}
					
					if (_108) 
					{
						n++;
					}
					
				}
				
			}
			
		}
		
		boolean _109 = ( n == 1 );
		if (_109) 
		{
			boolean _110 = ( side1_1 >= 0 );
			boolean _111 = false;
			if (_110) 
			{
				_111 = ( side2_1 >= 0 );
			}
			 else 
			{
				_111 = false;
			}
			
			boolean _112 = false;
			if (_111) 
			{
				_112 = ( side3_1 >= 0 );
			}
			 else 
			{
				_112 = false;
			}
			
			if (_112) 
			{
				pResult2.x = s1x;
				pResult2.y = s1y;
			}
			 else 
			{
				boolean _113 = ( side1_2 >= 0 );
				boolean _114 = false;
				if (_113) 
				{
					_114 = ( side2_2 >= 0 );
				}
				 else 
				{
					_114 = false;
				}
				
				boolean _115 = false;
				if (_114) 
				{
					_115 = ( side3_2 >= 0 );
				}
				 else 
				{
					_115 = false;
				}
				
				if (_115) 
				{
					pResult2.x = s2x;
					pResult2.y = s2y;
				}
				 else 
				{
					n = 0;
				}
				
			}
			
		}
		
		boolean _116 = ( n > 0 );
		if (_116) 
		{
			return true;
		}
		 else 
		{
			return false;
		}
		
	}
	
	
	public static   boolean isSegmentIntersectingTriangle(double s1x, double s1y, double s2x, double s2y, double t1x, double t1y, double t2x, double t2y, double t3x, double t3y)
	{
		int side1_1 = 0;
		int side1_2 = 0;
		int _0 = hxDaedalus.data.math.Geom2D.getDirection(t1x, t1y, t2x, t2y, s1x, s1y);
		side1_1 = _0;
		int _1 = hxDaedalus.data.math.Geom2D.getDirection(t1x, t1y, t2x, t2y, s2x, s2y);
		side1_2 = _1;
		boolean _2 = ( side1_1 <= 0 );
		boolean _3 = false;
		if (_2) 
		{
			_3 = ( side1_2 <= 0 );
		}
		 else 
		{
			_3 = false;
		}
		
		if (_3) 
		{
			return false;
		}
		
		int side2_1 = 0;
		int side2_2 = 0;
		int _4 = hxDaedalus.data.math.Geom2D.getDirection(t2x, t2y, t3x, t3y, s1x, s1y);
		side2_1 = _4;
		int _5 = hxDaedalus.data.math.Geom2D.getDirection(t2x, t2y, t3x, t3y, s2x, s2y);
		side2_2 = _5;
		boolean _6 = ( side2_1 <= 0 );
		boolean _7 = false;
		if (_6) 
		{
			_7 = ( side2_2 <= 0 );
		}
		 else 
		{
			_7 = false;
		}
		
		if (_7) 
		{
			return false;
		}
		
		int side3_1 = 0;
		int side3_2 = 0;
		int _8 = hxDaedalus.data.math.Geom2D.getDirection(t3x, t3y, t1x, t1y, s1x, s1y);
		side3_1 = _8;
		int _9 = hxDaedalus.data.math.Geom2D.getDirection(t3x, t3y, t1x, t1y, s2x, s2y);
		side3_2 = _9;
		boolean _10 = ( side3_1 <= 0 );
		boolean _11 = false;
		if (_10) 
		{
			_11 = ( side3_2 <= 0 );
		}
		 else 
		{
			_11 = false;
		}
		
		if (_11) 
		{
			return false;
		}
		
		boolean _12 = ( side1_1 == 1 );
		boolean _13 = false;
		if (_12) 
		{
			_13 = ( side2_1 == 1 );
		}
		 else 
		{
			_13 = false;
		}
		
		boolean _14 = false;
		if (_13) 
		{
			_14 = ( side3_1 == 1 );
		}
		 else 
		{
			_14 = false;
		}
		
		if (_14) 
		{
			return true;
		}
		
		boolean _15 = ( side1_1 == 1 );
		boolean _16 = false;
		if (_15) 
		{
			_16 = ( side2_1 == 1 );
		}
		 else 
		{
			_16 = false;
		}
		
		boolean _17 = false;
		if (_16) 
		{
			_17 = ( side3_1 == 1 );
		}
		 else 
		{
			_17 = false;
		}
		
		if (_17) 
		{
			return true;
		}
		
		int side1 = 0;
		int side2 = 0;
		boolean _18 = ( side1_1 == 1 );
		boolean _20 = false;
		if (_18) 
		{
			_20 = ( side1_2 <= 0 );
		}
		 else 
		{
			_20 = false;
		}
		
		boolean _21 =  ! (_20) ;
		boolean _23 = false;
		if (_21) 
		{
			boolean _22 = ( side1_1 <= 0 );
			boolean _19 = _22;
			if (_19) 
			{
				_23 = ( side1_2 == 1 );
			}
			 else 
			{
				_23 = false;
			}
			
		}
		 else 
		{
			_23 = true;
		}
		
		if (_23) 
		{
			int _24 = hxDaedalus.data.math.Geom2D.getDirection(s1x, s1y, s2x, s2y, t1x, t1y);
			side1 = _24;
			int _25 = hxDaedalus.data.math.Geom2D.getDirection(s1x, s1y, s2x, s2y, t2x, t2y);
			side2 = _25;
			boolean _26 = ( side1 == 1 );
			boolean _28 = false;
			if (_26) 
			{
				_28 = ( side2 <= 0 );
			}
			 else 
			{
				_28 = false;
			}
			
			boolean _29 =  ! (_28) ;
			boolean _31 = false;
			if (_29) 
			{
				boolean _30 = ( side1 <= 0 );
				boolean _27 = _30;
				if (_27) 
				{
					_31 = ( side2 == 1 );
				}
				 else 
				{
					_31 = false;
				}
				
			}
			 else 
			{
				_31 = true;
			}
			
			if (_31) 
			{
				return true;
			}
			
		}
		
		boolean _32 = ( side2_1 == 1 );
		boolean _34 = false;
		if (_32) 
		{
			_34 = ( side2_2 <= 0 );
		}
		 else 
		{
			_34 = false;
		}
		
		boolean _35 =  ! (_34) ;
		boolean _37 = false;
		if (_35) 
		{
			boolean _36 = ( side2_1 <= 0 );
			boolean _33 = _36;
			if (_33) 
			{
				_37 = ( side2_2 == 1 );
			}
			 else 
			{
				_37 = false;
			}
			
		}
		 else 
		{
			_37 = true;
		}
		
		if (_37) 
		{
			int _38 = hxDaedalus.data.math.Geom2D.getDirection(s1x, s1y, s2x, s2y, t2x, t2y);
			side1 = _38;
			int _39 = hxDaedalus.data.math.Geom2D.getDirection(s1x, s1y, s2x, s2y, t3x, t3y);
			side2 = _39;
			boolean _40 = ( side1 == 1 );
			boolean _42 = false;
			if (_40) 
			{
				_42 = ( side2 <= 0 );
			}
			 else 
			{
				_42 = false;
			}
			
			boolean _43 =  ! (_42) ;
			boolean _45 = false;
			if (_43) 
			{
				boolean _44 = ( side1 <= 0 );
				boolean _41 = _44;
				if (_41) 
				{
					_45 = ( side2 == 1 );
				}
				 else 
				{
					_45 = false;
				}
				
			}
			 else 
			{
				_45 = true;
			}
			
			if (_45) 
			{
				return true;
			}
			
		}
		
		boolean _46 = ( side3_1 == 1 );
		boolean _48 = false;
		if (_46) 
		{
			_48 = ( side3_2 <= 0 );
		}
		 else 
		{
			_48 = false;
		}
		
		boolean _49 =  ! (_48) ;
		boolean _51 = false;
		if (_49) 
		{
			boolean _50 = ( side3_1 <= 0 );
			boolean _47 = _50;
			if (_47) 
			{
				_51 = ( side3_2 == 1 );
			}
			 else 
			{
				_51 = false;
			}
			
		}
		 else 
		{
			_51 = true;
		}
		
		if (_51) 
		{
			int _52 = hxDaedalus.data.math.Geom2D.getDirection(s1x, s1y, s2x, s2y, t3x, t3y);
			side1 = _52;
			int _53 = hxDaedalus.data.math.Geom2D.getDirection(s1x, s1y, s2x, s2y, t1x, t1y);
			side2 = _53;
			boolean _54 = ( side1 == 1 );
			boolean _56 = false;
			if (_54) 
			{
				_56 = ( side2 <= 0 );
			}
			 else 
			{
				_56 = false;
			}
			
			boolean _57 =  ! (_56) ;
			boolean _59 = false;
			if (_57) 
			{
				boolean _58 = ( side1 <= 0 );
				boolean _55 = _58;
				if (_55) 
				{
					_59 = ( side2 == 1 );
				}
				 else 
				{
					_59 = false;
				}
				
			}
			 else 
			{
				_59 = true;
			}
			
			if (_59) 
			{
				return true;
			}
			
		}
		
		return false;
	}
	
	
	public static  hxDaedalus.data.math.Point2D __circumcenter;
	
	public static   boolean isDelaunay(hxDaedalus.data.Edge edge)
	{
		hxDaedalus.data.Vertex _0 = edge.get_originVertex();
		hxDaedalus.data.Vertex vLeft = _0;
		hxDaedalus.data.Vertex _1 = edge.get_destinationVertex();
		hxDaedalus.data.Vertex vRight = _1;
		hxDaedalus.data.Vertex _2 = edge.get_nextLeftEdge().get_destinationVertex();
		hxDaedalus.data.Vertex vCorner = _2;
		hxDaedalus.data.Vertex _3 = edge.get_nextRightEdge().get_destinationVertex();
		hxDaedalus.data.Vertex vOpposite = _3;
		double _4 = vCorner.get_pos().x;
		double _5 = vCorner.get_pos().y;
		double _6 = vLeft.get_pos().x;
		double _7 = vLeft.get_pos().y;
		double _8 = vRight.get_pos().x;
		double _9 = vRight.get_pos().y;
		hxDaedalus.data.math.Point2D _10 = hxDaedalus.data.math.Geom2D.__circumcenter;
		hxDaedalus.data.math.Geom2D.getCircumcenter(_4, _5, _6, _7, _8, _9, _10);
		double _11 = vCorner.get_pos().x;
		double _12 = hxDaedalus.data.math.Geom2D.__circumcenter.x;
		double _13 = ( _11 - _12 );
		double _14 = vCorner.get_pos().x;
		double _15 = hxDaedalus.data.math.Geom2D.__circumcenter.x;
		double _16 = ( _14 - _15 );
		double _17 = ( _13 * _16 );
		double _18 = vCorner.get_pos().y;
		double _19 = hxDaedalus.data.math.Geom2D.__circumcenter.y;
		double _20 = ( _18 - _19 );
		double _21 = vCorner.get_pos().y;
		double _22 = hxDaedalus.data.math.Geom2D.__circumcenter.y;
		double _23 = ( _21 - _22 );
		double _24 = ( _20 * _23 );
		double _25 = ( _17 + _24 );
		double squaredRadius = _25;
		double _26 = vOpposite.get_pos().x;
		double _27 = hxDaedalus.data.math.Geom2D.__circumcenter.x;
		double _28 = ( _26 - _27 );
		double _29 = vOpposite.get_pos().x;
		double _30 = hxDaedalus.data.math.Geom2D.__circumcenter.x;
		double _31 = ( _29 - _30 );
		double _32 = ( _28 * _31 );
		double _33 = vOpposite.get_pos().y;
		double _34 = hxDaedalus.data.math.Geom2D.__circumcenter.y;
		double _35 = ( _33 - _34 );
		double _36 = vOpposite.get_pos().y;
		double _37 = hxDaedalus.data.math.Geom2D.__circumcenter.y;
		double _38 = ( _36 - _37 );
		double _39 = ( _35 * _38 );
		double _40 = ( _32 + _39 );
		double squaredDistance = _40;
		boolean _41 = ( squaredDistance >= squaredRadius );
		return _41;
	}
	
	
	public static   hxDaedalus.data.math.Point2D getCircumcenter(double x1, double y1, double x2, double y2, double x3, double y3, hxDaedalus.data.math.Point2D result)
	{
		boolean _0 = ( result == null );
		if (_0) 
		{
			hxDaedalus.data.math.Point2D _1 = new hxDaedalus.data.math.Point2D(((java.lang.Object) (null) ), ((java.lang.Object) (null) ));
			result = _1;
		}
		
		double _2 = ( x1 + x2 );
		double _3 = ( _2 / 2 );
		double m1 = _3;
		double _4 = ( y1 + y2 );
		double _5 = ( _4 / 2 );
		double m2 = _5;
		double _6 = ( x1 + x3 );
		double _7 = ( _6 / 2 );
		double m3 = _7;
		double _8 = ( y1 + y3 );
		double _9 = ( _8 / 2 );
		double m4 = _9;
		double _10 = ( x1 - x3 );
		double _11 = ( m1 * _10 );
		double _12 = ( m2 - m4 );
		double _13 = ( y1 - y3 );
		double _14 = ( _12 * _13 );
		double _15 = ( _11 + _14 );
		double _16 = ( x3 - x1 );
		double _17 = ( m3 * _16 );
		double _18 = ( _15 + _17 );
		double _19 = ( y3 - y2 );
		double _20 = ( x1 * _19 );
		double _21 = ( y1 - y3 );
		double _22 = ( x2 * _21 );
		double _23 = ( _20 + _22 );
		double _24 = ( y2 - y1 );
		double _25 = ( x3 * _24 );
		double _26 = ( _23 + _25 );
		double _27 = ( _18 / _26 );
		double t1 = _27;
		double _28 = ( y2 - y1 );
		double _29 = ( t1 * _28 );
		double _30 = ( m1 + _29 );
		result.x = _30;
		double _31 = ( x2 - x1 );
		double _32 = ( t1 * _31 );
		double _33 = ( m2 - _32 );
		result.y = _33;
		return result;
	}
	
	
	public static   boolean intersections2segments(double s1p1x, double s1p1y, double s1p2x, double s1p2y, double s2p1x, double s2p1y, double s2p2x, double s2p2y, hxDaedalus.data.math.Point2D posIntersection, haxe.root.Array<java.lang.Object> paramIntersection, java.lang.Object infiniteLineMode)
	{
		boolean __temp_infiniteLineMode26 = ( (( infiniteLineMode == null )) ? (haxe.lang.Runtime.toBool(false)) : (haxe.lang.Runtime.toBool(infiniteLineMode)) );
		double t1 = ((double) (0) );
		double t2 = ((double) (0) );
		boolean result = false;
		double _0 = ( s1p1x - s1p2x );
		double _1 = ( s2p1y - s2p2y );
		double _2 = ( _0 * _1 );
		double _3 = ( s1p2y - s1p1y );
		double _4 = ( s2p1x - s2p2x );
		double _5 = ( _3 * _4 );
		double _6 = ( _2 + _5 );
		double divisor = _6;
		boolean _7 = ( divisor == 0 );
		if (_7) 
		{
			result = false;
		}
		 else 
		{
			result = true;
			boolean _8 =  ! (__temp_infiniteLineMode26) ;
			boolean _9 =  ! (_8) ;
			boolean _12 = false;
			if (_9) 
			{
				_12 = ( posIntersection != null );
			}
			 else 
			{
				_12 = true;
			}
			
			boolean _13 =  ! (_12) ;
			boolean _18 = false;
			if (_13) 
			{
				haxe.root.Array<java.lang.Object> _14 = paramIntersection;
				haxe.root.Array<java.lang.Object> _10 = _14;
				haxe.root.Array<java.lang.Object> _15 = null;
				haxe.root.Array<java.lang.Object> _11 = _15;
				haxe.root.Array<java.lang.Object> _16 = _10;
				haxe.root.Array<java.lang.Object> _17 = _11;
				_18 = ( _16 != _17 );
			}
			 else 
			{
				_18 = true;
			}
			
			if (_18) 
			{
				double _19 = ( s2p1y - s2p2y );
				double _20 = ( s1p1x * _19 );
				double _21 = ( s2p2x - s2p1x );
				double _22 = ( s1p1y * _21 );
				double _23 = ( _20 + _22 );
				double _24 = ( s2p1x * s2p2y );
				double _25 = ( _23 + _24 );
				double _26 = ( s2p1y * s2p2x );
				double _27 = ( _25 - _26 );
				double _28 = ( _27 / divisor );
				t1 = _28;
				double _29 = ( s2p1y - s1p2y );
				double _30 = ( s1p1x * _29 );
				double _31 = ( s1p2x - s2p1x );
				double _32 = ( s1p1y * _31 );
				double _33 = ( _30 + _32 );
				double _34 = ( s1p2x * s2p1y );
				double _35 = ( _33 - _34 );
				double _36 = ( s1p2y * s2p1x );
				double _37 = ( _35 + _36 );
				double _38 = ( _37 / divisor );
				t2 = _38;
				boolean _43 =  ! (__temp_infiniteLineMode26) ;
				boolean _48 = false;
				if (_43) 
				{
					boolean _44 = ( 0 <= t1 );
					boolean _39 = _44;
					boolean _40 = false;
					if (_39) 
					{
						boolean _45 = ( t1 <= 1 );
						_40 = _45;
					}
					 else 
					{
						_40 = false;
					}
					
					boolean _41 = false;
					if (_40) 
					{
						boolean _46 = ( 0 <= t2 );
						_41 = _46;
					}
					 else 
					{
						_41 = false;
					}
					
					boolean _42 = false;
					if (_41) 
					{
						boolean _47 = ( t2 <= 1 );
						_42 = _47;
					}
					 else 
					{
						_42 = false;
					}
					
					_48 =  ! (_42) ;
				}
				 else 
				{
					_48 = false;
				}
				
				if (_48) 
				{
					result = false;
				}
				
			}
			
		}
		
		if (result) 
		{
			boolean _49 = ( posIntersection != null );
			if (_49) 
			{
				double _50 = ( s1p2x - s1p1x );
				double _51 = ( t1 * _50 );
				double _52 = ( s1p1x + _51 );
				posIntersection.x = _52;
				double _53 = ( s1p2y - s1p1y );
				double _54 = ( t1 * _53 );
				double _55 = ( s1p1y + _54 );
				posIntersection.y = _55;
			}
			
			haxe.root.Array<java.lang.Object> _56 = paramIntersection;
			haxe.root.Array<java.lang.Object> _57 = null;
			boolean _58 = ( _56 != _57 );
			if (_58) 
			{
				paramIntersection.push(t1);
				paramIntersection.push(t2);
			}
			
		}
		
		return result;
	}
	
	
	public static   boolean intersections2edges(hxDaedalus.data.Edge edge1, hxDaedalus.data.Edge edge2, hxDaedalus.data.math.Point2D posIntersection, haxe.root.Array<java.lang.Object> paramIntersection, java.lang.Object infiniteLineMode)
	{
		boolean __temp_infiniteLineMode27 = ( (( infiniteLineMode == null )) ? (haxe.lang.Runtime.toBool(false)) : (haxe.lang.Runtime.toBool(infiniteLineMode)) );
		double _0 = edge1.get_originVertex().get_pos().x;
		double _1 = edge1.get_originVertex().get_pos().y;
		double _2 = edge1.get_destinationVertex().get_pos().x;
		double _3 = edge1.get_destinationVertex().get_pos().y;
		double _4 = edge2.get_originVertex().get_pos().x;
		double _5 = edge2.get_originVertex().get_pos().y;
		double _6 = edge2.get_destinationVertex().get_pos().x;
		double _7 = edge2.get_destinationVertex().get_pos().y;
		haxe.root.Array<java.lang.Object> _8 = paramIntersection;
		boolean _9 = hxDaedalus.data.math.Geom2D.intersections2segments(_0, _1, _2, _3, _4, _5, _6, _7, posIntersection, _8, __temp_infiniteLineMode27);
		return _9;
	}
	
	
	public static   boolean isConvex(hxDaedalus.data.Edge edge)
	{
		boolean result = true;
		hxDaedalus.data.Edge eLeft = null;
		hxDaedalus.data.Vertex vRight = null;
		hxDaedalus.data.Edge _0 = edge.get_nextLeftEdge().get_oppositeEdge();
		eLeft = _0;
		hxDaedalus.data.Vertex _1 = edge.get_nextRightEdge().get_destinationVertex();
		vRight = _1;
		double _2 = vRight.get_pos().x;
		double _3 = vRight.get_pos().y;
		int _4 = hxDaedalus.data.math.Geom2D.getRelativePosition(_2, _3, eLeft);
		boolean _5 = ( _4 != -1 );
		if (_5) 
		{
			result = false;
		}
		 else 
		{
			hxDaedalus.data.Edge _6 = edge.get_prevRightEdge();
			eLeft = _6;
			hxDaedalus.data.Vertex _7 = edge.get_prevLeftEdge().get_originVertex();
			vRight = _7;
			double _8 = vRight.get_pos().x;
			double _9 = vRight.get_pos().y;
			int _10 = hxDaedalus.data.math.Geom2D.getRelativePosition(_8, _9, eLeft);
			boolean _11 = ( _10 != -1 );
			if (_11) 
			{
				result = false;
			}
			
		}
		
		return result;
	}
	
	
	public static   void projectOrthogonaly(hxDaedalus.data.math.Point2D vertexPos, hxDaedalus.data.Edge edge)
	{
		double _0 = edge.get_originVertex().get_pos().x;
		double a = _0;
		double _1 = edge.get_originVertex().get_pos().y;
		double b = _1;
		double _2 = edge.get_destinationVertex().get_pos().x;
		double c = _2;
		double _3 = edge.get_destinationVertex().get_pos().y;
		double d = _3;
		double _4 = vertexPos.x;
		double e = _4;
		double _5 = vertexPos.y;
		double f = _5;
		double _6 = ( a * a );
		double _7 = ( a * c );
		double _8 = ( _6 - _7 );
		double _9 = ( a * e );
		double _10 = ( _8 - _9 );
		double _11 = ( b * b );
		double _12 = ( _10 + _11 );
		double _13 = ( b * d );
		double _14 = ( _12 - _13 );
		double _15 = ( b * f );
		double _16 = ( _14 - _15 );
		double _17 = ( c * e );
		double _18 = ( _16 + _17 );
		double _19 = ( d * f );
		double _20 = ( _18 + _19 );
		double _21 = ( a * a );
		double _22 = ( 2 * a );
		double _23 = ( _22 * c );
		double _24 = ( _21 - _23 );
		double _25 = ( b * b );
		double _26 = ( _24 + _25 );
		double _27 = ( 2 * b );
		double _28 = ( _27 * d );
		double _29 = ( _26 - _28 );
		double _30 = ( c * c );
		double _31 = ( _29 + _30 );
		double _32 = ( d * d );
		double _33 = ( _31 + _32 );
		double _34 = ( _20 / _33 );
		double t1 = _34;
		double _35 = ( c - a );
		double _36 = ( t1 * _35 );
		double _37 = ( a + _36 );
		vertexPos.x = _37;
		double _38 = ( d - b );
		double _39 = ( t1 * _38 );
		double _40 = ( b + _39 );
		vertexPos.y = _40;
	}
	
	
	public static   boolean intersections2Circles(double cx1, double cy1, double r1, double cx2, double cy2, double r2, haxe.root.Array<java.lang.Object> result)
	{
		double _0 = ( cx2 - cx1 );
		double _1 = ( cx2 - cx1 );
		double _2 = ( _0 * _1 );
		double _3 = ( cy2 - cy1 );
		double _4 = ( cy2 - cy1 );
		double _5 = ( _3 * _4 );
		double _6 = ( _2 + _5 );
		double distRadiusSQRD = _6;
		boolean _7 = ( cx1 != cx2 );
		boolean _8 =  ! (_7) ;
		boolean _12 = false;
		if (_8) 
		{
			_12 = ( cy1 != cy2 );
		}
		 else 
		{
			_12 = true;
		}
		
		boolean _22 = false;
		if (_12) 
		{
			double _19 = ( r1 + r2 );
			double _13 = _19;
			double _9 = _13;
			double _20 = ( r1 + r2 );
			double _14 = _20;
			double _10 = _14;
			double _21 = ( _9 * _10 );
			double _15 = _21;
			double _11 = _15;
			_22 = ( distRadiusSQRD <= _11 );
		}
		 else 
		{
			_22 = false;
		}
		
		boolean _26 = false;
		if (_22) 
		{
			double _23 = ( r1 - r2 );
			double _16 = _23;
			double _24 = ( r1 - r2 );
			double _17 = _24;
			double _25 = ( _16 * _17 );
			double _18 = _25;
			_26 = ( distRadiusSQRD >= _18 );
		}
		 else 
		{
			_26 = false;
		}
		
		if (_26) 
		{
			double _27 = ( r1 + r2 );
			double _28 = ( r1 + r2 );
			double _29 = ( _27 * _28 );
			double _30 = ( _29 - distRadiusSQRD );
			double _31 = ( r2 - r1 );
			double _32 = ( r2 - r1 );
			double _33 = ( _31 * _32 );
			double _34 = ( distRadiusSQRD - _33 );
			double _35 = ( _30 * _34 );
			double _36 = java.lang.Math.sqrt(_35);
			double transcendPart = _36;
			double _37 = ( cx1 + cx2 );
			double _38 = ( _37 / 2 );
			double _39 = ( cx2 - cx1 );
			double _40 = ( r1 * r1 );
			double _41 = ( r2 * r2 );
			double _42 = ( _40 - _41 );
			double _43 = ( _39 * _42 );
			double _44 = ( 2 * distRadiusSQRD );
			double _45 = ( _43 / _44 );
			double _46 = ( _38 + _45 );
			double xFirstPart = _46;
			double _47 = ( cy1 + cy2 );
			double _48 = ( _47 / 2 );
			double _49 = ( cy2 - cy1 );
			double _50 = ( r1 * r1 );
			double _51 = ( r2 * r2 );
			double _52 = ( _50 - _51 );
			double _53 = ( _49 * _52 );
			double _54 = ( 2 * distRadiusSQRD );
			double _55 = ( _53 / _54 );
			double _56 = ( _48 + _55 );
			double yFirstPart = _56;
			double _57 = ( cy2 - cy1 );
			double _58 = ( 2 * distRadiusSQRD );
			double _59 = ( _57 / _58 );
			double xFactor = _59;
			double _60 = ( cx2 - cx1 );
			double _61 = ( 2 * distRadiusSQRD );
			double _62 = ( _60 / _61 );
			double yFactor = _62;
			haxe.root.Array<java.lang.Object> _63 = result;
			haxe.root.Array<java.lang.Object> _64 = null;
			boolean _65 = ( _63 != _64 );
			if (_65) 
			{
				int _g = 0;
				double _66 = ( xFactor * transcendPart );
				double _67 = ( xFirstPart + _66 );
				double _68 = ( yFactor * transcendPart );
				double _69 = ( yFirstPart - _68 );
				double _70 = ( xFactor * transcendPart );
				double _71 = ( xFirstPart - _70 );
				double _72 = ( yFactor * transcendPart );
				double _73 = ( yFirstPart + _72 );
				haxe.root.Array<java.lang.Object> _74 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (_67) ), ((java.lang.Object) (_69) ), ((java.lang.Object) (_71) ), ((java.lang.Object) (_73) )});
				haxe.root.Array<java.lang.Object> _g1 = _74;
				while (true)
				{
					int _75 = _g1.length;
					boolean _76 = ( _g < _75 );
					boolean _77 =  ! (_76) ;
					if (_77) 
					{
						break;
					}
					
					haxe.root.Array<java.lang.Object> _78 = _g1;
					double _79 = ((double) (haxe.lang.Runtime.toDouble(_78.__get(_g))) );
					double f = _79;
					 ++ _g;
					result.push(f);
				}
				
			}
			
			return true;
		}
		 else 
		{
			return false;
		}
		
	}
	
	
	public static   boolean intersectionsSegmentCircle(double p0x, double p0y, double p1x, double p1y, double cx, double cy, double r, haxe.root.Array<java.lang.Object> result)
	{
		double _0 = ( p0x * p0x );
		double p0xSQD = _0;
		double _1 = ( p0y * p0y );
		double p0ySQD = _1;
		double _2 = ( p1y * p1y );
		double _3 = ( 2 * p1y );
		double _4 = ( _3 * p0y );
		double _5 = ( _2 - _4 );
		double _6 = ( _5 + p0ySQD );
		double _7 = ( p1x * p1x );
		double _8 = ( _6 + _7 );
		double _9 = ( 2 * p1x );
		double _10 = ( _9 * p0x );
		double _11 = ( _8 - _10 );
		double _12 = ( _11 + p0xSQD );
		double a = _12;
		double _13 = ( 2 * p0y );
		double _14 = ( _13 * cy );
		double _15 = ( 2 * p0xSQD );
		double _16 = ( _14 - _15 );
		double _17 = ( 2 * p1y );
		double _18 = ( _17 * p0y );
		double _19 = ( _16 + _18 );
		double _20 = ( 2 * p0ySQD );
		double _21 = ( _19 - _20 );
		double _22 = ( 2 * p1x );
		double _23 = ( _22 * p0x );
		double _24 = ( _21 + _23 );
		double _25 = ( 2 * p1x );
		double _26 = ( _25 * cx );
		double _27 = ( _24 - _26 );
		double _28 = ( 2 * p0x );
		double _29 = ( _28 * cx );
		double _30 = ( _27 + _29 );
		double _31 = ( 2 * p1y );
		double _32 = ( _31 * cy );
		double _33 = ( _30 - _32 );
		double b = _33;
		double _34 = ( cy * cy );
		double _35 = ( p0ySQD + _34 );
		double _36 = ( cx * cx );
		double _37 = ( _35 + _36 );
		double _38 = ( 2 * p0y );
		double _39 = ( _38 * cy );
		double _40 = ( _37 - _39 );
		double _41 = ( 2 * p0x );
		double _42 = ( _41 * cx );
		double _43 = ( _40 - _42 );
		double _44 = ( _43 + p0xSQD );
		double _45 = ( r * r );
		double _46 = ( _44 - _45 );
		double c = _46;
		double _47 = ( b * b );
		double _48 = ( 4 * a );
		double _49 = ( _48 * c );
		double _50 = ( _47 - _49 );
		double delta = _50;
		double deltaSQRT = 0.0;
		double t0 = 0.0;
		double t1 = 0.0;
		boolean _51 = ( delta < 0 );
		if (_51) 
		{
			return false;
		}
		 else 
		{
			boolean _52 = ( delta == 0 );
			if (_52) 
			{
				double _53 =  - (b) ;
				double _54 = ( 2 * a );
				double _55 = ( _53 / _54 );
				t0 = _55;
				boolean _56 = ( t0 < 0 );
				boolean _57 =  ! (_56) ;
				boolean _58 = false;
				if (_57) 
				{
					_58 = ( t0 > 1 );
				}
				 else 
				{
					_58 = true;
				}
				
				if (_58) 
				{
					return false;
				}
				
				haxe.root.Array<java.lang.Object> _59 = result;
				haxe.root.Array<java.lang.Object> _60 = null;
				boolean _61 = ( _59 != _60 );
				if (_61) 
				{
					int _g = 0;
					double _62 = ( p1x - p0x );
					double _63 = ( t0 * _62 );
					double _64 = ( p0x + _63 );
					double _65 = ( p1y - p0y );
					double _66 = ( t0 * _65 );
					double _67 = ( p0y + _66 );
					haxe.root.Array<java.lang.Object> _68 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (_64) ), ((java.lang.Object) (_67) ), ((java.lang.Object) (t0) )});
					haxe.root.Array<java.lang.Object> _g1 = _68;
					while (true)
					{
						int _69 = _g1.length;
						boolean _70 = ( _g < _69 );
						boolean _71 =  ! (_70) ;
						if (_71) 
						{
							break;
						}
						
						haxe.root.Array<java.lang.Object> _72 = _g1;
						double _73 = ((double) (haxe.lang.Runtime.toDouble(_72.__get(_g))) );
						double f = _73;
						 ++ _g;
						result.push(f);
					}
					
				}
				
				return true;
			}
			 else 
			{
				double _74 = java.lang.Math.sqrt(delta);
				deltaSQRT = _74;
				double _75 =  - (b) ;
				double _76 = ( _75 + deltaSQRT );
				double _77 = ( 2 * a );
				double _78 = ( _76 / _77 );
				t0 = _78;
				double _79 =  - (b) ;
				double _80 = ( _79 - deltaSQRT );
				double _81 = ( 2 * a );
				double _82 = ( _80 / _81 );
				t1 = _82;
				boolean intersecting = false;
				boolean _83 = ( 0 <= t0 );
				boolean _84 = false;
				if (_83) 
				{
					_84 = ( t0 <= 1 );
				}
				 else 
				{
					_84 = false;
				}
				
				if (_84) 
				{
					haxe.root.Array<java.lang.Object> _85 = result;
					haxe.root.Array<java.lang.Object> _86 = null;
					boolean _87 = ( _85 != _86 );
					if (_87) 
					{
						int _g2 = 0;
						double _88 = ( p1x - p0x );
						double _89 = ( t0 * _88 );
						double _90 = ( p0x + _89 );
						double _91 = ( p1y - p0y );
						double _92 = ( t0 * _91 );
						double _93 = ( p0y + _92 );
						haxe.root.Array<java.lang.Object> _94 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (_90) ), ((java.lang.Object) (_93) ), ((java.lang.Object) (t0) )});
						haxe.root.Array<java.lang.Object> _g11 = _94;
						while (true)
						{
							int _95 = _g11.length;
							boolean _96 = ( _g2 < _95 );
							boolean _97 =  ! (_96) ;
							if (_97) 
							{
								break;
							}
							
							haxe.root.Array<java.lang.Object> _98 = _g11;
							double _99 = ((double) (haxe.lang.Runtime.toDouble(_98.__get(_g2))) );
							double f1 = _99;
							 ++ _g2;
							result.push(f1);
						}
						
					}
					
					intersecting = true;
				}
				
				boolean _100 = ( 0 <= t1 );
				boolean _101 = false;
				if (_100) 
				{
					_101 = ( t1 <= 1 );
				}
				 else 
				{
					_101 = false;
				}
				
				if (_101) 
				{
					haxe.root.Array<java.lang.Object> _102 = result;
					haxe.root.Array<java.lang.Object> _103 = null;
					boolean _104 = ( _102 != _103 );
					if (_104) 
					{
						int _g3 = 0;
						double _105 = ( p1x - p0x );
						double _106 = ( t1 * _105 );
						double _107 = ( p0x + _106 );
						double _108 = ( p1y - p0y );
						double _109 = ( t1 * _108 );
						double _110 = ( p0y + _109 );
						haxe.root.Array<java.lang.Object> _111 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (_107) ), ((java.lang.Object) (_110) ), ((java.lang.Object) (t1) )});
						haxe.root.Array<java.lang.Object> _g12 = _111;
						while (true)
						{
							int _112 = _g12.length;
							boolean _113 = ( _g3 < _112 );
							boolean _114 =  ! (_113) ;
							if (_114) 
							{
								break;
							}
							
							haxe.root.Array<java.lang.Object> _115 = _g12;
							double _116 = ((double) (haxe.lang.Runtime.toDouble(_115.__get(_g3))) );
							double f2 = _116;
							 ++ _g3;
							result.push(f2);
						}
						
					}
					
					intersecting = true;
				}
				
				return intersecting;
			}
			
		}
		
	}
	
	
	public static   boolean intersectionsLineCircle(double p0x, double p0y, double p1x, double p1y, double cx, double cy, double r, haxe.root.Array<java.lang.Object> result)
	{
		double _0 = ( p0x * p0x );
		double p0xSQD = _0;
		double _1 = ( p0y * p0y );
		double p0ySQD = _1;
		double _2 = ( p1y * p1y );
		double _3 = ( 2 * p1y );
		double _4 = ( _3 * p0y );
		double _5 = ( _2 - _4 );
		double _6 = ( _5 + p0ySQD );
		double _7 = ( p1x * p1x );
		double _8 = ( _6 + _7 );
		double _9 = ( 2 * p1x );
		double _10 = ( _9 * p0x );
		double _11 = ( _8 - _10 );
		double _12 = ( _11 + p0xSQD );
		double a = _12;
		double _13 = ( 2 * p0y );
		double _14 = ( _13 * cy );
		double _15 = ( 2 * p0xSQD );
		double _16 = ( _14 - _15 );
		double _17 = ( 2 * p1y );
		double _18 = ( _17 * p0y );
		double _19 = ( _16 + _18 );
		double _20 = ( 2 * p0ySQD );
		double _21 = ( _19 - _20 );
		double _22 = ( 2 * p1x );
		double _23 = ( _22 * p0x );
		double _24 = ( _21 + _23 );
		double _25 = ( 2 * p1x );
		double _26 = ( _25 * cx );
		double _27 = ( _24 - _26 );
		double _28 = ( 2 * p0x );
		double _29 = ( _28 * cx );
		double _30 = ( _27 + _29 );
		double _31 = ( 2 * p1y );
		double _32 = ( _31 * cy );
		double _33 = ( _30 - _32 );
		double b = _33;
		double _34 = ( cy * cy );
		double _35 = ( p0ySQD + _34 );
		double _36 = ( cx * cx );
		double _37 = ( _35 + _36 );
		double _38 = ( 2 * p0y );
		double _39 = ( _38 * cy );
		double _40 = ( _37 - _39 );
		double _41 = ( 2 * p0x );
		double _42 = ( _41 * cx );
		double _43 = ( _40 - _42 );
		double _44 = ( _43 + p0xSQD );
		double _45 = ( r * r );
		double _46 = ( _44 - _45 );
		double c = _46;
		double _47 = ( b * b );
		double _48 = ( 4 * a );
		double _49 = ( _48 * c );
		double _50 = ( _47 - _49 );
		double delta = _50;
		double deltaSQRT = 0.0;
		double t0 = 0.0;
		double t1 = 0.0;
		boolean _51 = ( delta < 0 );
		if (_51) 
		{
			return false;
		}
		 else 
		{
			boolean _52 = ( delta == 0 );
			if (_52) 
			{
				double _53 =  - (b) ;
				double _54 = ( 2 * a );
				double _55 = ( _53 / _54 );
				t0 = _55;
				{
					int _g = 0;
					double _56 = ( p1x - p0x );
					double _57 = ( t0 * _56 );
					double _58 = ( p0x + _57 );
					double _59 = ( p1y - p0y );
					double _60 = ( t0 * _59 );
					double _61 = ( p0y + _60 );
					haxe.root.Array<java.lang.Object> _62 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (_58) ), ((java.lang.Object) (_61) ), ((java.lang.Object) (t0) )});
					haxe.root.Array<java.lang.Object> _g1 = _62;
					while (true)
					{
						int _63 = _g1.length;
						boolean _64 = ( _g < _63 );
						boolean _65 =  ! (_64) ;
						if (_65) 
						{
							break;
						}
						
						haxe.root.Array<java.lang.Object> _66 = _g1;
						double _67 = ((double) (haxe.lang.Runtime.toDouble(_66.__get(_g))) );
						double f = _67;
						 ++ _g;
						result.push(f);
					}
					
				}
				
			}
			 else 
			{
				boolean _68 = ( delta > 0 );
				if (_68) 
				{
					double _69 = java.lang.Math.sqrt(delta);
					deltaSQRT = _69;
					double _70 =  - (b) ;
					double _71 = ( _70 + deltaSQRT );
					double _72 = ( 2 * a );
					double _73 = ( _71 / _72 );
					t0 = _73;
					double _74 =  - (b) ;
					double _75 = ( _74 - deltaSQRT );
					double _76 = ( 2 * a );
					double _77 = ( _75 / _76 );
					t1 = _77;
					{
						int _g2 = 0;
						double _78 = ( p1x - p0x );
						double _79 = ( t0 * _78 );
						double _80 = ( p0x + _79 );
						double _81 = ( p1y - p0y );
						double _82 = ( t0 * _81 );
						double _83 = ( p0y + _82 );
						double _84 = ( p1x - p0x );
						double _85 = ( t1 * _84 );
						double _86 = ( p0x + _85 );
						double _87 = ( p1y - p0y );
						double _88 = ( t1 * _87 );
						double _89 = ( p0y + _88 );
						haxe.root.Array<java.lang.Object> _90 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (_80) ), ((java.lang.Object) (_83) ), ((java.lang.Object) (t0) ), ((java.lang.Object) (_86) ), ((java.lang.Object) (_89) ), ((java.lang.Object) (t1) )});
						haxe.root.Array<java.lang.Object> _g11 = _90;
						while (true)
						{
							int _91 = _g11.length;
							boolean _92 = ( _g2 < _91 );
							boolean _93 =  ! (_92) ;
							if (_93) 
							{
								break;
							}
							
							haxe.root.Array<java.lang.Object> _94 = _g11;
							double _95 = ((double) (haxe.lang.Runtime.toDouble(_94.__get(_g2))) );
							double f1 = _95;
							 ++ _g2;
							result.push(f1);
						}
						
					}
					
				}
				
			}
			
		}
		
		return true;
	}
	
	
	public static   boolean tangentsPointToCircle(double px, double py, double cx, double cy, double r, haxe.root.Array<java.lang.Object> result)
	{
		double _0 = ( px + cx );
		double _1 = ( _0 / 2 );
		double c2x = _1;
		double _2 = ( py + cy );
		double _3 = ( _2 / 2 );
		double c2y = _3;
		double _4 = ( px - cx );
		double _5 = ( px - cx );
		double _6 = ( _4 * _5 );
		double _7 = ( py - cy );
		double _8 = ( py - cy );
		double _9 = ( _7 * _8 );
		double _10 = ( _6 + _9 );
		double _11 = java.lang.Math.sqrt(_10);
		double _12 = ( 0.5 * _11 );
		double r2 = _12;
		haxe.root.Array<java.lang.Object> _13 = result;
		boolean _14 = hxDaedalus.data.math.Geom2D.intersections2Circles(c2x, c2y, r2, cx, cy, r, _13);
		return _14;
	}
	
	
	public static   boolean tangentsCrossCircleToCircle(double r, double c1x, double c1y, double c2x, double c2y, haxe.root.Array<java.lang.Object> result)
	{
		double _0 = ( c1x - c2x );
		double _1 = ( c1x - c2x );
		double _2 = ( _0 * _1 );
		double _3 = ( c1y - c2y );
		double _4 = ( c1y - c2y );
		double _5 = ( _3 * _4 );
		double _6 = ( _2 + _5 );
		double _7 = java.lang.Math.sqrt(_6);
		double distance = _7;
		double _8 = ( distance / 4 );
		double radius = _8;
		double _9 = ( c2x - c1x );
		double _10 = ( _9 / 4 );
		double _11 = ( c1x + _10 );
		double centerX = _11;
		double _12 = ( c2y - c1y );
		double _13 = ( _12 / 4 );
		double _14 = ( c1y + _13 );
		double centerY = _14;
		haxe.root.Array<java.lang.Object> _15 = result;
		boolean _16 = hxDaedalus.data.math.Geom2D.intersections2Circles(c1x, c1y, r, centerX, centerY, radius, _15);
		if (_16) 
		{
			haxe.root.Array<java.lang.Object> _17 = result;
			double _18 = ((double) (haxe.lang.Runtime.toDouble(_17.__get(0))) );
			double t1x = _18;
			haxe.root.Array<java.lang.Object> _19 = result;
			double _20 = ((double) (haxe.lang.Runtime.toDouble(_19.__get(1))) );
			double t1y = _20;
			haxe.root.Array<java.lang.Object> _21 = result;
			double _22 = ((double) (haxe.lang.Runtime.toDouble(_21.__get(2))) );
			double t2x = _22;
			haxe.root.Array<java.lang.Object> _23 = result;
			double _24 = ((double) (haxe.lang.Runtime.toDouble(_23.__get(3))) );
			double t2y = _24;
			double _25 = ( c1x + c2x );
			double _26 = ( _25 / 2 );
			double midX = _26;
			double _27 = ( c1y + c2y );
			double _28 = ( _27 / 2 );
			double midY = _28;
			double _29 = ( t1x - midX );
			double _30 = ( c2y - c1y );
			double _31 = ( _29 * _30 );
			double _32 = ( t1y - midY );
			double _33 =  - (c2x) ;
			double _34 = ( _33 + c1x );
			double _35 = ( _32 * _34 );
			double _36 = ( _31 + _35 );
			double dotProd = _36;
			double _37 = ( distance * distance );
			double _38 = ( dotProd / _37 );
			double tproj = _38;
			double _39 = ( c2y - c1y );
			double _40 = ( tproj * _39 );
			double _41 = ( midX + _40 );
			double projx = _41;
			double _42 = ( c2x - c1x );
			double _43 = ( tproj * _42 );
			double _44 = ( midY - _43 );
			double projy = _44;
			double _45 = ( 2 * projx );
			double _46 = ( _45 - t1x );
			double t4x = _46;
			double _47 = ( 2 * projy );
			double _48 = ( _47 - t1y );
			double t4y = _48;
			double _49 = ( t4x + t2x );
			double _50 = ( _49 - t1x );
			double t3x = _50;
			double _51 = ( t2y + t4y );
			double _52 = ( _51 - t1y );
			double t3y = _52;
			{
				int _g = 0;
				haxe.root.Array<java.lang.Object> _53 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (t3x) ), ((java.lang.Object) (t3y) ), ((java.lang.Object) (t4x) ), ((java.lang.Object) (t4y) )});
				haxe.root.Array<java.lang.Object> _g1 = _53;
				while (true)
				{
					int _54 = _g1.length;
					boolean _55 = ( _g < _54 );
					boolean _56 =  ! (_55) ;
					if (_56) 
					{
						break;
					}
					
					haxe.root.Array<java.lang.Object> _57 = _g1;
					double _58 = ((double) (haxe.lang.Runtime.toDouble(_57.__get(_g))) );
					double f = _58;
					 ++ _g;
					result.push(f);
				}
				
			}
			
			return true;
		}
		 else 
		{
			return false;
		}
		
	}
	
	
	public static   void tangentsParalCircleToCircle(double r, double c1x, double c1y, double c2x, double c2y, haxe.root.Array<java.lang.Object> result)
	{
		double _0 = ( c1x - c2x );
		double _1 = ( c1x - c2x );
		double _2 = ( _0 * _1 );
		double _3 = ( c1y - c2y );
		double _4 = ( c1y - c2y );
		double _5 = ( _3 * _4 );
		double _6 = ( _2 + _5 );
		double _7 = java.lang.Math.sqrt(_6);
		double distance = _7;
		double _8 = ( c2y - c1y );
		double _9 = ( r * _8 );
		double _10 = ( _9 / distance );
		double _11 = ( c1x + _10 );
		double t1x = _11;
		double _12 =  - (c2x) ;
		double _13 = ( _12 + c1x );
		double _14 = ( r * _13 );
		double _15 = ( _14 / distance );
		double _16 = ( c1y + _15 );
		double t1y = _16;
		double _17 = ( 2 * c1x );
		double _18 = ( _17 - t1x );
		double t2x = _18;
		double _19 = ( 2 * c1y );
		double _20 = ( _19 - t1y );
		double t2y = _20;
		double _21 = ( t2x + c2x );
		double _22 = ( _21 - c1x );
		double t3x = _22;
		double _23 = ( t2y + c2y );
		double _24 = ( _23 - c1y );
		double t3y = _24;
		double _25 = ( t1x + c2x );
		double _26 = ( _25 - c1x );
		double t4x = _26;
		double _27 = ( t1y + c2y );
		double _28 = ( _27 - c1y );
		double t4y = _28;
		{
			int _g = 0;
			haxe.root.Array<java.lang.Object> _29 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (t1x) ), ((java.lang.Object) (t1y) ), ((java.lang.Object) (t2x) ), ((java.lang.Object) (t2y) ), ((java.lang.Object) (t3x) ), ((java.lang.Object) (t3y) ), ((java.lang.Object) (t4x) ), ((java.lang.Object) (t4y) )});
			haxe.root.Array<java.lang.Object> _g1 = _29;
			while (true)
			{
				int _30 = _g1.length;
				boolean _31 = ( _g < _30 );
				boolean _32 =  ! (_31) ;
				if (_32) 
				{
					break;
				}
				
				haxe.root.Array<java.lang.Object> _33 = _g1;
				double _34 = ((double) (haxe.lang.Runtime.toDouble(_33.__get(_g))) );
				double f = _34;
				 ++ _g;
				result.push(f);
			}
			
		}
		
	}
	
	
	public static   double distanceSquaredPointToLine(double px, double py, double ax, double ay, double bx, double by)
	{
		double _0 = ( bx - ax );
		double _1 = ( bx - ax );
		double _2 = ( _0 * _1 );
		double _3 = ( by - ay );
		double _4 = ( by - ay );
		double _5 = ( _3 * _4 );
		double _6 = ( _2 + _5 );
		double a_b_squaredLength = _6;
		double _7 = ( px - ax );
		double _8 = ( bx - ax );
		double _9 = ( _7 * _8 );
		double _10 = ( py - ay );
		double _11 = ( by - ay );
		double _12 = ( _10 * _11 );
		double _13 = ( _9 + _12 );
		double dotProduct = _13;
		double _14 = ( ax - px );
		double _15 = ( ax - px );
		double _16 = ( _14 * _15 );
		double _17 = ( ay - py );
		double _18 = ( ay - py );
		double _19 = ( _17 * _18 );
		double _20 = ( _16 + _19 );
		double p_a_squaredLength = _20;
		double _21 = ( dotProduct * dotProduct );
		double _22 = ( _21 / a_b_squaredLength );
		double _23 = ( p_a_squaredLength - _22 );
		return _23;
	}
	
	
	public static   double distanceSquaredPointToSegment(double px, double py, double ax, double ay, double bx, double by)
	{
		double _0 = ( bx - ax );
		double _1 = ( bx - ax );
		double _2 = ( _0 * _1 );
		double _3 = ( by - ay );
		double _4 = ( by - ay );
		double _5 = ( _3 * _4 );
		double _6 = ( _2 + _5 );
		double a_b_squaredLength = _6;
		double _7 = ( px - ax );
		double _8 = ( bx - ax );
		double _9 = ( _7 * _8 );
		double _10 = ( py - ay );
		double _11 = ( by - ay );
		double _12 = ( _10 * _11 );
		double _13 = ( _9 + _12 );
		double _14 = ( _13 / a_b_squaredLength );
		double dotProduct = _14;
		boolean _15 = ( dotProduct < 0 );
		if (_15) 
		{
			double _16 = ( px - ax );
			double _17 = ( px - ax );
			double _18 = ( _16 * _17 );
			double _19 = ( py - ay );
			double _20 = ( py - ay );
			double _21 = ( _19 * _20 );
			double _22 = ( _18 + _21 );
			return _22;
		}
		 else 
		{
			boolean _23 = ( dotProduct <= 1 );
			if (_23) 
			{
				double _24 = ( ax - px );
				double _25 = ( ax - px );
				double _26 = ( _24 * _25 );
				double _27 = ( ay - py );
				double _28 = ( ay - py );
				double _29 = ( _27 * _28 );
				double _30 = ( _26 + _29 );
				double p_a_squaredLength = _30;
				double _31 = ( dotProduct * dotProduct );
				double _32 = ( _31 * a_b_squaredLength );
				double _33 = ( p_a_squaredLength - _32 );
				return _33;
			}
			 else 
			{
				double _34 = ( px - bx );
				double _35 = ( px - bx );
				double _36 = ( _34 * _35 );
				double _37 = ( py - by );
				double _38 = ( py - by );
				double _39 = ( _37 * _38 );
				double _40 = ( _36 + _39 );
				return _40;
			}
			
		}
		
	}
	
	
	public static   double distanceSquaredVertexToEdge(hxDaedalus.data.Vertex vertex, hxDaedalus.data.Edge edge)
	{
		double _0 = vertex.get_pos().x;
		double _1 = vertex.get_pos().y;
		double _2 = edge.get_originVertex().get_pos().x;
		double _3 = edge.get_originVertex().get_pos().y;
		double _4 = edge.get_destinationVertex().get_pos().x;
		double _5 = edge.get_destinationVertex().get_pos().y;
		double _6 = hxDaedalus.data.math.Geom2D.distanceSquaredPointToSegment(_0, _1, _2, _3, _4, _5);
		return _6;
	}
	
	
	public static   double pathLength(haxe.root.Array<java.lang.Object> path)
	{
		double sumDistance = 0.;
		haxe.root.Array<java.lang.Object> _0 = path;
		double _1 = ((double) (haxe.lang.Runtime.toDouble(_0.__get(0))) );
		double fromX = _1;
		haxe.root.Array<java.lang.Object> _2 = path;
		double _3 = ((double) (haxe.lang.Runtime.toDouble(_2.__get(1))) );
		double fromY = _3;
		double nextX = 0.0;
		double nextY = 0.0;
		double x = 0.0;
		double y = 0.0;
		double distance = 0.0;
		int i = 2;
		while (true)
		{
			int _4 = path.length;
			boolean _5 = ( i < _4 );
			boolean _6 =  ! (_5) ;
			if (_6) 
			{
				break;
			}
			
			haxe.root.Array<java.lang.Object> _7 = path;
			double _8 = ((double) (haxe.lang.Runtime.toDouble(_7.__get(i))) );
			nextX = _8;
			haxe.root.Array<java.lang.Object> _9 = path;
			int _10 = ( i + 1 );
			double _11 = ((double) (haxe.lang.Runtime.toDouble(_9.__get(_10))) );
			nextY = _11;
			double _12 = ( nextX - fromX );
			x = _12;
			double _13 = ( nextY - fromY );
			y = _13;
			double _14 = ( x * x );
			double _15 = ( y * y );
			double _16 = ( _14 + _15 );
			double _17 = java.lang.Math.sqrt(_16);
			distance = _17;
			sumDistance += distance;
			fromX = nextX;
			fromY = nextY;
			i += 2;
		}
		
		return sumDistance;
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new hxDaedalus.data.math.Geom2D(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new hxDaedalus.data.math.Geom2D();
	}
	
	
}


