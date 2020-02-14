using Acr.UserDialogs;
using MvvmCross.Platform;
using MvvmCross.Platform.IoC;
using System.Threading.Tasks;

namespace Mapsui.Samples.MVVMCross.Core
{
    public class CoreApp : MvvmCross.Core.ViewModels.MvxApplication
    {
        public override void Initialize()
        {
            CreatableTypes()
                .EndingWith("Service")
                .AsInterfaces()
                .RegisterAsLazySingleton();

            Mvx.RegisterSingleton(() => UserDialogs.Instance);
            base.Initialize();
            RegisterNavigationServiceAppStart<ViewModels.FirstViewModel>();
        }
    }
}
