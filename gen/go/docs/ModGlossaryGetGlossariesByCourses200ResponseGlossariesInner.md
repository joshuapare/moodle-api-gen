# ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Allowcomments** | Pointer to **int32** | If enabled, all participants with permission to create comments will be able to add comments to glossary entries | [optional] [default to null]
**Allowduplicatedentries** | Pointer to **int32** | If enabled, multiple entries can have the same concept name | [optional] [default to null]
**Allowprintview** | Pointer to **int32** | If enabled, students are provided with a link to a printer-friendly version of the glossary. The link is always available to teachers | [optional] [default to null]
**Approvaldisplayformat** | Pointer to **string** | When approving glossary items you may wish to use a different display format | [optional] [default to "null"]
**Assessed** | Pointer to **int32** | Aggregate type | [optional] [default to null]
**Assesstimefinish** | Pointer to **int32** | Restrict rating to items created before this | [optional] [default to null]
**Assesstimestart** | Pointer to **int32** | Restrict rating to items created after this | [optional] [default to null]
**Browsemodes** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Canaddentry** | Pointer to **int32** | Whether the user can add a new entry | [optional] [default to null]
**Completionentries** | Pointer to **int32** | Number of entries to complete | [optional] [default to null]
**Course** | Pointer to **int32** | Course id | [optional] 
**Coursemodule** | Pointer to **int32** | Course module id | [optional] 
**Defaultapproval** | Pointer to **int32** | If set to no, entries require approving by a teacher before they are viewable by everyone. | [optional] [default to null]
**Displayformat** | Pointer to **string** | Display format type | [optional] [default to "null"]
**Editalways** | Pointer to **int32** | Always allow editing | [optional] [default to null]
**Entbypage** | Pointer to **int32** | Entries shown per page | [optional] [default to null]
**Globalglossary** | Pointer to **int32** |  | [optional] 
**Groupingid** | Pointer to **int32** | Group id | [optional] 
**Groupmode** | Pointer to **int32** | Group mode | [optional] 
**Id** | Pointer to **int32** | Activity instance id | [optional] 
**Intro** | Pointer to **string** | Activity introduction | [optional] 
**Introfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**Mainglossary** | Pointer to **int32** | If enabled this glossary is a main glossary. | [optional] [default to null]
**Name** | Pointer to **string** | Activity name | [optional] 
**Rssarticles** | Pointer to **int32** | This setting specifies the number of glossary entry concepts to include in the RSS feed. Between 5 and 20 generally acceptable | [optional] [default to null]
**Rsstype** | Pointer to **int32** | To enable the RSS feed for this activity, select either concepts with author or concepts without author to be included in the feed | [optional] [default to null]
**Scale** | Pointer to **int32** | Scale ID | [optional] [default to null]
**Section** | Pointer to **int32** | Course section id | [optional] 
**Showall** | Pointer to **int32** | If enabled, participants can browse all entries at once | [optional] [default to null]
**Showalphabet** | Pointer to **int32** | If enabled, participants can browse the glossary by letters of the alphabet | [optional] [default to null]
**Showspecial** | Pointer to **int32** | If enabled, participants can browse the glossary by special characters, such as @ and # | [optional] [default to null]
**Timecreated** | Pointer to **int32** | Time created | [optional] 
**Timemodified** | Pointer to **int32** | Time modified | [optional] 
**Usedynalink** | Pointer to **int32** | If site-wide glossary auto-linking has been enabled by an administrator and this checkbox is ticked, the entry will be automatically linked wherever the concept words and phrases appear throughout the rest of the course. | [optional] [default to null]
**Visible** | Pointer to **bool** | Visible | [optional] 

## Methods

### NewModGlossaryGetGlossariesByCourses200ResponseGlossariesInner

`func NewModGlossaryGetGlossariesByCourses200ResponseGlossariesInner() *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner`

NewModGlossaryGetGlossariesByCourses200ResponseGlossariesInner instantiates a new ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetGlossariesByCourses200ResponseGlossariesInnerWithDefaults

`func NewModGlossaryGetGlossariesByCourses200ResponseGlossariesInnerWithDefaults() *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner`

NewModGlossaryGetGlossariesByCourses200ResponseGlossariesInnerWithDefaults instantiates a new ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAllowcomments

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetAllowcomments() int32`

GetAllowcomments returns the Allowcomments field if non-nil, zero value otherwise.

### GetAllowcommentsOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetAllowcommentsOk() (*int32, bool)`

