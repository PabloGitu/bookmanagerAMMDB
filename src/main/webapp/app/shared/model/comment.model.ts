import { IBook } from 'app/shared/model/book.model';

export interface IComment {
    id?: string;
    userName?: string;
    description?: string;
    book?: IBook;
}

export class Comment implements IComment {
    constructor(public id?: string, public userName?: string, public description?: string, public book?: IBook) {}
}
