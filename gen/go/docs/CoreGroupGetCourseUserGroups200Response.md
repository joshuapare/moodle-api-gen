# CoreGroupGetCourseUserGroups200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Groups** | [**[]CoreGroupGetCourseUserGroups200ResponseGroupsInner**](CoreGroupGetCourseUserGroups200ResponseGroupsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreGroupGetCourseUserGroups200Response

`func NewCoreGroupGetCourseUserGroups200Response(groups []CoreGroupGetCourseUserGroups200ResponseGroupsInner, ) *CoreGroupGetCourseUserGroups200Response`

NewCoreGroupGetCourseUserGroups200Response instantiates a new CoreGroupGetCourseUserGroups200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGroupGetCourseUserGroups200ResponseWithDefaults

`func NewCoreGroupGetCourseUserGroups200ResponseWithDefaults() *CoreGroupGetCourseUserGroups200Response`

NewCoreGroupGetCourseUserGroups200ResponseWithDefaults instantiates a new CoreGroupGetCourseUserGroups200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGroups

`func (o *CoreGroupGetCourseUserGroups200Response) GetGroups() []CoreGroupGetCourseUserGroups200ResponseGroupsInner`

GetGroups returns the Groups field if non-nil, zero value otherwise.

### GetGroupsOk

`func (o *CoreGroupGetCourseUserGroups200Response) GetGroupsOk() (*[]CoreGroupGetCourseUserGroups200ResponseGroupsInner, bool)`

GetGroupsOk returns a tuple with the Groups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroups

`func (o *CoreGroupGetCourseUserGroups200Response) SetGroups(v []CoreGroupGetCourseUserGroups200ResponseGroupsInner)`

SetGroups sets Groups field to given value.


### GetWarnings

`func (o *CoreGroupGetCourseUserGroups200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreGroupGetCourseUserGroups200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreGroupGetCourseUserGroups200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreGroupGetCourseUserGroups200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


