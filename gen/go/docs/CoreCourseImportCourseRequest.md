# CoreCourseImportCourseRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Deletecontent** | Pointer to **int32** | whether to delete the course content where we are importing to (default to 0 &#x3D; No) | [optional] [default to 0]
**Importfrom** | **int32** | the id of the course we are importing from | [default to null]
**Importto** | **int32** | the id of the course we are importing to | [default to null]
**Options** | Pointer to [**[]CoreCourseImportCourseRequestOptionsInner**](CoreCourseImportCourseRequestOptionsInner.md) |  | [optional] 

## Methods

### NewCoreCourseImportCourseRequest

`func NewCoreCourseImportCourseRequest(importfrom int32, importto int32, ) *CoreCourseImportCourseRequest`

NewCoreCourseImportCourseRequest instantiates a new CoreCourseImportCourseRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseImportCourseRequestWithDefaults

`func NewCoreCourseImportCourseRequestWithDefaults() *CoreCourseImportCourseRequest`

NewCoreCourseImportCourseRequestWithDefaults instantiates a new CoreCourseImportCourseRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDeletecontent

`func (o *CoreCourseImportCourseRequest) GetDeletecontent() int32`

GetDeletecontent returns the Deletecontent field if non-nil, zero value otherwise.

### GetDeletecontentOk

`func (o *CoreCourseImportCourseRequest) GetDeletecontentOk() (*int32, bool)`

GetDeletecontentOk returns a tuple with the Deletecontent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeletecontent

`func (o *CoreCourseImportCourseRequest) SetDeletecontent(v int32)`

SetDeletecontent sets Deletecontent field to given value.

### HasDeletecontent

`func (o *CoreCourseImportCourseRequest) HasDeletecontent() bool`

HasDeletecontent returns a boolean if a field has been set.

### GetImportfrom

`func (o *CoreCourseImportCourseRequest) GetImportfrom() int32`

GetImportfrom returns the Importfrom field if non-nil, zero value otherwise.

### GetImportfromOk

`func (o *CoreCourseImportCourseRequest) GetImportfromOk() (*int32, bool)`

GetImportfromOk returns a tuple with the Importfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImportfrom

`func (o *CoreCourseImportCourseRequest) SetImportfrom(v int32)`

SetImportfrom sets Importfrom field to given value.


### GetImportto

`func (o *CoreCourseImportCourseRequest) GetImportto() int32`

GetImportto returns the Importto field if non-nil, zero value otherwise.

### GetImporttoOk

`func (o *CoreCourseImportCourseRequest) GetImporttoOk() (*int32, bool)`

GetImporttoOk returns a tuple with the Importto field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImportto

`func (o *CoreCourseImportCourseRequest) SetImportto(v int32)`

SetImportto sets Importto field to given value.


### GetOptions

`func (o *CoreCourseImportCourseRequest) GetOptions() []CoreCourseImportCourseRequestOptionsInner`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *CoreCourseImportCourseRequest) GetOptionsOk() (*[]CoreCourseImportCourseRequestOptionsInner, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *CoreCourseImportCourseRequest) SetOptions(v []CoreCourseImportCourseRequestOptionsInner)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *CoreCourseImportCourseRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


