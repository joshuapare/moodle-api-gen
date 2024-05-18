# ModBookViewBookRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookid** | **int32** | book instance id | [default to null]
**Chapterid** | Pointer to **int32** | chapter id | [optional] [default to 0]

## Methods

### NewModBookViewBookRequest

`func NewModBookViewBookRequest(bookid int32, ) *ModBookViewBookRequest`

NewModBookViewBookRequest instantiates a new ModBookViewBookRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModBookViewBookRequestWithDefaults

`func NewModBookViewBookRequestWithDefaults() *ModBookViewBookRequest`

NewModBookViewBookRequestWithDefaults instantiates a new ModBookViewBookRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBookid

`func (o *ModBookViewBookRequest) GetBookid() int32`

GetBookid returns the Bookid field if non-nil, zero value otherwise.

### GetBookidOk

`func (o *ModBookViewBookRequest) GetBookidOk() (*int32, bool)`

GetBookidOk returns a tuple with the Bookid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookid

`func (o *ModBookViewBookRequest) SetBookid(v int32)`

SetBookid sets Bookid field to given value.


### GetChapterid

`func (o *ModBookViewBookRequest) GetChapterid() int32`

GetChapterid returns the Chapterid field if non-nil, zero value otherwise.

### GetChapteridOk

`func (o *ModBookViewBookRequest) GetChapteridOk() (*int32, bool)`

GetChapteridOk returns a tuple with the Chapterid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChapterid

`func (o *ModBookViewBookRequest) SetChapterid(v int32)`

SetChapterid sets Chapterid field to given value.

### HasChapterid

`func (o *ModBookViewBookRequest) HasChapterid() bool`

HasChapterid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


