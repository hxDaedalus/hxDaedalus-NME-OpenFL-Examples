package haxe.lang;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class HaxeException extends java.lang.RuntimeException
{
	public    HaxeException(java.lang.Object obj, java.lang.String msg, java.lang.Throwable cause)
	{
		super(msg, cause);
		boolean _0 = ( obj instanceof haxe.lang.HaxeException );
		if (_0) 
		{
			haxe.lang.HaxeException _obj = ((haxe.lang.HaxeException) (obj) );
			java.lang.Object _1 = _obj.getObject();
			obj = _1;
		}
		
		this.obj = obj;
	}
	
	
	public static   java.lang.RuntimeException wrap(java.lang.Object obj)
	{
		java.lang.RuntimeException ret = null;
		boolean _0 = ( obj instanceof java.lang.RuntimeException );
		if (_0) 
		{
			ret = ((java.lang.RuntimeException) (obj) );
		}
		 else 
		{
			boolean _1 = ( obj instanceof java.lang.String );
			if (_1) 
			{
				haxe.lang.HaxeException _2 = new haxe.lang.HaxeException(((java.lang.Object) (obj) ), haxe.lang.Runtime.toString(obj), ((java.lang.Throwable) (null) ));
				ret = _2;
			}
			 else 
			{
				boolean _3 = ( obj instanceof java.lang.Throwable );
				if (_3) 
				{
					haxe.lang.HaxeException _4 = new haxe.lang.HaxeException(((java.lang.Object) (obj) ), haxe.lang.Runtime.toString(null), ((java.lang.Throwable) (obj) ));
					ret = _4;
				}
				 else 
				{
					haxe.lang.HaxeException _5 = new haxe.lang.HaxeException(((java.lang.Object) (obj) ), haxe.lang.Runtime.toString(null), ((java.lang.Throwable) (null) ));
					ret = _5;
				}
				
			}
			
		}
		
		return ret;
	}
	
	
	public  java.lang.Object obj;
	
	public   java.lang.Object getObject()
	{
		java.lang.Object _0 = this.obj;
		return _0;
	}
	
	
	@Override public   java.lang.String toString()
	{
		java.lang.Object _0 = this.obj;
		java.lang.String _1 = haxe.root.Std.string(_0);
		java.lang.String _2 = ( "Haxe Exception: " + _1 );
		return _2;
	}
	
	
}


