# GradereportUserGetAccessInformation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canviewallgrades** | **bool** | Whether the user can view all users grades in the course. | [default to null]
**Canviewmygrades** | **bool** | Whether the user can view his grades in the course. | [default to null]
**Canviewusergradereport** | **bool** | Whether the user can view the user grade report. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewGradereportUserGetAccessInformation200Response

`func NewGradereportUserGetAccessInformation200Response(canviewallgrades bool, canviewmygrades bool, canviewusergradereport bool, ) *GradereportUserGetAccessInformation200Response`

NewGradereportUserGetAccessInformation200Response instantiates a new GradereportUserGetAccessInformation200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGradereportUserGetAccessInformation200ResponseWithDefaults

`func NewGradereportUserGetAccessInformation200ResponseWithDefaults() *GradereportUserGetAccessInformation200Response`

NewGradereportUserGetAccessInformation200ResponseWithDefaults instantiates a new GradereportUserGetAccessInformation200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanviewallgrades

`func (o *GradereportUserGetAccessInformation200Response) GetCanviewallgrades() bool`

GetCanviewallgrades returns the Canviewallgrades field if non-nil, zero value otherwise.

### GetCanviewallgradesOk

`func (o *GradereportUserGetAccessInformation200Response) GetCanviewallgradesOk() (*bool, bool)`

GetCanviewallgradesOk returns a tuple with the Canviewallgrades field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewallgrades

`func (o *GradereportUserGetAccessInformation200Response) SetCanviewallgrades(v bool)`

SetCanviewallgrades sets Canviewallgrades field to given value.


### GetCanviewmygrades

`func (o *GradereportUserGetAccessInformation200Response) GetCanviewmygrades() bool`

GetCanviewmygrades returns the Canviewmygrades field if non-nil, zero value otherwise.

### GetCanviewmygradesOk

`func (o *GradereportUserGetAccessInformation200Response) GetCanviewmygradesOk() (*bool, bool)`

GetCanviewmygradesOk returns a tuple with the Canviewmygrades field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewmygrades

`func (o *GradereportUserGetAccessInformation200Response) SetCanviewmygrades(v bool)`

SetCanviewmygrades sets Canviewmygrades field to given value.


### GetCanviewusergradereport

`func (o *GradereportUserGetAccessInformation200Response) GetCanviewusergradereport() bool`

GetCanviewusergradereport returns the Canviewusergradereport field if non-nil, zero value otherwise.

### GetCanviewusergradereportOk

`func (o *GradereportUserGetAccessInformation200Response) GetCanviewusergradereportOk() (*bool, bool)`

GetCanviewusergradereportOk returns a tuple with the Canviewusergradereport field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewusergradereport

`func (o *GradereportUserGetAccessInformation200Response) SetCanviewusergradereport(v bool)`

SetCanviewusergradereport sets Canviewusergradereport field to given value.


### GetWarnings

`func (o *GradereportUserGetAccessInformation200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *GradereportUserGetAccessInformation200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *GradereportUserGetAccessInformation200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *GradereportUserGetAccessInformation200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