GetAllowcommentsOk returns a tuple with the Allowcomments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowcomments

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetAllowcomments(v int32)`

SetAllowcomments sets Allowcomments field to given value.

### HasAllowcomments

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasAllowcomments() bool`

HasAllowcomments returns a boolean if a field has been set.

### GetAllowduplicatedentries

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetAllowduplicatedentries() int32`

GetAllowduplicatedentries returns the Allowduplicatedentries field if non-nil, zero value otherwise.

### GetAllowduplicatedentriesOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetAllowduplicatedentriesOk() (*int32, bool)`

GetAllowduplicatedentriesOk returns a tuple with the Allowduplicatedentries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowduplicatedentries

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetAllowduplicatedentries(v int32)`

SetAllowduplicatedentries sets Allowduplicatedentries field to given value.

### HasAllowduplicatedentries

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasAllowduplicatedentries() bool`

HasAllowduplicatedentries returns a boolean if a field has been set.

### GetAllowprintview

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetAllowprintview() int32`

GetAllowprintview returns the Allowprintview field if non-nil, zero value otherwise.

### GetAllowprintviewOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetAllowprintviewOk() (*int32, bool)`

GetAllowprintviewOk returns a tuple with the Allowprintview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowprintview

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetAllowprintview(v int32)`

SetAllowprintview sets Allowprintview field to given value.

### HasAllowprintview

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasAllowprintview() bool`

HasAllowprintview returns a boolean if a field has been set.

### GetApprovaldisplayformat

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetApprovaldisplayformat() string`

GetApprovaldisplayformat returns the Approvaldisplayformat field if non-nil, zero value otherwise.

### GetApprovaldisplayformatOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetApprovaldisplayformatOk() (*string, bool)`

GetApprovaldisplayformatOk returns a tuple with the Approvaldisplayformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApprovaldisplayformat

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetApprovaldisplayformat(v string)`

SetApprovaldisplayformat sets Approvaldisplayformat field to given value.

### HasApprovaldisplayformat

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasApprovaldisplayformat() bool`

HasApprovaldisplayformat returns a boolean if a field has been set.

### GetAssessed

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetAssessed() int32`

GetAssessed returns the Assessed field if non-nil, zero value otherwise.

### GetAssessedOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetAssessedOk() (*int32, bool)`

GetAssessedOk returns a tuple with the Assessed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssessed

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetAssessed(v int32)`

SetAssessed sets Assessed field to given value.

### HasAssessed

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasAssessed() bool`

HasAssessed returns a boolean if a field has been set.

### GetAssesstimefinish

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetAssesstimefinish() int32`

GetAssesstimefinish returns the Assesstimefinish field if non-nil, zero value otherwise.

### GetAssesstimefinishOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetAssesstimefinishOk() (*int32, bool)`

GetAssesstimefinishOk returns a tuple with the Assesstimefinish field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssesstimefinish

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetAssesstimefinish(v int32)`

SetAssesstimefinish sets Assesstimefinish field to given value.

### HasAssesstimefinish

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasAssesstimefinish() bool`

HasAssesstimefinish returns a boolean if a field has been set.

### GetAssesstimestart

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetAssesstimestart() int32`

GetAssesstimestart returns the Assesstimestart field if non-nil, zero value otherwise.

### GetAssesstimestartOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetAssesstimestartOk() (*int32, bool)`

GetAssesstimestartOk returns a tuple with the Assesstimestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssesstimestart

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetAssesstimestart(v int32)`

SetAssesstimestart sets Assesstimestart field to given value.

### HasAssesstimestart

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasAssesstimestart() bool`

HasAssesstimestart returns a boolean if a field has been set.

### GetBrowsemodes

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetBrowsemodes() []map[string]interface{}`

GetBrowsemodes returns the Browsemodes field if non-nil, zero value otherwise.

### GetBrowsemodesOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetBrowsemodesOk() (*[]map[string]interface{}, bool)`

GetBrowsemodesOk returns a tuple with the Browsemodes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrowsemodes

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetBrowsemodes(v []map[string]interface{})`

SetBrowsemodes sets Browsemodes field to given value.

### HasBrowsemodes

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasBrowsemodes() bool`

