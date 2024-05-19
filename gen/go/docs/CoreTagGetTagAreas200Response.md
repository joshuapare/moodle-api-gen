# CoreTagGetTagAreas200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Areas** | [**[]CoreTagGetTagAreas200ResponseAreasInner**](CoreTagGetTagAreas200ResponseAreasInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreTagGetTagAreas200Response

`func NewCoreTagGetTagAreas200Response(areas []CoreTagGetTagAreas200ResponseAreasInner, ) *CoreTagGetTagAreas200Response`

NewCoreTagGetTagAreas200Response instantiates a new CoreTagGetTagAreas200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreTagGetTagAreas200ResponseWithDefaults

`func NewCoreTagGetTagAreas200ResponseWithDefaults() *CoreTagGetTagAreas200Response`

NewCoreTagGetTagAreas200ResponseWithDefaults instantiates a new CoreTagGetTagAreas200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAreas

`func (o *CoreTagGetTagAreas200Response) GetAreas() []CoreTagGetTagAreas200ResponseAreasInner`

GetAreas returns the Areas field if non-nil, zero value otherwise.

### GetAreasOk

`func (o *CoreTagGetTagAreas200Response) GetAreasOk() (*[]CoreTagGetTagAreas200ResponseAreasInner, bool)`

GetAreasOk returns a tuple with the Areas field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAreas

`func (o *CoreTagGetTagAreas200Response) SetAreas(v []CoreTagGetTagAreas200ResponseAreasInner)`

SetAreas sets Areas field to given value.


### GetWarnings

`func (o *CoreTagGetTagAreas200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreTagGetTagAreas200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreTagGetTagAreas200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreTagGetTagAreas200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


