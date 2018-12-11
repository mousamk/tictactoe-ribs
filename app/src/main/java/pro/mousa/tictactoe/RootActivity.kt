package pro.mousa.tictactoe

import android.view.ViewGroup
import com.uber.rib.core.RibActivity
import com.uber.rib.core.ViewRouter
import pro.mousa.tictactoe.root.RootBuilder
import pro.mousa.tictactoe.root.RootInteractor


class RootActivity : RibActivity()
{
    private lateinit var rootInteractor: RootInteractor


    override fun createRouter(parentViewGroup: ViewGroup): ViewRouter<*, *, *>
    {
        val rootBuilder = RootBuilder(object : RootBuilder.ParentComponent {})
        val router = rootBuilder.build(parentViewGroup)
        rootInteractor = router.interactor
        return router
    }
}
