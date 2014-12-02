package haxe.lang;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Enum
{
	public    Enum(int index, haxe.root.Array<java.lang.Object> params)
	{
		this.index = index;
		haxe.root.Array<java.lang.Object> _0 = params;
		this.params = _0;
	}
	
	
	public  int index;
	
	public  haxe.root.Array<java.lang.Object> params;
	
	public   java.lang.String getTag()
	{
		java.lang.Class _0 = haxe.root.Type.getEnum(((java.lang.Object) (this) ));
		java.lang.Object cl = _0;
		java.lang.Object _1 = haxe.lang.Runtime.getField(cl, "constructs", true);
		int _2 = this.index;
		java.lang.String _3 = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(_1, "__get", new haxe.root.Array(new java.lang.Object[]{_2})));
		return _3;
	}
	
	
	@Override public   java.lang.String toString()
	{
		haxe.root.Array<java.lang.Object> _0 = this.params;
		haxe.root.Array<java.lang.Object> _1 = null;
		haxe.root.Array<java.lang.Object> _3 = _0;
		haxe.root.Array<java.lang.Object> _4 = _1;
		boolean _5 = ( _3 == _4 );
		boolean _6 =  ! (_5) ;
		boolean _8 = false;
		if (_6) 
		{
			int _7 = this.params.length;
			int _2 = _7;
			_8 = ( _2 == 0 );
		}
		 else 
		{
			_8 = true;
		}
		
		if (_8) 
		{
			java.lang.String _9 = this.getTag();
			return _9;
		}
		
		haxe.root.StringBuf _10 = new haxe.root.StringBuf();
		haxe.root.StringBuf ret = _10;
		java.lang.String _11 = this.getTag();
		ret.add(_11);
		ret.add("(");
		boolean first = true;
		{
			int _g = 0;
			haxe.root.Array<java.lang.Object> _12 = this.params;
			haxe.root.Array<java.lang.Object> _g1 = _12;
			while (true)
			{
				int _13 = _g1.length;
				boolean _14 = ( _g < _13 );
				boolean _15 =  ! (_14) ;
				if (_15) 
				{
					break;
				}
				
				haxe.root.Array<java.lang.Object> _16 = _g1;
				java.lang.Object _17 = _16.__get(_g);
				java.lang.Object p = _17;
				 ++ _g;
				if (first) 
				{
					first = false;
				}
				 else 
				{
					ret.add(",");
				}
				
				ret.add(p);
			}
			
		}
		
		ret.add(")");
		java.lang.String _18 = ret.toString();
		return _18;
	}
	
	
	@Override public   boolean equals(java.lang.Object obj)
	{
		boolean _0 = haxe.lang.Runtime.eq(obj, this);
		if (_0) 
		{
			return true;
		}
		
		haxe.lang.Enum obj1 = ((haxe.lang.Enum) (obj) );
		boolean _2 = ( obj1 != null );
		boolean _7 = false;
		if (_2) 
		{
			java.lang.Class _6 = haxe.root.Type.getEnum(((java.lang.Object) (this) ));
			java.lang.Class _3 = _6;
			java.lang.Class _1 = _3;
			_7 = haxe.root.Std.is(obj1, _1);
		}
		 else 
		{
			_7 = false;
		}
		
		boolean _10 = false;
		if (_7) 
		{
			int _8 = obj1.index;
			int _4 = _8;
			int _9 = this.index;
			int _5 = _9;
			_10 = ( _4 == _5 );
		}
		 else 
		{
			_10 = false;
		}
		
		boolean ret = _10;
		boolean _11 =  ! (ret) ;
		if (_11) 
		{
			return false;
		}
		
		haxe.root.Array<java.lang.Object> _12 = obj1.params;
		haxe.root.Array<java.lang.Object> _13 = this.params;
		boolean _14 = ( _12 == _13 );
		if (_14) 
		{
			return true;
		}
		
		int len = 0;
		haxe.root.Array<java.lang.Object> _15 = obj1.params;
		haxe.root.Array<java.lang.Object> _16 = null;
		haxe.root.Array<java.lang.Object> _19 = _15;
		haxe.root.Array<java.lang.Object> _20 = _16;
		boolean _21 = ( _19 == _20 );
		boolean _22 =  ! (_21) ;
		boolean _38 = false;
		if (_22) 
		{
			haxe.root.Array<java.lang.Object> _30 = this.params;
			haxe.root.Array<java.lang.Object> _23 = _30;
			haxe.root.Array<java.lang.Object> _31 = _23;
			haxe.root.Array<java.lang.Object> _17 = _31;
			haxe.root.Array<java.lang.Object> _32 = null;
			haxe.root.Array<java.lang.Object> _24 = _32;
			haxe.root.Array<java.lang.Object> _33 = _24;
			haxe.root.Array<java.lang.Object> _18 = _33;
			haxe.root.Array<java.lang.Object> _34 = _17;
			haxe.root.Array<java.lang.Object> _25 = _34;
			haxe.root.Array<java.lang.Object> _35 = _18;
			haxe.root.Array<java.lang.Object> _26 = _35;
			haxe.root.Array<java.lang.Object> _36 = _25;
			haxe.root.Array<java.lang.Object> _37 = _26;
			_38 = ( _36 == _37 );
		}
		 else 
		{
			_38 = true;
		}
		
		boolean _39 =  ! (_38) ;
		boolean _42 = false;
		if (_39) 
		{
			int _40 = this.params.length;
			int _27 = _40;
			len = _27;
			int _28 = len;
			int _41 = obj1.params.length;
			int _29 = _41;
			_42 = ( _28 != _29 );
		}
		 else 
		{
			_42 = true;
		}
		
		if (_42) 
		{
			return false;
		}
		
		{
			int _g = 0;
			while (true)
			{
				boolean _43 = ( _g < ((int) (len) ) );
				boolean _44 =  ! (_43) ;
				if (_44) 
				{
					break;
				}
				
				int _45 = _g++;
				int i = _45;
				haxe.root.Array<java.lang.Object> _46 = obj1.params;
				java.lang.Object _47 = _46.__get(i);
				haxe.root.Array<java.lang.Object> _48 = this.params;
				java.lang.Object _49 = _48.__get(i);
				boolean _50 = haxe.root.Type.enumEq(_47, _49);
				boolean _51 =  ! (_50) ;
				if (_51) 
				{
					return false;
				}
				
			}
			
		}
		
		return true;
	}
	
	
	@Override public   int hashCode()
	{
		int h = 19;
		haxe.root.Array<java.lang.Object> _0 = this.params;
		haxe.root.Array<java.lang.Object> _1 = null;
		boolean _2 = ( _0 != _1 );
		if (_2) 
		{
			int _g = 0;
			haxe.root.Array<java.lang.Object> _3 = this.params;
			haxe.root.Array<java.lang.Object> _g1 = _3;
			while (true)
			{
				int _4 = _g1.length;
				boolean _5 = ( _g < _4 );
				boolean _6 =  ! (_5) ;
				if (_6) 
				{
					break;
				}
				
				haxe.root.Array<java.lang.Object> _7 = _g1;
				java.lang.Object _8 = _7.__get(_g);
				java.lang.Object p = _8;
				 ++ _g;
				int _9 = ( h * 31 );
				h = _9;
				boolean _10 = ( ! (( p == null )) );
				if (_10) 
				{
					int _11 = p.hashCode();
					h += _11;
				}
				
			}
			
		}
		
		int _12 = this.index;
		h += _12;
		return h;
	}
	
	
}


