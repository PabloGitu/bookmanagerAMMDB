import { NgModule } from '@angular/core';

import { BookmanagerAmmdbSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [BookmanagerAmmdbSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [BookmanagerAmmdbSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class BookmanagerAmmdbSharedCommonModule {}
