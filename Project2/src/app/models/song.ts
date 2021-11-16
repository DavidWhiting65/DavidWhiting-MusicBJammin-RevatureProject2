/* export class Song {

    constructor(
        public _id: number,
        public _title: string,
        public _musician: Musician
    ){}
} */

import { Musician } from './musician';

export interface Song {
    id: number;
    title: string;
    likes: number;
    dislikes: number;
    musician_id: number;
    musician: Musician;
    url: string
}

