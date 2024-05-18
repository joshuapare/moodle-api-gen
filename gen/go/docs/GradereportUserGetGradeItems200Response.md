# GradereportUserGetGradeItems200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Usergrades** | [**[]GradereportUserGetGradeItems200ResponseUsergradesInner**](GradereportUserGetGradeItems200ResponseUsergradesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewGradereportUserGetGradeItems200Response

`func NewGradereportUserGetGradeItems200Response(usergrades []GradereportUserGetGradeItems200ResponseUsergradesInner, ) *GradereportUserGetGradeItems200Response`

NewGradereportUserGetGradeItems200Response instantiates a new GradereportUserGetGradeItems200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGradereportUserGetGradeItems200ResponseWithDefaults

`func NewGradereportUserGetGradeItems200ResponseWithDefaults() *GradereportUserGetGradeItems200Response`

NewGradereportUserGetGradeItems200ResponseWithDefaults instantiates a new GradereportUserGetGradeItems200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUsergrades

`func (o *GradereportUserGetGradeItems200Response) GetUsergrades() []GradereportUserGetGradeItems200ResponseUsergradesInner`

GetUsergrades returns the Usergrades field if non-nil, zero value otherwise.

### GetUsergradesOk

`func (o *GradereportUserGetGradeItems200Response) GetUsergradesOk() (*[]GradereportUserGetGradeItems200ResponseUsergradesInner, bool)`

GetUsergradesOk returns a tuple with the Usergrades field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsergrades

`func (o *GradereportUserGetGradeItems200Response) SetUsergrades(v []GradereportUserGetGradeItems200ResponseUsergradesInner)`

SetUsergrades sets Usergrades field to given value.


### GetWarnings

`func (o *GradereportUserGetGradeItems200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *GradereportUserGetGradeItems200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *GradereportUserGetGradeItems200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *GradereportUserGetGradeItems200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


