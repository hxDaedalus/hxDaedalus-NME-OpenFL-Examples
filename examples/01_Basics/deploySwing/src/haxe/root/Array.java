package haxe.root;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Array<T> extends haxe.lang.HxObject
{
	
	public Array(T[] _native)
	{
		this.__a = _native;
		this.length = _native.length;
	}
	public    Array(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    Array()
	{
		haxe.root.Array.__hx_ctor__Array(this);
	}
	
	
	public static  <T_c> void __hx_ctor__Array(haxe.root.Array<T_c> __temp_me1)
	{
		__temp_me1.length = 0;
		T_c[] _0 = ((T_c[]) (((java.lang.Object) (new java.lang.Object[((int) (0) )]) )) );
		__temp_me1.__a = _0;
	}
	
	
	public static  <X> haxe.root.Array<X> ofNative(X[] _native)
	{
		
			return new Array<X>(_native);
	
	}
	
	
	public static  <Y> haxe.root.Array<Y> alloc(int size)
	{
		
			return new Array<Y>((Y[]) ((java.lang.Object)new java.lang.Object[size]));
	
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.root.Array<java.lang.Object>(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.root.Array<java.lang.Object>();
	}
	
	
	public  int length;
	
	public  T[] __a;
	
	public final   haxe.root.Array<T> concat(haxe.root.Array<T> a)
	{
		int _0 = this.length;
		int length = _0;
		int _1 = a.length;
		int _2 = ( length + _1 );
		int len = _2;
		T[] _3 = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (len) )]) )) );
		T[] retarr = _3;
		T[] _4 = this.__a;
		java.lang.System.arraycopy(((java.lang.Object) (_4) ), ((int) (0) ), ((java.lang.Object) (retarr) ), ((int) (0) ), ((int) (length) ));
		T[] _5 = a.__a;
		int _6 = a.length;
		java.lang.System.arraycopy(((java.lang.Object) (_5) ), ((int) (0) ), ((java.lang.Object) (retarr) ), ((int) (length) ), ((int) (_6) ));
		haxe.root.Array<T> _7 = haxe.root.Array.ofNative(retarr);
		return _7;
	}
	
	
	public final   void concatNative(T[] a)
	{
		T[] _0 = this.__a;
		T[] __a = _0;
		int _1 = this.length;
		int length = _1;
		int _2 = a.length;
		int _3 = ( length + _2 );
		int len = _3;
		int _4 = __a.length;
		boolean _5 = ( _4 >= len );
		if (_5) 
		{
			java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (0) ), ((java.lang.Object) (__a) ), ((int) (length) ), ((int) (length) ));
		}
		 else 
		{
			T[] _6 = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (len) )]) )) );
			T[] newarr = _6;
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (length) ));
			int _7 = a.length;
			java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (length) ), ((int) (_7) ));
			this.__a = newarr;
		}
		
		this.length = len;
	}
	
	
	public final   java.lang.String join(java.lang.String sep)
	{
		haxe.root.StringBuf _0 = new haxe.root.StringBuf();
		haxe.root.StringBuf buf = _0;
		int i = -1;
		boolean first = true;
		int _1 = this.length;
		int length = _1;
		while (true)
		{
			int _2 =  ++ i;
			boolean _3 = ( _2 < length );
			boolean _4 =  ! (_3) ;
			if (_4) 
			{
				break;
			}
			
			if (first) 
			{
				first = false;
			}
			 else 
			{
				buf.add(sep);
			}
			
			T[] _5 = this.__a;
			T _6 = _5[i];
			buf.add(_6);
		}
		
		java.lang.String _7 = buf.toString();
		return _7;
	}
	
	
	public final   T pop()
	{
		T[] _0 = this.__a;
		T[] __a = _0;
		int _1 = this.length;
		int length = _1;
		boolean _2 = ( length > 0 );
		if (_2) 
		{
			int _3 =  -- length;
			T _4 = __a[_3];
			T val = _4;
			__a[length] = null;
			this.length = length;
			return val;
		}
		 else 
		{
			return null;
		}
		
	}
	
	
	public final   int push(T x)
	{
		int _0 = this.length;
		int length = _0;
		int _1 = this.__a.length;
		boolean _2 = ( length >= _1 );
		if (_2) 
		{
			int _3 = ( length << 1 );
			int _4 = ( _3 + 1 );
			int newLen = _4;
			T[] _5 = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (newLen) )]) )) );
			T[] newarr = _5;
			T[] _6 = this.__a;
			int _7 = this.__a.length;
			java.lang.System.arraycopy(((java.lang.Object) (_6) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (_7) ));
			this.__a = newarr;
		}
		
		T[] _8 = this.__a;
		_8[length] = x;
		int _9 =  ++ this.length;
		return _9;
	}
	
	
	public final   void reverse()
	{
		int i = 0;
		int _0 = this.length;
		int l = _0;
		T[] _1 = this.__a;
		T[] a = _1;
		int _2 = ( l >> 1 );
		int half = _2;
		l -= 1;
		while (true)
		{
			boolean _3 = ( i < half );
			boolean _4 =  ! (_3) ;
			if (_4) 
			{
				break;
			}
			
			T _5 = a[i];
			T tmp = _5;
			int _6 = ( l - i );
			a[i] = a[_6];
			int _7 = ( l - i );
			a[_7] = tmp;
			i += 1;
		}
		
	}
	
	
	public final   T shift()
	{
		int _0 = this.length;
		int l = _0;
		boolean _1 = ( l == 0 );
		if (_1) 
		{
			return null;
		}
		
		T[] _2 = this.__a;
		T[] a = _2;
		T _3 = a[0];
		T x = _3;
		l -= 1;
		int _4 = this.length;
		int _5 = ( _4 - 1 );
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (1) ), ((java.lang.Object) (a) ), ((int) (0) ), ((int) (_5) ));
		a[l] = null;
		this.length = l;
		return x;
	}
	
	
	public final   haxe.root.Array<T> slice(int pos, java.lang.Object end)
	{
		boolean _0 = ( pos < 0 );
		if (_0) 
		{
			int _1 = this.length;
			int _2 = ( _1 + pos );
			pos = _2;
			boolean _3 = ( pos < 0 );
			if (_3) 
			{
				pos = 0;
			}
			
		}
		
		boolean _4 = ( end == null );
		if (_4) 
		{
			int _5 = this.length;
			end = _5;
		}
		 else 
		{
			boolean _6 = ( haxe.lang.Runtime.compare(end, 0) < 0 );
			if (_6) 
			{
				int _7 = this.length;
				int _8 = ((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.plus(_7, end))) );
				end = _8;
			}
			
		}
		
		int _9 = this.length;
		boolean _10 = ( haxe.lang.Runtime.compare(end, _9) > 0 );
		if (_10) 
		{
			int _11 = this.length;
			end = _11;
		}
		
		int _12 = ( ((int) (haxe.lang.Runtime.toInt(end)) ) - ((int) (pos) ) );
		int len = _12;
		boolean _13 = ( len < 0 );
		if (_13) 
		{
			haxe.root.Array<T> _14 = new haxe.root.Array<T>();
			return _14;
		}
		
		T[] _15 = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (len) )]) )) );
		T[] newarr = _15;
		T[] _16 = this.__a;
		java.lang.System.arraycopy(((java.lang.Object) (_16) ), ((int) (pos) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (len) ));
		haxe.root.Array<T> _17 = haxe.root.Array.ofNative(newarr);
		return _17;
	}
	
	
	public final   void sort(haxe.lang.Function f)
	{
		int _0 = this.length;
		boolean _1 = ( _0 == 0 );
		if (_1) 
		{
			return ;
		}
		
		int _2 = this.length;
		int _3 = ( _2 - 1 );
		this.quicksort(0, _3, f);
	}
	
	
	public final   void quicksort(int lo, int hi, haxe.lang.Function f)
	{
		T[] _0 = this.__a;
		T[] buf = _0;
		int i = lo;
		int j = hi;
		int _1 = ( i + j );
		int _2 = ( _1 >> 1 );
		T _3 = buf[_2];
		T p = _3;
		while (true)
		{
			boolean _4 = ( i <= j );
			boolean _5 =  ! (_4) ;
			if (_5) 
			{
				break;
			}
			
			while (true)
			{
				T _6 = buf[i];
				int _7 = ((int) (f.__hx_invoke2_f(0.0, _6, 0.0, p)) );
				boolean _8 = ( _7 < 0 );
				boolean _9 =  ! (_8) ;
				if (_9) 
				{
					break;
				}
				
				i++;
			}
			
			while (true)
			{
				T _10 = buf[j];
				int _11 = ((int) (f.__hx_invoke2_f(0.0, _10, 0.0, p)) );
				boolean _12 = ( _11 > 0 );
				boolean _13 =  ! (_12) ;
				if (_13) 
				{
					break;
				}
				
				j--;
			}
			
			boolean _14 = ( i <= j );
			if (_14) 
			{
				T _15 = buf[i];
				T t = _15;
				int _16 = i++;
				buf[_16] = buf[j];
				int _17 = j--;
				buf[_17] = t;
			}
			
		}
		
		boolean _18 = ( lo < j );
		if (_18) 
		{
			this.quicksort(lo, j, f);
		}
		
		boolean _19 = ( i < hi );
		if (_19) 
		{
			this.quicksort(i, hi, f);
		}
		
	}
	
	
	public final   haxe.root.Array<T> splice(int pos, int len)
	{
		boolean _0 = ( len < 0 );
		if (_0) 
		{
			haxe.root.Array<T> _1 = new haxe.root.Array<T>();
			return _1;
		}
		
		boolean _2 = ( pos < 0 );
		if (_2) 
		{
			int _3 = this.length;
			int _4 = ( _3 + pos );
			pos = _4;
			boolean _5 = ( pos < 0 );
			if (_5) 
			{
				pos = 0;
			}
			
		}
		
		int _6 = this.length;
		boolean _7 = ( pos > _6 );
		if (_7) 
		{
			pos = 0;
			len = 0;
		}
		 else 
		{
			int _8 = ( pos + len );
			int _9 = this.length;
			boolean _10 = ( _8 > _9 );
			if (_10) 
			{
				int _11 = this.length;
				int _12 = ( _11 - pos );
				len = _12;
				boolean _13 = ( len < 0 );
				if (_13) 
				{
					len = 0;
				}
				
			}
			
		}
		
		T[] _14 = this.__a;
		T[] a = _14;
		T[] _15 = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (len) )]) )) );
		T[] ret = _15;
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (pos) ), ((java.lang.Object) (ret) ), ((int) (0) ), ((int) (len) ));
		haxe.root.Array<T> _16 = haxe.root.Array.ofNative(ret);
		haxe.root.Array<T> ret1 = _16;
		int _17 = ( pos + len );
		int end = _17;
		int _18 = this.length;
		int _19 = ( _18 - end );
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (end) ), ((java.lang.Object) (a) ), ((int) (pos) ), ((int) (_19) ));
		this.length -= len;
		while (true)
		{
			int _20 =  -- len;
			boolean _21 = ( _20 >= 0 );
			boolean _22 =  ! (_21) ;
			if (_22) 
			{
				break;
			}
			
			int _23 = this.length;
			int _24 = ( _23 + len );
			a[_24] = null;
		}
		
		haxe.root.Array<T> _25 = ret1;
		return _25;
	}
	
	
	public final   void spliceVoid(int pos, int len)
	{
		boolean _0 = ( len < 0 );
		if (_0) 
		{
			return ;
		}
		
		boolean _1 = ( pos < 0 );
		if (_1) 
		{
			int _2 = this.length;
			int _3 = ( _2 + pos );
			pos = _3;
			boolean _4 = ( pos < 0 );
			if (_4) 
			{
				pos = 0;
			}
			
		}
		
		int _5 = this.length;
		boolean _6 = ( pos > _5 );
		if (_6) 
		{
			pos = 0;
			len = 0;
		}
		 else 
		{
			int _7 = ( pos + len );
			int _8 = this.length;
			boolean _9 = ( _7 > _8 );
			if (_9) 
			{
				int _10 = this.length;
				int _11 = ( _10 - pos );
				len = _11;
				boolean _12 = ( len < 0 );
				if (_12) 
				{
					len = 0;
				}
				
			}
			
		}
		
		T[] _13 = this.__a;
		T[] a = _13;
		int _14 = ( pos + len );
		int end = _14;
		int _15 = this.length;
		int _16 = ( _15 - end );
		java.lang.System.arraycopy(((java.lang.Object) (a) ), ((int) (end) ), ((java.lang.Object) (a) ), ((int) (pos) ), ((int) (_16) ));
		this.length -= len;
		while (true)
		{
			int _17 =  -- len;
			boolean _18 = ( _17 >= 0 );
			boolean _19 =  ! (_18) ;
			if (_19) 
			{
				break;
			}
			
			int _20 = this.length;
			int _21 = ( _20 + len );
			a[_21] = null;
		}
		
	}
	
	
	@Override public   java.lang.String toString()
	{
		haxe.root.StringBuf _0 = new haxe.root.StringBuf();
		haxe.root.StringBuf ret = _0;
		T[] _1 = this.__a;
		T[] a = _1;
		ret.add("[");
		boolean first = true;
		{
			int _g1 = 0;
			int _2 = this.length;
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
				if (first) 
				{
					first = false;
				}
				 else 
				{
					ret.add(",");
				}
				
				T _6 = a[i];
				ret.add(_6);
			}
			
		}
		
		ret.add("]");
		java.lang.String _7 = ret.toString();
		return _7;
	}
	
	
	public final   void unshift(T x)
	{
		T[] _0 = this.__a;
		T[] __a = _0;
		int _1 = this.length;
		int length = _1;
		int _2 = __a.length;
		boolean _3 = ( length >= _2 );
		if (_3) 
		{
			int _4 = ( length << 1 );
			int _5 = ( _4 + 1 );
			int newLen = _5;
			T[] _6 = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (newLen) )]) )) );
			T[] newarr = _6;
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (1) ), ((int) (length) ));
			this.__a = newarr;
		}
		 else 
		{
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (__a) ), ((int) (1) ), ((int) (length) ));
		}
		
		T[] _7 = this.__a;
		_7[0] = x;
		 ++ this.length;
	}
	
	
	public final   void insert(int pos, T x)
	{
		int _0 = this.length;
		int l = _0;
		boolean _1 = ( pos < 0 );
		if (_1) 
		{
			int _2 = ( l + pos );
			pos = _2;
			boolean _3 = ( pos < 0 );
			if (_3) 
			{
				pos = 0;
			}
			
		}
		
		boolean _4 = ( pos >= l );
		if (_4) 
		{
			this.push(x);
			return ;
		}
		 else 
		{
			boolean _5 = ( pos == 0 );
			if (_5) 
			{
				this.unshift(x);
				return ;
			}
			
		}
		
		int _6 = this.__a.length;
		boolean _7 = ( l >= _6 );
		if (_7) 
		{
			int _8 = this.length;
			int _9 = ( _8 << 1 );
			int _10 = ( _9 + 1 );
			int newLen = _10;
			T[] _11 = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (newLen) )]) )) );
			T[] newarr = _11;
			T[] _12 = this.__a;
			java.lang.System.arraycopy(((java.lang.Object) (_12) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (pos) ));
			newarr[pos] = x;
			T[] _13 = this.__a;
			int _14 = ( pos + 1 );
			int _15 = ( l - pos );
			java.lang.System.arraycopy(((java.lang.Object) (_13) ), ((int) (pos) ), ((java.lang.Object) (newarr) ), ((int) (_14) ), ((int) (_15) ));
			this.__a = newarr;
			 ++ this.length;
		}
		 else 
		{
			T[] _16 = this.__a;
			T[] __a = _16;
			int _17 = ( pos + 1 );
			int _18 = ( l - pos );
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (pos) ), ((java.lang.Object) (__a) ), ((int) (_17) ), ((int) (_18) ));
			java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (__a) ), ((int) (0) ), ((int) (pos) ));
			__a[pos] = x;
			 ++ this.length;
		}
		
	}
	
	
	public final   boolean remove(T x)
	{
		T[] _0 = this.__a;
		T[] __a = _0;
		int i = -1;
		int _1 = this.length;
		int length = _1;
		while (true)
		{
			int _2 =  ++ i;
			boolean _3 = ( _2 < length );
			boolean _4 =  ! (_3) ;
			if (_4) 
			{
				break;
			}
			
			T _5 = __a[i];
			boolean _6 = haxe.lang.Runtime.eq(_5, x);
			if (_6) 
			{
				int _7 = ( i + 1 );
				int _8 = ( length - i );
				int _9 = ( _8 - 1 );
				java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (_7) ), ((java.lang.Object) (__a) ), ((int) (i) ), ((int) (_9) ));
				int _10 =  -- this.length;
				__a[_10] = null;
				return true;
			}
			
		}
		
		return false;
	}
	
	
	public final   int indexOf(T x, java.lang.Object fromIndex)
	{
		int _0 = this.length;
		int len = _0;
		T[] _1 = this.__a;
		T[] a = _1;
		boolean _2 = ( fromIndex == null );
		int _3 = 0;
		if (_2) 
		{
			_3 = 0;
		}
		 else 
		{
			_3 = ((int) (haxe.lang.Runtime.toInt(fromIndex)) );
		}
		
		int i = _3;
		boolean _4 = ( i < 0 );
		if (_4) 
		{
			i += len;
			boolean _5 = ( i < 0 );
			if (_5) 
			{
				i = 0;
			}
			
		}
		
		while (true)
		{
			boolean _6 = ( i < len );
			boolean _7 =  ! (_6) ;
			if (_7) 
			{
				break;
			}
			
			T _8 = a[i];
			boolean _9 = haxe.lang.Runtime.eq(_8, x);
			if (_9) 
			{
				return i;
			}
			
			i++;
		}
		
		return -1;
	}
	
	
	public final   int lastIndexOf(T x, java.lang.Object fromIndex)
	{
		int _0 = this.length;
		int len = _0;
		T[] _1 = this.__a;
		T[] a = _1;
		boolean _2 = ( fromIndex == null );
		int _3 = 0;
		if (_2) 
		{
			_3 = ( len - 1 );
		}
		 else 
		{
			_3 = ((int) (haxe.lang.Runtime.toInt(fromIndex)) );
		}
		
		int i = _3;
		boolean _4 = ( i >= len );
		if (_4) 
		{
			int _5 = ( len - 1 );
			i = _5;
		}
		 else 
		{
			boolean _6 = ( i < 0 );
			if (_6) 
			{
				i += len;
			}
			
		}
		
		while (true)
		{
			boolean _7 = ( i >= 0 );
			boolean _8 =  ! (_7) ;
			if (_8) 
			{
				break;
			}
			
			T _9 = a[i];
			boolean _10 = haxe.lang.Runtime.eq(_9, x);
			if (_10) 
			{
				return i;
			}
			
			i--;
		}
		
		return -1;
	}
	
	
	public final   haxe.root.Array<T> copy()
	{
		int _0 = this.length;
		int len = _0;
		T[] _1 = this.__a;
		T[] __a = _1;
		T[] _2 = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (len) )]) )) );
		T[] newarr = _2;
		java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (newarr) ), ((int) (0) ), ((int) (len) ));
		haxe.root.Array<T> _3 = haxe.root.Array.ofNative(newarr);
		return _3;
	}
	
	
	public final   java.lang.Object iterator()
	{
		haxe.root.Array<T> _0 = this;
		_Array.ArrayIterator<T> _1 = new _Array.ArrayIterator<T>(((haxe.root.Array<T>) (_0) ));
		return _1;
	}
	
	
	public final  <S> haxe.root.Array<S> map(haxe.lang.Function f)
	{
		haxe.root.Array<S> _0 = new haxe.root.Array<S>(( (S[]) (new java.lang.Object[] {}) ));
		haxe.root.Array<S> ret = _0;
		{
			int _g = 0;
			haxe.root.Array<T> _1 = this;
			haxe.root.Array<T> _g1 = _1;
			while (true)
			{
				int _2 = _g1.length;
				boolean _3 = ( _g < _2 );
				boolean _4 =  ! (_3) ;
				if (_4) 
				{
					break;
				}
				
				haxe.root.Array<T> _5 = _g1;
				T _6 = _5.__get(_g);
				T elt = _6;
				 ++ _g;
				S _7 = ((S) (f.__hx_invoke1_o(0.0, elt)) );
				ret.push(_7);
			}
			
		}
		
		haxe.root.Array<S> _8 = ret;
		return _8;
	}
	
	
	public final   haxe.root.Array<T> filter(haxe.lang.Function f)
	{
		haxe.root.Array<T> _0 = new haxe.root.Array<T>(( (T[]) (new java.lang.Object[] {}) ));
		haxe.root.Array<T> ret = _0;
		{
			int _g = 0;
			haxe.root.Array<T> _1 = this;
			haxe.root.Array<T> _g1 = _1;
			while (true)
			{
				int _2 = _g1.length;
				boolean _3 = ( _g < _2 );
				boolean _4 =  ! (_3) ;
				if (_4) 
				{
					break;
				}
				
				haxe.root.Array<T> _5 = _g1;
				T _6 = _5.__get(_g);
				T elt = _6;
				 ++ _g;
				boolean _7 = haxe.lang.Runtime.toBool(f.__hx_invoke1_o(0.0, elt));
				if (_7) 
				{
					ret.push(elt);
				}
				
			}
			
		}
		
		haxe.root.Array<T> _8 = ret;
		return _8;
	}
	
	
	public final   T __get(int idx)
	{
		T[] _0 = this.__a;
		T[] __a = _0;
		int _1 = __a.length;
		boolean _2 = ( idx >= _1 );
		boolean _3 =  ! (_2) ;
		boolean _4 = false;
		if (_3) 
		{
			_4 = ( idx < 0 );
		}
		 else 
		{
			_4 = true;
		}
		
		if (_4) 
		{
			return null;
		}
		
		T _5 = __a[idx];
		return _5;
	}
	
	
	public final   T __set(int idx, T v)
	{
		T[] _0 = this.__a;
		T[] __a = _0;
		int _1 = __a.length;
		boolean _2 = ( idx >= _1 );
		if (_2) 
		{
			int _3 = ( idx + 1 );
			int newl = _3;
			int _4 = __a.length;
			boolean _5 = ( idx == _4 );
			if (_5) 
			{
				int _6 = ( idx << 1 );
				int _7 = ( _6 + 1 );
				newl = _7;
			}
			
			T[] _8 = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (newl) )]) )) );
			T[] newArr = _8;
			int _9 = this.length;
			boolean _10 = ( _9 > 0 );
			if (_10) 
			{
				int _11 = this.length;
				java.lang.System.arraycopy(((java.lang.Object) (__a) ), ((int) (0) ), ((java.lang.Object) (newArr) ), ((int) (0) ), ((int) (_11) ));
			}
			
			__a = newArr;
			T[] _12 = __a;
			this.__a = _12;
		}
		
		int _13 = this.length;
		boolean _14 = ( idx >= _13 );
		if (_14) 
		{
			int _15 = ( idx + 1 );
			this.length = _15;
		}
		
		T _16 = __a[idx] = v;
		return _16;
	}
	
	
	public final   T __unsafe_get(int idx)
	{
		T[] _0 = this.__a;
		T _1 = _0[idx];
		return _1;
	}
	
	
	public final   T __unsafe_set(int idx, T val)
	{
		T[] _0 = this.__a;
		T _1 = _0[idx] = val;
		return _1;
	}
	
	
	@Override public   double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef58 = true;
			switch (field.hashCode())
			{
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef58 = false;
						this.length = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef58) 
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
			boolean __temp_executeDef59 = true;
			switch (field.hashCode())
			{
				case 94337:
				{
					if (field.equals("__a")) 
					{
						__temp_executeDef59 = false;
						this.__a = ((T[]) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef59 = false;
						this.length = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef59) 
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
			boolean __temp_executeDef60 = true;
			switch (field.hashCode())
			{
				case -537840087:
				{
					if (field.equals("__unsafe_set")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("__unsafe_set"))) );
					}
					
					break;
				}
				
				
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef60 = false;
						return this.length;
					}
					
					break;
				}
				
				
				case -537851619:
				{
					if (field.equals("__unsafe_get")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("__unsafe_get"))) );
					}
					
					break;
				}
				
				
				case 94337:
				{
					if (field.equals("__a")) 
					{
						__temp_executeDef60 = false;
						return this.__a;
					}
					
					break;
				}
				
				
				case 90678402:
				{
					if (field.equals("__set")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("__set"))) );
					}
					
					break;
				}
				
				
				case -1354795244:
				{
					if (field.equals("concat")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("concat"))) );
					}
					
					break;
				}
				
				
				case 90666870:
				{
					if (field.equals("__get")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("__get"))) );
					}
					
					break;
				}
				
				
				case -1238494133:
				{
					if (field.equals("concatNative")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("concatNative"))) );
					}
					
					break;
				}
				
				
				case -1274492040:
				{
					if (field.equals("filter")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("filter"))) );
					}
					
					break;
				}
				
				
				case 3267882:
				{
					if (field.equals("join")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("join"))) );
					}
					
					break;
				}
				
				
				case 107868:
				{
					if (field.equals("map")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("map"))) );
					}
					
					break;
				}
				
				
				case 111185:
				{
					if (field.equals("pop")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("pop"))) );
					}
					
					break;
				}
				
				
				case 1182533742:
				{
					if (field.equals("iterator")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("iterator"))) );
					}
					
					break;
				}
				
				
				case 3452698:
				{
					if (field.equals("push")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("push"))) );
					}
					
					break;
				}
				
				
				case 3059573:
				{
					if (field.equals("copy")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("copy"))) );
					}
					
					break;
				}
				
				
				case 1099846370:
				{
					if (field.equals("reverse")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("reverse"))) );
					}
					
					break;
				}
				
				
				case -467511597:
				{
					if (field.equals("lastIndexOf")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("lastIndexOf"))) );
					}
					
					break;
				}
				
				
				case 109407362:
				{
					if (field.equals("shift")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("shift"))) );
					}
					
					break;
				}
				
				
				case 1943291465:
				{
					if (field.equals("indexOf")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("indexOf"))) );
					}
					
					break;
				}
				
				
				case 109526418:
				{
					if (field.equals("slice")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("slice"))) );
					}
					
					break;
				}
				
				
				case -934610812:
				{
					if (field.equals("remove")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("remove"))) );
					}
					
					break;
				}
				
				
				case 3536286:
				{
					if (field.equals("sort")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("sort"))) );
					}
					
					break;
				}
				
				
				case -1183792455:
				{
					if (field.equals("insert")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("insert"))) );
					}
					
					break;
				}
				
				
				case 1301699851:
				{
					if (field.equals("quicksort")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("quicksort"))) );
					}
					
					break;
				}
				
				
				case -277637751:
				{
					if (field.equals("unshift")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("unshift"))) );
					}
					
					break;
				}
				
				
				case -895859076:
				{
					if (field.equals("splice")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("splice"))) );
					}
					
					break;
				}
				
				
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("toString"))) );
					}
					
					break;
				}
				
				
				case -821858768:
				{
					if (field.equals("spliceVoid")) 
					{
						__temp_executeDef60 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("spliceVoid"))) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef60) 
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
			boolean __temp_executeDef61 = true;
			switch (field.hashCode())
			{
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef61 = false;
						return ((double) (this.length) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef61) 
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
			boolean __temp_executeDef62 = true;
			switch (field.hashCode())
			{
				case -537840087:
				{
					if (field.equals("__unsafe_set")) 
					{
						__temp_executeDef62 = false;
						return this.__unsafe_set(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((T) (dynargs.__get(1)) ));
					}
					
					break;
				}
				
				
				case -1354795244:
				{
					if (field.equals("concat")) 
					{
						__temp_executeDef62 = false;
						return this.concat(((haxe.root.Array<T>) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case -537851619:
				{
					if (field.equals("__unsafe_get")) 
					{
						__temp_executeDef62 = false;
						return this.__unsafe_get(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					break;
				}
				
				
				case -1238494133:
				{
					if (field.equals("concatNative")) 
					{
						__temp_executeDef62 = false;
						this.concatNative(((T[]) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 90678402:
				{
					if (field.equals("__set")) 
					{
						__temp_executeDef62 = false;
						return this.__set(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((T) (dynargs.__get(1)) ));
					}
					
					break;
				}
				
				
				case 3267882:
				{
					if (field.equals("join")) 
					{
						__temp_executeDef62 = false;
						return this.join(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case 90666870:
				{
					if (field.equals("__get")) 
					{
						__temp_executeDef62 = false;
						return this.__get(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					break;
				}
				
				
				case 111185:
				{
					if (field.equals("pop")) 
					{
						__temp_executeDef62 = false;
						return this.pop();
					}
					
					break;
				}
				
				
				case -1274492040:
				{
					if (field.equals("filter")) 
					{
						__temp_executeDef62 = false;
						return this.filter(((haxe.lang.Function) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 3452698:
				{
					if (field.equals("push")) 
					{
						__temp_executeDef62 = false;
						return this.push(((T) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 107868:
				{
					if (field.equals("map")) 
					{
						__temp_executeDef62 = false;
						return this.map(((haxe.lang.Function) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 1099846370:
				{
					if (field.equals("reverse")) 
					{
						__temp_executeDef62 = false;
						this.reverse();
					}
					
					break;
				}
				
				
				case 1182533742:
				{
					if (field.equals("iterator")) 
					{
						__temp_executeDef62 = false;
						return this.iterator();
					}
					
					break;
				}
				
				
				case 109407362:
				{
					if (field.equals("shift")) 
					{
						__temp_executeDef62 = false;
						return this.shift();
					}
					
					break;
				}
				
				
				case 3059573:
				{
					if (field.equals("copy")) 
					{
						__temp_executeDef62 = false;
						return this.copy();
					}
					
					break;
				}
				
				
				case 109526418:
				{
					if (field.equals("slice")) 
					{
						__temp_executeDef62 = false;
						return this.slice(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), dynargs.__get(1));
					}
					
					break;
				}
				
				
				case -467511597:
				{
					if (field.equals("lastIndexOf")) 
					{
						__temp_executeDef62 = false;
						return this.lastIndexOf(((T) (dynargs.__get(0)) ), dynargs.__get(1));
					}
					
					break;
				}
				
				
				case 3536286:
				{
					if (field.equals("sort")) 
					{
						__temp_executeDef62 = false;
						this.sort(((haxe.lang.Function) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 1943291465:
				{
					if (field.equals("indexOf")) 
					{
						__temp_executeDef62 = false;
						return this.indexOf(((T) (dynargs.__get(0)) ), dynargs.__get(1));
					}
					
					break;
				}
				
				
				case 1301699851:
				{
					if (field.equals("quicksort")) 
					{
						__temp_executeDef62 = false;
						this.quicksort(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), ((haxe.lang.Function) (dynargs.__get(2)) ));
					}
					
					break;
				}
				
				
				case -934610812:
				{
					if (field.equals("remove")) 
					{
						__temp_executeDef62 = false;
						return this.remove(((T) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case -895859076:
				{
					if (field.equals("splice")) 
					{
						__temp_executeDef62 = false;
						return this.splice(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ));
					}
					
					break;
				}
				
				
				case -1183792455:
				{
					if (field.equals("insert")) 
					{
						__temp_executeDef62 = false;
						this.insert(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((T) (dynargs.__get(1)) ));
					}
					
					break;
				}
				
				
				case -821858768:
				{
					if (field.equals("spliceVoid")) 
					{
						__temp_executeDef62 = false;
						this.spliceVoid(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ));
					}
					
					break;
				}
				
				
				case -277637751:
				{
					if (field.equals("unshift")) 
					{
						__temp_executeDef62 = false;
						this.unshift(((T) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						__temp_executeDef62 = false;
						return this.toString();
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef62) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		return null;
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("__a");
		baseArr.push("length");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


