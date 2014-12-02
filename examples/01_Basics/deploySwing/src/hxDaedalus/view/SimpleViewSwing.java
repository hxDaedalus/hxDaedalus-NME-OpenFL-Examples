package hxDaedalus.view;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class SimpleViewSwing extends haxe.lang.HxObject
{
	public    SimpleViewSwing(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    SimpleViewSwing()
	{
		hxDaedalus.view.SimpleViewSwing.__hx_ctor_hxDaedalus_view_SimpleViewSwing(this);
	}
	
	
	public static   void __hx_ctor_hxDaedalus_view_SimpleViewSwing(hxDaedalus.view.SimpleViewSwing __temp_me48)
	{
		{
			__temp_me48.noughtFiveStroke = new java.awt.BasicStroke(((float) (0.5) ));
		}
		
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new hxDaedalus.view.SimpleViewSwing(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new hxDaedalus.view.SimpleViewSwing();
	}
	
	
	public  java.awt.BasicStroke noughtFiveStroke;
	
	public  hxDaedalus.data.Mesh mesh;
	
	public   void drawMesh(java.awt.Graphics2D g, hxDaedalus.data.Mesh mesh_)
	{
		boolean _1 = ( mesh_ != null );
		if (_1) 
		{
			this.mesh = mesh_;
		}
		
		java.awt.Color _2 = new java.awt.Color(((int) (16711680) ));
		g.setPaint(((java.awt.Paint) (_2) ));
		java.awt.BasicStroke _3 = this.noughtFiveStroke;
		g.setStroke(((java.awt.Stroke) (_3) ));
		int _5 = 0;
		{
			double _4 = this.mesh.get_width();
			double x = _4;
			_5 = ((int) (x) );
		}
		
		int _7 = 0;
		{
			double _6 = this.mesh.get_height();
			double x1 = _6;
			_7 = ((int) (x1) );
		}
		
		g.drawRect(((int) (0) ), ((int) (0) ), ((int) (_5) ), ((int) (_7) ));
		hxDaedalus.data.Vertex vertex = null;
		hxDaedalus.data.Edge incomingEdge = null;
		hxDaedalus.data.Face holdingFace = null;
		hxDaedalus.iterators.FromMeshToVertices iterVertices = null;
		hxDaedalus.iterators.FromMeshToVertices _8 = new hxDaedalus.iterators.FromMeshToVertices();
		iterVertices = _8;
		hxDaedalus.data.Mesh _9 = this.mesh;
		iterVertices.set_fromMesh(_9);
		hxDaedalus.iterators.FromVertexToIncomingEdges iterEdges = null;
		hxDaedalus.iterators.FromVertexToIncomingEdges _10 = new hxDaedalus.iterators.FromVertexToIncomingEdges();
		iterEdges = _10;
		haxe.ds.ObjectMap<hxDaedalus.data.Vertex, java.lang.Object> _12 = null;
		{
			haxe.ds.ObjectMap<hxDaedalus.data.Vertex, java.lang.Object> _11 = new haxe.ds.ObjectMap<hxDaedalus.data.Vertex, java.lang.Object>();
			haxe.ds.ObjectMap<hxDaedalus.data.Vertex, java.lang.Object> _0 = _11;
			_12 = _0;
		}
		
		haxe.ds.ObjectMap<hxDaedalus.data.Vertex, java.lang.Object> dictVerticesDone = _12;
		java.awt.geom.GeneralPath gpath = null;
		while (true)
		{
			hxDaedalus.data.Vertex _13 = iterVertices.next();
			vertex = _13;
			hxDaedalus.data.Vertex _14 = vertex;
			boolean _15 = ( _14 != null );
			boolean _16 =  ! (_15) ;
			if (_16) 
			{
				break;
			}
			
			{
				dictVerticesDone.set(vertex, true);
				boolean __temp_expr181 = true;
			}
			
			hxDaedalus.data.Mesh _17 = this.mesh;
			boolean _18 = this.vertexIsInsideAABB(vertex, _17);
			boolean _19 =  ! (_18) ;
			if (_19) 
			{
				hxDaedalus.data.Vertex _20 = iterVertices.next();
				vertex = _20;
				hxDaedalus.data.Vertex _21 = vertex;
				boolean _22 = ( _21 != null );
				boolean _23 =  ! (_22) ;
				if (_23) 
				{
					break;
				}
				 else 
				{
					continue;
				}
				
			}
			
			java.awt.Color _24 = new java.awt.Color(((int) (255) ));
			g.setPaint(((java.awt.Paint) (_24) ));
			double _25 = vertex.get_pos().x;
			int _26 = ((int) (( _25 - 0.5 )) );
			double _27 = vertex.get_pos().y;
			int _28 = ((int) (( _27 - 0.5 )) );
			g.fillOval(((int) (_26) ), ((int) (_28) ), ((int) (1) ), ((int) (1) ));
			iterEdges.set_fromVertex(vertex);
			while (true)
			{
				hxDaedalus.data.Edge _29 = iterEdges.next();
				incomingEdge = _29;
				hxDaedalus.data.Edge _30 = incomingEdge;
				boolean _31 = ( _30 != null );
				boolean _32 =  ! (_31) ;
				if (_32) 
				{
					break;
				}
				
				java.lang.Object _34 = null;
				{
					hxDaedalus.data.Vertex _33 = incomingEdge.get_originVertex();
					hxDaedalus.data.Vertex key = _33;
					_34 = dictVerticesDone.get(key);
				}
				
				boolean _35 = ( ! (haxe.lang.Runtime.toBool(_34)) );
				if (_35) 
				{
					boolean _36 = incomingEdge.get_isConstrained();
					if (_36) 
					{
						java.awt.Color _37 = new java.awt.Color(((int) (16711680) ));
						g.setPaint(((java.awt.Paint) (_37) ));
						java.awt.geom.GeneralPath _38 = new java.awt.geom.GeneralPath();
						gpath = _38;
						double _39 = incomingEdge.get_originVertex().get_pos().x;
						double _40 = incomingEdge.get_originVertex().get_pos().y;
						gpath.moveTo(((double) (_39) ), ((double) (_40) ));
						double _41 = incomingEdge.get_destinationVertex().get_pos().x;
						double _42 = incomingEdge.get_destinationVertex().get_pos().y;
						gpath.lineTo(((double) (_41) ), ((double) (_42) ));
						g.draw(((java.awt.Shape) (gpath) ));
					}
					 else 
					{
						java.awt.Color _43 = new java.awt.Color(((int) (10066329) ));
						g.setPaint(((java.awt.Paint) (_43) ));
						java.awt.geom.GeneralPath _44 = new java.awt.geom.GeneralPath();
						gpath = _44;
						double _45 = incomingEdge.get_originVertex().get_pos().x;
						double _46 = incomingEdge.get_originVertex().get_pos().y;
						gpath.moveTo(((double) (_45) ), ((double) (_46) ));
						double _47 = incomingEdge.get_destinationVertex().get_pos().x;
						double _48 = incomingEdge.get_destinationVertex().get_pos().y;
						gpath.lineTo(((double) (_47) ), ((double) (_48) ));
						g.draw(((java.awt.Shape) (gpath) ));
					}
					
				}
				
			}
			
		}
		
	}
	
	
	public   void drawEntity(java.awt.Graphics2D g, hxDaedalus.ai.EntityAI entity)
	{
		java.awt.Color _0 = new java.awt.Color(((int) (65280) ));
		g.setPaint(((java.awt.Paint) (_0) ));
		java.awt.BasicStroke _1 = this.noughtFiveStroke;
		g.setStroke(((java.awt.Stroke) (_1) ));
		double _2 = entity.get_radius();
		double r = _2;
		double _3 = ( r * 2 );
		double r2 = _3;
		double _4 = entity.x;
		int _5 = ((int) (( _4 - r )) );
		double _6 = entity.y;
		int _7 = ((int) (( _6 - r )) );
		g.fillOval(((int) (_5) ), ((int) (_7) ), ((int) (r2) ), ((int) (r2) ));
	}
	
	
	public   void drawEntities(java.awt.Graphics2D g, haxe.root.Array<hxDaedalus.ai.EntityAI> vEntities)
	{
		java.awt.BasicStroke _0 = this.noughtFiveStroke;
		g.setStroke(((java.awt.Stroke) (_0) ));
		java.awt.Color _1 = new java.awt.Color(((int) (65280) ));
		g.setPaint(((java.awt.Paint) (_1) ));
		{
			int _g1 = 0;
			int _2 = vEntities.length;
			int _g = _2;
			while (true)
			{
				boolean _3 = ( _g1 < _g );
				boolean _4 =  ! (_3) ;
				if (_4) 
				{
					break;
				}
				
				int _5 = _g1++;
				int i = _5;
				java.awt.Color _6 = new java.awt.Color(((int) (65280) ));
				g.setPaint(((java.awt.Paint) (_6) ));
				haxe.root.Array<hxDaedalus.ai.EntityAI> _7 = vEntities;
				double _8 = _7.__get(i).get_radius();
				double r = _8;
				double _9 = ( r * 2 );
				double r2 = _9;
				haxe.root.Array<hxDaedalus.ai.EntityAI> _10 = vEntities;
				double _11 = _10.__get(i).x;
				int _12 = ((int) (( _11 - r )) );
				haxe.root.Array<hxDaedalus.ai.EntityAI> _13 = vEntities;
				double _14 = _13.__get(i).y;
				int _15 = ((int) (( _14 - r )) );
				g.fillOval(((int) (_12) ), ((int) (_15) ), ((int) (r2) ), ((int) (r2) ));
			}
			
		}
		
	}
	
	
	public   void drawPath(java.awt.Graphics2D g, haxe.root.Array<java.lang.Object> path)
	{
		int _0 = path.length;
		boolean _1 = ( _0 == 0 );
		if (_1) 
		{
			return ;
		}
		
		java.awt.BasicStroke _2 = this.noughtFiveStroke;
		g.setStroke(((java.awt.Stroke) (_2) ));
		java.awt.Color _3 = new java.awt.Color(((int) (16760848) ));
		g.setPaint(((java.awt.Paint) (_3) ));
		java.awt.geom.GeneralPath _4 = new java.awt.geom.GeneralPath();
		java.awt.geom.GeneralPath gpath = _4;
		haxe.root.Array<java.lang.Object> _5 = path;
		double _6 = ((double) (haxe.lang.Runtime.toDouble(_5.__get(0))) );
		haxe.root.Array<java.lang.Object> _7 = path;
		double _8 = ((double) (haxe.lang.Runtime.toDouble(_7.__get(1))) );
		gpath.moveTo(((double) (_6) ), ((double) (_8) ));
		int i = 2;
		while (true)
		{
			int _9 = path.length;
			boolean _10 = ( i < _9 );
			boolean _11 =  ! (_10) ;
			if (_11) 
			{
				break;
			}
			
			haxe.root.Array<java.lang.Object> _12 = path;
			double _13 = ((double) (haxe.lang.Runtime.toDouble(_12.__get(i))) );
			haxe.root.Array<java.lang.Object> _14 = path;
			int _15 = ( i + 1 );
			double _16 = ((double) (haxe.lang.Runtime.toDouble(_14.__get(_15))) );
			gpath.lineTo(((double) (_13) ), ((double) (_16) ));
			haxe.root.Array<java.lang.Object> _17 = path;
			double _18 = ((double) (haxe.lang.Runtime.toDouble(_17.__get(i))) );
			haxe.root.Array<java.lang.Object> _19 = path;
			int _20 = ( i + 1 );
			double _21 = ((double) (haxe.lang.Runtime.toDouble(_19.__get(_20))) );
			gpath.moveTo(((double) (_18) ), ((double) (_21) ));
			i += 2;
		}
		
		g.draw(((java.awt.Shape) (gpath) ));
	}
	
	
	public   boolean vertexIsInsideAABB(hxDaedalus.data.Vertex vertex, hxDaedalus.data.Mesh mesh)
	{
		double _0 = vertex.get_pos().x;
		boolean _3 = ( _0 < 0 );
		boolean _4 =  ! (_3) ;
		boolean _10 = false;
		if (_4) 
		{
			double _8 = vertex.get_pos().x;
			double _5 = _8;
			double _1 = _5;
			double _9 = mesh.get_width();
			double _6 = _9;
			double _2 = _6;
			_10 = ( _1 > _2 );
		}
		 else 
		{
			_10 = true;
		}
		
		boolean _11 =  ! (_10) ;
		boolean _16 = false;
		if (_11) 
		{
			double _15 = vertex.get_pos().y;
			double _12 = _15;
			double _7 = _12;
			_16 = ( _7 < 0 );
		}
		 else 
		{
			_16 = true;
		}
		
		boolean _17 =  ! (_16) ;
		boolean _20 = false;
		if (_17) 
		{
			double _18 = vertex.get_pos().y;
			double _13 = _18;
			double _19 = mesh.get_height();
			double _14 = _19;
			_20 = ( _13 > _14 );
		}
		 else 
		{
			_20 = true;
		}
		
		if (_20) 
		{
			return false;
		}
		 else 
		{
			return true;
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef182 = true;
			switch (field.hashCode())
			{
				case 3347949:
				{
					if (field.equals("mesh")) 
					{
						__temp_executeDef182 = false;
						this.mesh = ((hxDaedalus.data.Mesh) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -1666039479:
				{
					if (field.equals("noughtFiveStroke")) 
					{
						__temp_executeDef182 = false;
						this.noughtFiveStroke = ((java.awt.BasicStroke) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef182) 
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
			boolean __temp_executeDef183 = true;
			switch (field.hashCode())
			{
				case 37005034:
				{
					if (field.equals("vertexIsInsideAABB")) 
					{
						__temp_executeDef183 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("vertexIsInsideAABB"))) );
					}
					
					break;
				}
				
				
				case -1666039479:
				{
					if (field.equals("noughtFiveStroke")) 
					{
						__temp_executeDef183 = false;
						return this.noughtFiveStroke;
					}
					
					break;
				}
				
				
				case -827014263:
				{
					if (field.equals("drawPath")) 
					{
						__temp_executeDef183 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("drawPath"))) );
					}
					
					break;
				}
				
				
				case 3347949:
				{
					if (field.equals("mesh")) 
					{
						__temp_executeDef183 = false;
						return this.mesh;
					}
					
					break;
				}
				
				
				case 1366185253:
				{
					if (field.equals("drawEntities")) 
					{
						__temp_executeDef183 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("drawEntities"))) );
					}
					
					break;
				}
				
				
				case -827099823:
				{
					if (field.equals("drawMesh")) 
					{
						__temp_executeDef183 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("drawMesh"))) );
					}
					
					break;
				}
				
				
				case -494667193:
				{
					if (field.equals("drawEntity")) 
					{
						__temp_executeDef183 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("drawEntity"))) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef183) 
			{
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
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
			boolean __temp_executeDef184 = true;
			switch (field.hashCode())
			{
				case 37005034:
				{
					if (field.equals("vertexIsInsideAABB")) 
					{
						__temp_executeDef184 = false;
						return this.vertexIsInsideAABB(((hxDaedalus.data.Vertex) (dynargs.__get(0)) ), ((hxDaedalus.data.Mesh) (dynargs.__get(1)) ));
					}
					
					break;
				}
				
				
				case -827099823:
				{
					if (field.equals("drawMesh")) 
					{
						__temp_executeDef184 = false;
						this.drawMesh(((java.awt.Graphics2D) (dynargs.__get(0)) ), ((hxDaedalus.data.Mesh) (dynargs.__get(1)) ));
					}
					
					break;
				}
				
				
				case -827014263:
				{
					if (field.equals("drawPath")) 
					{
						__temp_executeDef184 = false;
						this.drawPath(((java.awt.Graphics2D) (dynargs.__get(0)) ), ((haxe.root.Array<java.lang.Object>) (dynargs.__get(1)) ));
					}
					
					break;
				}
				
				
				case -494667193:
				{
					if (field.equals("drawEntity")) 
					{
						__temp_executeDef184 = false;
						this.drawEntity(((java.awt.Graphics2D) (dynargs.__get(0)) ), ((hxDaedalus.ai.EntityAI) (dynargs.__get(1)) ));
					}
					
					break;
				}
				
				
				case 1366185253:
				{
					if (field.equals("drawEntities")) 
					{
						__temp_executeDef184 = false;
						this.drawEntities(((java.awt.Graphics2D) (dynargs.__get(0)) ), ((haxe.root.Array<hxDaedalus.ai.EntityAI>) (dynargs.__get(1)) ));
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef184) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		return null;
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("mesh");
		baseArr.push("noughtFiveStroke");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


