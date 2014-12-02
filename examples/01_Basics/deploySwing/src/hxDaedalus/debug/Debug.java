package hxDaedalus.debug;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Debug extends haxe.lang.HxObject
{
	public    Debug(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    Debug()
	{
		hxDaedalus.debug.Debug.__hx_ctor_hxDaedalus_debug_Debug(this);
	}
	
	
	public static   void __hx_ctor_hxDaedalus_debug_Debug(hxDaedalus.debug.Debug __temp_me40)
	{
		{
		}
		
	}
	
	
	public static   void assertTrue(boolean cond, java.lang.String message, java.lang.Object pos)
	{
		boolean _0 =  ! (cond) ;
		if (_0) 
		{
			java.lang.String _1 = haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(pos, "fileName", true));
			java.lang.String _2 = ( _1 + ":" );
			int _3 = ((int) (haxe.lang.Runtime.getField_f(pos, "lineNumber", true)) );
			java.lang.String _4 = ( _2 + _3 );
			java.lang.String _5 = ( _4 + ": Expected true but was false! " );
			boolean _6 = ( message != null );
			java.lang.String _7 = null;
			if (_6) 
			{
				_7 = message;
			}
			 else 
			{
				_7 = "";
			}
			
			throw haxe.lang.HaxeException.wrap(( _5 + _7 ));
		}
		
	}
	
	
	public static   void assertFalse(boolean cond, java.lang.String message, java.lang.Object pos)
	{
		if (cond) 
		{
			java.lang.String _0 = haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(pos, "fileName", true));
			java.lang.String _1 = ( _0 + ":" );
			int _2 = ((int) (haxe.lang.Runtime.getField_f(pos, "lineNumber", true)) );
			java.lang.String _3 = ( _1 + _2 );
			java.lang.String _4 = ( _3 + ": Expected false but was true! " );
			boolean _5 = ( message != null );
			java.lang.String _6 = null;
			if (_5) 
			{
				_6 = message;
			}
			 else 
			{
				_6 = "";
			}
			
			throw haxe.lang.HaxeException.wrap(( _4 + _6 ));
		}
		
	}
	
	
	public static  <T> void assertEquals(T expected, T actual, java.lang.String message, java.lang.Object pos)
	{
		boolean _0 = ( ! (haxe.lang.Runtime.eq(actual, expected)) );
		if (_0) 
		{
			java.lang.String _1 = haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(pos, "fileName", true));
			java.lang.String _2 = ( _1 + ":" );
			int _3 = ((int) (haxe.lang.Runtime.getField_f(pos, "lineNumber", true)) );
			java.lang.String _4 = ( _2 + _3 );
			java.lang.String _5 = ( _4 + ": Expected \'" );
			java.lang.String _6 = haxe.root.Std.string(expected);
			java.lang.String _7 = ( _5 + _6 );
			java.lang.String _8 = ( _7 + "\' but was \'" );
			java.lang.String _9 = haxe.root.Std.string(actual);
			java.lang.String _10 = ( _8 + _9 );
			java.lang.String _11 = ( _10 + "\' " );
			boolean _12 = ( message != null );
			java.lang.String _13 = null;
			if (_12) 
			{
				_13 = message;
			}
			 else 
			{
				_13 = "";
			}
			
			throw haxe.lang.HaxeException.wrap(( _11 + _13 ));
		}
		
	}
	
	
	public static   void trace(java.lang.Object value, java.lang.Object pos)
	{
		haxe.Log.trace.__hx_invoke2_o(0.0, value, 0.0, pos);
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new hxDaedalus.debug.Debug(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new hxDaedalus.debug.Debug();
	}
	
	
}


