using MvvmCross.Core.ViewModels;
using System.Threading.Tasks;
namespace Mapsui.Samples.MVVMCross.Core.ViewModels.Base
{
    public abstract class BaseViewModelResult<TResult> : BaseViewModel, IMvxViewModelResult<TResult>
    {   // This type of MvxViewModel returns result to the calling ViewModel.
        public TaskCompletionSource<object> CloseCompletionSource { get; set; }

        //public override void ViewDestroy(bool viewFinishing = true)
        //{
        //    if (viewFinishing && CloseCompletionSource?.Task.IsCompleted == false && !CloseCompletionSource.Task.IsFaulted)
        //        CloseCompletionSource?.TrySetCanceled();

        //    base.ViewDestroy();
        //}
    }
}
