import { IBook } from 'app/shared/model/book.model';

export const enum Distribution {
    WORLDWIDE = 'WORLDWIDE',
    REGIONAL = 'REGIONAL'
}

export interface IPublisher {
    id?: string;
    name?: string;
    distribution?: Distribution;
    localization?: string;
    books?: IBook[];
}

export class Publisher implements IPublisher {
    constructor(
        public id?: string,
        public name?: string,
        public distribution?: Distribution,
        public localization?: string,
        public books?: IBook[]
    ) {}
}
