using MvvmCross.Core.ViewModels;
using System;
using System.Collections.Generic;
using System.Text;
using System.Threading.Tasks;

namespace Mapsui.Samples.MVVMCross.Core.ViewModels.Base
{
    public abstract class BaseViewModel : MvxViewModel
    {
        // BaseViewModel is inhereted from MvxViewModel and thus implements the basic functionalities of a MVVMCross ViewModel
        public IMvxAsyncCommand BackCommand { get; set; }
        public override async Task Initialize()
        {
            await base.Initialize();
           
        }
    }
}
