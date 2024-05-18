# CoreUserGetUsers200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Users** | [**[]CoreGradesGetGradableUsers200ResponseUsersInner**](CoreGradesGetGradableUsers200ResponseUsersInner.md) |  | 
**Warnings** | Pointer to [**[]BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner**](BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreUserGetUsers200Response

`func NewCoreUserGetUsers200Response(users []CoreGradesGetGradableUsers200ResponseUsersInner, ) *CoreUserGetUsers200Response`

NewCoreUserGetUsers200Response instantiates a new CoreUserGetUsers200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreUserGetUsers200ResponseWithDefaults

`func NewCoreUserGetUsers200ResponseWithDefaults() *CoreUserGetUsers200Response`

NewCoreUserGetUsers200ResponseWithDefaults instantiates a new CoreUserGetUsers200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUsers

`func (o *CoreUserGetUsers200Response) GetUsers() []CoreGradesGetGradableUsers200ResponseUsersInner`

GetUsers returns the Users field if non-nil, zero value otherwise.

### GetUsersOk

`func (o *CoreUserGetUsers200Response) GetUsersOk() (*[]CoreGradesGetGradableUsers200ResponseUsersInner, bool)`

GetUsersOk returns a tuple with the Users field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsers

`func (o *CoreUserGetUsers200Response) SetUsers(v []CoreGradesGetGradableUsers200ResponseUsersInner)`

SetUsers sets Users field to given value.


### GetWarnings

`func (o *CoreUserGetUsers200Response) GetWarnings() []BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreUserGetUsers200Response) GetWarningsOk() (*[]BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreUserGetUsers200Response) SetWarnings(v []BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreUserGetUsers200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


