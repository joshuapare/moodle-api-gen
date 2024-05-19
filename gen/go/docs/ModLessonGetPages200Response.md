# ModLessonGetPages200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pages** | [**[]ModLessonGetPages200ResponsePagesInner**](ModLessonGetPages200ResponsePagesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModLessonGetPages200Response

`func NewModLessonGetPages200Response(pages []ModLessonGetPages200ResponsePagesInner, ) *ModLessonGetPages200Response`

NewModLessonGetPages200Response instantiates a new ModLessonGetPages200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetPages200ResponseWithDefaults

`func NewModLessonGetPages200ResponseWithDefaults() *ModLessonGetPages200Response`

NewModLessonGetPages200ResponseWithDefaults instantiates a new ModLessonGetPages200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPages

`func (o *ModLessonGetPages200Response) GetPages() []ModLessonGetPages200ResponsePagesInner`

GetPages returns the Pages field if non-nil, zero value otherwise.

### GetPagesOk

`func (o *ModLessonGetPages200Response) GetPagesOk() (*[]ModLessonGetPages200ResponsePagesInner, bool)`

GetPagesOk returns a tuple with the Pages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPages

`func (o *ModLessonGetPages200Response) SetPages(v []ModLessonGetPages200ResponsePagesInner)`

SetPages sets Pages field to given value.


### GetWarnings

`func (o *ModLessonGetPages200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModLessonGetPages200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModLessonGetPages200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModLessonGetPages200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


