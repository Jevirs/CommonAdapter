# CommonAdapter

来自慕课网的万能适配器

一个强大的ViewHolder类。
高性能的SparseArray适用于存放Integer-Object键值对，用于快速获取View，减少findViewById的资源消耗。

public static ViewHolder getInstance(Context context,View convertview,ViewGroup parent,int resID,int postion)
静态方法在判断是否存在convertview复用后获取一个ViewHolder实例，
ViewHolder类中已经封装了setText和setImageView的方法（还有待拓展），
可以在获取到ViewHolder实例后直接调用（在Adapter的setView中调用）。


public abstract class CommonAdapter<T> extends BaseAdapter

CommonAdaptr抽象类继承自BaseAdapter,将Adapter封装，只抽象出setView方法供用户实现。
简化思路，只需要专注于setView的方法。