HasBrowsemodes returns a boolean if a field has been set.

### GetCanaddentry

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetCanaddentry() int32`

GetCanaddentry returns the Canaddentry field if non-nil, zero value otherwise.

### GetCanaddentryOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetCanaddentryOk() (*int32, bool)`

GetCanaddentryOk returns a tuple with the Canaddentry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanaddentry

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetCanaddentry(v int32)`

SetCanaddentry sets Canaddentry field to given value.

### HasCanaddentry

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasCanaddentry() bool`

HasCanaddentry returns a boolean if a field has been set.

### GetCompletionentries

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetCompletionentries() int32`

GetCompletionentries returns the Completionentries field if non-nil, zero value otherwise.

### GetCompletionentriesOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetCompletionentriesOk() (*int32, bool)`

GetCompletionentriesOk returns a tuple with the Completionentries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionentries

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetCompletionentries(v int32)`

SetCompletionentries sets Completionentries field to given value.

### HasCompletionentries

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasCompletionentries() bool`

HasCompletionentries returns a boolean if a field has been set.

### GetCourse

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetDefaultapproval

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetDefaultapproval() int32`

GetDefaultapproval returns the Defaultapproval field if non-nil, zero value otherwise.

### GetDefaultapprovalOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetDefaultapprovalOk() (*int32, bool)`

GetDefaultapprovalOk returns a tuple with the Defaultapproval field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultapproval

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetDefaultapproval(v int32)`

SetDefaultapproval sets Defaultapproval field to given value.

### HasDefaultapproval

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasDefaultapproval() bool`

HasDefaultapproval returns a boolean if a field has been set.

### GetDisplayformat

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetDisplayformat() string`

GetDisplayformat returns the Displayformat field if non-nil, zero value otherwise.

### GetDisplayformatOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetDisplayformatOk() (*string, bool)`

GetDisplayformatOk returns a tuple with the Displayformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayformat

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetDisplayformat(v string)`

SetDisplayformat sets Displayformat field to given value.

### HasDisplayformat

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasDisplayformat() bool`

HasDisplayformat returns a boolean if a field has been set.

### GetEditalways

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetEditalways() int32`

GetEditalways returns the Editalways field if non-nil, zero value otherwise.

### GetEditalwaysOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetEditalwaysOk() (*int32, bool)`

GetEditalwaysOk returns a tuple with the Editalways field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEditalways

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetEditalways(v int32)`

SetEditalways sets Editalways field to given value.

### HasEditalways

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasEditalways() bool`

HasEditalways returns a boolean if a field has been set.

### GetEntbypage

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetEntbypage() int32`

GetEntbypage returns the Entbypage field if non-nil, zero value otherwise.

### GetEntbypageOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetEntbypageOk() (*int32, bool)`

GetEntbypageOk returns a tuple with the Entbypage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntbypage

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetEntbypage(v int32)`

SetEntbypage sets Entbypage field to given value.

### HasEntbypage

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasEntbypage() bool`

HasEntbypage returns a boolean if a field has been set.

### GetGlobalglossary

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetGlobalglossary() int32`

GetGlobalglossary returns the Globalglossary field if non-nil, zero value otherwise.

### GetGlobalglossaryOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetGlobalglossaryOk() (*int32, bool)`

GetGlobalglossaryOk returns a tuple with the Globalglossary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGlobalglossary

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetGlobalglossary(v int32)`

SetGlobalglossary sets Globalglossary field to given value.

### HasGlobalglossary

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasGlobalglossary() bool`

HasGlobalglossary returns a boolean if a field has been set.

### GetGroupingid

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetGroupingid() int32`

GetGroupingid returns the Groupingid field if non-nil, zero value otherwise.

### GetGroupingidOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetGroupingidOk() (*int32, bool)`

GetGroupingidOk returns a tuple with the Groupingid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupingid

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetGroupingid(v int32)`

SetGroupingid sets Groupingid field to given value.

### HasGroupingid

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasGroupingid() bool`

HasGroupingid returns a boolean if a field has been set.

### GetGroupmode

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetGroupmode() int32`

GetGroupmode returns the Groupmode field if non-nil, zero value otherwise.

### GetGroupmodeOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetGroupmodeOk() (*int32, bool)`

