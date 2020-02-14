using MvvmCross.Core.ViewModels;
using System;
using System.Collections.Generic;
using System.Text;

namespace Mapsui.Samples.MVVMCross.Core.ViewModels.Base
{
    public abstract class BaseViewModel<TParameter, TResult> : BaseViewModelResult<TResult>, IMvxViewModel<TParameter, TResult>
    {   // BaseViewModel<TParameter, TResult>  is another type of MvxViewModels where we can pass data to the ViewModel
        // And the passed data can be obtained in Prepare method of the ViewModel along with this, this ViewModel
        // after performing its specified functionality, returns result to the calling ViewModel.
        public abstract void Prepare(TParameter parameter);
    }
}
