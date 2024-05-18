# ModUrlGetUrlsByCourses200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Urls** | [**[]ModUrlGetUrlsByCourses200ResponseUrlsInner**](ModUrlGetUrlsByCourses200ResponseUrlsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModUrlGetUrlsByCourses200Response

`func NewModUrlGetUrlsByCourses200Response(urls []ModUrlGetUrlsByCourses200ResponseUrlsInner, ) *ModUrlGetUrlsByCourses200Response`

NewModUrlGetUrlsByCourses200Response instantiates a new ModUrlGetUrlsByCourses200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModUrlGetUrlsByCourses200ResponseWithDefaults

`func NewModUrlGetUrlsByCourses200ResponseWithDefaults() *ModUrlGetUrlsByCourses200Response`

NewModUrlGetUrlsByCourses200ResponseWithDefaults instantiates a new ModUrlGetUrlsByCourses200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUrls

`func (o *ModUrlGetUrlsByCourses200Response) GetUrls() []ModUrlGetUrlsByCourses200ResponseUrlsInner`

GetUrls returns the Urls field if non-nil, zero value otherwise.

### GetUrlsOk

`func (o *ModUrlGetUrlsByCourses200Response) GetUrlsOk() (*[]ModUrlGetUrlsByCourses200ResponseUrlsInner, bool)`

GetUrlsOk returns a tuple with the Urls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrls

`func (o *ModUrlGetUrlsByCourses200Response) SetUrls(v []ModUrlGetUrlsByCourses200ResponseUrlsInner)`

SetUrls sets Urls field to given value.


### GetWarnings

`func (o *ModUrlGetUrlsByCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModUrlGetUrlsByCourses200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModUrlGetUrlsByCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModUrlGetUrlsByCourses200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


