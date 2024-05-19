# CoreBlogGetEntries200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Entries** | [**[]CoreBlogGetEntries200ResponseEntriesInner**](CoreBlogGetEntries200ResponseEntriesInner.md) |  | 
**Totalentries** | **int32** | The total number of entries found. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreBlogGetEntries200Response

`func NewCoreBlogGetEntries200Response(entries []CoreBlogGetEntries200ResponseEntriesInner, totalentries int32, ) *CoreBlogGetEntries200Response`

NewCoreBlogGetEntries200Response instantiates a new CoreBlogGetEntries200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBlogGetEntries200ResponseWithDefaults

`func NewCoreBlogGetEntries200ResponseWithDefaults() *CoreBlogGetEntries200Response`

NewCoreBlogGetEntries200ResponseWithDefaults instantiates a new CoreBlogGetEntries200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntries

`func (o *CoreBlogGetEntries200Response) GetEntries() []CoreBlogGetEntries200ResponseEntriesInner`

GetEntries returns the Entries field if non-nil, zero value otherwise.

### GetEntriesOk

`func (o *CoreBlogGetEntries200Response) GetEntriesOk() (*[]CoreBlogGetEntries200ResponseEntriesInner, bool)`

GetEntriesOk returns a tuple with the Entries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntries

`func (o *CoreBlogGetEntries200Response) SetEntries(v []CoreBlogGetEntries200ResponseEntriesInner)`

SetEntries sets Entries field to given value.


### GetTotalentries

`func (o *CoreBlogGetEntries200Response) GetTotalentries() int32`

GetTotalentries returns the Totalentries field if non-nil, zero value otherwise.

### GetTotalentriesOk

`func (o *CoreBlogGetEntries200Response) GetTotalentriesOk() (*int32, bool)`

GetTotalentriesOk returns a tuple with the Totalentries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalentries

`func (o *CoreBlogGetEntries200Response) SetTotalentries(v int32)`

SetTotalentries sets Totalentries field to given value.


### GetWarnings

`func (o *CoreBlogGetEntries200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreBlogGetEntries200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreBlogGetEntries200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreBlogGetEntries200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


