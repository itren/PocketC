package cn.itgrocery.pocketc.presenter.main;

import javax.inject.Inject;

import cn.itgrocery.pocketc.base.RxPresenter;
import cn.itgrocery.pocketc.base.contract.main.MainContract;

/**
 * Created by xc on 2017/12/23.
 */

public class MainPresenter
        extends RxPresenter<MainContract.View> implements MainContract.Presenter {

    /**
     * 对于可以自行管理的类无需创建Module来提供实例化的对象
     *
     */
    @Inject
    public MainPresenter() {
    }

    @Override
    public void testDagger() {
        mView.showMessage("From MainPresenter!");
    }
}
