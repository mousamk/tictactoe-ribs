package pro.mousa.tictactoe.root.logged_out

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

import kotlinx.android.synthetic.main.logged_out_rib.*


/**
 * Top level view for {@link LoggedOutBuilder.LoggedOutScope}.
 */
class LoggedOutView @JvmOverloads constructor(context: Context,
                                              attrs: AttributeSet? = null,
                                              defStyle: Int = 0)
    : LinearLayout(context, attrs, defStyle), LoggedOutInteractor.LoggedOutPresenter
{
    override fun onFinishInflate()
    {
        super.onFinishInflate()
    }
}
