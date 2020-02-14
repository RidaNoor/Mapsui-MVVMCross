using MvvmCross.Core.ViewModels;


namespace Mapsui.Samples.MVVMCross.Core.ViewModels.Base
{
    public abstract class BaseViewModel<TParameter> : BaseViewModel, IMvxViewModel<TParameter>
    { // BaseViewModel<TParameter> is another type of MvxViewModels where we can pass data to the ViewModel
      // And the passed data can be obtained in Prepare method of the BaseViewModel<TParameter>
        public abstract void Prepare(TParameter parameter);
    }
}