GetGroupmodeOk returns a tuple with the Groupmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupmode

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetGroupmode(v int32)`

SetGroupmode sets Groupmode field to given value.

### HasGroupmode

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasGroupmode() bool`

HasGroupmode returns a boolean if a field has been set.

### GetId

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetIntrofiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetIntrofilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetIntrofiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetLang

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetMainglossary

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetMainglossary() int32`

GetMainglossary returns the Mainglossary field if non-nil, zero value otherwise.

### GetMainglossaryOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetMainglossaryOk() (*int32, bool)`

GetMainglossaryOk returns a tuple with the Mainglossary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMainglossary

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetMainglossary(v int32)`

SetMainglossary sets Mainglossary field to given value.

### HasMainglossary

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasMainglossary() bool`

HasMainglossary returns a boolean if a field has been set.

### GetName

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetRssarticles

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetRssarticles() int32`

GetRssarticles returns the Rssarticles field if non-nil, zero value otherwise.

### GetRssarticlesOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetRssarticlesOk() (*int32, bool)`

GetRssarticlesOk returns a tuple with the Rssarticles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRssarticles

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetRssarticles(v int32)`

SetRssarticles sets Rssarticles field to given value.

### HasRssarticles

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasRssarticles() bool`

HasRssarticles returns a boolean if a field has been set.

### GetRsstype

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetRsstype() int32`

GetRsstype returns the Rsstype field if non-nil, zero value otherwise.

### GetRsstypeOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetRsstypeOk() (*int32, bool)`

GetRsstypeOk returns a tuple with the Rsstype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRsstype

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetRsstype(v int32)`

SetRsstype sets Rsstype field to given value.

### HasRsstype

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasRsstype() bool`

HasRsstype returns a boolean if a field has been set.

### GetScale

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetScale() int32`

GetScale returns the Scale field if non-nil, zero value otherwise.

### GetScaleOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetScaleOk() (*int32, bool)`

GetScaleOk returns a tuple with the Scale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScale

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetScale(v int32)`

SetScale sets Scale field to given value.

### HasScale

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasScale() bool`

HasScale returns a boolean if a field has been set.

### GetSection

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetSection() int32`

GetSection returns the Section field if non-nil, zero value otherwise.

### GetSectionOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetSectionOk() (*int32, bool)`

GetSectionOk returns a tuple with the Section field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSection

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetSection(v int32)`

SetSection sets Section field to given value.

### HasSection

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasSection() bool`

HasSection returns a boolean if a field has been set.

### GetShowall

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetShowall() int32`

GetShowall returns the Showall field if non-nil, zero value otherwise.

### GetShowallOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetShowallOk() (*int32, bool)`

GetShowallOk returns a tuple with the Showall field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowall

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetShowall(v int32)`

SetShowall sets Showall field to given value.

### HasShowall

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasShowall() bool`

HasShowall returns a boolean if a field has been set.

### GetShowalphabet

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetShowalphabet() int32`

GetShowalphabet returns the Showalphabet field if non-nil, zero value otherwise.

### GetShowalphabetOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetShowalphabetOk() (*int32, bool)`

GetShowalphabetOk returns a tuple with the Showalphabet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowalphabet

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetShowalphabet(v int32)`

SetShowalphabet sets Showalphabet field to given value.

### HasShowalphabet

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasShowalphabet() bool`

HasShowalphabet returns a boolean if a field has been set.

### GetShowspecial

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetShowspecial() int32`

GetShowspecial returns the Showspecial field if non-nil, zero value otherwise.

### GetShowspecialOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetShowspecialOk() (*int32, bool)`

GetShowspecialOk returns a tuple with the Showspecial field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowspecial

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetShowspecial(v int32)`

SetShowspecial sets Showspecial field to given value.

### HasShowspecial

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasShowspecial() bool`

HasShowspecial returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUsedynalink

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetUsedynalink() int32`

GetUsedynalink returns the Usedynalink field if non-nil, zero value otherwise.

### GetUsedynalinkOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetUsedynalinkOk() (*int32, bool)`

GetUsedynalinkOk returns a tuple with the Usedynalink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsedynalink

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetUsedynalink(v int32)`

SetUsedynalink sets Usedynalink field to given value.

### HasUsedynalink

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasUsedynalink() bool`

HasUsedynalink returns a boolean if a field has been set.

### GetVisible

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) SetVisible(v bool)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


