import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
    imports: [
        RouterModule.forChild([
            {
                path: 'author',
                loadChildren: './author/author.module#BookmanagerAmmdbAuthorModule'
            },
            {
                path: 'book',
                loadChildren: './book/book.module#BookmanagerAmmdbBookModule'
            },
            {
                path: 'comment',
                loadChildren: './comment/comment.module#BookmanagerAmmdbCommentModule'
            },
            {
                path: 'publisher',
                loadChildren: './publisher/publisher.module#BookmanagerAmmdbPublisherModule'
            },
            {
                path: 'book',
                loadChildren: './book/book.module#BookmanagerAmmdbBookModule'
            }
            /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
        ])
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class BookmanagerAmmdbEntityModule {}
