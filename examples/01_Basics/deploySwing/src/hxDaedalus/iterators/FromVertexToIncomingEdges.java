package hxDaedalus.iterators;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class FromVertexToIncomingEdges extends haxe.lang.HxObject
{
	public    FromVertexToIncomingEdges(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    FromVertexToIncomingEdges()
	{
		hxDaedalus.iterators.FromVertexToIncomingEdges.__hx_ctor_hxDaedalus_iterators_FromVertexToIncomingEdges(this);
	}
	
	
	public static   void __hx_ctor_hxDaedalus_iterators_FromVertexToIncomingEdges(hxDaedalus.iterators.FromVertexToIncomingEdges __temp_me45)
	{
		{
		}
		
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new hxDaedalus.iterators.FromVertexToIncomingEdges(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new hxDaedalus.iterators.FromVertexToIncomingEdges();
	}
	
	
	
	
	public  hxDaedalus.data.Vertex _fromVertex;
	
	public  hxDaedalus.data.Edge _nextEdge;
	
	public  hxDaedalus.data.Edge _resultEdge;
	
	public   hxDaedalus.data.Vertex set_fromVertex(hxDaedalus.data.Vertex value)
	{
		this._fromVertex = value;
		hxDaedalus.data.Edge _0 = this._fromVertex.get_edge();
		this._nextEdge = _0;
		while (true)
		{
			boolean _1 = this._nextEdge.get_isReal();
			boolean _2 =  ! (_1) ;
			boolean _3 =  ! (_2) ;
			if (_3) 
			{
				break;
			}
			
			hxDaedalus.data.Edge _4 = this._nextEdge.get_rotLeftEdge();
			this._nextEdge = _4;
		}
		
		return value;
	}
	
	
	public   hxDaedalus.data.Edge next()
	{
		hxDaedalus.data.Edge _0 = this._nextEdge;
		boolean _1 = ( _0 != null );
		if (_1) 
		{
			hxDaedalus.data.Edge _2 = this._nextEdge.get_oppositeEdge();
			this._resultEdge = _2;
			while (true)
			{
				hxDaedalus.data.Edge _3 = this._nextEdge.get_rotLeftEdge();
				this._nextEdge = _3;
				hxDaedalus.data.Edge _4 = this._nextEdge;
				hxDaedalus.data.Edge _5 = this._fromVertex.get_edge();
				boolean _6 = ( _4 == _5 );
				if (_6) 
				{
					this._nextEdge = null;
					break;
				}
				
				boolean _7 = this._nextEdge.get_isReal();
				boolean _8 =  ! (_7) ;
				boolean _9 =  ! (_8) ;
				if (_9) 
				{
					break;
				}
				
			}
			
		}
		 else 
		{
			this._resultEdge = null;
		}
		
		hxDaedalus.data.Edge _10 = this._resultEdge;
		return _10;
	}
	
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef164 = true;
			switch (field.hashCode())
			{
				case 516008217:
				{
					if (field.equals("_resultEdge")) 
					{
						__temp_executeDef164 = false;
						this._resultEdge = ((hxDaedalus.data.Edge) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -2064921106:
				{
					if (field.equals("fromVertex")) 
					{
						__temp_executeDef164 = false;
						this.set_fromVertex(((hxDaedalus.data.Vertex) (value) ));
						return value;
					}
					
					break;
				}
				
				
				case 1514466479:
				{
					if (field.equals("_nextEdge")) 
					{
						__temp_executeDef164 = false;
						this._nextEdge = ((hxDaedalus.data.Edge) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -976608371:
				{
					if (field.equals("_fromVertex")) 
					{
						__temp_executeDef164 = false;
						this._fromVertex = ((hxDaedalus.data.Vertex) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef164) 
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
			boolean __temp_executeDef165 = true;
			switch (field.hashCode())
			{
				case 3377907:
				{
					if (field.equals("next")) 
					{
						__temp_executeDef165 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("next"))) );
					}
					
					break;
				}
				
				
				case -976608371:
				{
					if (field.equals("_fromVertex")) 
					{
						__temp_executeDef165 = false;
						return this._fromVertex;
					}
					
					break;
				}
				
				
				case -761514517:
				{
					if (field.equals("set_fromVertex")) 
					{
						__temp_executeDef165 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("set_fromVertex"))) );
					}
					
					break;
				}
				
				
				case 1514466479:
				{
					if (field.equals("_nextEdge")) 
					{
						__temp_executeDef165 = false;
						return this._nextEdge;
					}
					
					break;
				}
				
				
				case 516008217:
				{
					if (field.equals("_resultEdge")) 
					{
						__temp_executeDef165 = false;
						return this._resultEdge;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef165) 
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
			boolean __temp_executeDef166 = true;
			switch (field.hashCode())
			{
				case 3377907:
				{
					if (field.equals("next")) 
					{
						__temp_executeDef166 = false;
						return this.next();
					}
					
					break;
				}
				
				
				case -761514517:
				{
					if (field.equals("set_fromVertex")) 
					{
						__temp_executeDef166 = false;
						return this.set_fromVertex(((hxDaedalus.data.Vertex) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef166) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("_resultEdge");
		baseArr.push("_nextEdge");
		baseArr.push("_fromVertex");
		baseArr.push("fromVertex");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


