using MvvmCross.Core.ViewModels;
using MvvmCross.Forms.Core;
using MvvmCross.Forms.iOS;
using MvvmCross.iOS.Platform;
using MvvmCross.Platform.Platform;
using Mapsui.Samples.MVVMCross.Core;
using UIKit;

namespace Mapsui.Samples.MVVMCross.iOS
{
    public class Setup : MvxFormsIosSetup
    {
        public Setup(IMvxApplicationDelegate applicationDelegate, UIWindow window)
            : base(applicationDelegate, window)
        {
        }

        protected override IMvxApplication CreateApp() => new CoreApp();
        protected override MvxFormsApplication CreateFormsApplication() => new Core.Application();
        protected override IMvxTrace CreateDebugTrace() => new DebugTrace();
    }
}

