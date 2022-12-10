package plugin.wuxianggujun.zhiso

import com.su.mediabox.pluginapi.IPluginFactory
import com.su.mediabox.pluginapi.components.IBasePageDataComponent

class PluginFactory : IPluginFactory() {
    override val host: String
        get() = ""

    //自定义了页面数据组件
    @Suppress("UNCHECKED_CAST")
    override fun <T : IBasePageDataComponent> createComponent(clazz: Class<T>): T? {
        //return HotPageComponent() as? T?
        TODO("待写组件")
    }
}