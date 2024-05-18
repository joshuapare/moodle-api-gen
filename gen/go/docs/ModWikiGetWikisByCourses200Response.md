# ModWikiGetWikisByCourses200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 
**Wikis** | [**[]ModWikiGetWikisByCourses200ResponseWikisInner**](ModWikiGetWikisByCourses200ResponseWikisInner.md) |  | 

## Methods

### NewModWikiGetWikisByCourses200Response

`func NewModWikiGetWikisByCourses200Response(wikis []ModWikiGetWikisByCourses200ResponseWikisInner, ) *ModWikiGetWikisByCourses200Response`

NewModWikiGetWikisByCourses200Response instantiates a new ModWikiGetWikisByCourses200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWikiGetWikisByCourses200ResponseWithDefaults

`func NewModWikiGetWikisByCourses200ResponseWithDefaults() *ModWikiGetWikisByCourses200Response`

NewModWikiGetWikisByCourses200ResponseWithDefaults instantiates a new ModWikiGetWikisByCourses200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetWarnings

`func (o *ModWikiGetWikisByCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModWikiGetWikisByCourses200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModWikiGetWikisByCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModWikiGetWikisByCourses200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.

### GetWikis

`func (o *ModWikiGetWikisByCourses200Response) GetWikis() []ModWikiGetWikisByCourses200ResponseWikisInner`

GetWikis returns the Wikis field if non-nil, zero value otherwise.

### GetWikisOk

`func (o *ModWikiGetWikisByCourses200Response) GetWikisOk() (*[]ModWikiGetWikisByCourses200ResponseWikisInner, bool)`

GetWikisOk returns a tuple with the Wikis field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWikis

`func (o *ModWikiGetWikisByCourses200Response) SetWikis(v []ModWikiGetWikisByCourses200ResponseWikisInner)`

SetWikis sets Wikis field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


