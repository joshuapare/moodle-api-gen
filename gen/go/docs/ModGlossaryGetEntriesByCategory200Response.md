# ModGlossaryGetEntriesByCategory200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | **int32** | The total number of records matching the request. | 
**Entries** | [**[]ModGlossaryGetEntriesByCategory200ResponseEntriesInner**](ModGlossaryGetEntriesByCategory200ResponseEntriesInner.md) |  | 
**Ratinginfo** | Pointer to [**ModForumGetDiscussionPosts200ResponseRatinginfo**](ModForumGetDiscussionPosts200ResponseRatinginfo.md) |  | [optional] 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModGlossaryGetEntriesByCategory200Response

`func NewModGlossaryGetEntriesByCategory200Response(count int32, entries []ModGlossaryGetEntriesByCategory200ResponseEntriesInner, ) *ModGlossaryGetEntriesByCategory200Response`

NewModGlossaryGetEntriesByCategory200Response instantiates a new ModGlossaryGetEntriesByCategory200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetEntriesByCategory200ResponseWithDefaults

`func NewModGlossaryGetEntriesByCategory200ResponseWithDefaults() *ModGlossaryGetEntriesByCategory200Response`

NewModGlossaryGetEntriesByCategory200ResponseWithDefaults instantiates a new ModGlossaryGetEntriesByCategory200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *ModGlossaryGetEntriesByCategory200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *ModGlossaryGetEntriesByCategory200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *ModGlossaryGetEntriesByCategory200Response) SetCount(v int32)`

SetCount sets Count field to given value.


### GetEntries

`func (o *ModGlossaryGetEntriesByCategory200Response) GetEntries() []ModGlossaryGetEntriesByCategory200ResponseEntriesInner`

GetEntries returns the Entries field if non-nil, zero value otherwise.

### GetEntriesOk

`func (o *ModGlossaryGetEntriesByCategory200Response) GetEntriesOk() (*[]ModGlossaryGetEntriesByCategory200ResponseEntriesInner, bool)`

GetEntriesOk returns a tuple with the Entries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntries

`func (o *ModGlossaryGetEntriesByCategory200Response) SetEntries(v []ModGlossaryGetEntriesByCategory200ResponseEntriesInner)`

SetEntries sets Entries field to given value.


### GetRatinginfo

`func (o *ModGlossaryGetEntriesByCategory200Response) GetRatinginfo() ModForumGetDiscussionPosts200ResponseRatinginfo`

GetRatinginfo returns the Ratinginfo field if non-nil, zero value otherwise.

### GetRatinginfoOk

`func (o *ModGlossaryGetEntriesByCategory200Response) GetRatinginfoOk() (*ModForumGetDiscussionPosts200ResponseRatinginfo, bool)`

GetRatinginfoOk returns a tuple with the Ratinginfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRatinginfo

`func (o *ModGlossaryGetEntriesByCategory200Response) SetRatinginfo(v ModForumGetDiscussionPosts200ResponseRatinginfo)`

SetRatinginfo sets Ratinginfo field to given value.

### HasRatinginfo

`func (o *ModGlossaryGetEntriesByCategory200Response) HasRatinginfo() bool`

HasRatinginfo returns a boolean if a field has been set.

### GetWarnings

`func (o *ModGlossaryGetEntriesByCategory200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModGlossaryGetEntriesByCategory200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModGlossaryGetEntriesByCategory200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModGlossaryGetEntriesByCategory200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


