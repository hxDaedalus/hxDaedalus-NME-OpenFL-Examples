package hxDaedalus.iterators;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class FromFaceToInnerEdges extends haxe.lang.HxObject
{
	public    FromFaceToInnerEdges(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    FromFaceToInnerEdges()
	{
		hxDaedalus.iterators.FromFaceToInnerEdges.__hx_ctor_hxDaedalus_iterators_FromFaceToInnerEdges(this);
	}
	
	
	public static   void __hx_ctor_hxDaedalus_iterators_FromFaceToInnerEdges(hxDaedalus.iterators.FromFaceToInnerEdges __temp_me42)
	{
		{
		}
		
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new hxDaedalus.iterators.FromFaceToInnerEdges(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new hxDaedalus.iterators.FromFaceToInnerEdges();
	}
	
	
	
	
	public  hxDaedalus.data.Face _fromFace;
	
	public  hxDaedalus.data.Edge _nextEdge;
	
	public  hxDaedalus.data.Edge _resultEdge;
	
	public   hxDaedalus.data.Face set_fromFace(hxDaedalus.data.Face value)
	{
		this._fromFace = value;
		hxDaedalus.data.Edge _0 = this._fromFace.get_edge();
		this._nextEdge = _0;
		return value;
	}
	
	
	public   hxDaedalus.data.Edge next()
	{
		hxDaedalus.data.Edge _0 = this._nextEdge;
		boolean _1 = ( _0 != null );
		if (_1) 
		{
			hxDaedalus.data.Edge _2 = this._nextEdge;
			this._resultEdge = _2;
			hxDaedalus.data.Edge _3 = this._nextEdge.get_nextLeftEdge();
			this._nextEdge = _3;
			hxDaedalus.data.Edge _4 = this._nextEdge;
			hxDaedalus.data.Edge _5 = this._fromFace.get_edge();
			boolean _6 = ( _4 == _5 );
			if (_6) 
			{
				this._nextEdge = null;
			}
			
		}
		 else 
		{
			this._resultEdge = null;
		}
		
		hxDaedalus.data.Edge _7 = this._resultEdge;
		return _7;
	}
	
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef153 = true;
			switch (field.hashCode())
			{
				case 516008217:
				{
					if (field.equals("_resultEdge")) 
					{
						__temp_executeDef153 = false;
						this._resultEdge = ((hxDaedalus.data.Edge) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -1245086425:
				{
					if (field.equals("fromFace")) 
					{
						__temp_executeDef153 = false;
						this.set_fromFace(((hxDaedalus.data.Face) (value) ));
						return value;
					}
					
					break;
				}
				
				
				case 1514466479:
				{
					if (field.equals("_nextEdge")) 
					{
						__temp_executeDef153 = false;
						this._nextEdge = ((hxDaedalus.data.Edge) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -1154568570:
				{
					if (field.equals("_fromFace")) 
					{
						__temp_executeDef153 = false;
						this._fromFace = ((hxDaedalus.data.Face) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef153) 
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
			boolean __temp_executeDef154 = true;
			switch (field.hashCode())
			{
				case 3377907:
				{
					if (field.equals("next")) 
					{
						__temp_executeDef154 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("next"))) );
					}
					
					break;
				}
				
				
				case -1154568570:
				{
					if (field.equals("_fromFace")) 
					{
						__temp_executeDef154 = false;
						return this._fromFace;
					}
					
					break;
				}
				
				
				case -1619148700:
				{
					if (field.equals("set_fromFace")) 
					{
						__temp_executeDef154 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("set_fromFace"))) );
					}
					
					break;
				}
				
				
				case 1514466479:
				{
					if (field.equals("_nextEdge")) 
					{
						__temp_executeDef154 = false;
						return this._nextEdge;
					}
					
					break;
				}
				
				
				case 516008217:
				{
					if (field.equals("_resultEdge")) 
					{
						__temp_executeDef154 = false;
						return this._resultEdge;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef154) 
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
			boolean __temp_executeDef155 = true;
			switch (field.hashCode())
			{
				case 3377907:
				{
					if (field.equals("next")) 
					{
						__temp_executeDef155 = false;
						return this.next();
					}
					
					break;
				}
				
				
				case -1619148700:
				{
					if (field.equals("set_fromFace")) 
					{
						__temp_executeDef155 = false;
						return this.set_fromFace(((hxDaedalus.data.Face) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef155) 
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
		baseArr.push("_fromFace");
		baseArr.push("fromFace");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


