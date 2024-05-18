# ModGlossaryGetAuthors200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Authors** | [**[]ModGlossaryGetAuthors200ResponseAuthorsInner**](ModGlossaryGetAuthors200ResponseAuthorsInner.md) |  | 
**Count** | **int32** | The total number of records. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModGlossaryGetAuthors200Response

`func NewModGlossaryGetAuthors200Response(authors []ModGlossaryGetAuthors200ResponseAuthorsInner, count int32, ) *ModGlossaryGetAuthors200Response`

NewModGlossaryGetAuthors200Response instantiates a new ModGlossaryGetAuthors200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetAuthors200ResponseWithDefaults

`func NewModGlossaryGetAuthors200ResponseWithDefaults() *ModGlossaryGetAuthors200Response`

NewModGlossaryGetAuthors200ResponseWithDefaults instantiates a new ModGlossaryGetAuthors200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAuthors

`func (o *ModGlossaryGetAuthors200Response) GetAuthors() []ModGlossaryGetAuthors200ResponseAuthorsInner`

GetAuthors returns the Authors field if non-nil, zero value otherwise.

### GetAuthorsOk

`func (o *ModGlossaryGetAuthors200Response) GetAuthorsOk() (*[]ModGlossaryGetAuthors200ResponseAuthorsInner, bool)`

GetAuthorsOk returns a tuple with the Authors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthors

`func (o *ModGlossaryGetAuthors200Response) SetAuthors(v []ModGlossaryGetAuthors200ResponseAuthorsInner)`

SetAuthors sets Authors field to given value.


### GetCount

`func (o *ModGlossaryGetAuthors200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *ModGlossaryGetAuthors200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *ModGlossaryGetAuthors200Response) SetCount(v int32)`

SetCount sets Count field to given value.


### GetWarnings

`func (o *ModGlossaryGetAuthors200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModGlossaryGetAuthors200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModGlossaryGetAuthors200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModGlossaryGetAuthors200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


