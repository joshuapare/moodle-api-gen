# ModGlossaryGetEntriesByAuthor200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | **int32** | The total number of records matching the request. | [default to null]
**Entries** | [**[]ModGlossaryGetEntriesByAuthor200ResponseEntriesInner**](ModGlossaryGetEntriesByAuthor200ResponseEntriesInner.md) |  | 
**Ratinginfo** | Pointer to [**ModForumGetDiscussionPosts200ResponseRatinginfo**](ModForumGetDiscussionPosts200ResponseRatinginfo.md) |  | [optional] 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModGlossaryGetEntriesByAuthor200Response

`func NewModGlossaryGetEntriesByAuthor200Response(count int32, entries []ModGlossaryGetEntriesByAuthor200ResponseEntriesInner, ) *ModGlossaryGetEntriesByAuthor200Response`

NewModGlossaryGetEntriesByAuthor200Response instantiates a new ModGlossaryGetEntriesByAuthor200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetEntriesByAuthor200ResponseWithDefaults

`func NewModGlossaryGetEntriesByAuthor200ResponseWithDefaults() *ModGlossaryGetEntriesByAuthor200Response`

NewModGlossaryGetEntriesByAuthor200ResponseWithDefaults instantiates a new ModGlossaryGetEntriesByAuthor200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *ModGlossaryGetEntriesByAuthor200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *ModGlossaryGetEntriesByAuthor200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *ModGlossaryGetEntriesByAuthor200Response) SetCount(v int32)`

SetCount sets Count field to given value.


### GetEntries

`func (o *ModGlossaryGetEntriesByAuthor200Response) GetEntries() []ModGlossaryGetEntriesByAuthor200ResponseEntriesInner`

GetEntries returns the Entries field if non-nil, zero value otherwise.

### GetEntriesOk

`func (o *ModGlossaryGetEntriesByAuthor200Response) GetEntriesOk() (*[]ModGlossaryGetEntriesByAuthor200ResponseEntriesInner, bool)`

GetEntriesOk returns a tuple with the Entries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntries

`func (o *ModGlossaryGetEntriesByAuthor200Response) SetEntries(v []ModGlossaryGetEntriesByAuthor200ResponseEntriesInner)`

SetEntries sets Entries field to given value.


### GetRatinginfo

`func (o *ModGlossaryGetEntriesByAuthor200Response) GetRatinginfo() ModForumGetDiscussionPosts200ResponseRatinginfo`

GetRatinginfo returns the Ratinginfo field if non-nil, zero value otherwise.

### GetRatinginfoOk

`func (o *ModGlossaryGetEntriesByAuthor200Response) GetRatinginfoOk() (*ModForumGetDiscussionPosts200ResponseRatinginfo, bool)`

GetRatinginfoOk returns a tuple with the Ratinginfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRatinginfo

`func (o *ModGlossaryGetEntriesByAuthor200Response) SetRatinginfo(v ModForumGetDiscussionPosts200ResponseRatinginfo)`

SetRatinginfo sets Ratinginfo field to given value.

### HasRatinginfo

`func (o *ModGlossaryGetEntriesByAuthor200Response) HasRatinginfo() bool`

HasRatinginfo returns a boolean if a field has been set.

### GetWarnings

`func (o *ModGlossaryGetEntriesByAuthor200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModGlossaryGetEntriesByAuthor200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModGlossaryGetEntriesByAuthor200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModGlossaryGetEntriesByAuthor200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


