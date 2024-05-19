# ModDataGetDatabasesByCourses200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Databases** | [**[]ModDataGetDatabasesByCourses200ResponseDatabasesInner**](ModDataGetDatabasesByCourses200ResponseDatabasesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModDataGetDatabasesByCourses200Response

`func NewModDataGetDatabasesByCourses200Response(databases []ModDataGetDatabasesByCourses200ResponseDatabasesInner, ) *ModDataGetDatabasesByCourses200Response`

NewModDataGetDatabasesByCourses200Response instantiates a new ModDataGetDatabasesByCourses200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataGetDatabasesByCourses200ResponseWithDefaults

`func NewModDataGetDatabasesByCourses200ResponseWithDefaults() *ModDataGetDatabasesByCourses200Response`

NewModDataGetDatabasesByCourses200ResponseWithDefaults instantiates a new ModDataGetDatabasesByCourses200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDatabases

`func (o *ModDataGetDatabasesByCourses200Response) GetDatabases() []ModDataGetDatabasesByCourses200ResponseDatabasesInner`

GetDatabases returns the Databases field if non-nil, zero value otherwise.

### GetDatabasesOk

`func (o *ModDataGetDatabasesByCourses200Response) GetDatabasesOk() (*[]ModDataGetDatabasesByCourses200ResponseDatabasesInner, bool)`

GetDatabasesOk returns a tuple with the Databases field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatabases

`func (o *ModDataGetDatabasesByCourses200Response) SetDatabases(v []ModDataGetDatabasesByCourses200ResponseDatabasesInner)`

SetDatabases sets Databases field to given value.


### GetWarnings

`func (o *ModDataGetDatabasesByCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModDataGetDatabasesByCourses200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModDataGetDatabasesByCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModDataGetDatabasesByCourses200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


