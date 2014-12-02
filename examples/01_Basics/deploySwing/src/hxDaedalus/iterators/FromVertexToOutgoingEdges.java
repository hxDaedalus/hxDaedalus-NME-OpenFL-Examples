package hxDaedalus.iterators;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class FromVertexToOutgoingEdges extends haxe.lang.HxObject
{
	public    FromVertexToOutgoingEdges(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    FromVertexToOutgoingEdges()
	{
		hxDaedalus.iterators.FromVertexToOutgoingEdges.__hx_ctor_hxDaedalus_iterators_FromVertexToOutgoingEdges(this);
	}
	
	
	public static   void __hx_ctor_hxDaedalus_iterators_FromVertexToOutgoingEdges(hxDaedalus.iterators.FromVertexToOutgoingEdges __temp_me46)
	{
		{
			__temp_me46.realEdgesOnly = true;
		}
		
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new hxDaedalus.iterators.FromVertexToOutgoingEdges(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new hxDaedalus.iterators.FromVertexToOutgoingEdges();
	}
	
	
	
	
	public  hxDaedalus.data.Vertex _fromVertex;
	
	public  hxDaedalus.data.Edge _nextEdge;
	
	public  boolean realEdgesOnly;
	
	public   hxDaedalus.data.Vertex set_fromVertex(hxDaedalus.data.Vertex value)
	{
		this._fromVertex = value;
		hxDaedalus.data.Edge _0 = this._fromVertex.get_edge();
		this._nextEdge = _0;
		while (true)
		{
			boolean _2 = this.realEdgesOnly;
			boolean _4 = false;
			if (_2) 
			{
				boolean _3 = this._nextEdge.get_isReal();
				boolean _1 = _3;
				_4 =  ! (_1) ;
			}
			 else 
			{
				_4 = false;
			}
			
			boolean _5 =  ! (_4) ;
			if (_5) 
			{
				break;
			}
			
			hxDaedalus.data.Edge _6 = this._nextEdge.get_rotLeftEdge();
			this._nextEdge = _6;
		}
		
		return value;
	}
	
	
	public  hxDaedalus.data.Edge _resultEdge;
	
	public   hxDaedalus.data.Edge next()
	{
		hxDaedalus.data.Edge _0 = this._nextEdge;
		boolean _1 = ( _0 != null );
		if (_1) 
		{
			hxDaedalus.data.Edge _2 = this._nextEdge;
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
				
				boolean _8 = this.realEdgesOnly;
				boolean _10 = false;
				if (_8) 
				{
					boolean _9 = this._nextEdge.get_isReal();
					boolean _7 = _9;
					_10 =  ! (_7) ;
				}
				 else 
				{
					_10 = false;
				}
				
				boolean _11 =  ! (_10) ;
				if (_11) 
				{
					break;
				}
				
			}
			
		}
		 else 
		{
			this._resultEdge = null;
		}
		
		hxDaedalus.data.Edge _12 = this._resultEdge;
		return _12;
	}
	
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef167 = true;
			switch (field.hashCode())
			{
				case 516008217:
				{
					if (field.equals("_resultEdge")) 
					{
						__temp_executeDef167 = false;
						this._resultEdge = ((hxDaedalus.data.Edge) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -2064921106:
				{
					if (field.equals("fromVertex")) 
					{
						__temp_executeDef167 = false;
						this.set_fromVertex(((hxDaedalus.data.Vertex) (value) ));
						return value;
					}
					
					break;
				}
				
				
				case 1055882020:
				{
					if (field.equals("realEdgesOnly")) 
					{
						__temp_executeDef167 = false;
						this.realEdgesOnly = haxe.lang.Runtime.toBool(value);
						return value;
					}
					
					break;
				}
				
				
				case -976608371:
				{
					if (field.equals("_fromVertex")) 
					{
						__temp_executeDef167 = false;
						this._fromVertex = ((hxDaedalus.data.Vertex) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 1514466479:
				{
					if (field.equals("_nextEdge")) 
					{
						__temp_executeDef167 = false;
						this._nextEdge = ((hxDaedalus.data.Edge) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef167) 
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
			boolean __temp_executeDef168 = true;
			switch (field.hashCode())
			{
				case 3377907:
				{
					if (field.equals("next")) 
					{
						__temp_executeDef168 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("next"))) );
					}
					
					break;
				}
				
				
				case -976608371:
				{
					if (field.equals("_fromVertex")) 
					{
						__temp_executeDef168 = false;
						return this._fromVertex;
					}
					
					break;
				}
				
				
				case 516008217:
				{
					if (field.equals("_resultEdge")) 
					{
						__temp_executeDef168 = false;
						return this._resultEdge;
					}
					
					break;
				}
				
				
				case 1514466479:
				{
					if (field.equals("_nextEdge")) 
					{
						__temp_executeDef168 = false;
						return this._nextEdge;
					}
					
					break;
				}
				
				
				case -761514517:
				{
					if (field.equals("set_fromVertex")) 
					{
						__temp_executeDef168 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("set_fromVertex"))) );
					}
					
					break;
				}
				
				
				case 1055882020:
				{
					if (field.equals("realEdgesOnly")) 
					{
						__temp_executeDef168 = false;
						return this.realEdgesOnly;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef168) 
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
			boolean __temp_executeDef169 = true;
			switch (field.hashCode())
			{
				case 3377907:
				{
					if (field.equals("next")) 
					{
						__temp_executeDef169 = false;
						return this.next();
					}
					
					break;
				}
				
				
				case -761514517:
				{
					if (field.equals("set_fromVertex")) 
					{
						__temp_executeDef169 = false;
						return this.set_fromVertex(((hxDaedalus.data.Vertex) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef169) 
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
		baseArr.push("realEdgesOnly");
		baseArr.push("_nextEdge");
		baseArr.push("_fromVertex");
		baseArr.push("fromVertex");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


