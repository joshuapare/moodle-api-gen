<br>
<div align="center">
  <img src="https://moodle.com/wp-content/uploads/2024/02/Moodlelogo.svg" alt="Moodle" width="300">
  <h1 align="center" style="padding-top: 20px;">
    Moodle | PHP Client
  </h1>
</div>

<br>

<div align="center">
  <img alt="GitHub Release" src="https://img.shields.io/github/v/release/joshuapare/moodle-api-gen?include_prereleases&style=flat-square&color=f98012">
  <img alt="GitHub License" src="https://img.shields.io/github/license/joshuapare/moodle-api-gen?style=flat-square">
  <img alt="Built with Go" src="https://img.shields.io/badge/built_with-Go-007D9C.svg?style=flat-square">
</div>

<br>

<p align="center">
  <img alt="PHP" src="https://img.shields.io/badge/PHP-777BB4?style=for-the-badge&logo=php&logoColor=white" />
</p>
 

PHP Client for Moodle, generated from the relevant OpenAPI spec from the [moodle-api-gen](https://www.github.com/joshuapare/moodle-api-gen) project.

## Installation & Usage

### Requirements

PHP 7.4 and later.
Should also work with PHP 8.0.

### Composer

To install the bindings via [Composer](https://getcomposer.org/), add the following to `composer.json`:

```json
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/joshuapare/moodle-api-gen.git"
    }
  ],
  "require": {
    "joshuapare/moodle-api-gen": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
<?php
require_once('/path/to/OpenAPIClient-php/vendor/autoload.php');
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');

$apiInstance = new OpenAPI\Client\Api\AuthEmailApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->authEmailGetSignupSettings();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthEmailApi->authEmailGetSignupSettings: ', $e->getMessage(), PHP_EOL;
}

```

## API Endpoints

All URIs are relative to *https://localhost/webservice/restful/server.php*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthEmailApi* | [**authEmailGetSignupSettings**](docs/Api/AuthEmailApi.md#authemailgetsignupsettings) | **POST** /auth_email_get_signup_settings | Get the signup required settings and profile fields.
*AuthEmailApi* | [**authEmailSignupUser**](docs/Api/AuthEmailApi.md#authemailsignupuser) | **POST** /auth_email_signup_user | Adds a new user (pendingto be confirmed) in the site.
*BlockAccessreviewApi* | [**blockAccessreviewGetModuleData**](docs/Api/BlockAccessreviewApi.md#blockaccessreviewgetmoduledata) | **POST** /block_accessreview_get_module_data | Gets error data for course modules.
*BlockAccessreviewApi* | [**blockAccessreviewGetSectionData**](docs/Api/BlockAccessreviewApi.md#blockaccessreviewgetsectiondata) | **POST** /block_accessreview_get_section_data | Gets error data for course sections.
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminAllocateLicenses**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadminallocatelicenses) | **POST** /block_iomad_company_admin_allocate_licenses | Allocate course licenses to a user
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminAssignCourses**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadminassigncourses) | **POST** /block_iomad_company_admin_assign_courses | Assign a course to a company
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminAssignUsers**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadminassignusers) | **POST** /block_iomad_company_admin_assign_users | Assign users to a company
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminCapabilityDeleteTemplate**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadmincapabilitydeletetemplate) | **POST** /block_iomad_company_admin_capability_delete_template | Delete Iomad capabilities template
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminCheckToken**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadminchecktoken) | **POST** /block_iomad_company_admin_check_token | Check SSO token
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminCreateCompanies**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadmincreatecompanies) | **POST** /block_iomad_company_admin_create_companies | Create new Iomad companies
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminCreateLicenses**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadmincreatelicenses) | **POST** /block_iomad_company_admin_create_licenses | Create company licenses
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminDeleteLicenses**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadmindeletelicenses) | **POST** /block_iomad_company_admin_delete_licenses | Delete company licenses
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminEditCompanies**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadmineditcompanies) | **POST** /block_iomad_company_admin_edit_companies | Edit Iomad companies
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminEditLicenses**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadmineditlicenses) | **POST** /block_iomad_company_admin_edit_licenses | Edit company license settings
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminEnrolUsers**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadminenrolusers) | **POST** /block_iomad_company_admin_enrol_users | Assign users onto courses
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminGetCompanies**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadmingetcompanies) | **POST** /block_iomad_company_admin_get_companies | Get all Iomad companies
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminGetCompanyCourses**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadmingetcompanycourses) | **POST** /block_iomad_company_admin_get_company_courses | Get Iomad company course allocations
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminGetCourseInfo**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadmingetcourseinfo) | **POST** /block_iomad_company_admin_get_course_info | Get Iomad course settings
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminGetDepartmentUsers**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadmingetdepartmentusers) | **POST** /block_iomad_company_admin_get_department_users | Get users within a department
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminGetDepartments**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadmingetdepartments) | **POST** /block_iomad_company_admin_get_departments | Get all company departments
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminGetLicenseFromId**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadmingetlicensefromid) | **POST** /block_iomad_company_admin_get_license_from_id | Get licence data give the ID
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminGetLicenseInfo**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadmingetlicenseinfo) | **POST** /block_iomad_company_admin_get_license_info | Get company license information
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminMoveUsers**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadminmoveusers) | **POST** /block_iomad_company_admin_move_users | Move users between departments
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminRestrictCapability**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadminrestrictcapability) | **POST** /block_iomad_company_admin_restrict_capability | set/reset Iomad capability
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminSyncUsers**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadminsyncusers) | **POST** /block_iomad_company_admin_sync_users | Call update users to sync to external system
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminUnallocateLicenses**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadminunallocatelicenses) | **POST** /block_iomad_company_admin_unallocate_licenses | Remove course licenses from users
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminUnassignCourses**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadminunassigncourses) | **POST** /block_iomad_company_admin_unassign_courses | Unassign a course from a company
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminUnassignUsers**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadminunassignusers) | **POST** /block_iomad_company_admin_unassign_users | Unassign users from a company
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminUpdateCourses**](docs/Api/BlockIomadCompanyAdminApi.md#blockiomadcompanyadminupdatecourses) | **POST** /block_iomad_company_admin_update_courses | Update Iomad course settings
*BlockRecentlyaccesseditemsApi* | [**blockRecentlyaccesseditemsGetRecentItems**](docs/Api/BlockRecentlyaccesseditemsApi.md#blockrecentlyaccesseditemsgetrecentitems) | **POST** /block_recentlyaccesseditems_get_recent_items | List of items a user has accessed most recently.
*BlockStarredcoursesApi* | [**blockStarredcoursesGetStarredCourses**](docs/Api/BlockStarredcoursesApi.md#blockstarredcoursesgetstarredcourses) | **POST** /block_starredcourses_get_starred_courses | Get users starred courses.
*EnrolGuestApi* | [**enrolGuestGetInstanceInfo**](docs/Api/EnrolGuestApi.md#enrolguestgetinstanceinfo) | **POST** /enrol_guest_get_instance_info | Return guest enrolment instance information.
*EnrolGuestApi* | [**enrolGuestValidatePassword**](docs/Api/EnrolGuestApi.md#enrolguestvalidatepassword) | **POST** /enrol_guest_validate_password | Perform password validation.
*EnrolLicenseApi* | [**enrolLicenseEnrolUser**](docs/Api/EnrolLicenseApi.md#enrollicenseenroluser) | **POST** /enrol_license_enrol_user | License enrol the current user in the given course.
*EnrolLicenseApi* | [**enrolLicenseGetInstanceInfo**](docs/Api/EnrolLicenseApi.md#enrollicensegetinstanceinfo) | **POST** /enrol_license_get_instance_info | License enrolment instance information.
*EnrolManualApi* | [**enrolManualEnrolUsers**](docs/Api/EnrolManualApi.md#enrolmanualenrolusers) | **POST** /enrol_manual_enrol_users | Manual enrol users
*EnrolManualApi* | [**enrolManualUnenrolUsers**](docs/Api/EnrolManualApi.md#enrolmanualunenrolusers) | **POST** /enrol_manual_unenrol_users | Manual unenrol users
*EnrolMetaApi* | [**enrolMetaAddInstances**](docs/Api/EnrolMetaApi.md#enrolmetaaddinstances) | **POST** /enrol_meta_add_instances | Add meta enrolment instances
*EnrolMetaApi* | [**enrolMetaDeleteInstances**](docs/Api/EnrolMetaApi.md#enrolmetadeleteinstances) | **POST** /enrol_meta_delete_instances | Delete meta enrolment instances
*EnrolSelfApi* | [**enrolSelfEnrolUser**](docs/Api/EnrolSelfApi.md#enrolselfenroluser) | **POST** /enrol_self_enrol_user | Self enrol the current user in the given course.
*EnrolSelfApi* | [**enrolSelfGetInstanceInfo**](docs/Api/EnrolSelfApi.md#enrolselfgetinstanceinfo) | **POST** /enrol_self_get_instance_info | self enrolment instance information.
*GradereportGraderApi* | [**gradereportGraderGetUsersInReport**](docs/Api/GradereportGraderApi.md#gradereportgradergetusersinreport) | **POST** /gradereport_grader_get_users_in_report | Returns the dataset of users within the report
*GradereportOverviewApi* | [**gradereportOverviewGetCourseGrades**](docs/Api/GradereportOverviewApi.md#gradereportoverviewgetcoursegrades) | **POST** /gradereport_overview_get_course_grades | Get the given user courses final grades
*GradereportOverviewApi* | [**gradereportOverviewViewGradeReport**](docs/Api/GradereportOverviewApi.md#gradereportoverviewviewgradereport) | **POST** /gradereport_overview_view_grade_report | Trigger the report view event
*GradereportSingleviewApi* | [**gradereportSingleviewGetGradeItemsForSearchWidget**](docs/Api/GradereportSingleviewApi.md#gradereportsingleviewgetgradeitemsforsearchwidget) | **POST** /gradereport_singleview_get_grade_items_for_search_widget | Get the gradeitem/(s) for a course
*GradereportUserApi* | [**gradereportUserGetAccessInformation**](docs/Api/GradereportUserApi.md#gradereportusergetaccessinformation) | **POST** /gradereport_user_get_access_information | Returns user access information for the user grade report.
*GradereportUserApi* | [**gradereportUserGetGradeItems**](docs/Api/GradereportUserApi.md#gradereportusergetgradeitems) | **POST** /gradereport_user_get_grade_items | Returns the complete list of grade items for users in a course
*GradereportUserApi* | [**gradereportUserGetGradesTable**](docs/Api/GradereportUserApi.md#gradereportusergetgradestable) | **POST** /gradereport_user_get_grades_table | Get the user/s report grades table for a course
*GradereportUserApi* | [**gradereportUserViewGradeReport**](docs/Api/GradereportUserApi.md#gradereportuserviewgradereport) | **POST** /gradereport_user_view_grade_report | Trigger the report view event
*GradingformGuideApi* | [**gradingformGuideGraderGradingpanelFetch**](docs/Api/GradingformGuideApi.md#gradingformguidegradergradingpanelfetch) | **POST** /gradingform_guide_grader_gradingpanel_fetch | Fetch the data required to display the grader grading panel, creating the grade item if required
*GradingformGuideApi* | [**gradingformGuideGraderGradingpanelStore**](docs/Api/GradingformGuideApi.md#gradingformguidegradergradingpanelstore) | **POST** /gradingform_guide_grader_gradingpanel_store | Store the grading data for a user from the grader grading panel.
*GradingformRubricApi* | [**gradingformRubricGraderGradingpanelFetch**](docs/Api/GradingformRubricApi.md#gradingformrubricgradergradingpanelfetch) | **POST** /gradingform_rubric_grader_gradingpanel_fetch | Fetch the data required to display the grader grading panel, creating the grade item if required
*GradingformRubricApi* | [**gradingformRubricGraderGradingpanelStore**](docs/Api/GradingformRubricApi.md#gradingformrubricgradergradingpanelstore) | **POST** /gradingform_rubric_grader_gradingpanel_store | Store the grading data for a user from the grader grading panel.
*LocalIomadLearningpathApi* | [**localIomadLearningpathActivate**](docs/Api/LocalIomadLearningpathApi.md#localiomadlearningpathactivate) | **POST** /local_iomad_learningpath_activate | Activates / deactivates learning path
*LocalIomadLearningpathApi* | [**localIomadLearningpathAddcourses**](docs/Api/LocalIomadLearningpathApi.md#localiomadlearningpathaddcourses) | **POST** /local_iomad_learningpath_addcourses | Add courses to learning path
*LocalIomadLearningpathApi* | [**localIomadLearningpathAddusers**](docs/Api/LocalIomadLearningpathApi.md#localiomadlearningpathaddusers) | **POST** /local_iomad_learningpath_addusers | Add users to learning path
*LocalIomadLearningpathApi* | [**localIomadLearningpathCopypath**](docs/Api/LocalIomadLearningpathApi.md#localiomadlearningpathcopypath) | **POST** /local_iomad_learningpath_copypath | Copy a learning path
*LocalIomadLearningpathApi* | [**localIomadLearningpathDeletepath**](docs/Api/LocalIomadLearningpathApi.md#localiomadlearningpathdeletepath) | **POST** /local_iomad_learningpath_deletepath | Completely delete a learning path
*LocalIomadLearningpathApi* | [**localIomadLearningpathGetcourses**](docs/Api/LocalIomadLearningpathApi.md#localiomadlearningpathgetcourses) | **POST** /local_iomad_learningpath_getcourses | Read list of courses for given learning
*LocalIomadLearningpathApi* | [**localIomadLearningpathGetprospectivecourses**](docs/Api/LocalIomadLearningpathApi.md#localiomadlearningpathgetprospectivecourses) | **POST** /local_iomad_learningpath_getprospectivecourses | Read set of filtered courses for given company
*LocalIomadLearningpathApi* | [**localIomadLearningpathGetprospectiveusers**](docs/Api/LocalIomadLearningpathApi.md#localiomadlearningpathgetprospectiveusers) | **POST** /local_iomad_learningpath_getprospectiveusers | Get set of filtered users for given company
*LocalIomadLearningpathApi* | [**localIomadLearningpathGetusers**](docs/Api/LocalIomadLearningpathApi.md#localiomadlearningpathgetusers) | **POST** /local_iomad_learningpath_getusers | Get users assigned to path
*LocalIomadLearningpathApi* | [**localIomadLearningpathOrdercourses**](docs/Api/LocalIomadLearningpathApi.md#localiomadlearningpathordercourses) | **POST** /local_iomad_learningpath_ordercourses | Set sequence of courses in learning path
*LocalIomadLearningpathApi* | [**localIomadLearningpathRemovecourses**](docs/Api/LocalIomadLearningpathApi.md#localiomadlearningpathremovecourses) | **POST** /local_iomad_learningpath_removecourses | Remove courses from learning path
*LocalIomadLearningpathApi* | [**localIomadLearningpathRemoveusers**](docs/Api/LocalIomadLearningpathApi.md#localiomadlearningpathremoveusers) | **POST** /local_iomad_learningpath_removeusers | Remove users from learning path
*MediaVideojsApi* | [**mediaVideojsGetLanguage**](docs/Api/MediaVideojsApi.md#mediavideojsgetlanguage) | **POST** /media_videojs_get_language | get language.
*MessageAirnotifierApi* | [**messageAirnotifierAreNotificationPreferencesConfigured**](docs/Api/MessageAirnotifierApi.md#messageairnotifierarenotificationpreferencesconfigured) | **POST** /message_airnotifier_are_notification_preferences_configured | Check if the users have notification preferences configured yet
*MessageAirnotifierApi* | [**messageAirnotifierEnableDevice**](docs/Api/MessageAirnotifierApi.md#messageairnotifierenabledevice) | **POST** /message_airnotifier_enable_device | Enables or disables a registered user device so it can receive Push notifications
*MessageAirnotifierApi* | [**messageAirnotifierGetUserDevices**](docs/Api/MessageAirnotifierApi.md#messageairnotifiergetuserdevices) | **POST** /message_airnotifier_get_user_devices | Return the list of mobile devices that are registered in Moodle for the given user
*MessageAirnotifierApi* | [**messageAirnotifierIsSystemConfigured**](docs/Api/MessageAirnotifierApi.md#messageairnotifierissystemconfigured) | **POST** /message_airnotifier_is_system_configured | Check whether the airnotifier settings have been configured
*MessagePopupApi* | [**messagePopupGetPopupNotifications**](docs/Api/MessagePopupApi.md#messagepopupgetpopupnotifications) | **POST** /message_popup_get_popup_notifications | Retrieve a list of popup notifications for a user
*MessagePopupApi* | [**messagePopupGetUnreadPopupNotificationCount**](docs/Api/MessagePopupApi.md#messagepopupgetunreadpopupnotificationcount) | **POST** /message_popup_get_unread_popup_notification_count | Retrieve the count of unread popup notifications for a given user
*ModAssignApi* | [**modAssignCopyPreviousAttempt**](docs/Api/ModAssignApi.md#modassigncopypreviousattempt) | **POST** /mod_assign_copy_previous_attempt | Copy a students previous attempt to a new attempt.
*ModAssignApi* | [**modAssignGetAssignments**](docs/Api/ModAssignApi.md#modassigngetassignments) | **POST** /mod_assign_get_assignments | Returns the courses and assignments for the users capability
*ModAssignApi* | [**modAssignGetGrades**](docs/Api/ModAssignApi.md#modassigngetgrades) | **POST** /mod_assign_get_grades | Returns grades from the assignment
*ModAssignApi* | [**modAssignGetParticipant**](docs/Api/ModAssignApi.md#modassigngetparticipant) | **POST** /mod_assign_get_participant | Get a participant for an assignment, with some summary info about their submissions.
*ModAssignApi* | [**modAssignGetSubmissionStatus**](docs/Api/ModAssignApi.md#modassigngetsubmissionstatus) | **POST** /mod_assign_get_submission_status | Returns information about an assignment submission status for a given user.
*ModAssignApi* | [**modAssignGetSubmissions**](docs/Api/ModAssignApi.md#modassigngetsubmissions) | **POST** /mod_assign_get_submissions | Returns the submissions for assignments
*ModAssignApi* | [**modAssignGetUserFlags**](docs/Api/ModAssignApi.md#modassigngetuserflags) | **POST** /mod_assign_get_user_flags | Returns the user flags for assignments
*ModAssignApi* | [**modAssignGetUserMappings**](docs/Api/ModAssignApi.md#modassigngetusermappings) | **POST** /mod_assign_get_user_mappings | Returns the blind marking mappings for assignments
*ModAssignApi* | [**modAssignListParticipants**](docs/Api/ModAssignApi.md#modassignlistparticipants) | **POST** /mod_assign_list_participants | List the participants for a single assignment, with some summary info about their submissions.
*ModAssignApi* | [**modAssignLockSubmissions**](docs/Api/ModAssignApi.md#modassignlocksubmissions) | **POST** /mod_assign_lock_submissions | Prevent students from making changes to a list of submissions
*ModAssignApi* | [**modAssignRevealIdentities**](docs/Api/ModAssignApi.md#modassignrevealidentities) | **POST** /mod_assign_reveal_identities | Reveal the identities for a blind marking assignment
*ModAssignApi* | [**modAssignRevertSubmissionsToDraft**](docs/Api/ModAssignApi.md#modassignrevertsubmissionstodraft) | **POST** /mod_assign_revert_submissions_to_draft | Reverts the list of submissions to draft status
*ModAssignApi* | [**modAssignSaveGrade**](docs/Api/ModAssignApi.md#modassignsavegrade) | **POST** /mod_assign_save_grade | Save a grade update for a single student.
*ModAssignApi* | [**modAssignSaveGrades**](docs/Api/ModAssignApi.md#modassignsavegrades) | **POST** /mod_assign_save_grades | Save multiple grade updates for an assignment.
*ModAssignApi* | [**modAssignSaveSubmission**](docs/Api/ModAssignApi.md#modassignsavesubmission) | **POST** /mod_assign_save_submission | Update the current students submission
*ModAssignApi* | [**modAssignSaveUserExtensions**](docs/Api/ModAssignApi.md#modassignsaveuserextensions) | **POST** /mod_assign_save_user_extensions | Save a list of assignment extensions
*ModAssignApi* | [**modAssignSetUserFlags**](docs/Api/ModAssignApi.md#modassignsetuserflags) | **POST** /mod_assign_set_user_flags | Creates or updates user flags
*ModAssignApi* | [**modAssignStartSubmission**](docs/Api/ModAssignApi.md#modassignstartsubmission) | **POST** /mod_assign_start_submission | Start a submission for user if assignment has a time limit.
*ModAssignApi* | [**modAssignSubmitForGrading**](docs/Api/ModAssignApi.md#modassignsubmitforgrading) | **POST** /mod_assign_submit_for_grading | Submit the current students assignment for grading
*ModAssignApi* | [**modAssignSubmitGradingForm**](docs/Api/ModAssignApi.md#modassignsubmitgradingform) | **POST** /mod_assign_submit_grading_form | Submit the grading form data via ajax
*ModAssignApi* | [**modAssignUnlockSubmissions**](docs/Api/ModAssignApi.md#modassignunlocksubmissions) | **POST** /mod_assign_unlock_submissions | Allow students to make changes to a list of submissions
*ModAssignApi* | [**modAssignViewAssign**](docs/Api/ModAssignApi.md#modassignviewassign) | **POST** /mod_assign_view_assign | Update the module completion status.
*ModAssignApi* | [**modAssignViewGradingTable**](docs/Api/ModAssignApi.md#modassignviewgradingtable) | **POST** /mod_assign_view_grading_table | Trigger the grading_table_viewed event.
*ModAssignApi* | [**modAssignViewSubmissionStatus**](docs/Api/ModAssignApi.md#modassignviewsubmissionstatus) | **POST** /mod_assign_view_submission_status | Trigger the submission status viewed event.
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnCanJoin**](docs/Api/ModBigbluebuttonbnApi.md#modbigbluebuttonbncanjoin) | **POST** /mod_bigbluebuttonbn_can_join | Returns information if the current user can join or not.
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnCompletionValidate**](docs/Api/ModBigbluebuttonbnApi.md#modbigbluebuttonbncompletionvalidate) | **POST** /mod_bigbluebuttonbn_completion_validate | Validate completion
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnEndMeeting**](docs/Api/ModBigbluebuttonbnApi.md#modbigbluebuttonbnendmeeting) | **POST** /mod_bigbluebuttonbn_end_meeting | End a meeting
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnGetBigbluebuttonbnsByCourses**](docs/Api/ModBigbluebuttonbnApi.md#modbigbluebuttonbngetbigbluebuttonbnsbycourses) | **POST** /mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses | Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnGetJoinUrl**](docs/Api/ModBigbluebuttonbnApi.md#modbigbluebuttonbngetjoinurl) | **POST** /mod_bigbluebuttonbn_get_join_url | Get the join URL for the meeting and create if it does not exist.
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnGetRecordings**](docs/Api/ModBigbluebuttonbnApi.md#modbigbluebuttonbngetrecordings) | **POST** /mod_bigbluebuttonbn_get_recordings | Returns a list of recordings ready to be processed by a datatable.
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnGetRecordingsToImport**](docs/Api/ModBigbluebuttonbnApi.md#modbigbluebuttonbngetrecordingstoimport) | **POST** /mod_bigbluebuttonbn_get_recordings_to_import | Returns a list of recordings ready to import to be processed by a datatable.
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnMeetingInfo**](docs/Api/ModBigbluebuttonbnApi.md#modbigbluebuttonbnmeetinginfo) | **POST** /mod_bigbluebuttonbn_meeting_info | Get displayable information on the meeting
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnUpdateRecording**](docs/Api/ModBigbluebuttonbnApi.md#modbigbluebuttonbnupdaterecording) | **POST** /mod_bigbluebuttonbn_update_recording | Update a single recording
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnViewBigbluebuttonbn**](docs/Api/ModBigbluebuttonbnApi.md#modbigbluebuttonbnviewbigbluebuttonbn) | **POST** /mod_bigbluebuttonbn_view_bigbluebuttonbn | Trigger the course module viewed event and update the module completion status.
*ModBookApi* | [**modBookGetBooksByCourses**](docs/Api/ModBookApi.md#modbookgetbooksbycourses) | **POST** /mod_book_get_books_by_courses | Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.
*ModBookApi* | [**modBookViewBook**](docs/Api/ModBookApi.md#modbookviewbook) | **POST** /mod_book_view_book | Simulate the view.php web interface book: trigger events, completion, etc...
*ModChatApi* | [**modChatGetChatLatestMessages**](docs/Api/ModChatApi.md#modchatgetchatlatestmessages) | **POST** /mod_chat_get_chat_latest_messages | Get the latest messages from the given chat session.
*ModChatApi* | [**modChatGetChatUsers**](docs/Api/ModChatApi.md#modchatgetchatusers) | **POST** /mod_chat_get_chat_users | Get the list of users in the given chat session.
*ModChatApi* | [**modChatGetChatsByCourses**](docs/Api/ModChatApi.md#modchatgetchatsbycourses) | **POST** /mod_chat_get_chats_by_courses | Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.
*ModChatApi* | [**modChatGetSessionMessages**](docs/Api/ModChatApi.md#modchatgetsessionmessages) | **POST** /mod_chat_get_session_messages | Retrieves messages of the given chat session.
*ModChatApi* | [**modChatGetSessions**](docs/Api/ModChatApi.md#modchatgetsessions) | **POST** /mod_chat_get_sessions | Retrieves chat sessions for a given chat.
*ModChatApi* | [**modChatLoginUser**](docs/Api/ModChatApi.md#modchatloginuser) | **POST** /mod_chat_login_user | Log a user into a chat room in the given chat.
*ModChatApi* | [**modChatSendChatMessage**](docs/Api/ModChatApi.md#modchatsendchatmessage) | **POST** /mod_chat_send_chat_message | Send a message on the given chat session.
*ModChatApi* | [**modChatViewChat**](docs/Api/ModChatApi.md#modchatviewchat) | **POST** /mod_chat_view_chat | Trigger the course module viewed event and update the module completion status.
*ModChatApi* | [**modChatViewSessions**](docs/Api/ModChatApi.md#modchatviewsessions) | **POST** /mod_chat_view_sessions | Trigger the chat session viewed event.
*ModChoiceApi* | [**modChoiceDeleteChoiceResponses**](docs/Api/ModChoiceApi.md#modchoicedeletechoiceresponses) | **POST** /mod_choice_delete_choice_responses | Delete the given submitted responses in a choice
*ModChoiceApi* | [**modChoiceGetChoiceOptions**](docs/Api/ModChoiceApi.md#modchoicegetchoiceoptions) | **POST** /mod_choice_get_choice_options | Retrieve options for a specific choice.
*ModChoiceApi* | [**modChoiceGetChoiceResults**](docs/Api/ModChoiceApi.md#modchoicegetchoiceresults) | **POST** /mod_choice_get_choice_results | Retrieve users results for a given choice.
*ModChoiceApi* | [**modChoiceGetChoicesByCourses**](docs/Api/ModChoiceApi.md#modchoicegetchoicesbycourses) | **POST** /mod_choice_get_choices_by_courses | Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.
*ModChoiceApi* | [**modChoiceSubmitChoiceResponse**](docs/Api/ModChoiceApi.md#modchoicesubmitchoiceresponse) | **POST** /mod_choice_submit_choice_response | Submit responses to a specific choice item.
*ModChoiceApi* | [**modChoiceViewChoice**](docs/Api/ModChoiceApi.md#modchoiceviewchoice) | **POST** /mod_choice_view_choice | Trigger the course module viewed event and update the module completion status.
*ModDataApi* | [**modDataAddEntry**](docs/Api/ModDataApi.md#moddataaddentry) | **POST** /mod_data_add_entry | Adds a new entry.
*ModDataApi* | [**modDataApproveEntry**](docs/Api/ModDataApi.md#moddataapproveentry) | **POST** /mod_data_approve_entry | Approves or unapproves an entry.
*ModDataApi* | [**modDataDeleteEntry**](docs/Api/ModDataApi.md#moddatadeleteentry) | **POST** /mod_data_delete_entry | Deletes an entry.
*ModDataApi* | [**modDataDeleteSavedPreset**](docs/Api/ModDataApi.md#moddatadeletesavedpreset) | **POST** /mod_data_delete_saved_preset | Delete site user preset.
*ModDataApi* | [**modDataGetDataAccessInformation**](docs/Api/ModDataApi.md#moddatagetdataaccessinformation) | **POST** /mod_data_get_data_access_information | Return access information for a given database.
*ModDataApi* | [**modDataGetDatabasesByCourses**](docs/Api/ModDataApi.md#moddatagetdatabasesbycourses) | **POST** /mod_data_get_databases_by_courses | Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.
*ModDataApi* | [**modDataGetEntries**](docs/Api/ModDataApi.md#moddatagetentries) | **POST** /mod_data_get_entries | Return the complete list of entries of the given database.
*ModDataApi* | [**modDataGetEntry**](docs/Api/ModDataApi.md#moddatagetentry) | **POST** /mod_data_get_entry | Return one entry record from the database, including contents optionally.
*ModDataApi* | [**modDataGetFields**](docs/Api/ModDataApi.md#moddatagetfields) | **POST** /mod_data_get_fields | Return the list of configured fields for the given database.
*ModDataApi* | [**modDataGetMappingInformation**](docs/Api/ModDataApi.md#moddatagetmappinginformation) | **POST** /mod_data_get_mapping_information | Get importing information
*ModDataApi* | [**modDataSearchEntries**](docs/Api/ModDataApi.md#moddatasearchentries) | **POST** /mod_data_search_entries | Search for entries in the given database.
*ModDataApi* | [**modDataUpdateEntry**](docs/Api/ModDataApi.md#moddataupdateentry) | **POST** /mod_data_update_entry | Updates an existing entry.
*ModDataApi* | [**modDataViewDatabase**](docs/Api/ModDataApi.md#moddataviewdatabase) | **POST** /mod_data_view_database | Simulate the view.php web interface data: trigger events, completion, etc...
*ModFeedbackApi* | [**modFeedbackGetAnalysis**](docs/Api/ModFeedbackApi.md#modfeedbackgetanalysis) | **POST** /mod_feedback_get_analysis | Retrieves the feedback analysis.
*ModFeedbackApi* | [**modFeedbackGetCurrentCompletedTmp**](docs/Api/ModFeedbackApi.md#modfeedbackgetcurrentcompletedtmp) | **POST** /mod_feedback_get_current_completed_tmp | Returns the temporary completion record for the current user.
*ModFeedbackApi* | [**modFeedbackGetFeedbackAccessInformation**](docs/Api/ModFeedbackApi.md#modfeedbackgetfeedbackaccessinformation) | **POST** /mod_feedback_get_feedback_access_information | Return access information for a given feedback.
*ModFeedbackApi* | [**modFeedbackGetFeedbacksByCourses**](docs/Api/ModFeedbackApi.md#modfeedbackgetfeedbacksbycourses) | **POST** /mod_feedback_get_feedbacks_by_courses | Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.
*ModFeedbackApi* | [**modFeedbackGetFinishedResponses**](docs/Api/ModFeedbackApi.md#modfeedbackgetfinishedresponses) | **POST** /mod_feedback_get_finished_responses | Retrieves responses from the last finished attempt.
*ModFeedbackApi* | [**modFeedbackGetItems**](docs/Api/ModFeedbackApi.md#modfeedbackgetitems) | **POST** /mod_feedback_get_items | Returns the items (questions) in the given feedback.
*ModFeedbackApi* | [**modFeedbackGetLastCompleted**](docs/Api/ModFeedbackApi.md#modfeedbackgetlastcompleted) | **POST** /mod_feedback_get_last_completed | Retrieves the last completion record for the current user.
*ModFeedbackApi* | [**modFeedbackGetNonRespondents**](docs/Api/ModFeedbackApi.md#modfeedbackgetnonrespondents) | **POST** /mod_feedback_get_non_respondents | Retrieves a list of students who didn&#39;t submit the feedback.
*ModFeedbackApi* | [**modFeedbackGetPageItems**](docs/Api/ModFeedbackApi.md#modfeedbackgetpageitems) | **POST** /mod_feedback_get_page_items | Get a single feedback page items.
*ModFeedbackApi* | [**modFeedbackGetResponsesAnalysis**](docs/Api/ModFeedbackApi.md#modfeedbackgetresponsesanalysis) | **POST** /mod_feedback_get_responses_analysis | Return the feedback user responses analysis.
*ModFeedbackApi* | [**modFeedbackGetUnfinishedResponses**](docs/Api/ModFeedbackApi.md#modfeedbackgetunfinishedresponses) | **POST** /mod_feedback_get_unfinished_responses | Retrieves responses from the current unfinished attempt.
*ModFeedbackApi* | [**modFeedbackLaunchFeedback**](docs/Api/ModFeedbackApi.md#modfeedbacklaunchfeedback) | **POST** /mod_feedback_launch_feedback | Starts or continues a feedback submission.
*ModFeedbackApi* | [**modFeedbackProcessPage**](docs/Api/ModFeedbackApi.md#modfeedbackprocesspage) | **POST** /mod_feedback_process_page | Process a jump between pages.
*ModFeedbackApi* | [**modFeedbackViewFeedback**](docs/Api/ModFeedbackApi.md#modfeedbackviewfeedback) | **POST** /mod_feedback_view_feedback | Trigger the course module viewed event and update the module completion status.
*ModFolderApi* | [**modFolderGetFoldersByCourses**](docs/Api/ModFolderApi.md#modfoldergetfoldersbycourses) | **POST** /mod_folder_get_folders_by_courses | Returns a list of folders in a provided list of courses, if no list is provided all folders that                             the user can view will be returned. Please note that this WS is not returning the folder contents.
*ModFolderApi* | [**modFolderViewFolder**](docs/Api/ModFolderApi.md#modfolderviewfolder) | **POST** /mod_folder_view_folder | Simulate the view.php web interface folder: trigger events, completion, etc...
*ModForumApi* | [**modForumAddDiscussion**](docs/Api/ModForumApi.md#modforumadddiscussion) | **POST** /mod_forum_add_discussion | Add a new discussion into an existing forum.
*ModForumApi* | [**modForumAddDiscussionPost**](docs/Api/ModForumApi.md#modforumadddiscussionpost) | **POST** /mod_forum_add_discussion_post | Create new posts into an existing discussion.
*ModForumApi* | [**modForumCanAddDiscussion**](docs/Api/ModForumApi.md#modforumcanadddiscussion) | **POST** /mod_forum_can_add_discussion | Check if the current user can add discussions in the given forum (and optionally for the given group).
*ModForumApi* | [**modForumDeletePost**](docs/Api/ModForumApi.md#modforumdeletepost) | **POST** /mod_forum_delete_post | Deletes a post or a discussion completely when the post is the discussion topic.
*ModForumApi* | [**modForumGetDiscussionPost**](docs/Api/ModForumApi.md#modforumgetdiscussionpost) | **POST** /mod_forum_get_discussion_post | Get a particular discussion post.
*ModForumApi* | [**modForumGetDiscussionPosts**](docs/Api/ModForumApi.md#modforumgetdiscussionposts) | **POST** /mod_forum_get_discussion_posts | Returns a list of forum posts for a discussion.
*ModForumApi* | [**modForumGetDiscussionPostsByUserid**](docs/Api/ModForumApi.md#modforumgetdiscussionpostsbyuserid) | **POST** /mod_forum_get_discussion_posts_by_userid | Returns a list of forum posts for a discussion for a user.
*ModForumApi* | [**modForumGetForumAccessInformation**](docs/Api/ModForumApi.md#modforumgetforumaccessinformation) | **POST** /mod_forum_get_forum_access_information | Return capabilities information for a given forum.
*ModForumApi* | [**modForumGetForumDiscussions**](docs/Api/ModForumApi.md#modforumgetforumdiscussions) | **POST** /mod_forum_get_forum_discussions | Returns a list of forum discussions optionally sorted and paginated.
*ModForumApi* | [**modForumGetForumDiscussionsPaginated**](docs/Api/ModForumApi.md#modforumgetforumdiscussionspaginated) | **POST** /mod_forum_get_forum_discussions_paginated | ** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.
*ModForumApi* | [**modForumGetForumsByCourses**](docs/Api/ModForumApi.md#modforumgetforumsbycourses) | **POST** /mod_forum_get_forums_by_courses | Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.
*ModForumApi* | [**modForumPrepareDraftAreaForPost**](docs/Api/ModForumApi.md#modforumpreparedraftareaforpost) | **POST** /mod_forum_prepare_draft_area_for_post | Prepares a draft area for editing a post.
*ModForumApi* | [**modForumSetLockState**](docs/Api/ModForumApi.md#modforumsetlockstate) | **POST** /mod_forum_set_lock_state | Set the lock state for the discussion
*ModForumApi* | [**modForumSetPinState**](docs/Api/ModForumApi.md#modforumsetpinstate) | **POST** /mod_forum_set_pin_state | Set the pin state
*ModForumApi* | [**modForumSetSubscriptionState**](docs/Api/ModForumApi.md#modforumsetsubscriptionstate) | **POST** /mod_forum_set_subscription_state | Set the subscription state
*ModForumApi* | [**modForumToggleFavouriteState**](docs/Api/ModForumApi.md#modforumtogglefavouritestate) | **POST** /mod_forum_toggle_favourite_state | Toggle the favourite state
*ModForumApi* | [**modForumUpdateDiscussionPost**](docs/Api/ModForumApi.md#modforumupdatediscussionpost) | **POST** /mod_forum_update_discussion_post | Updates a post or a discussion topic post.
*ModForumApi* | [**modForumViewForum**](docs/Api/ModForumApi.md#modforumviewforum) | **POST** /mod_forum_view_forum | Trigger the course module viewed event and update the module completion status.
*ModForumApi* | [**modForumViewForumDiscussion**](docs/Api/ModForumApi.md#modforumviewforumdiscussion) | **POST** /mod_forum_view_forum_discussion | Trigger the forum discussion viewed event.
*ModGlossaryApi* | [**modGlossaryAddEntry**](docs/Api/ModGlossaryApi.md#modglossaryaddentry) | **POST** /mod_glossary_add_entry | Add a new entry to a given glossary
*ModGlossaryApi* | [**modGlossaryDeleteEntry**](docs/Api/ModGlossaryApi.md#modglossarydeleteentry) | **POST** /mod_glossary_delete_entry | Delete the given entry from the glossary.
*ModGlossaryApi* | [**modGlossaryGetAuthors**](docs/Api/ModGlossaryApi.md#modglossarygetauthors) | **POST** /mod_glossary_get_authors | Get the authors.
*ModGlossaryApi* | [**modGlossaryGetCategories**](docs/Api/ModGlossaryApi.md#modglossarygetcategories) | **POST** /mod_glossary_get_categories | Get the categories.
*ModGlossaryApi* | [**modGlossaryGetEntriesByAuthor**](docs/Api/ModGlossaryApi.md#modglossarygetentriesbyauthor) | **POST** /mod_glossary_get_entries_by_author | Browse entries by author.
*ModGlossaryApi* | [**modGlossaryGetEntriesByAuthorId**](docs/Api/ModGlossaryApi.md#modglossarygetentriesbyauthorid) | **POST** /mod_glossary_get_entries_by_author_id | Browse entries by author ID.
*ModGlossaryApi* | [**modGlossaryGetEntriesByCategory**](docs/Api/ModGlossaryApi.md#modglossarygetentriesbycategory) | **POST** /mod_glossary_get_entries_by_category | Browse entries by category.
*ModGlossaryApi* | [**modGlossaryGetEntriesByDate**](docs/Api/ModGlossaryApi.md#modglossarygetentriesbydate) | **POST** /mod_glossary_get_entries_by_date | Browse entries by date.
*ModGlossaryApi* | [**modGlossaryGetEntriesByLetter**](docs/Api/ModGlossaryApi.md#modglossarygetentriesbyletter) | **POST** /mod_glossary_get_entries_by_letter | Browse entries by letter.
*ModGlossaryApi* | [**modGlossaryGetEntriesBySearch**](docs/Api/ModGlossaryApi.md#modglossarygetentriesbysearch) | **POST** /mod_glossary_get_entries_by_search | Browse entries by search query.
*ModGlossaryApi* | [**modGlossaryGetEntriesByTerm**](docs/Api/ModGlossaryApi.md#modglossarygetentriesbyterm) | **POST** /mod_glossary_get_entries_by_term | Browse entries by term (concept or alias).
*ModGlossaryApi* | [**modGlossaryGetEntriesToApprove**](docs/Api/ModGlossaryApi.md#modglossarygetentriestoapprove) | **POST** /mod_glossary_get_entries_to_approve | Browse entries to be approved.
*ModGlossaryApi* | [**modGlossaryGetEntryById**](docs/Api/ModGlossaryApi.md#modglossarygetentrybyid) | **POST** /mod_glossary_get_entry_by_id | Get an entry by ID
*ModGlossaryApi* | [**modGlossaryGetGlossariesByCourses**](docs/Api/ModGlossaryApi.md#modglossarygetglossariesbycourses) | **POST** /mod_glossary_get_glossaries_by_courses | Retrieve a list of glossaries from several courses.
*ModGlossaryApi* | [**modGlossaryPrepareEntryForEdition**](docs/Api/ModGlossaryApi.md#modglossaryprepareentryforedition) | **POST** /mod_glossary_prepare_entry_for_edition | Prepares the given entry for edition returning draft item areas and file areas information.
*ModGlossaryApi* | [**modGlossaryUpdateEntry**](docs/Api/ModGlossaryApi.md#modglossaryupdateentry) | **POST** /mod_glossary_update_entry | Updates the given glossary entry.
*ModGlossaryApi* | [**modGlossaryViewEntry**](docs/Api/ModGlossaryApi.md#modglossaryviewentry) | **POST** /mod_glossary_view_entry | Notify a glossary entry as being viewed.
*ModGlossaryApi* | [**modGlossaryViewGlossary**](docs/Api/ModGlossaryApi.md#modglossaryviewglossary) | **POST** /mod_glossary_view_glossary | Notify the glossary as being viewed.
*ModH5pactivityApi* | [**modH5pactivityGetAttempts**](docs/Api/ModH5pactivityApi.md#modh5pactivitygetattempts) | **POST** /mod_h5pactivity_get_attempts | Return the information needed to list a user attempts.
*ModH5pactivityApi* | [**modH5pactivityGetH5pactivitiesByCourses**](docs/Api/ModH5pactivityApi.md#modh5pactivitygeth5pactivitiesbycourses) | **POST** /mod_h5pactivity_get_h5pactivities_by_courses | Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.
*ModH5pactivityApi* | [**modH5pactivityGetH5pactivityAccessInformation**](docs/Api/ModH5pactivityApi.md#modh5pactivitygeth5pactivityaccessinformation) | **POST** /mod_h5pactivity_get_h5pactivity_access_information | Return access information for a given h5p activity.
*ModH5pactivityApi* | [**modH5pactivityGetResults**](docs/Api/ModH5pactivityApi.md#modh5pactivitygetresults) | **POST** /mod_h5pactivity_get_results | Return the information needed to list a user attempt results.
*ModH5pactivityApi* | [**modH5pactivityGetUserAttempts**](docs/Api/ModH5pactivityApi.md#modh5pactivitygetuserattempts) | **POST** /mod_h5pactivity_get_user_attempts | Return the information needed to list all enrolled user attempts.
*ModH5pactivityApi* | [**modH5pactivityLogReportViewed**](docs/Api/ModH5pactivityApi.md#modh5pactivitylogreportviewed) | **POST** /mod_h5pactivity_log_report_viewed | Log that the h5pactivity was viewed.
*ModH5pactivityApi* | [**modH5pactivityViewH5pactivity**](docs/Api/ModH5pactivityApi.md#modh5pactivityviewh5pactivity) | **POST** /mod_h5pactivity_view_h5pactivity | Trigger the course module viewed event and update the module completion status.
*ModImscpApi* | [**modImscpGetImscpsByCourses**](docs/Api/ModImscpApi.md#modimscpgetimscpsbycourses) | **POST** /mod_imscp_get_imscps_by_courses | Returns a list of IMSCP instances in a provided set of courses,                             if no courses are provided then all the IMSCP instances the user has access to will be returned.
*ModImscpApi* | [**modImscpViewImscp**](docs/Api/ModImscpApi.md#modimscpviewimscp) | **POST** /mod_imscp_view_imscp | Simulate the view.php web interface imscp: trigger events, completion, etc...
*ModIomadcertificateApi* | [**modIomadcertificateGetIomadcertificatesByCourses**](docs/Api/ModIomadcertificateApi.md#modiomadcertificategetiomadcertificatesbycourses) | **POST** /mod_iomadcertificate_get_iomadcertificates_by_courses | Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.
*ModIomadcertificateApi* | [**modIomadcertificateGetIssuedIomadcertificates**](docs/Api/ModIomadcertificateApi.md#modiomadcertificategetissuediomadcertificates) | **POST** /mod_iomadcertificate_get_issued_iomadcertificates | Get the list of issued iomadcertificates for the current user.
*ModIomadcertificateApi* | [**modIomadcertificateIssueIomadcertificate**](docs/Api/ModIomadcertificateApi.md#modiomadcertificateissueiomadcertificate) | **POST** /mod_iomadcertificate_issue_iomadcertificate | Create new iomadcertificate record, or return existing record for the current user.
*ModIomadcertificateApi* | [**modIomadcertificateViewIomadcertificate**](docs/Api/ModIomadcertificateApi.md#modiomadcertificateviewiomadcertificate) | **POST** /mod_iomadcertificate_view_iomadcertificate | Trigger the course module viewed event and update the module completion status.
*ModLabelApi* | [**modLabelGetLabelsByCourses**](docs/Api/ModLabelApi.md#modlabelgetlabelsbycourses) | **POST** /mod_label_get_labels_by_courses | Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.
*ModLessonApi* | [**modLessonFinishAttempt**](docs/Api/ModLessonApi.md#modlessonfinishattempt) | **POST** /mod_lesson_finish_attempt | Finishes the current attempt.
*ModLessonApi* | [**modLessonGetAttemptsOverview**](docs/Api/ModLessonApi.md#modlessongetattemptsoverview) | **POST** /mod_lesson_get_attempts_overview | Get a list of all the attempts made by users in a lesson.
*ModLessonApi* | [**modLessonGetContentPagesViewed**](docs/Api/ModLessonApi.md#modlessongetcontentpagesviewed) | **POST** /mod_lesson_get_content_pages_viewed | Return the list of content pages viewed by a user during a lesson attempt.
*ModLessonApi* | [**modLessonGetLesson**](docs/Api/ModLessonApi.md#modlessongetlesson) | **POST** /mod_lesson_get_lesson | Return information of a given lesson.
*ModLessonApi* | [**modLessonGetLessonAccessInformation**](docs/Api/ModLessonApi.md#modlessongetlessonaccessinformation) | **POST** /mod_lesson_get_lesson_access_information | Return access information for a given lesson.
*ModLessonApi* | [**modLessonGetLessonsByCourses**](docs/Api/ModLessonApi.md#modlessongetlessonsbycourses) | **POST** /mod_lesson_get_lessons_by_courses | Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.
*ModLessonApi* | [**modLessonGetPageData**](docs/Api/ModLessonApi.md#modlessongetpagedata) | **POST** /mod_lesson_get_page_data | Return information of a given page, including its contents.
*ModLessonApi* | [**modLessonGetPages**](docs/Api/ModLessonApi.md#modlessongetpages) | **POST** /mod_lesson_get_pages | Return the list of pages in a lesson (based on the user permissions).
*ModLessonApi* | [**modLessonGetPagesPossibleJumps**](docs/Api/ModLessonApi.md#modlessongetpagespossiblejumps) | **POST** /mod_lesson_get_pages_possible_jumps | Return all the possible jumps for the pages in a given lesson.
*ModLessonApi* | [**modLessonGetQuestionsAttempts**](docs/Api/ModLessonApi.md#modlessongetquestionsattempts) | **POST** /mod_lesson_get_questions_attempts | Return the list of questions attempts in a given lesson.
*ModLessonApi* | [**modLessonGetUserAttempt**](docs/Api/ModLessonApi.md#modlessongetuserattempt) | **POST** /mod_lesson_get_user_attempt | Return information about the given user attempt (including answers).
*ModLessonApi* | [**modLessonGetUserAttemptGrade**](docs/Api/ModLessonApi.md#modlessongetuserattemptgrade) | **POST** /mod_lesson_get_user_attempt_grade | Return grade information in the attempt for a given user.
*ModLessonApi* | [**modLessonGetUserGrade**](docs/Api/ModLessonApi.md#modlessongetusergrade) | **POST** /mod_lesson_get_user_grade | Return the final grade in the lesson for the given user.
*ModLessonApi* | [**modLessonGetUserTimers**](docs/Api/ModLessonApi.md#modlessongetusertimers) | **POST** /mod_lesson_get_user_timers | Return the timers in the current lesson for the given user.
*ModLessonApi* | [**modLessonLaunchAttempt**](docs/Api/ModLessonApi.md#modlessonlaunchattempt) | **POST** /mod_lesson_launch_attempt | Starts a new attempt or continues an existing one.
*ModLessonApi* | [**modLessonProcessPage**](docs/Api/ModLessonApi.md#modlessonprocesspage) | **POST** /mod_lesson_process_page | Processes page responses.
*ModLessonApi* | [**modLessonViewLesson**](docs/Api/ModLessonApi.md#modlessonviewlesson) | **POST** /mod_lesson_view_lesson | Trigger the course module viewed event and update the module completion status.
*ModLtiApi* | [**modLtiCreateToolProxy**](docs/Api/ModLtiApi.md#modlticreatetoolproxy) | **POST** /mod_lti_create_tool_proxy | Create a tool proxy
*ModLtiApi* | [**modLtiCreateToolType**](docs/Api/ModLtiApi.md#modlticreatetooltype) | **POST** /mod_lti_create_tool_type | Create a tool type
*ModLtiApi* | [**modLtiDeleteCourseToolType**](docs/Api/ModLtiApi.md#modltideletecoursetooltype) | **POST** /mod_lti_delete_course_tool_type | Delete a course tool type
*ModLtiApi* | [**modLtiDeleteToolProxy**](docs/Api/ModLtiApi.md#modltideletetoolproxy) | **POST** /mod_lti_delete_tool_proxy | Delete a tool proxy
*ModLtiApi* | [**modLtiDeleteToolType**](docs/Api/ModLtiApi.md#modltideletetooltype) | **POST** /mod_lti_delete_tool_type | Delete a tool type
*ModLtiApi* | [**modLtiGetLtisByCourses**](docs/Api/ModLtiApi.md#modltigetltisbycourses) | **POST** /mod_lti_get_ltis_by_courses | Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.
*ModLtiApi* | [**modLtiGetToolLaunchData**](docs/Api/ModLtiApi.md#modltigettoollaunchdata) | **POST** /mod_lti_get_tool_launch_data | Return the launch data for a given external tool.
*ModLtiApi* | [**modLtiGetToolProxies**](docs/Api/ModLtiApi.md#modltigettoolproxies) | **POST** /mod_lti_get_tool_proxies | Get a list of the tool proxies
*ModLtiApi* | [**modLtiGetToolProxyRegistrationRequest**](docs/Api/ModLtiApi.md#modltigettoolproxyregistrationrequest) | **POST** /mod_lti_get_tool_proxy_registration_request | Get a registration request for a tool proxy
*ModLtiApi* | [**modLtiGetToolTypes**](docs/Api/ModLtiApi.md#modltigettooltypes) | **POST** /mod_lti_get_tool_types | Get a list of the tool types
*ModLtiApi* | [**modLtiGetToolTypesAndProxies**](docs/Api/ModLtiApi.md#modltigettooltypesandproxies) | **POST** /mod_lti_get_tool_types_and_proxies | Get a list of the tool types and tool proxies
*ModLtiApi* | [**modLtiGetToolTypesAndProxiesCount**](docs/Api/ModLtiApi.md#modltigettooltypesandproxiescount) | **POST** /mod_lti_get_tool_types_and_proxies_count | Get total number of the tool types and tool proxies
*ModLtiApi* | [**modLtiIsCartridge**](docs/Api/ModLtiApi.md#modltiiscartridge) | **POST** /mod_lti_is_cartridge | Determine if the given url is for a cartridge
*ModLtiApi* | [**modLtiToggleShowinactivitychooser**](docs/Api/ModLtiApi.md#modltitoggleshowinactivitychooser) | **POST** /mod_lti_toggle_showinactivitychooser | Toggle showinactivitychooser for a tool type in a course
*ModLtiApi* | [**modLtiUpdateToolType**](docs/Api/ModLtiApi.md#modltiupdatetooltype) | **POST** /mod_lti_update_tool_type | Update a tool type
*ModLtiApi* | [**modLtiViewLti**](docs/Api/ModLtiApi.md#modltiviewlti) | **POST** /mod_lti_view_lti | Trigger the course module viewed event and update the module completion status.
*ModPageApi* | [**modPageGetPagesByCourses**](docs/Api/ModPageApi.md#modpagegetpagesbycourses) | **POST** /mod_page_get_pages_by_courses | Returns a list of pages in a provided list of courses, if no list is provided all pages that the user                             can view will be returned.
*ModPageApi* | [**modPageViewPage**](docs/Api/ModPageApi.md#modpageviewpage) | **POST** /mod_page_view_page | Simulate the view.php web interface page: trigger events, completion, etc...
*ModQuizApi* | [**modQuizAddRandomQuestions**](docs/Api/ModQuizApi.md#modquizaddrandomquestions) | **POST** /mod_quiz_add_random_questions | Add a number of random questions to a quiz.
*ModQuizApi* | [**modQuizGetAttemptAccessInformation**](docs/Api/ModQuizApi.md#modquizgetattemptaccessinformation) | **POST** /mod_quiz_get_attempt_access_information | Return access information for a given attempt in a quiz.
*ModQuizApi* | [**modQuizGetAttemptData**](docs/Api/ModQuizApi.md#modquizgetattemptdata) | **POST** /mod_quiz_get_attempt_data | Returns information for the given attempt page for a quiz attempt in progress.
*ModQuizApi* | [**modQuizGetAttemptReview**](docs/Api/ModQuizApi.md#modquizgetattemptreview) | **POST** /mod_quiz_get_attempt_review | Returns review information for the given finished attempt, can be used by users or teachers.
*ModQuizApi* | [**modQuizGetAttemptSummary**](docs/Api/ModQuizApi.md#modquizgetattemptsummary) | **POST** /mod_quiz_get_attempt_summary | Returns a summary of a quiz attempt before it is submitted.
*ModQuizApi* | [**modQuizGetCombinedReviewOptions**](docs/Api/ModQuizApi.md#modquizgetcombinedreviewoptions) | **POST** /mod_quiz_get_combined_review_options | Combines the review options from a number of different quiz attempts.
*ModQuizApi* | [**modQuizGetQuizAccessInformation**](docs/Api/ModQuizApi.md#modquizgetquizaccessinformation) | **POST** /mod_quiz_get_quiz_access_information | Return access information for a given quiz.
*ModQuizApi* | [**modQuizGetQuizFeedbackForGrade**](docs/Api/ModQuizApi.md#modquizgetquizfeedbackforgrade) | **POST** /mod_quiz_get_quiz_feedback_for_grade | Get the feedback text that should be show to a student who got the given grade in the given quiz.
*ModQuizApi* | [**modQuizGetQuizRequiredQtypes**](docs/Api/ModQuizApi.md#modquizgetquizrequiredqtypes) | **POST** /mod_quiz_get_quiz_required_qtypes | Return the potential question types that would be required for a given quiz.
*ModQuizApi* | [**modQuizGetQuizzesByCourses**](docs/Api/ModQuizApi.md#modquizgetquizzesbycourses) | **POST** /mod_quiz_get_quizzes_by_courses | Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.
*ModQuizApi* | [**modQuizGetReopenAttemptConfirmation**](docs/Api/ModQuizApi.md#modquizgetreopenattemptconfirmation) | **POST** /mod_quiz_get_reopen_attempt_confirmation | Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.
*ModQuizApi* | [**modQuizGetUserAttempts**](docs/Api/ModQuizApi.md#modquizgetuserattempts) | **POST** /mod_quiz_get_user_attempts | Return a list of attempts for the given quiz and user.
*ModQuizApi* | [**modQuizGetUserBestGrade**](docs/Api/ModQuizApi.md#modquizgetuserbestgrade) | **POST** /mod_quiz_get_user_best_grade | Get the best current grade for the given user on a quiz.
*ModQuizApi* | [**modQuizProcessAttempt**](docs/Api/ModQuizApi.md#modquizprocessattempt) | **POST** /mod_quiz_process_attempt | Process responses during an attempt at a quiz and also deals with attempts finishing.
*ModQuizApi* | [**modQuizReopenAttempt**](docs/Api/ModQuizApi.md#modquizreopenattempt) | **POST** /mod_quiz_reopen_attempt | Re-open an attempt that is currently in the never submitted state.
*ModQuizApi* | [**modQuizSaveAttempt**](docs/Api/ModQuizApi.md#modquizsaveattempt) | **POST** /mod_quiz_save_attempt | Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.
*ModQuizApi* | [**modQuizSetQuestionVersion**](docs/Api/ModQuizApi.md#modquizsetquestionversion) | **POST** /mod_quiz_set_question_version | Set the version of question that would be required for a given quiz.
*ModQuizApi* | [**modQuizStartAttempt**](docs/Api/ModQuizApi.md#modquizstartattempt) | **POST** /mod_quiz_start_attempt | Starts a new attempt at a quiz.
*ModQuizApi* | [**modQuizUpdateFilterCondition**](docs/Api/ModQuizApi.md#modquizupdatefiltercondition) | **POST** /mod_quiz_update_filter_condition | Update filter condition for a random question slot.
*ModQuizApi* | [**modQuizViewAttempt**](docs/Api/ModQuizApi.md#modquizviewattempt) | **POST** /mod_quiz_view_attempt | Trigger the attempt viewed event.
*ModQuizApi* | [**modQuizViewAttemptReview**](docs/Api/ModQuizApi.md#modquizviewattemptreview) | **POST** /mod_quiz_view_attempt_review | Trigger the attempt reviewed event.
*ModQuizApi* | [**modQuizViewAttemptSummary**](docs/Api/ModQuizApi.md#modquizviewattemptsummary) | **POST** /mod_quiz_view_attempt_summary | Trigger the attempt summary viewed event.
*ModQuizApi* | [**modQuizViewQuiz**](docs/Api/ModQuizApi.md#modquizviewquiz) | **POST** /mod_quiz_view_quiz | Trigger the course module viewed event and update the module completion status.
*ModResourceApi* | [**modResourceGetResourcesByCourses**](docs/Api/ModResourceApi.md#modresourcegetresourcesbycourses) | **POST** /mod_resource_get_resources_by_courses | Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
*ModResourceApi* | [**modResourceViewResource**](docs/Api/ModResourceApi.md#modresourceviewresource) | **POST** /mod_resource_view_resource | Simulate the view.php web interface resource: trigger events, completion, etc...
*ModScormApi* | [**modScormGetScormAccessInformation**](docs/Api/ModScormApi.md#modscormgetscormaccessinformation) | **POST** /mod_scorm_get_scorm_access_information | Return capabilities information for a given scorm.
*ModScormApi* | [**modScormGetScormAttemptCount**](docs/Api/ModScormApi.md#modscormgetscormattemptcount) | **POST** /mod_scorm_get_scorm_attempt_count | Return the number of attempts done by a user in the given SCORM.
*ModScormApi* | [**modScormGetScormScoTracks**](docs/Api/ModScormApi.md#modscormgetscormscotracks) | **POST** /mod_scorm_get_scorm_sco_tracks | Retrieves SCO tracking data for the given user id and attempt number
*ModScormApi* | [**modScormGetScormScoes**](docs/Api/ModScormApi.md#modscormgetscormscoes) | **POST** /mod_scorm_get_scorm_scoes | Returns a list containing all the scoes data related to the given scorm id
*ModScormApi* | [**modScormGetScormUserData**](docs/Api/ModScormApi.md#modscormgetscormuserdata) | **POST** /mod_scorm_get_scorm_user_data | Retrieves user tracking and SCO data and default SCORM values
*ModScormApi* | [**modScormGetScormsByCourses**](docs/Api/ModScormApi.md#modscormgetscormsbycourses) | **POST** /mod_scorm_get_scorms_by_courses | Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.
*ModScormApi* | [**modScormInsertScormTracks**](docs/Api/ModScormApi.md#modscorminsertscormtracks) | **POST** /mod_scorm_insert_scorm_tracks | Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.
*ModScormApi* | [**modScormLaunchSco**](docs/Api/ModScormApi.md#modscormlaunchsco) | **POST** /mod_scorm_launch_sco | Trigger the SCO launched event.
*ModScormApi* | [**modScormViewScorm**](docs/Api/ModScormApi.md#modscormviewscorm) | **POST** /mod_scorm_view_scorm | Trigger the course module viewed event.
*ModSurveyApi* | [**modSurveyGetQuestions**](docs/Api/ModSurveyApi.md#modsurveygetquestions) | **POST** /mod_survey_get_questions | Get the complete list of questions for the survey, including subquestions.
*ModSurveyApi* | [**modSurveyGetSurveysByCourses**](docs/Api/ModSurveyApi.md#modsurveygetsurveysbycourses) | **POST** /mod_survey_get_surveys_by_courses | Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.
*ModSurveyApi* | [**modSurveySubmitAnswers**](docs/Api/ModSurveyApi.md#modsurveysubmitanswers) | **POST** /mod_survey_submit_answers | Submit the answers for a given survey.
*ModSurveyApi* | [**modSurveyViewSurvey**](docs/Api/ModSurveyApi.md#modsurveyviewsurvey) | **POST** /mod_survey_view_survey | Trigger the course module viewed event and update the module completion status.
*ModUrlApi* | [**modUrlGetUrlsByCourses**](docs/Api/ModUrlApi.md#modurlgeturlsbycourses) | **POST** /mod_url_get_urls_by_courses | Returns a list of urls in a provided list of courses, if no list is provided all urls that the user                             can view will be returned.
*ModUrlApi* | [**modUrlViewUrl**](docs/Api/ModUrlApi.md#modurlviewurl) | **POST** /mod_url_view_url | Trigger the course module viewed event and update the module completion status.
*ModWikiApi* | [**modWikiEditPage**](docs/Api/ModWikiApi.md#modwikieditpage) | **POST** /mod_wiki_edit_page | Save the contents of a page.
*ModWikiApi* | [**modWikiGetPageContents**](docs/Api/ModWikiApi.md#modwikigetpagecontents) | **POST** /mod_wiki_get_page_contents | Returns the contents of a page.
*ModWikiApi* | [**modWikiGetPageForEditing**](docs/Api/ModWikiApi.md#modwikigetpageforediting) | **POST** /mod_wiki_get_page_for_editing | Locks and retrieves info of page-section to be edited.
*ModWikiApi* | [**modWikiGetSubwikiFiles**](docs/Api/ModWikiApi.md#modwikigetsubwikifiles) | **POST** /mod_wiki_get_subwiki_files | Returns the list of files for a specific subwiki.
*ModWikiApi* | [**modWikiGetSubwikiPages**](docs/Api/ModWikiApi.md#modwikigetsubwikipages) | **POST** /mod_wiki_get_subwiki_pages | Returns the list of pages for a specific subwiki.
*ModWikiApi* | [**modWikiGetSubwikis**](docs/Api/ModWikiApi.md#modwikigetsubwikis) | **POST** /mod_wiki_get_subwikis | Returns the list of subwikis the user can see in a specific wiki.
*ModWikiApi* | [**modWikiGetWikisByCourses**](docs/Api/ModWikiApi.md#modwikigetwikisbycourses) | **POST** /mod_wiki_get_wikis_by_courses | Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.
*ModWikiApi* | [**modWikiNewPage**](docs/Api/ModWikiApi.md#modwikinewpage) | **POST** /mod_wiki_new_page | Create a new page in a subwiki.
*ModWikiApi* | [**modWikiViewPage**](docs/Api/ModWikiApi.md#modwikiviewpage) | **POST** /mod_wiki_view_page | Trigger the page viewed event and update the module completion status.
*ModWikiApi* | [**modWikiViewWiki**](docs/Api/ModWikiApi.md#modwikiviewwiki) | **POST** /mod_wiki_view_wiki | Trigger the course module viewed event and update the module completion status.
*ModWorkshopApi* | [**modWorkshopAddSubmission**](docs/Api/ModWorkshopApi.md#modworkshopaddsubmission) | **POST** /mod_workshop_add_submission | Add a new submission to a given workshop.
*ModWorkshopApi* | [**modWorkshopDeleteSubmission**](docs/Api/ModWorkshopApi.md#modworkshopdeletesubmission) | **POST** /mod_workshop_delete_submission | Deletes the given submission.
*ModWorkshopApi* | [**modWorkshopEvaluateAssessment**](docs/Api/ModWorkshopApi.md#modworkshopevaluateassessment) | **POST** /mod_workshop_evaluate_assessment | Evaluates an assessment (used by teachers for provide feedback to the reviewer).
*ModWorkshopApi* | [**modWorkshopEvaluateSubmission**](docs/Api/ModWorkshopApi.md#modworkshopevaluatesubmission) | **POST** /mod_workshop_evaluate_submission | Evaluates a submission (used by teachers for provide feedback or override the submission grade).
*ModWorkshopApi* | [**modWorkshopGetAssessment**](docs/Api/ModWorkshopApi.md#modworkshopgetassessment) | **POST** /mod_workshop_get_assessment | Retrieves the given assessment.
*ModWorkshopApi* | [**modWorkshopGetAssessmentFormDefinition**](docs/Api/ModWorkshopApi.md#modworkshopgetassessmentformdefinition) | **POST** /mod_workshop_get_assessment_form_definition | Retrieves the assessment form definition.
*ModWorkshopApi* | [**modWorkshopGetGrades**](docs/Api/ModWorkshopApi.md#modworkshopgetgrades) | **POST** /mod_workshop_get_grades | Returns the assessment and submission grade for the given user.
*ModWorkshopApi* | [**modWorkshopGetGradesReport**](docs/Api/ModWorkshopApi.md#modworkshopgetgradesreport) | **POST** /mod_workshop_get_grades_report | Retrieves the assessment grades report.
*ModWorkshopApi* | [**modWorkshopGetReviewerAssessments**](docs/Api/ModWorkshopApi.md#modworkshopgetreviewerassessments) | **POST** /mod_workshop_get_reviewer_assessments | Retrieves all the assessments reviewed by the given user.
*ModWorkshopApi* | [**modWorkshopGetSubmission**](docs/Api/ModWorkshopApi.md#modworkshopgetsubmission) | **POST** /mod_workshop_get_submission | Retrieves the given submission.
*ModWorkshopApi* | [**modWorkshopGetSubmissionAssessments**](docs/Api/ModWorkshopApi.md#modworkshopgetsubmissionassessments) | **POST** /mod_workshop_get_submission_assessments | Retrieves all the assessments of the given submission.
*ModWorkshopApi* | [**modWorkshopGetSubmissions**](docs/Api/ModWorkshopApi.md#modworkshopgetsubmissions) | **POST** /mod_workshop_get_submissions | Retrieves all the workshop submissions or the one done by the given user (except example submissions).
*ModWorkshopApi* | [**modWorkshopGetUserPlan**](docs/Api/ModWorkshopApi.md#modworkshopgetuserplan) | **POST** /mod_workshop_get_user_plan | Return the planner information for the given user.
*ModWorkshopApi* | [**modWorkshopGetWorkshopAccessInformation**](docs/Api/ModWorkshopApi.md#modworkshopgetworkshopaccessinformation) | **POST** /mod_workshop_get_workshop_access_information | Return access information for a given workshop.
*ModWorkshopApi* | [**modWorkshopGetWorkshopsByCourses**](docs/Api/ModWorkshopApi.md#modworkshopgetworkshopsbycourses) | **POST** /mod_workshop_get_workshops_by_courses | Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.
*ModWorkshopApi* | [**modWorkshopUpdateAssessment**](docs/Api/ModWorkshopApi.md#modworkshopupdateassessment) | **POST** /mod_workshop_update_assessment | Add information to an allocated assessment.
*ModWorkshopApi* | [**modWorkshopUpdateSubmission**](docs/Api/ModWorkshopApi.md#modworkshopupdatesubmission) | **POST** /mod_workshop_update_submission | Update the given submission.
*ModWorkshopApi* | [**modWorkshopViewSubmission**](docs/Api/ModWorkshopApi.md#modworkshopviewsubmission) | **POST** /mod_workshop_view_submission | Trigger the submission viewed event.
*ModWorkshopApi* | [**modWorkshopViewWorkshop**](docs/Api/ModWorkshopApi.md#modworkshopviewworkshop) | **POST** /mod_workshop_view_workshop | Trigger the course module viewed event and update the module completion status.
*MoodleApi* | [**coreAdminSetBlockProtection**](docs/Api/MoodleApi.md#coreadminsetblockprotection) | **POST** /core_admin_set_block_protection | Set the protection state for a block plugin
*MoodleApi* | [**coreAdminSetPluginOrder**](docs/Api/MoodleApi.md#coreadminsetpluginorder) | **POST** /core_admin_set_plugin_order | Set the order of a plugin
*MoodleApi* | [**coreAdminSetPluginState**](docs/Api/MoodleApi.md#coreadminsetpluginstate) | **POST** /core_admin_set_plugin_state | Set the state of a plugin
*MoodleApi* | [**coreAuthConfirmUser**](docs/Api/MoodleApi.md#coreauthconfirmuser) | **POST** /core_auth_confirm_user | Confirm a user account.
*MoodleApi* | [**coreAuthIsAgeDigitalConsentVerificationEnabled**](docs/Api/MoodleApi.md#coreauthisagedigitalconsentverificationenabled) | **POST** /core_auth_is_age_digital_consent_verification_enabled | Checks if age digital consent verification is enabled.
*MoodleApi* | [**coreAuthIsMinor**](docs/Api/MoodleApi.md#coreauthisminor) | **POST** /core_auth_is_minor | Requests a check if a user is a digital minor.
*MoodleApi* | [**coreAuthRequestPasswordReset**](docs/Api/MoodleApi.md#coreauthrequestpasswordreset) | **POST** /core_auth_request_password_reset | Requests a password reset.
*MoodleApi* | [**coreAuthResendConfirmationEmail**](docs/Api/MoodleApi.md#coreauthresendconfirmationemail) | **POST** /core_auth_resend_confirmation_email | Resend confirmation email.
*MoodleApi* | [**coreBackupGetAsyncBackupLinksBackup**](docs/Api/MoodleApi.md#corebackupgetasyncbackuplinksbackup) | **POST** /core_backup_get_async_backup_links_backup | Gets the data to use when updating the status table row in the UI for when an async backup completes.
*MoodleApi* | [**coreBackupGetAsyncBackupLinksRestore**](docs/Api/MoodleApi.md#corebackupgetasyncbackuplinksrestore) | **POST** /core_backup_get_async_backup_links_restore | Gets the data to use when updating the status table row in the UI for when an async restore completes.
*MoodleApi* | [**coreBackupGetAsyncBackupProgress**](docs/Api/MoodleApi.md#corebackupgetasyncbackupprogress) | **POST** /core_backup_get_async_backup_progress | Get the progress of an Asyncronhous backup.
*MoodleApi* | [**coreBackupGetCopyProgress**](docs/Api/MoodleApi.md#corebackupgetcopyprogress) | **POST** /core_backup_get_copy_progress | Gets the progress of course copy operations.
*MoodleApi* | [**coreBackupSubmitCopyForm**](docs/Api/MoodleApi.md#corebackupsubmitcopyform) | **POST** /core_backup_submit_copy_form | Handles ajax submission of course copy form.
*MoodleApi* | [**coreBadgesGetUserBadgeByHash**](docs/Api/MoodleApi.md#corebadgesgetuserbadgebyhash) | **POST** /core_badges_get_user_badge_by_hash | Returns the badge awarded to a user by hash.
*MoodleApi* | [**coreBadgesGetUserBadges**](docs/Api/MoodleApi.md#corebadgesgetuserbadges) | **POST** /core_badges_get_user_badges | Returns the list of badges awarded to a user.
*MoodleApi* | [**coreBlockFetchAddableBlocks**](docs/Api/MoodleApi.md#coreblockfetchaddableblocks) | **POST** /core_block_fetch_addable_blocks | Returns all addable blocks in a given page.
*MoodleApi* | [**coreBlockGetCourseBlocks**](docs/Api/MoodleApi.md#coreblockgetcourseblocks) | **POST** /core_block_get_course_blocks | Returns blocks information for a course.
*MoodleApi* | [**coreBlockGetDashboardBlocks**](docs/Api/MoodleApi.md#coreblockgetdashboardblocks) | **POST** /core_block_get_dashboard_blocks | Returns blocks information for the given user dashboard.
*MoodleApi* | [**coreBlogGetEntries**](docs/Api/MoodleApi.md#corebloggetentries) | **POST** /core_blog_get_entries | Returns blog entries.
*MoodleApi* | [**coreBlogViewEntries**](docs/Api/MoodleApi.md#coreblogviewentries) | **POST** /core_blog_view_entries | Trigger the blog_entries_viewed event.
*MoodleApi* | [**coreCalendarCreateCalendarEvents**](docs/Api/MoodleApi.md#corecalendarcreatecalendarevents) | **POST** /core_calendar_create_calendar_events | Create calendar events
*MoodleApi* | [**coreCalendarDeleteCalendarEvents**](docs/Api/MoodleApi.md#corecalendardeletecalendarevents) | **POST** /core_calendar_delete_calendar_events | Delete calendar events
*MoodleApi* | [**coreCalendarDeleteSubscription**](docs/Api/MoodleApi.md#corecalendardeletesubscription) | **POST** /core_calendar_delete_subscription | Delete the calendar subscription
*MoodleApi* | [**coreCalendarGetActionEventsByCourse**](docs/Api/MoodleApi.md#corecalendargetactioneventsbycourse) | **POST** /core_calendar_get_action_events_by_course | Get calendar action events by course
*MoodleApi* | [**coreCalendarGetActionEventsByCourses**](docs/Api/MoodleApi.md#corecalendargetactioneventsbycourses) | **POST** /core_calendar_get_action_events_by_courses | Get calendar action events by courses
*MoodleApi* | [**coreCalendarGetActionEventsByTimesort**](docs/Api/MoodleApi.md#corecalendargetactioneventsbytimesort) | **POST** /core_calendar_get_action_events_by_timesort | Get calendar action events by tiemsort
*MoodleApi* | [**coreCalendarGetAllowedEventTypes**](docs/Api/MoodleApi.md#corecalendargetallowedeventtypes) | **POST** /core_calendar_get_allowed_event_types | Get the type of events a user can create in the given course.
*MoodleApi* | [**coreCalendarGetCalendarAccessInformation**](docs/Api/MoodleApi.md#corecalendargetcalendaraccessinformation) | **POST** /core_calendar_get_calendar_access_information | Convenience function to retrieve some permissions/access information for the given course calendar.
*MoodleApi* | [**coreCalendarGetCalendarDayView**](docs/Api/MoodleApi.md#corecalendargetcalendardayview) | **POST** /core_calendar_get_calendar_day_view | Fetch the day view data for a calendar
*MoodleApi* | [**coreCalendarGetCalendarEventById**](docs/Api/MoodleApi.md#corecalendargetcalendareventbyid) | **POST** /core_calendar_get_calendar_event_by_id | Get calendar event by id
*MoodleApi* | [**coreCalendarGetCalendarEvents**](docs/Api/MoodleApi.md#corecalendargetcalendarevents) | **POST** /core_calendar_get_calendar_events | Get calendar events
*MoodleApi* | [**coreCalendarGetCalendarExportToken**](docs/Api/MoodleApi.md#corecalendargetcalendarexporttoken) | **POST** /core_calendar_get_calendar_export_token | Return the auth token required for exporting a calendar.
*MoodleApi* | [**coreCalendarGetCalendarMonthlyView**](docs/Api/MoodleApi.md#corecalendargetcalendarmonthlyview) | **POST** /core_calendar_get_calendar_monthly_view | Fetch the monthly view data for a calendar
*MoodleApi* | [**coreCalendarGetCalendarUpcomingView**](docs/Api/MoodleApi.md#corecalendargetcalendarupcomingview) | **POST** /core_calendar_get_calendar_upcoming_view | Fetch the upcoming view data for a calendar
*MoodleApi* | [**coreCalendarGetTimestamps**](docs/Api/MoodleApi.md#corecalendargettimestamps) | **POST** /core_calendar_get_timestamps | Fetch unix timestamps for given date times.
*MoodleApi* | [**coreCalendarSubmitCreateUpdateForm**](docs/Api/MoodleApi.md#corecalendarsubmitcreateupdateform) | **POST** /core_calendar_submit_create_update_form | Submit form data for event form
*MoodleApi* | [**coreCalendarUpdateEventStartDay**](docs/Api/MoodleApi.md#corecalendarupdateeventstartday) | **POST** /core_calendar_update_event_start_day | Update the start day (but not time) for an event.
*MoodleApi* | [**coreChangeEditmode**](docs/Api/MoodleApi.md#corechangeeditmode) | **POST** /core_change_editmode | Change the editing mode
*MoodleApi* | [**coreCohortAddCohortMembers**](docs/Api/MoodleApi.md#corecohortaddcohortmembers) | **POST** /core_cohort_add_cohort_members | Adds cohort members.
*MoodleApi* | [**coreCohortCreateCohorts**](docs/Api/MoodleApi.md#corecohortcreatecohorts) | **POST** /core_cohort_create_cohorts | Creates new cohorts.
*MoodleApi* | [**coreCohortDeleteCohortMembers**](docs/Api/MoodleApi.md#corecohortdeletecohortmembers) | **POST** /core_cohort_delete_cohort_members | Deletes cohort members.
*MoodleApi* | [**coreCohortDeleteCohorts**](docs/Api/MoodleApi.md#corecohortdeletecohorts) | **POST** /core_cohort_delete_cohorts | Deletes all specified cohorts.
*MoodleApi* | [**coreCohortGetCohortMembers**](docs/Api/MoodleApi.md#corecohortgetcohortmembers) | **POST** /core_cohort_get_cohort_members | Returns cohort members.
*MoodleApi* | [**coreCohortGetCohorts**](docs/Api/MoodleApi.md#corecohortgetcohorts) | **POST** /core_cohort_get_cohorts | Returns cohort details.
*MoodleApi* | [**coreCohortSearchCohorts**](docs/Api/MoodleApi.md#corecohortsearchcohorts) | **POST** /core_cohort_search_cohorts | Search for cohorts.
*MoodleApi* | [**coreCohortUpdateCohorts**](docs/Api/MoodleApi.md#corecohortupdatecohorts) | **POST** /core_cohort_update_cohorts | Updates existing cohorts.
*MoodleApi* | [**coreCommentAddComments**](docs/Api/MoodleApi.md#corecommentaddcomments) | **POST** /core_comment_add_comments | Adds a comment or comments.
*MoodleApi* | [**coreCommentDeleteComments**](docs/Api/MoodleApi.md#corecommentdeletecomments) | **POST** /core_comment_delete_comments | Deletes a comment or comments.
*MoodleApi* | [**coreCommentGetComments**](docs/Api/MoodleApi.md#corecommentgetcomments) | **POST** /core_comment_get_comments | Returns comments.
*MoodleApi* | [**coreCompetencyAddCompetencyToCourse**](docs/Api/MoodleApi.md#corecompetencyaddcompetencytocourse) | **POST** /core_competency_add_competency_to_course | Add the competency to a course
*MoodleApi* | [**coreCompetencyAddCompetencyToPlan**](docs/Api/MoodleApi.md#corecompetencyaddcompetencytoplan) | **POST** /core_competency_add_competency_to_plan | Add the competency to a learning plan
*MoodleApi* | [**coreCompetencyAddCompetencyToTemplate**](docs/Api/MoodleApi.md#corecompetencyaddcompetencytotemplate) | **POST** /core_competency_add_competency_to_template | Add the competency to a template
*MoodleApi* | [**coreCompetencyAddRelatedCompetency**](docs/Api/MoodleApi.md#corecompetencyaddrelatedcompetency) | **POST** /core_competency_add_related_competency | Adds a related competency
*MoodleApi* | [**coreCompetencyApprovePlan**](docs/Api/MoodleApi.md#corecompetencyapproveplan) | **POST** /core_competency_approve_plan | Approve a plan.
*MoodleApi* | [**coreCompetencyCompetencyFrameworkViewed**](docs/Api/MoodleApi.md#corecompetencycompetencyframeworkviewed) | **POST** /core_competency_competency_framework_viewed | Log event competency framework viewed
*MoodleApi* | [**coreCompetencyCompetencyViewed**](docs/Api/MoodleApi.md#corecompetencycompetencyviewed) | **POST** /core_competency_competency_viewed | Log event competency viewed
*MoodleApi* | [**coreCompetencyCompletePlan**](docs/Api/MoodleApi.md#corecompetencycompleteplan) | **POST** /core_competency_complete_plan | Complete learning plan.
*MoodleApi* | [**coreCompetencyCountCompetencies**](docs/Api/MoodleApi.md#corecompetencycountcompetencies) | **POST** /core_competency_count_competencies | Count a list of a competencies.
*MoodleApi* | [**coreCompetencyCountCompetenciesInCourse**](docs/Api/MoodleApi.md#corecompetencycountcompetenciesincourse) | **POST** /core_competency_count_competencies_in_course | List the competencies in a course
*MoodleApi* | [**coreCompetencyCountCompetenciesInTemplate**](docs/Api/MoodleApi.md#corecompetencycountcompetenciesintemplate) | **POST** /core_competency_count_competencies_in_template | Count a list of a competencies for a given template.
*MoodleApi* | [**coreCompetencyCountCompetencyFrameworks**](docs/Api/MoodleApi.md#corecompetencycountcompetencyframeworks) | **POST** /core_competency_count_competency_frameworks | Count a list of a competency frameworks.
*MoodleApi* | [**coreCompetencyCountCourseModuleCompetencies**](docs/Api/MoodleApi.md#corecompetencycountcoursemodulecompetencies) | **POST** /core_competency_count_course_module_competencies | Count the competencies in a course module
*MoodleApi* | [**coreCompetencyCountCoursesUsingCompetency**](docs/Api/MoodleApi.md#corecompetencycountcoursesusingcompetency) | **POST** /core_competency_count_courses_using_competency | List the courses using a competency
*MoodleApi* | [**coreCompetencyCountTemplates**](docs/Api/MoodleApi.md#corecompetencycounttemplates) | **POST** /core_competency_count_templates | Count a list of a learning plan templates.
*MoodleApi* | [**coreCompetencyCountTemplatesUsingCompetency**](docs/Api/MoodleApi.md#corecompetencycounttemplatesusingcompetency) | **POST** /core_competency_count_templates_using_competency | Count a list of a learning plan templates for a given competency.
*MoodleApi* | [**coreCompetencyCreateCompetency**](docs/Api/MoodleApi.md#corecompetencycreatecompetency) | **POST** /core_competency_create_competency | Creates new competencies.
*MoodleApi* | [**coreCompetencyCreateCompetencyFramework**](docs/Api/MoodleApi.md#corecompetencycreatecompetencyframework) | **POST** /core_competency_create_competency_framework | Creates new competency frameworks.
*MoodleApi* | [**coreCompetencyCreatePlan**](docs/Api/MoodleApi.md#corecompetencycreateplan) | **POST** /core_competency_create_plan | Creates a learning plan.
*MoodleApi* | [**coreCompetencyCreateTemplate**](docs/Api/MoodleApi.md#corecompetencycreatetemplate) | **POST** /core_competency_create_template | Creates new learning plan templates.
*MoodleApi* | [**coreCompetencyCreateUserEvidenceCompetency**](docs/Api/MoodleApi.md#corecompetencycreateuserevidencecompetency) | **POST** /core_competency_create_user_evidence_competency | Create an evidence of prior learning relationship with a competency.
*MoodleApi* | [**coreCompetencyDeleteCompetency**](docs/Api/MoodleApi.md#corecompetencydeletecompetency) | **POST** /core_competency_delete_competency | Delete a competency.
*MoodleApi* | [**coreCompetencyDeleteCompetencyFramework**](docs/Api/MoodleApi.md#corecompetencydeletecompetencyframework) | **POST** /core_competency_delete_competency_framework | Delete a competency framework.
*MoodleApi* | [**coreCompetencyDeleteEvidence**](docs/Api/MoodleApi.md#corecompetencydeleteevidence) | **POST** /core_competency_delete_evidence | Delete an evidence
*MoodleApi* | [**coreCompetencyDeletePlan**](docs/Api/MoodleApi.md#corecompetencydeleteplan) | **POST** /core_competency_delete_plan | Delete a learning plan.
*MoodleApi* | [**coreCompetencyDeleteTemplate**](docs/Api/MoodleApi.md#corecompetencydeletetemplate) | **POST** /core_competency_delete_template | Delete a learning plan template.
*MoodleApi* | [**coreCompetencyDeleteUserEvidence**](docs/Api/MoodleApi.md#corecompetencydeleteuserevidence) | **POST** /core_competency_delete_user_evidence | Delete an evidence of prior learning.
*MoodleApi* | [**coreCompetencyDeleteUserEvidenceCompetency**](docs/Api/MoodleApi.md#corecompetencydeleteuserevidencecompetency) | **POST** /core_competency_delete_user_evidence_competency | Delete an evidence of prior learning relationship with a competency.
*MoodleApi* | [**coreCompetencyDuplicateCompetencyFramework**](docs/Api/MoodleApi.md#corecompetencyduplicatecompetencyframework) | **POST** /core_competency_duplicate_competency_framework | Duplicate a competency framework.
*MoodleApi* | [**coreCompetencyDuplicateTemplate**](docs/Api/MoodleApi.md#corecompetencyduplicatetemplate) | **POST** /core_competency_duplicate_template | Duplicate learning plan template.
*MoodleApi* | [**coreCompetencyGetScaleValues**](docs/Api/MoodleApi.md#corecompetencygetscalevalues) | **POST** /core_competency_get_scale_values | Fetch the values for a specific scale
*MoodleApi* | [**coreCompetencyGradeCompetency**](docs/Api/MoodleApi.md#corecompetencygradecompetency) | **POST** /core_competency_grade_competency | Grade a competency.
*MoodleApi* | [**coreCompetencyGradeCompetencyInCourse**](docs/Api/MoodleApi.md#corecompetencygradecompetencyincourse) | **POST** /core_competency_grade_competency_in_course | Grade a competency from the course page.
*MoodleApi* | [**coreCompetencyGradeCompetencyInPlan**](docs/Api/MoodleApi.md#corecompetencygradecompetencyinplan) | **POST** /core_competency_grade_competency_in_plan | Grade a competency from the user plan page.
*MoodleApi* | [**coreCompetencyListCompetencies**](docs/Api/MoodleApi.md#corecompetencylistcompetencies) | **POST** /core_competency_list_competencies | Load a list of a competencies.
*MoodleApi* | [**coreCompetencyListCompetenciesInTemplate**](docs/Api/MoodleApi.md#corecompetencylistcompetenciesintemplate) | **POST** /core_competency_list_competencies_in_template | Load a list of a competencies for a given template.
*MoodleApi* | [**coreCompetencyListCompetencyFrameworks**](docs/Api/MoodleApi.md#corecompetencylistcompetencyframeworks) | **POST** /core_competency_list_competency_frameworks | Load a list of a competency frameworks.
*MoodleApi* | [**coreCompetencyListCourseCompetencies**](docs/Api/MoodleApi.md#corecompetencylistcoursecompetencies) | **POST** /core_competency_list_course_competencies | List the competencies in a course
*MoodleApi* | [**coreCompetencyListCourseModuleCompetencies**](docs/Api/MoodleApi.md#corecompetencylistcoursemodulecompetencies) | **POST** /core_competency_list_course_module_competencies | List the competencies in a course module
*MoodleApi* | [**coreCompetencyListPlanCompetencies**](docs/Api/MoodleApi.md#corecompetencylistplancompetencies) | **POST** /core_competency_list_plan_competencies | List the competencies in a plan
*MoodleApi* | [**coreCompetencyListTemplates**](docs/Api/MoodleApi.md#corecompetencylisttemplates) | **POST** /core_competency_list_templates | Load a list of a learning plan templates.
*MoodleApi* | [**coreCompetencyListTemplatesUsingCompetency**](docs/Api/MoodleApi.md#corecompetencylisttemplatesusingcompetency) | **POST** /core_competency_list_templates_using_competency | Load a list of a learning plan templates for a given competency.
*MoodleApi* | [**coreCompetencyListUserPlans**](docs/Api/MoodleApi.md#corecompetencylistuserplans) | **POST** /core_competency_list_user_plans | List a user&#39;s learning plans.
*MoodleApi* | [**coreCompetencyMoveDownCompetency**](docs/Api/MoodleApi.md#corecompetencymovedowncompetency) | **POST** /core_competency_move_down_competency | Re-order a competency.
*MoodleApi* | [**coreCompetencyMoveUpCompetency**](docs/Api/MoodleApi.md#corecompetencymoveupcompetency) | **POST** /core_competency_move_up_competency | Re-order a competency.
*MoodleApi* | [**coreCompetencyPlanCancelReviewRequest**](docs/Api/MoodleApi.md#corecompetencyplancancelreviewrequest) | **POST** /core_competency_plan_cancel_review_request | Cancel the review of a plan.
*MoodleApi* | [**coreCompetencyPlanRequestReview**](docs/Api/MoodleApi.md#corecompetencyplanrequestreview) | **POST** /core_competency_plan_request_review | Request for a plan to be reviewed.
*MoodleApi* | [**coreCompetencyPlanStartReview**](docs/Api/MoodleApi.md#corecompetencyplanstartreview) | **POST** /core_competency_plan_start_review | Start the review of a plan.
*MoodleApi* | [**coreCompetencyPlanStopReview**](docs/Api/MoodleApi.md#corecompetencyplanstopreview) | **POST** /core_competency_plan_stop_review | Stop the review of a plan.
*MoodleApi* | [**coreCompetencyReadCompetency**](docs/Api/MoodleApi.md#corecompetencyreadcompetency) | **POST** /core_competency_read_competency | Load a summary of a competency.
*MoodleApi* | [**coreCompetencyReadCompetencyFramework**](docs/Api/MoodleApi.md#corecompetencyreadcompetencyframework) | **POST** /core_competency_read_competency_framework | Load a summary of a competency framework.
*MoodleApi* | [**coreCompetencyReadPlan**](docs/Api/MoodleApi.md#corecompetencyreadplan) | **POST** /core_competency_read_plan | Load a learning plan.
*MoodleApi* | [**coreCompetencyReadTemplate**](docs/Api/MoodleApi.md#corecompetencyreadtemplate) | **POST** /core_competency_read_template | Load a summary of a learning plan template.
*MoodleApi* | [**coreCompetencyReadUserEvidence**](docs/Api/MoodleApi.md#corecompetencyreaduserevidence) | **POST** /core_competency_read_user_evidence | Read an evidence of prior learning.
*MoodleApi* | [**coreCompetencyRemoveCompetencyFromCourse**](docs/Api/MoodleApi.md#corecompetencyremovecompetencyfromcourse) | **POST** /core_competency_remove_competency_from_course | Remove a competency from a course
*MoodleApi* | [**coreCompetencyRemoveCompetencyFromPlan**](docs/Api/MoodleApi.md#corecompetencyremovecompetencyfromplan) | **POST** /core_competency_remove_competency_from_plan | Remove the competency from a learning plan
*MoodleApi* | [**coreCompetencyRemoveCompetencyFromTemplate**](docs/Api/MoodleApi.md#corecompetencyremovecompetencyfromtemplate) | **POST** /core_competency_remove_competency_from_template | Remove a competency from a template
*MoodleApi* | [**coreCompetencyRemoveRelatedCompetency**](docs/Api/MoodleApi.md#corecompetencyremoverelatedcompetency) | **POST** /core_competency_remove_related_competency | Remove a related competency
*MoodleApi* | [**coreCompetencyReopenPlan**](docs/Api/MoodleApi.md#corecompetencyreopenplan) | **POST** /core_competency_reopen_plan | Reopen learning plan.
*MoodleApi* | [**coreCompetencyReorderCourseCompetency**](docs/Api/MoodleApi.md#corecompetencyreordercoursecompetency) | **POST** /core_competency_reorder_course_competency | Move a course competency to a new relative sort order.
*MoodleApi* | [**coreCompetencyReorderPlanCompetency**](docs/Api/MoodleApi.md#corecompetencyreorderplancompetency) | **POST** /core_competency_reorder_plan_competency | Move a plan competency to a new relative sort order.
*MoodleApi* | [**coreCompetencyReorderTemplateCompetency**](docs/Api/MoodleApi.md#corecompetencyreordertemplatecompetency) | **POST** /core_competency_reorder_template_competency | Move a template competency to a new relative sort order.
*MoodleApi* | [**coreCompetencyRequestReviewOfUserEvidenceLinkedCompetencies**](docs/Api/MoodleApi.md#corecompetencyrequestreviewofuserevidencelinkedcompetencies) | **POST** /core_competency_request_review_of_user_evidence_linked_competencies | Send user evidence competencies in review
*MoodleApi* | [**coreCompetencySearchCompetencies**](docs/Api/MoodleApi.md#corecompetencysearchcompetencies) | **POST** /core_competency_search_competencies | Search a list of a competencies.
*MoodleApi* | [**coreCompetencySetCourseCompetencyRuleoutcome**](docs/Api/MoodleApi.md#corecompetencysetcoursecompetencyruleoutcome) | **POST** /core_competency_set_course_competency_ruleoutcome | Modify the ruleoutcome value for course competency
*MoodleApi* | [**coreCompetencySetParentCompetency**](docs/Api/MoodleApi.md#corecompetencysetparentcompetency) | **POST** /core_competency_set_parent_competency | Set a new parent for a competency.
*MoodleApi* | [**coreCompetencyTemplateHasRelatedData**](docs/Api/MoodleApi.md#corecompetencytemplatehasrelateddata) | **POST** /core_competency_template_has_related_data | Check if a template has related data
*MoodleApi* | [**coreCompetencyTemplateViewed**](docs/Api/MoodleApi.md#corecompetencytemplateviewed) | **POST** /core_competency_template_viewed | Log event template viewed
*MoodleApi* | [**coreCompetencyUnapprovePlan**](docs/Api/MoodleApi.md#corecompetencyunapproveplan) | **POST** /core_competency_unapprove_plan | Unapprove a plan.
*MoodleApi* | [**coreCompetencyUnlinkPlanFromTemplate**](docs/Api/MoodleApi.md#corecompetencyunlinkplanfromtemplate) | **POST** /core_competency_unlink_plan_from_template | Unlink a plan form it template.
*MoodleApi* | [**coreCompetencyUpdateCompetency**](docs/Api/MoodleApi.md#corecompetencyupdatecompetency) | **POST** /core_competency_update_competency | Update a competency.
*MoodleApi* | [**coreCompetencyUpdateCompetencyFramework**](docs/Api/MoodleApi.md#corecompetencyupdatecompetencyframework) | **POST** /core_competency_update_competency_framework | Update a competency framework.
*MoodleApi* | [**coreCompetencyUpdateCourseCompetencySettings**](docs/Api/MoodleApi.md#corecompetencyupdatecoursecompetencysettings) | **POST** /core_competency_update_course_competency_settings | Update the course competency settings
*MoodleApi* | [**coreCompetencyUpdatePlan**](docs/Api/MoodleApi.md#corecompetencyupdateplan) | **POST** /core_competency_update_plan | Updates a learning plan.
*MoodleApi* | [**coreCompetencyUpdateTemplate**](docs/Api/MoodleApi.md#corecompetencyupdatetemplate) | **POST** /core_competency_update_template | Update a learning plan template.
*MoodleApi* | [**coreCompetencyUserCompetencyCancelReviewRequest**](docs/Api/MoodleApi.md#corecompetencyusercompetencycancelreviewrequest) | **POST** /core_competency_user_competency_cancel_review_request | Cancel a review request.
*MoodleApi* | [**coreCompetencyUserCompetencyPlanViewed**](docs/Api/MoodleApi.md#corecompetencyusercompetencyplanviewed) | **POST** /core_competency_user_competency_plan_viewed | Log the user competency plan viewed event.
*MoodleApi* | [**coreCompetencyUserCompetencyRequestReview**](docs/Api/MoodleApi.md#corecompetencyusercompetencyrequestreview) | **POST** /core_competency_user_competency_request_review | Request a review.
*MoodleApi* | [**coreCompetencyUserCompetencyStartReview**](docs/Api/MoodleApi.md#corecompetencyusercompetencystartreview) | **POST** /core_competency_user_competency_start_review | Start a review.
*MoodleApi* | [**coreCompetencyUserCompetencyStopReview**](docs/Api/MoodleApi.md#corecompetencyusercompetencystopreview) | **POST** /core_competency_user_competency_stop_review | Stop a review.
*MoodleApi* | [**coreCompetencyUserCompetencyViewed**](docs/Api/MoodleApi.md#corecompetencyusercompetencyviewed) | **POST** /core_competency_user_competency_viewed | Log the user competency viewed event.
*MoodleApi* | [**coreCompetencyUserCompetencyViewedInCourse**](docs/Api/MoodleApi.md#corecompetencyusercompetencyviewedincourse) | **POST** /core_competency_user_competency_viewed_in_course | Log the user competency viewed in course event
*MoodleApi* | [**coreCompetencyUserCompetencyViewedInPlan**](docs/Api/MoodleApi.md#corecompetencyusercompetencyviewedinplan) | **POST** /core_competency_user_competency_viewed_in_plan | Log the user competency viewed in plan event.
*MoodleApi* | [**coreCompletionGetActivitiesCompletionStatus**](docs/Api/MoodleApi.md#corecompletiongetactivitiescompletionstatus) | **POST** /core_completion_get_activities_completion_status | Return the activities completion status for a user in a course.
*MoodleApi* | [**coreCompletionGetCourseCompletionStatus**](docs/Api/MoodleApi.md#corecompletiongetcoursecompletionstatus) | **POST** /core_completion_get_course_completion_status | Returns course completion status.
*MoodleApi* | [**coreCompletionMarkCourseSelfCompleted**](docs/Api/MoodleApi.md#corecompletionmarkcourseselfcompleted) | **POST** /core_completion_mark_course_self_completed | Update the course completion status for the current user (if course self-completion is enabled).
*MoodleApi* | [**coreCompletionOverrideActivityCompletionStatus**](docs/Api/MoodleApi.md#corecompletionoverrideactivitycompletionstatus) | **POST** /core_completion_override_activity_completion_status | Update completion status for a user in an activity by overriding it.
*MoodleApi* | [**coreCompletionUpdateActivityCompletionStatusManually**](docs/Api/MoodleApi.md#corecompletionupdateactivitycompletionstatusmanually) | **POST** /core_completion_update_activity_completion_status_manually | Update completion status for the current user in an activity, only for activities with manual tracking.
*MoodleApi* | [**coreContentbankCopyContent**](docs/Api/MoodleApi.md#corecontentbankcopycontent) | **POST** /core_contentbank_copy_content | Copy a content in the content bank.
*MoodleApi* | [**coreContentbankDeleteContent**](docs/Api/MoodleApi.md#corecontentbankdeletecontent) | **POST** /core_contentbank_delete_content | Delete a content from the content bank.
*MoodleApi* | [**coreContentbankRenameContent**](docs/Api/MoodleApi.md#corecontentbankrenamecontent) | **POST** /core_contentbank_rename_content | Rename a content in the content bank.
*MoodleApi* | [**coreContentbankSetContentVisibility**](docs/Api/MoodleApi.md#corecontentbanksetcontentvisibility) | **POST** /core_contentbank_set_content_visibility | Set the visibility of a content in the content bank.
*MoodleApi* | [**coreCourseAddContentItemToUserFavourites**](docs/Api/MoodleApi.md#corecourseaddcontentitemtouserfavourites) | **POST** /core_course_add_content_item_to_user_favourites | Adds a content item (activity, resource or their subtypes) to the favourites for the user.
*MoodleApi* | [**coreCourseCheckUpdates**](docs/Api/MoodleApi.md#corecoursecheckupdates) | **POST** /core_course_check_updates | Check if there is updates affecting the user for the given course and contexts.
*MoodleApi* | [**coreCourseCreateCategories**](docs/Api/MoodleApi.md#corecoursecreatecategories) | **POST** /core_course_create_categories | Create course categories
*MoodleApi* | [**coreCourseCreateCourses**](docs/Api/MoodleApi.md#corecoursecreatecourses) | **POST** /core_course_create_courses | Create new courses
*MoodleApi* | [**coreCourseDeleteCategories**](docs/Api/MoodleApi.md#corecoursedeletecategories) | **POST** /core_course_delete_categories | Delete course categories
*MoodleApi* | [**coreCourseDeleteCourses**](docs/Api/MoodleApi.md#corecoursedeletecourses) | **POST** /core_course_delete_courses | Deletes all specified courses
*MoodleApi* | [**coreCourseDeleteModules**](docs/Api/MoodleApi.md#corecoursedeletemodules) | **POST** /core_course_delete_modules | Deletes all specified module instances
*MoodleApi* | [**coreCourseDuplicateCourse**](docs/Api/MoodleApi.md#corecourseduplicatecourse) | **POST** /core_course_duplicate_course | Duplicate an existing course (creating a new one).
*MoodleApi* | [**coreCourseEditModule**](docs/Api/MoodleApi.md#corecourseeditmodule) | **POST** /core_course_edit_module | Performs an action on course module (change visibility, duplicate, delete, etc.)
*MoodleApi* | [**coreCourseEditSection**](docs/Api/MoodleApi.md#corecourseeditsection) | **POST** /core_course_edit_section | Performs an action on course section (change visibility, set marker, delete)
*MoodleApi* | [**coreCourseGetActivityChooserFooter**](docs/Api/MoodleApi.md#corecoursegetactivitychooserfooter) | **POST** /core_course_get_activity_chooser_footer | Fetch the data for the activity chooser footer.
*MoodleApi* | [**coreCourseGetCategories**](docs/Api/MoodleApi.md#corecoursegetcategories) | **POST** /core_course_get_categories | Return category details
*MoodleApi* | [**coreCourseGetContents**](docs/Api/MoodleApi.md#corecoursegetcontents) | **POST** /core_course_get_contents | Get course contents
*MoodleApi* | [**coreCourseGetCourseContentItems**](docs/Api/MoodleApi.md#corecoursegetcoursecontentitems) | **POST** /core_course_get_course_content_items | Fetch all the content items (activities, resources and their subtypes) for the activity picker
*MoodleApi* | [**coreCourseGetCourseModule**](docs/Api/MoodleApi.md#corecoursegetcoursemodule) | **POST** /core_course_get_course_module | Return information about a course module
*MoodleApi* | [**coreCourseGetCourseModuleByInstance**](docs/Api/MoodleApi.md#corecoursegetcoursemodulebyinstance) | **POST** /core_course_get_course_module_by_instance | Return information about a given module name and instance id
*MoodleApi* | [**coreCourseGetCourses**](docs/Api/MoodleApi.md#corecoursegetcourses) | **POST** /core_course_get_courses | Return course details
*MoodleApi* | [**coreCourseGetCoursesByField**](docs/Api/MoodleApi.md#corecoursegetcoursesbyfield) | **POST** /core_course_get_courses_by_field | Get courses matching a specific field (id/s, shortname, idnumber, category)
*MoodleApi* | [**coreCourseGetEnrolledCoursesByTimelineClassification**](docs/Api/MoodleApi.md#corecoursegetenrolledcoursesbytimelineclassification) | **POST** /core_course_get_enrolled_courses_by_timeline_classification | List of enrolled courses for the given timeline classification (past, inprogress, or future).
*MoodleApi* | [**coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification**](docs/Api/MoodleApi.md#corecoursegetenrolledcourseswithactioneventsbytimelineclassification) | **POST** /core_course_get_enrolled_courses_with_action_events_by_timeline_classification | List of enrolled courses with action events in a given timeframe, for the given timeline classification.
*MoodleApi* | [**coreCourseGetEnrolledUsersByCmid**](docs/Api/MoodleApi.md#corecoursegetenrolledusersbycmid) | **POST** /core_course_get_enrolled_users_by_cmid | List users by course module id, filter by group and active enrolment status.
*MoodleApi* | [**coreCourseGetModule**](docs/Api/MoodleApi.md#corecoursegetmodule) | **POST** /core_course_get_module | Returns html with one activity module on course page
*MoodleApi* | [**coreCourseGetRecentCourses**](docs/Api/MoodleApi.md#corecoursegetrecentcourses) | **POST** /core_course_get_recent_courses | List of courses a user has accessed most recently.
*MoodleApi* | [**coreCourseGetUpdatesSince**](docs/Api/MoodleApi.md#corecoursegetupdatessince) | **POST** /core_course_get_updates_since | Check if there are updates affecting the user for the given course since the given time stamp.
*MoodleApi* | [**coreCourseGetUserAdministrationOptions**](docs/Api/MoodleApi.md#corecoursegetuseradministrationoptions) | **POST** /core_course_get_user_administration_options | Return a list of administration options in a set of courses that are avaialable or not for the current                             user.
*MoodleApi* | [**coreCourseGetUserNavigationOptions**](docs/Api/MoodleApi.md#corecoursegetusernavigationoptions) | **POST** /core_course_get_user_navigation_options | Return a list of navigation options in a set of courses that are avaialable or not for the current user.
*MoodleApi* | [**coreCourseImportCourse**](docs/Api/MoodleApi.md#corecourseimportcourse) | **POST** /core_course_import_course | Import course data from a course into another course. Does not include any user data.
*MoodleApi* | [**coreCourseRemoveContentItemFromUserFavourites**](docs/Api/MoodleApi.md#corecourseremovecontentitemfromuserfavourites) | **POST** /core_course_remove_content_item_from_user_favourites | Removes a content item (activity, resource or their subtypes) from the favourites for the user.
*MoodleApi* | [**coreCourseSearchCourses**](docs/Api/MoodleApi.md#corecoursesearchcourses) | **POST** /core_course_search_courses | Search courses by (name, module, block, tag)
*MoodleApi* | [**coreCourseSetFavouriteCourses**](docs/Api/MoodleApi.md#corecoursesetfavouritecourses) | **POST** /core_course_set_favourite_courses | Add a list of courses to the list of favourite courses.
*MoodleApi* | [**coreCourseToggleActivityRecommendation**](docs/Api/MoodleApi.md#corecoursetoggleactivityrecommendation) | **POST** /core_course_toggle_activity_recommendation | Adds or removes an activity as a recommendation in the activity chooser.
*MoodleApi* | [**coreCourseUpdateCategories**](docs/Api/MoodleApi.md#corecourseupdatecategories) | **POST** /core_course_update_categories | Update categories
*MoodleApi* | [**coreCourseUpdateCourses**](docs/Api/MoodleApi.md#corecourseupdatecourses) | **POST** /core_course_update_courses | Update courses
*MoodleApi* | [**coreCourseViewCourse**](docs/Api/MoodleApi.md#corecourseviewcourse) | **POST** /core_course_view_course | Log that the course was viewed
*MoodleApi* | [**coreCourseformatFileHandlers**](docs/Api/MoodleApi.md#corecourseformatfilehandlers) | **POST** /core_courseformat_file_handlers | Get the current course file hanlders.
*MoodleApi* | [**coreCourseformatGetState**](docs/Api/MoodleApi.md#corecourseformatgetstate) | **POST** /core_courseformat_get_state | Get the current course state.
*MoodleApi* | [**coreCourseformatUpdateCourse**](docs/Api/MoodleApi.md#corecourseformatupdatecourse) | **POST** /core_courseformat_update_course | Update course contents.
*MoodleApi* | [**coreCreateUserfeedbackActionRecord**](docs/Api/MoodleApi.md#corecreateuserfeedbackactionrecord) | **POST** /core_create_userfeedback_action_record | Record the action that the user takes in the user feedback notification for future use.
*MoodleApi* | [**coreCustomfieldCreateCategory**](docs/Api/MoodleApi.md#corecustomfieldcreatecategory) | **POST** /core_customfield_create_category | Creates a new category
*MoodleApi* | [**coreCustomfieldDeleteCategory**](docs/Api/MoodleApi.md#corecustomfielddeletecategory) | **POST** /core_customfield_delete_category | Deletes a category
*MoodleApi* | [**coreCustomfieldDeleteField**](docs/Api/MoodleApi.md#corecustomfielddeletefield) | **POST** /core_customfield_delete_field | Deletes an entry
*MoodleApi* | [**coreCustomfieldMoveCategory**](docs/Api/MoodleApi.md#corecustomfieldmovecategory) | **POST** /core_customfield_move_category | Drag and drop categories
*MoodleApi* | [**coreCustomfieldMoveField**](docs/Api/MoodleApi.md#corecustomfieldmovefield) | **POST** /core_customfield_move_field | Drag and drop
*MoodleApi* | [**coreCustomfieldReloadTemplate**](docs/Api/MoodleApi.md#corecustomfieldreloadtemplate) | **POST** /core_customfield_reload_template | Reloads template
*MoodleApi* | [**coreDynamicTabsGetContent**](docs/Api/MoodleApi.md#coredynamictabsgetcontent) | **POST** /core_dynamic_tabs_get_content | Returns the content for a dynamic tab
*MoodleApi* | [**coreEnrolGetCourseEnrolmentMethods**](docs/Api/MoodleApi.md#coreenrolgetcourseenrolmentmethods) | **POST** /core_enrol_get_course_enrolment_methods | Get the list of course enrolment methods
*MoodleApi* | [**coreEnrolGetEnrolledUsers**](docs/Api/MoodleApi.md#coreenrolgetenrolledusers) | **POST** /core_enrol_get_enrolled_users | Get enrolled users by course id.
*MoodleApi* | [**coreEnrolGetEnrolledUsersWithCapability**](docs/Api/MoodleApi.md#coreenrolgetenrolleduserswithcapability) | **POST** /core_enrol_get_enrolled_users_with_capability | For each course and capability specified, return a list of the users that are enrolled in the course                                   and have that capability
*MoodleApi* | [**coreEnrolGetPotentialUsers**](docs/Api/MoodleApi.md#coreenrolgetpotentialusers) | **POST** /core_enrol_get_potential_users | Get the list of potential users to enrol
*MoodleApi* | [**coreEnrolGetUsersCourses**](docs/Api/MoodleApi.md#coreenrolgetuserscourses) | **POST** /core_enrol_get_users_courses | Get the list of courses where a user is enrolled in
*MoodleApi* | [**coreEnrolSearchUsers**](docs/Api/MoodleApi.md#coreenrolsearchusers) | **POST** /core_enrol_search_users | Search within the list of course participants
*MoodleApi* | [**coreEnrolSubmitUserEnrolmentForm**](docs/Api/MoodleApi.md#coreenrolsubmituserenrolmentform) | **POST** /core_enrol_submit_user_enrolment_form | Submit form data for enrolment form
*MoodleApi* | [**coreEnrolUnenrolUserEnrolment**](docs/Api/MoodleApi.md#coreenrolunenroluserenrolment) | **POST** /core_enrol_unenrol_user_enrolment | External function that unenrols a given user enrolment
*MoodleApi* | [**coreFetchNotifications**](docs/Api/MoodleApi.md#corefetchnotifications) | **POST** /core_fetch_notifications | Return a list of notifications for the current session
*MoodleApi* | [**coreFilesDeleteDraftFiles**](docs/Api/MoodleApi.md#corefilesdeletedraftfiles) | **POST** /core_files_delete_draft_files | Delete the indicated files (or directories) from a user draft file area.
*MoodleApi* | [**coreFilesGetFiles**](docs/Api/MoodleApi.md#corefilesgetfiles) | **POST** /core_files_get_files | browse moodle files
*MoodleApi* | [**coreFilesGetUnusedDraftItemid**](docs/Api/MoodleApi.md#corefilesgetunuseddraftitemid) | **POST** /core_files_get_unused_draft_itemid | Generate a new draft itemid for the current user.
*MoodleApi* | [**coreFilesUpload**](docs/Api/MoodleApi.md#corefilesupload) | **POST** /core_files_upload | upload a file to moodle
*MoodleApi* | [**coreFiltersGetAvailableInContext**](docs/Api/MoodleApi.md#corefiltersgetavailableincontext) | **POST** /core_filters_get_available_in_context | Returns the filters available in the given contexts.
*MoodleApi* | [**coreFormDynamicForm**](docs/Api/MoodleApi.md#coreformdynamicform) | **POST** /core_form_dynamic_form | Process submission of a dynamic (modal) form
*MoodleApi* | [**coreFormGetFiletypesBrowserData**](docs/Api/MoodleApi.md#coreformgetfiletypesbrowserdata) | **POST** /core_form_get_filetypes_browser_data | Provides data for the filetypes element browser.
*MoodleApi* | [**coreGetComponentStrings**](docs/Api/MoodleApi.md#coregetcomponentstrings) | **POST** /core_get_component_strings | Return all raw strings (with {$a-&gt;xxx}), for a specific component - similar to core get_component_strings(), call
*MoodleApi* | [**coreGetFragment**](docs/Api/MoodleApi.md#coregetfragment) | **POST** /core_get_fragment | Return a fragment for inclusion, such as a JavaScript page.
*MoodleApi* | [**coreGetString**](docs/Api/MoodleApi.md#coregetstring) | **POST** /core_get_string | Return a translated string - similar to core get_string(), call
*MoodleApi* | [**coreGetStrings**](docs/Api/MoodleApi.md#coregetstrings) | **POST** /core_get_strings | Return some translated strings - like several core get_string(), calls
*MoodleApi* | [**coreGetUserDates**](docs/Api/MoodleApi.md#coregetuserdates) | **POST** /core_get_user_dates | Return formatted timestamps
*MoodleApi* | [**coreGradesCreateGradecategories**](docs/Api/MoodleApi.md#coregradescreategradecategories) | **POST** /core_grades_create_gradecategories | Create grade categories inside a course gradebook.
*MoodleApi* | [**coreGradesGetEnrolledUsersForSearchWidget**](docs/Api/MoodleApi.md#coregradesgetenrolledusersforsearchwidget) | **POST** /core_grades_get_enrolled_users_for_search_widget | ** DEPRECATED ** Please do not call this function any more. Use core_grades_get_enrolled_users_for_selector instead. Returns the enrolled users within and map some fields to the returned array of user objects.
*MoodleApi* | [**coreGradesGetEnrolledUsersForSelector**](docs/Api/MoodleApi.md#coregradesgetenrolledusersforselector) | **POST** /core_grades_get_enrolled_users_for_selector | Returns the enrolled users within and map some fields to the returned array of user objects.
*MoodleApi* | [**coreGradesGetFeedback**](docs/Api/MoodleApi.md#coregradesgetfeedback) | **POST** /core_grades_get_feedback | Get the feedback data for a grade item
*MoodleApi* | [**coreGradesGetGradableUsers**](docs/Api/MoodleApi.md#coregradesgetgradableusers) | **POST** /core_grades_get_gradable_users | Returns the gradable users in a course
*MoodleApi* | [**coreGradesGetGradeTree**](docs/Api/MoodleApi.md#coregradesgetgradetree) | **POST** /core_grades_get_grade_tree | Get the grade tree structure for a course
*MoodleApi* | [**coreGradesGetGradeitems**](docs/Api/MoodleApi.md#coregradesgetgradeitems) | **POST** /core_grades_get_gradeitems | Get the gradeitems for a course
*MoodleApi* | [**coreGradesGetGroupsForSearchWidget**](docs/Api/MoodleApi.md#coregradesgetgroupsforsearchwidget) | **POST** /core_grades_get_groups_for_search_widget | ** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course
*MoodleApi* | [**coreGradesGetGroupsForSelector**](docs/Api/MoodleApi.md#coregradesgetgroupsforselector) | **POST** /core_grades_get_groups_for_selector | ** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course
*MoodleApi* | [**coreGradesGraderGradingpanelPointFetch**](docs/Api/MoodleApi.md#coregradesgradergradingpanelpointfetch) | **POST** /core_grades_grader_gradingpanel_point_fetch | Fetch the data required to display the grader grading panel for simple grading, creating the grade item if required
*MoodleApi* | [**coreGradesGraderGradingpanelPointStore**](docs/Api/MoodleApi.md#coregradesgradergradingpanelpointstore) | **POST** /core_grades_grader_gradingpanel_point_store | Store the data required to display the grader grading panel for simple grading
*MoodleApi* | [**coreGradesGraderGradingpanelScaleFetch**](docs/Api/MoodleApi.md#coregradesgradergradingpanelscalefetch) | **POST** /core_grades_grader_gradingpanel_scale_fetch | Fetch the data required to display the grader grading panel for scale-based grading, creating the grade item if required
*MoodleApi* | [**coreGradesGraderGradingpanelScaleStore**](docs/Api/MoodleApi.md#coregradesgradergradingpanelscalestore) | **POST** /core_grades_grader_gradingpanel_scale_store | Store the data required to display the grader grading panel for scale-based grading
*MoodleApi* | [**coreGradesUpdateGrades**](docs/Api/MoodleApi.md#coregradesupdategrades) | **POST** /core_grades_update_grades | Update a grade item and associated student grades.
*MoodleApi* | [**coreGradingGetDefinitions**](docs/Api/MoodleApi.md#coregradinggetdefinitions) | **POST** /core_grading_get_definitions | Get grading definitions
*MoodleApi* | [**coreGradingGetGradingformInstances**](docs/Api/MoodleApi.md#coregradinggetgradingforminstances) | **POST** /core_grading_get_gradingform_instances | Get grading form instances
*MoodleApi* | [**coreGradingSaveDefinitions**](docs/Api/MoodleApi.md#coregradingsavedefinitions) | **POST** /core_grading_save_definitions | Save grading definitions
*MoodleApi* | [**coreGroupAddGroupMembers**](docs/Api/MoodleApi.md#coregroupaddgroupmembers) | **POST** /core_group_add_group_members | Adds group members.
*MoodleApi* | [**coreGroupAssignGrouping**](docs/Api/MoodleApi.md#coregroupassigngrouping) | **POST** /core_group_assign_grouping | Assing groups from groupings
*MoodleApi* | [**coreGroupCreateGroupings**](docs/Api/MoodleApi.md#coregroupcreategroupings) | **POST** /core_group_create_groupings | Creates new groupings
*MoodleApi* | [**coreGroupCreateGroups**](docs/Api/MoodleApi.md#coregroupcreategroups) | **POST** /core_group_create_groups | Creates new groups.
*MoodleApi* | [**coreGroupDeleteGroupMembers**](docs/Api/MoodleApi.md#coregroupdeletegroupmembers) | **POST** /core_group_delete_group_members | Deletes group members.
*MoodleApi* | [**coreGroupDeleteGroupings**](docs/Api/MoodleApi.md#coregroupdeletegroupings) | **POST** /core_group_delete_groupings | Deletes all specified groupings.
*MoodleApi* | [**coreGroupDeleteGroups**](docs/Api/MoodleApi.md#coregroupdeletegroups) | **POST** /core_group_delete_groups | Deletes all specified groups.
*MoodleApi* | [**coreGroupGetActivityAllowedGroups**](docs/Api/MoodleApi.md#coregroupgetactivityallowedgroups) | **POST** /core_group_get_activity_allowed_groups | Gets a list of groups that the user is allowed to access within the specified activity.
*MoodleApi* | [**coreGroupGetActivityGroupmode**](docs/Api/MoodleApi.md#coregroupgetactivitygroupmode) | **POST** /core_group_get_activity_groupmode | Returns effective groupmode used in a given activity.
*MoodleApi* | [**coreGroupGetCourseGroupings**](docs/Api/MoodleApi.md#coregroupgetcoursegroupings) | **POST** /core_group_get_course_groupings | Returns all groupings in specified course.
*MoodleApi* | [**coreGroupGetCourseGroups**](docs/Api/MoodleApi.md#coregroupgetcoursegroups) | **POST** /core_group_get_course_groups | Returns all groups in specified course.
*MoodleApi* | [**coreGroupGetCourseUserGroups**](docs/Api/MoodleApi.md#coregroupgetcourseusergroups) | **POST** /core_group_get_course_user_groups | Returns all groups in specified course for the specified user.
*MoodleApi* | [**coreGroupGetGroupMembers**](docs/Api/MoodleApi.md#coregroupgetgroupmembers) | **POST** /core_group_get_group_members | Returns group members.
*MoodleApi* | [**coreGroupGetGroupings**](docs/Api/MoodleApi.md#coregroupgetgroupings) | **POST** /core_group_get_groupings | Returns groupings details.
*MoodleApi* | [**coreGroupGetGroups**](docs/Api/MoodleApi.md#coregroupgetgroups) | **POST** /core_group_get_groups | Returns group details.
*MoodleApi* | [**coreGroupGetGroupsForSelector**](docs/Api/MoodleApi.md#coregroupgetgroupsforselector) | **POST** /core_group_get_groups_for_selector | Get the group/(s) for a course
*MoodleApi* | [**coreGroupUnassignGrouping**](docs/Api/MoodleApi.md#coregroupunassigngrouping) | **POST** /core_group_unassign_grouping | Unassing groups from groupings
*MoodleApi* | [**coreGroupUpdateGroupings**](docs/Api/MoodleApi.md#coregroupupdategroupings) | **POST** /core_group_update_groupings | Updates existing groupings
*MoodleApi* | [**coreGroupUpdateGroups**](docs/Api/MoodleApi.md#coregroupupdategroups) | **POST** /core_group_update_groups | Updates existing groups.
*MoodleApi* | [**coreH5pGetTrustedH5pFile**](docs/Api/MoodleApi.md#coreh5pgettrustedh5pfile) | **POST** /core_h5p_get_trusted_h5p_file | Get the H5P file cleaned for Mobile App.
*MoodleApi* | [**coreMessageBlockUser**](docs/Api/MoodleApi.md#coremessageblockuser) | **POST** /core_message_block_user | Blocks a user
*MoodleApi* | [**coreMessageConfirmContactRequest**](docs/Api/MoodleApi.md#coremessageconfirmcontactrequest) | **POST** /core_message_confirm_contact_request | Confirms a contact request
*MoodleApi* | [**coreMessageCreateContactRequest**](docs/Api/MoodleApi.md#coremessagecreatecontactrequest) | **POST** /core_message_create_contact_request | Creates a contact request
*MoodleApi* | [**coreMessageDataForMessageareaSearchMessages**](docs/Api/MoodleApi.md#coremessagedataformessageareasearchmessages) | **POST** /core_message_data_for_messagearea_search_messages | Retrieve the template data for searching for messages
*MoodleApi* | [**coreMessageDeclineContactRequest**](docs/Api/MoodleApi.md#coremessagedeclinecontactrequest) | **POST** /core_message_decline_contact_request | Declines a contact request
*MoodleApi* | [**coreMessageDeleteContacts**](docs/Api/MoodleApi.md#coremessagedeletecontacts) | **POST** /core_message_delete_contacts | Remove contacts from the contact list
*MoodleApi* | [**coreMessageDeleteConversationsById**](docs/Api/MoodleApi.md#coremessagedeleteconversationsbyid) | **POST** /core_message_delete_conversations_by_id | Deletes a list of conversations.
*MoodleApi* | [**coreMessageDeleteMessage**](docs/Api/MoodleApi.md#coremessagedeletemessage) | **POST** /core_message_delete_message | Deletes a message.
*MoodleApi* | [**coreMessageDeleteMessageForAllUsers**](docs/Api/MoodleApi.md#coremessagedeletemessageforallusers) | **POST** /core_message_delete_message_for_all_users | Deletes a message for all users.
*MoodleApi* | [**coreMessageGetBlockedUsers**](docs/Api/MoodleApi.md#coremessagegetblockedusers) | **POST** /core_message_get_blocked_users | Retrieve a list of users blocked
*MoodleApi* | [**coreMessageGetContactRequests**](docs/Api/MoodleApi.md#coremessagegetcontactrequests) | **POST** /core_message_get_contact_requests | Returns contact requests for a user
*MoodleApi* | [**coreMessageGetConversation**](docs/Api/MoodleApi.md#coremessagegetconversation) | **POST** /core_message_get_conversation | Retrieve a conversation for a user
*MoodleApi* | [**coreMessageGetConversationBetweenUsers**](docs/Api/MoodleApi.md#coremessagegetconversationbetweenusers) | **POST** /core_message_get_conversation_between_users | Retrieve a conversation for a user between another user
*MoodleApi* | [**coreMessageGetConversationCounts**](docs/Api/MoodleApi.md#coremessagegetconversationcounts) | **POST** /core_message_get_conversation_counts | Retrieve a list of conversation counts, indexed by type.
*MoodleApi* | [**coreMessageGetConversationMembers**](docs/Api/MoodleApi.md#coremessagegetconversationmembers) | **POST** /core_message_get_conversation_members | Retrieve a list of members in a conversation
*MoodleApi* | [**coreMessageGetConversationMessages**](docs/Api/MoodleApi.md#coremessagegetconversationmessages) | **POST** /core_message_get_conversation_messages | Retrieve the conversation messages and relevant member information
*MoodleApi* | [**coreMessageGetConversations**](docs/Api/MoodleApi.md#coremessagegetconversations) | **POST** /core_message_get_conversations | Retrieve a list of conversations for a user
*MoodleApi* | [**coreMessageGetMemberInfo**](docs/Api/MoodleApi.md#coremessagegetmemberinfo) | **POST** /core_message_get_member_info | Retrieve a user message profiles
*MoodleApi* | [**coreMessageGetMessageProcessor**](docs/Api/MoodleApi.md#coremessagegetmessageprocessor) | **POST** /core_message_get_message_processor | Get a message processor
*MoodleApi* | [**coreMessageGetMessages**](docs/Api/MoodleApi.md#coremessagegetmessages) | **POST** /core_message_get_messages | Retrieve a list of messages sent and received by a user (conversations, notifications or both)
*MoodleApi* | [**coreMessageGetReceivedContactRequestsCount**](docs/Api/MoodleApi.md#coremessagegetreceivedcontactrequestscount) | **POST** /core_message_get_received_contact_requests_count | Gets the number of received contact requests
*MoodleApi* | [**coreMessageGetSelfConversation**](docs/Api/MoodleApi.md#coremessagegetselfconversation) | **POST** /core_message_get_self_conversation | Retrieve a self-conversation for a user
*MoodleApi* | [**coreMessageGetUnreadConversationCounts**](docs/Api/MoodleApi.md#coremessagegetunreadconversationcounts) | **POST** /core_message_get_unread_conversation_counts | Retrieve a list of unread conversation counts, indexed by type.
*MoodleApi* | [**coreMessageGetUnreadConversationsCount**](docs/Api/MoodleApi.md#coremessagegetunreadconversationscount) | **POST** /core_message_get_unread_conversations_count | Retrieve the count of unread conversations for a given user
*MoodleApi* | [**coreMessageGetUnreadNotificationCount**](docs/Api/MoodleApi.md#coremessagegetunreadnotificationcount) | **POST** /core_message_get_unread_notification_count | Get number of unread notifications.
*MoodleApi* | [**coreMessageGetUserContacts**](docs/Api/MoodleApi.md#coremessagegetusercontacts) | **POST** /core_message_get_user_contacts | Retrieve the contact list
*MoodleApi* | [**coreMessageGetUserMessagePreferences**](docs/Api/MoodleApi.md#coremessagegetusermessagepreferences) | **POST** /core_message_get_user_message_preferences | Get the message preferences for a given user.
*MoodleApi* | [**coreMessageGetUserNotificationPreferences**](docs/Api/MoodleApi.md#coremessagegetusernotificationpreferences) | **POST** /core_message_get_user_notification_preferences | Get the notification preferences for a given user.
*MoodleApi* | [**coreMessageMarkAllConversationMessagesAsRead**](docs/Api/MoodleApi.md#coremessagemarkallconversationmessagesasread) | **POST** /core_message_mark_all_conversation_messages_as_read | Mark all conversation messages as read for a given user
*MoodleApi* | [**coreMessageMarkAllNotificationsAsRead**](docs/Api/MoodleApi.md#coremessagemarkallnotificationsasread) | **POST** /core_message_mark_all_notifications_as_read | Mark all notifications as read for a given user
*MoodleApi* | [**coreMessageMarkMessageRead**](docs/Api/MoodleApi.md#coremessagemarkmessageread) | **POST** /core_message_mark_message_read | Mark a single message as read, trigger message_viewed event.
*MoodleApi* | [**coreMessageMarkNotificationRead**](docs/Api/MoodleApi.md#coremessagemarknotificationread) | **POST** /core_message_mark_notification_read | Mark a single notification as read, trigger notification_viewed event.
*MoodleApi* | [**coreMessageMessageProcessorConfigForm**](docs/Api/MoodleApi.md#coremessagemessageprocessorconfigform) | **POST** /core_message_message_processor_config_form | Process the message processor config form
*MoodleApi* | [**coreMessageMessageSearchUsers**](docs/Api/MoodleApi.md#coremessagemessagesearchusers) | **POST** /core_message_message_search_users | Retrieve the data for searching for people
*MoodleApi* | [**coreMessageMuteConversations**](docs/Api/MoodleApi.md#coremessagemuteconversations) | **POST** /core_message_mute_conversations | Mutes a list of conversations
*MoodleApi* | [**coreMessageSearchContacts**](docs/Api/MoodleApi.md#coremessagesearchcontacts) | **POST** /core_message_search_contacts | Search for contacts
*MoodleApi* | [**coreMessageSendInstantMessages**](docs/Api/MoodleApi.md#coremessagesendinstantmessages) | **POST** /core_message_send_instant_messages | Send instant messages
*MoodleApi* | [**coreMessageSendMessagesToConversation**](docs/Api/MoodleApi.md#coremessagesendmessagestoconversation) | **POST** /core_message_send_messages_to_conversation | Send messages to an existing conversation between users
*MoodleApi* | [**coreMessageSetFavouriteConversations**](docs/Api/MoodleApi.md#coremessagesetfavouriteconversations) | **POST** /core_message_set_favourite_conversations | Mark a conversation or group of conversations as favourites/starred conversations.
*MoodleApi* | [**coreMessageUnblockUser**](docs/Api/MoodleApi.md#coremessageunblockuser) | **POST** /core_message_unblock_user | Unblocks a user
*MoodleApi* | [**coreMessageUnmuteConversations**](docs/Api/MoodleApi.md#coremessageunmuteconversations) | **POST** /core_message_unmute_conversations | Unmutes a list of conversations
*MoodleApi* | [**coreMessageUnsetFavouriteConversations**](docs/Api/MoodleApi.md#coremessageunsetfavouriteconversations) | **POST** /core_message_unset_favourite_conversations | Unset a conversation or group of conversations as favourites/starred conversations.
*MoodleApi* | [**coreMoodlenetAuthCheck**](docs/Api/MoodleApi.md#coremoodlenetauthcheck) | **POST** /core_moodlenet_auth_check | Check a user has authorized for a given MoodleNet site
*MoodleApi* | [**coreMoodlenetGetShareInfoActivity**](docs/Api/MoodleApi.md#coremoodlenetgetshareinfoactivity) | **POST** /core_moodlenet_get_share_info_activity | Get information about an activity being shared
*MoodleApi* | [**coreMoodlenetGetSharedCourseInfo**](docs/Api/MoodleApi.md#coremoodlenetgetsharedcourseinfo) | **POST** /core_moodlenet_get_shared_course_info | Get information about an course being shared
*MoodleApi* | [**coreMoodlenetSendActivity**](docs/Api/MoodleApi.md#coremoodlenetsendactivity) | **POST** /core_moodlenet_send_activity | Send activity to MoodleNet
*MoodleApi* | [**coreMoodlenetSendCourse**](docs/Api/MoodleApi.md#coremoodlenetsendcourse) | **POST** /core_moodlenet_send_course | Send course to MoodleNet
*MoodleApi* | [**coreMyViewPage**](docs/Api/MoodleApi.md#coremyviewpage) | **POST** /core_my_view_page | Trigger the My or Dashboard viewed event.
*MoodleApi* | [**coreNotesCreateNotes**](docs/Api/MoodleApi.md#corenotescreatenotes) | **POST** /core_notes_create_notes | Create notes
*MoodleApi* | [**coreNotesDeleteNotes**](docs/Api/MoodleApi.md#corenotesdeletenotes) | **POST** /core_notes_delete_notes | Delete notes
*MoodleApi* | [**coreNotesGetCourseNotes**](docs/Api/MoodleApi.md#corenotesgetcoursenotes) | **POST** /core_notes_get_course_notes | Returns all notes in specified course (or site), for the specified user.
*MoodleApi* | [**coreNotesGetNotes**](docs/Api/MoodleApi.md#corenotesgetnotes) | **POST** /core_notes_get_notes | Get notes
*MoodleApi* | [**coreNotesUpdateNotes**](docs/Api/MoodleApi.md#corenotesupdatenotes) | **POST** /core_notes_update_notes | Update notes
*MoodleApi* | [**coreNotesViewNotes**](docs/Api/MoodleApi.md#corenotesviewnotes) | **POST** /core_notes_view_notes | Simulates the web interface view of notes/index.php: trigger events.
*MoodleApi* | [**coreOutputLoadFontawesomeIconMap**](docs/Api/MoodleApi.md#coreoutputloadfontawesomeiconmap) | **POST** /core_output_load_fontawesome_icon_map | Load the mapping of names to icons
*MoodleApi* | [**coreOutputLoadFontawesomeIconSystemMap**](docs/Api/MoodleApi.md#coreoutputloadfontawesomeiconsystemmap) | **POST** /core_output_load_fontawesome_icon_system_map | Load the mapping of moodle pix names to fontawesome icon names
*MoodleApi* | [**coreOutputLoadTemplate**](docs/Api/MoodleApi.md#coreoutputloadtemplate) | **POST** /core_output_load_template | Load a template for a renderable
*MoodleApi* | [**coreOutputLoadTemplateWithDependencies**](docs/Api/MoodleApi.md#coreoutputloadtemplatewithdependencies) | **POST** /core_output_load_template_with_dependencies | Load a template and its dependencies for a renderable
*MoodleApi* | [**corePaymentGetAvailableGateways**](docs/Api/MoodleApi.md#corepaymentgetavailablegateways) | **POST** /core_payment_get_available_gateways | Get the list of payment gateways that support the given component/area
*MoodleApi* | [**coreQuestionGetRandomQuestionSummaries**](docs/Api/MoodleApi.md#corequestiongetrandomquestionsummaries) | **POST** /core_question_get_random_question_summaries | Get the random question set for a criteria
*MoodleApi* | [**coreQuestionSubmitTagsForm**](docs/Api/MoodleApi.md#corequestionsubmittagsform) | **POST** /core_question_submit_tags_form | Update the question tags.
*MoodleApi* | [**coreQuestionUpdateFlag**](docs/Api/MoodleApi.md#corequestionupdateflag) | **POST** /core_question_update_flag | Update the flag state of a question attempt.
*MoodleApi* | [**coreRatingAddRating**](docs/Api/MoodleApi.md#coreratingaddrating) | **POST** /core_rating_add_rating | Rates an item.
*MoodleApi* | [**coreRatingGetItemRatings**](docs/Api/MoodleApi.md#coreratinggetitemratings) | **POST** /core_rating_get_item_ratings | Retrieve all the ratings for an item.
*MoodleApi* | [**coreReportbuilderAudiencesDelete**](docs/Api/MoodleApi.md#corereportbuilderaudiencesdelete) | **POST** /core_reportbuilder_audiences_delete | Delete audience from report
*MoodleApi* | [**coreReportbuilderCanViewSystemReport**](docs/Api/MoodleApi.md#corereportbuildercanviewsystemreport) | **POST** /core_reportbuilder_can_view_system_report | Determine access to a system report
*MoodleApi* | [**coreReportbuilderColumnsAdd**](docs/Api/MoodleApi.md#corereportbuildercolumnsadd) | **POST** /core_reportbuilder_columns_add | Add column to report
*MoodleApi* | [**coreReportbuilderColumnsDelete**](docs/Api/MoodleApi.md#corereportbuildercolumnsdelete) | **POST** /core_reportbuilder_columns_delete | Delete column from report
*MoodleApi* | [**coreReportbuilderColumnsReorder**](docs/Api/MoodleApi.md#corereportbuildercolumnsreorder) | **POST** /core_reportbuilder_columns_reorder | Re-order column within report
*MoodleApi* | [**coreReportbuilderColumnsSortGet**](docs/Api/MoodleApi.md#corereportbuildercolumnssortget) | **POST** /core_reportbuilder_columns_sort_get | Retrieve column sorting for report
*MoodleApi* | [**coreReportbuilderColumnsSortReorder**](docs/Api/MoodleApi.md#corereportbuildercolumnssortreorder) | **POST** /core_reportbuilder_columns_sort_reorder | Re-order column sorting within report
*MoodleApi* | [**coreReportbuilderColumnsSortToggle**](docs/Api/MoodleApi.md#corereportbuildercolumnssorttoggle) | **POST** /core_reportbuilder_columns_sort_toggle | Toggle sorting of column within report
*MoodleApi* | [**coreReportbuilderConditionsAdd**](docs/Api/MoodleApi.md#corereportbuilderconditionsadd) | **POST** /core_reportbuilder_conditions_add | Add condition to report
*MoodleApi* | [**coreReportbuilderConditionsDelete**](docs/Api/MoodleApi.md#corereportbuilderconditionsdelete) | **POST** /core_reportbuilder_conditions_delete | Delete condition from report
*MoodleApi* | [**coreReportbuilderConditionsReorder**](docs/Api/MoodleApi.md#corereportbuilderconditionsreorder) | **POST** /core_reportbuilder_conditions_reorder | Re-order condition within report
*MoodleApi* | [**coreReportbuilderConditionsReset**](docs/Api/MoodleApi.md#corereportbuilderconditionsreset) | **POST** /core_reportbuilder_conditions_reset | Reset conditions for given report
*MoodleApi* | [**coreReportbuilderFiltersAdd**](docs/Api/MoodleApi.md#corereportbuilderfiltersadd) | **POST** /core_reportbuilder_filters_add | Add filter to report
*MoodleApi* | [**coreReportbuilderFiltersDelete**](docs/Api/MoodleApi.md#corereportbuilderfiltersdelete) | **POST** /core_reportbuilder_filters_delete | Delete filter from report
*MoodleApi* | [**coreReportbuilderFiltersReorder**](docs/Api/MoodleApi.md#corereportbuilderfiltersreorder) | **POST** /core_reportbuilder_filters_reorder | Re-order filter within report
*MoodleApi* | [**coreReportbuilderFiltersReset**](docs/Api/MoodleApi.md#corereportbuilderfiltersreset) | **POST** /core_reportbuilder_filters_reset | Reset filters for given report
*MoodleApi* | [**coreReportbuilderListReports**](docs/Api/MoodleApi.md#corereportbuilderlistreports) | **POST** /core_reportbuilder_list_reports | List custom reports for current user
*MoodleApi* | [**coreReportbuilderReportsDelete**](docs/Api/MoodleApi.md#corereportbuilderreportsdelete) | **POST** /core_reportbuilder_reports_delete | Delete report
*MoodleApi* | [**coreReportbuilderReportsGet**](docs/Api/MoodleApi.md#corereportbuilderreportsget) | **POST** /core_reportbuilder_reports_get | Get custom report
*MoodleApi* | [**coreReportbuilderRetrieveReport**](docs/Api/MoodleApi.md#corereportbuilderretrievereport) | **POST** /core_reportbuilder_retrieve_report | Retrieve custom report content
*MoodleApi* | [**coreReportbuilderRetrieveSystemReport**](docs/Api/MoodleApi.md#corereportbuilderretrievesystemreport) | **POST** /core_reportbuilder_retrieve_system_report | Retrieve system report content
*MoodleApi* | [**coreReportbuilderSchedulesDelete**](docs/Api/MoodleApi.md#corereportbuilderschedulesdelete) | **POST** /core_reportbuilder_schedules_delete | Delete schedule from report
*MoodleApi* | [**coreReportbuilderSchedulesSend**](docs/Api/MoodleApi.md#corereportbuilderschedulessend) | **POST** /core_reportbuilder_schedules_send | Send report schedule
*MoodleApi* | [**coreReportbuilderSchedulesToggle**](docs/Api/MoodleApi.md#corereportbuilderschedulestoggle) | **POST** /core_reportbuilder_schedules_toggle | Toggle state of report schedule
*MoodleApi* | [**coreReportbuilderSetFilters**](docs/Api/MoodleApi.md#corereportbuildersetfilters) | **POST** /core_reportbuilder_set_filters | Set filter values for given report
*MoodleApi* | [**coreReportbuilderViewReport**](docs/Api/MoodleApi.md#corereportbuilderviewreport) | **POST** /core_reportbuilder_view_report | Trigger custom report viewed
*MoodleApi* | [**coreRoleAssignRoles**](docs/Api/MoodleApi.md#coreroleassignroles) | **POST** /core_role_assign_roles | Manual role assignments.
*MoodleApi* | [**coreRoleUnassignRoles**](docs/Api/MoodleApi.md#coreroleunassignroles) | **POST** /core_role_unassign_roles | Manual role unassignments.
*MoodleApi* | [**coreSearchGetRelevantUsers**](docs/Api/MoodleApi.md#coresearchgetrelevantusers) | **POST** /core_search_get_relevant_users | Gets relevant users for a search request.
*MoodleApi* | [**coreSearchGetResults**](docs/Api/MoodleApi.md#coresearchgetresults) | **POST** /core_search_get_results | Get search results.
*MoodleApi* | [**coreSearchGetSearchAreasList**](docs/Api/MoodleApi.md#coresearchgetsearchareaslist) | **POST** /core_search_get_search_areas_list | Get search areas.
*MoodleApi* | [**coreSearchGetTopResults**](docs/Api/MoodleApi.md#coresearchgettopresults) | **POST** /core_search_get_top_results | Get top search results.
*MoodleApi* | [**coreSearchViewResults**](docs/Api/MoodleApi.md#coresearchviewresults) | **POST** /core_search_view_results | Trigger view search results event.
*MoodleApi* | [**coreSessionTimeRemaining**](docs/Api/MoodleApi.md#coresessiontimeremaining) | **POST** /core_session_time_remaining | Count the seconds remaining in this session
*MoodleApi* | [**coreSessionTouch**](docs/Api/MoodleApi.md#coresessiontouch) | **POST** /core_session_touch | Keep the users session alive
*MoodleApi* | [**coreTableGetDynamicTableContent**](docs/Api/MoodleApi.md#coretablegetdynamictablecontent) | **POST** /core_table_get_dynamic_table_content | Get the dynamic table content raw html
*MoodleApi* | [**coreTagGetTagAreas**](docs/Api/MoodleApi.md#coretaggettagareas) | **POST** /core_tag_get_tag_areas | Retrieves existing tag areas.
*MoodleApi* | [**coreTagGetTagCloud**](docs/Api/MoodleApi.md#coretaggettagcloud) | **POST** /core_tag_get_tag_cloud | Retrieves a tag cloud for the given collection and/or query search.
*MoodleApi* | [**coreTagGetTagCollections**](docs/Api/MoodleApi.md#coretaggettagcollections) | **POST** /core_tag_get_tag_collections | Retrieves existing tag collections.
*MoodleApi* | [**coreTagGetTagindex**](docs/Api/MoodleApi.md#coretaggettagindex) | **POST** /core_tag_get_tagindex | Gets tag index page for one tag and one tag area
*MoodleApi* | [**coreTagGetTagindexPerArea**](docs/Api/MoodleApi.md#coretaggettagindexperarea) | **POST** /core_tag_get_tagindex_per_area | Gets tag index page per different areas.
*MoodleApi* | [**coreTagGetTags**](docs/Api/MoodleApi.md#coretaggettags) | **POST** /core_tag_get_tags | Gets tags by their ids
*MoodleApi* | [**coreTagUpdateTags**](docs/Api/MoodleApi.md#coretagupdatetags) | **POST** /core_tag_update_tags | Updates tags
*MoodleApi* | [**coreUpdateInplaceEditable**](docs/Api/MoodleApi.md#coreupdateinplaceeditable) | **POST** /core_update_inplace_editable | Generic service to update title
*MoodleApi* | [**coreUserAddUserDevice**](docs/Api/MoodleApi.md#coreuseradduserdevice) | **POST** /core_user_add_user_device | Store mobile user devices information for PUSH Notifications.
*MoodleApi* | [**coreUserAddUserPrivateFiles**](docs/Api/MoodleApi.md#coreuseradduserprivatefiles) | **POST** /core_user_add_user_private_files | Copy files from a draft area to users private files area.
*MoodleApi* | [**coreUserAgreeSitePolicy**](docs/Api/MoodleApi.md#coreuseragreesitepolicy) | **POST** /core_user_agree_site_policy | Agree the site policy for the current user.
*MoodleApi* | [**coreUserCreateUsers**](docs/Api/MoodleApi.md#coreusercreateusers) | **POST** /core_user_create_users | Create users.
*MoodleApi* | [**coreUserDeleteUsers**](docs/Api/MoodleApi.md#coreuserdeleteusers) | **POST** /core_user_delete_users | Delete users.
*MoodleApi* | [**coreUserGetCourseUserProfiles**](docs/Api/MoodleApi.md#coreusergetcourseuserprofiles) | **POST** /core_user_get_course_user_profiles | Get course user profiles (each of the profils matching a course id and a user id),.
*MoodleApi* | [**coreUserGetPrivateFilesInfo**](docs/Api/MoodleApi.md#coreusergetprivatefilesinfo) | **POST** /core_user_get_private_files_info | Returns general information about files in the user private files area.
*MoodleApi* | [**coreUserGetUserPreferences**](docs/Api/MoodleApi.md#coreusergetuserpreferences) | **POST** /core_user_get_user_preferences | Return user preferences.
*MoodleApi* | [**coreUserGetUsers**](docs/Api/MoodleApi.md#coreusergetusers) | **POST** /core_user_get_users | search for users matching the parameters
*MoodleApi* | [**coreUserGetUsersByField**](docs/Api/MoodleApi.md#coreusergetusersbyfield) | **POST** /core_user_get_users_by_field | Retrieve users&#39; information for a specified unique field - If you want to do a user search, use core_user_get_users() or core_user_search_identity().
*MoodleApi* | [**coreUserRemoveUserDevice**](docs/Api/MoodleApi.md#coreuserremoveuserdevice) | **POST** /core_user_remove_user_device | Remove a user device from the Moodle database.
*MoodleApi* | [**coreUserSearchIdentity**](docs/Api/MoodleApi.md#coreusersearchidentity) | **POST** /core_user_search_identity | Return list of users identities matching the given criteria in their name or other identity fields.
*MoodleApi* | [**coreUserSetUserPreferences**](docs/Api/MoodleApi.md#coreusersetuserpreferences) | **POST** /core_user_set_user_preferences | Set user preferences.
*MoodleApi* | [**coreUserUpdatePicture**](docs/Api/MoodleApi.md#coreuserupdatepicture) | **POST** /core_user_update_picture | Update or delete the user picture in the site
*MoodleApi* | [**coreUserUpdateUserDevicePublicKey**](docs/Api/MoodleApi.md#coreuserupdateuserdevicepublickey) | **POST** /core_user_update_user_device_public_key | Store mobile user public key.
*MoodleApi* | [**coreUserUpdateUserPreferences**](docs/Api/MoodleApi.md#coreuserupdateuserpreferences) | **POST** /core_user_update_user_preferences | Update a user&#39;s preferences
*MoodleApi* | [**coreUserUpdateUsers**](docs/Api/MoodleApi.md#coreuserupdateusers) | **POST** /core_user_update_users | Update users.
*MoodleApi* | [**coreUserViewUserList**](docs/Api/MoodleApi.md#coreuserviewuserlist) | **POST** /core_user_view_user_list | Simulates the web-interface view of user/index.php (triggering events),.
*MoodleApi* | [**coreUserViewUserProfile**](docs/Api/MoodleApi.md#coreuserviewuserprofile) | **POST** /core_user_view_user_profile | Simulates the web-interface view of user/view.php and user/profile.php (triggering events),.
*MoodleApi* | [**coreWebserviceGetSiteInfo**](docs/Api/MoodleApi.md#corewebservicegetsiteinfo) | **POST** /core_webservice_get_site_info | Return some site info / user info / list web service functions
*MoodleApi* | [**coreXapiDeleteState**](docs/Api/MoodleApi.md#corexapideletestate) | **POST** /core_xapi_delete_state | Delete an xAPI state data from an activityId.
*MoodleApi* | [**coreXapiDeleteStates**](docs/Api/MoodleApi.md#corexapideletestates) | **POST** /core_xapi_delete_states | Delete all xAPI state data from an activityId.
*MoodleApi* | [**coreXapiGetState**](docs/Api/MoodleApi.md#corexapigetstate) | **POST** /core_xapi_get_state | Get an xAPI state data from an activityId.
*MoodleApi* | [**coreXapiGetStates**](docs/Api/MoodleApi.md#corexapigetstates) | **POST** /core_xapi_get_states | Get all state ID from an activityId.
*MoodleApi* | [**coreXapiPostState**](docs/Api/MoodleApi.md#corexapipoststate) | **POST** /core_xapi_post_state | Post an xAPI state into an activityId.
*MoodleApi* | [**coreXapiStatementPost**](docs/Api/MoodleApi.md#corexapistatementpost) | **POST** /core_xapi_statement_post | Post an xAPI statement.
*PaygwPaypalApi* | [**paygwPaypalCreateTransactionComplete**](docs/Api/PaygwPaypalApi.md#paygwpaypalcreatetransactioncomplete) | **POST** /paygw_paypal_create_transaction_complete | Takes care of what needs to be done when a PayPal transaction comes back as complete.
*PaygwPaypalApi* | [**paygwPaypalGetConfigForJs**](docs/Api/PaygwPaypalApi.md#paygwpaypalgetconfigforjs) | **POST** /paygw_paypal_get_config_for_js | Returns the configuration settings to be used in js
*QbankColumnsortorderApi* | [**qbankColumnsortorderSetColumnSize**](docs/Api/QbankColumnsortorderApi.md#qbankcolumnsortordersetcolumnsize) | **POST** /qbank_columnsortorder_set_column_size | Column size
*QbankColumnsortorderApi* | [**qbankColumnsortorderSetColumnbankOrder**](docs/Api/QbankColumnsortorderApi.md#qbankcolumnsortordersetcolumnbankorder) | **POST** /qbank_columnsortorder_set_columnbank_order | Sets question columns order in database
*QbankColumnsortorderApi* | [**qbankColumnsortorderSetHiddenColumns**](docs/Api/QbankColumnsortorderApi.md#qbankcolumnsortordersethiddencolumns) | **POST** /qbank_columnsortorder_set_hidden_columns | Hidden Columns
*QbankEditquestionApi* | [**qbankEditquestionSetStatus**](docs/Api/QbankEditquestionApi.md#qbankeditquestionsetstatus) | **POST** /qbank_editquestion_set_status | Update the question status.
*QbankTagquestionApi* | [**qbankTagquestionSubmitTagsForm**](docs/Api/QbankTagquestionApi.md#qbanktagquestionsubmittagsform) | **POST** /qbank_tagquestion_submit_tags_form | Update the question tags.
*QbankViewquestiontextApi* | [**qbankViewquestiontextSetQuestionTextFormat**](docs/Api/QbankViewquestiontextApi.md#qbankviewquestiontextsetquestiontextformat) | **POST** /qbank_viewquestiontext_set_question_text_format | Sets the preference for displaying and formatting the question text
*QuizaccessSebApi* | [**quizaccessSebValidateQuizKeys**](docs/Api/QuizaccessSebApi.md#quizaccesssebvalidatequizkeys) | **POST** /quizaccess_seb_validate_quiz_keys | Validate a Safe Exam Browser config key or a browser exam key.
*ReportCompetencyApi* | [**reportCompetencyDataForReport**](docs/Api/ReportCompetencyApi.md#reportcompetencydataforreport) | **POST** /report_competency_data_for_report | Load the data for the competency report in a course.
*ReportInsightsApi* | [**reportInsightsActionExecuted**](docs/Api/ReportInsightsApi.md#reportinsightsactionexecuted) | **POST** /report_insights_action_executed | Stores an action executed over a group of predictions.
*ReportInsightsApi* | [**reportInsightsSetFixedPrediction**](docs/Api/ReportInsightsApi.md#reportinsightssetfixedprediction) | **POST** /report_insights_set_fixed_prediction | Flags a prediction as fixed.
*ReportInsightsApi* | [**reportInsightsSetNotusefulPrediction**](docs/Api/ReportInsightsApi.md#reportinsightssetnotusefulprediction) | **POST** /report_insights_set_notuseful_prediction | Flags the prediction as not useful.
*TinyAutosaveApi* | [**tinyAutosaveResetSession**](docs/Api/TinyAutosaveApi.md#tinyautosaveresetsession) | **POST** /tiny_autosave_reset_session | Reset an autosave session
*TinyAutosaveApi* | [**tinyAutosaveResumeSession**](docs/Api/TinyAutosaveApi.md#tinyautosaveresumesession) | **POST** /tiny_autosave_resume_session | Resume an autosave session
*TinyAutosaveApi* | [**tinyAutosaveUpdateSession**](docs/Api/TinyAutosaveApi.md#tinyautosaveupdatesession) | **POST** /tiny_autosave_update_session | Update an autosave session
*TinyEquationApi* | [**tinyEquationFilter**](docs/Api/TinyEquationApi.md#tinyequationfilter) | **POST** /tiny_equation_filter | Filter the equation
*TinyPremiumApi* | [**tinyPremiumGetApiKey**](docs/Api/TinyPremiumApi.md#tinypremiumgetapikey) | **POST** /tiny_premium_get_api_key | Get the Tiny Premium API key from Moodle
*ToolAnalyticsApi* | [**toolAnalyticsPotentialContexts**](docs/Api/ToolAnalyticsApi.md#toolanalyticspotentialcontexts) | **POST** /tool_analytics_potential_contexts | Retrieve the list of potential contexts for a model.
*ToolBehatApi* | [**toolBehatGetEntityGenerator**](docs/Api/ToolBehatApi.md#toolbehatgetentitygenerator) | **POST** /tool_behat_get_entity_generator | Get the generator details for an entity
*ToolDataprivacyApi* | [**toolDataprivacyApproveDataRequest**](docs/Api/ToolDataprivacyApi.md#tooldataprivacyapprovedatarequest) | **POST** /tool_dataprivacy_approve_data_request | Approve a data request
*ToolDataprivacyApi* | [**toolDataprivacyBulkApproveDataRequests**](docs/Api/ToolDataprivacyApi.md#tooldataprivacybulkapprovedatarequests) | **POST** /tool_dataprivacy_bulk_approve_data_requests | Bulk approve data requests
*ToolDataprivacyApi* | [**toolDataprivacyBulkDenyDataRequests**](docs/Api/ToolDataprivacyApi.md#tooldataprivacybulkdenydatarequests) | **POST** /tool_dataprivacy_bulk_deny_data_requests | Bulk deny data requests
*ToolDataprivacyApi* | [**toolDataprivacyCancelDataRequest**](docs/Api/ToolDataprivacyApi.md#tooldataprivacycanceldatarequest) | **POST** /tool_dataprivacy_cancel_data_request | Cancel the data request made by the user
*ToolDataprivacyApi* | [**toolDataprivacyConfirmContextsForDeletion**](docs/Api/ToolDataprivacyApi.md#tooldataprivacyconfirmcontextsfordeletion) | **POST** /tool_dataprivacy_confirm_contexts_for_deletion | Mark the selected expired contexts as confirmed for deletion
*ToolDataprivacyApi* | [**toolDataprivacyContactDpo**](docs/Api/ToolDataprivacyApi.md#tooldataprivacycontactdpo) | **POST** /tool_dataprivacy_contact_dpo | Contact the site Data Protection Officer(s)
*ToolDataprivacyApi* | [**toolDataprivacyCreateCategoryForm**](docs/Api/ToolDataprivacyApi.md#tooldataprivacycreatecategoryform) | **POST** /tool_dataprivacy_create_category_form | Adds a data category
*ToolDataprivacyApi* | [**toolDataprivacyCreatePurposeForm**](docs/Api/ToolDataprivacyApi.md#tooldataprivacycreatepurposeform) | **POST** /tool_dataprivacy_create_purpose_form | Adds a data purpose
*ToolDataprivacyApi* | [**toolDataprivacyDeleteCategory**](docs/Api/ToolDataprivacyApi.md#tooldataprivacydeletecategory) | **POST** /tool_dataprivacy_delete_category | Deletes an existing data category
*ToolDataprivacyApi* | [**toolDataprivacyDeletePurpose**](docs/Api/ToolDataprivacyApi.md#tooldataprivacydeletepurpose) | **POST** /tool_dataprivacy_delete_purpose | Deletes an existing data purpose
*ToolDataprivacyApi* | [**toolDataprivacyDenyDataRequest**](docs/Api/ToolDataprivacyApi.md#tooldataprivacydenydatarequest) | **POST** /tool_dataprivacy_deny_data_request | Deny a data request
*ToolDataprivacyApi* | [**toolDataprivacyGetActivityOptions**](docs/Api/ToolDataprivacyApi.md#tooldataprivacygetactivityoptions) | **POST** /tool_dataprivacy_get_activity_options | Fetches a list of activity options
*ToolDataprivacyApi* | [**toolDataprivacyGetCategoryOptions**](docs/Api/ToolDataprivacyApi.md#tooldataprivacygetcategoryoptions) | **POST** /tool_dataprivacy_get_category_options | Fetches a list of data category options
*ToolDataprivacyApi* | [**toolDataprivacyGetDataRequest**](docs/Api/ToolDataprivacyApi.md#tooldataprivacygetdatarequest) | **POST** /tool_dataprivacy_get_data_request | Fetch the details of a user&#39;s data request
*ToolDataprivacyApi* | [**toolDataprivacyGetPurposeOptions**](docs/Api/ToolDataprivacyApi.md#tooldataprivacygetpurposeoptions) | **POST** /tool_dataprivacy_get_purpose_options | Fetches a list of data storage purpose options
*ToolDataprivacyApi* | [**toolDataprivacyGetUsers**](docs/Api/ToolDataprivacyApi.md#tooldataprivacygetusers) | **POST** /tool_dataprivacy_get_users | Fetches a list of users
*ToolDataprivacyApi* | [**toolDataprivacyMarkComplete**](docs/Api/ToolDataprivacyApi.md#tooldataprivacymarkcomplete) | **POST** /tool_dataprivacy_mark_complete | Mark a user&#39;s general enquiry as complete
*ToolDataprivacyApi* | [**toolDataprivacySetContextDefaults**](docs/Api/ToolDataprivacyApi.md#tooldataprivacysetcontextdefaults) | **POST** /tool_dataprivacy_set_context_defaults | Updates the default category and purpose for a given context level (and optionally, a plugin)
*ToolDataprivacyApi* | [**toolDataprivacySetContextForm**](docs/Api/ToolDataprivacyApi.md#tooldataprivacysetcontextform) | **POST** /tool_dataprivacy_set_context_form | Sets purpose and category for a specific context
*ToolDataprivacyApi* | [**toolDataprivacySetContextlevelForm**](docs/Api/ToolDataprivacyApi.md#tooldataprivacysetcontextlevelform) | **POST** /tool_dataprivacy_set_contextlevel_form | Sets purpose and category across a context level
*ToolDataprivacyApi* | [**toolDataprivacySubmitSelectedCoursesForm**](docs/Api/ToolDataprivacyApi.md#tooldataprivacysubmitselectedcoursesform) | **POST** /tool_dataprivacy_submit_selected_courses_form | Save list of selected courses for export
*ToolDataprivacyApi* | [**toolDataprivacyTreeExtraBranches**](docs/Api/ToolDataprivacyApi.md#tooldataprivacytreeextrabranches) | **POST** /tool_dataprivacy_tree_extra_branches | Return branches for the context tree
*ToolIomadpolicyApi* | [**toolIomadpolicyGetIomadpolicyVersion**](docs/Api/ToolIomadpolicyApi.md#tooliomadpolicygetiomadpolicyversion) | **POST** /tool_iomadpolicy_get_iomadpolicy_version | Fetch the details of a iomadpolicy version
*ToolIomadpolicyApi* | [**toolIomadpolicySubmitAcceptOnBehalf**](docs/Api/ToolIomadpolicyApi.md#tooliomadpolicysubmitacceptonbehalf) | **POST** /tool_iomadpolicy_submit_accept_on_behalf | Accept policies on behalf of other users
*ToolLpApi* | [**toolLpDataForCompetenciesManagePage**](docs/Api/ToolLpApi.md#toollpdataforcompetenciesmanagepage) | **POST** /tool_lp_data_for_competencies_manage_page | Load the data for the competencies manage page template
*ToolLpApi* | [**toolLpDataForCompetencyFrameworksManagePage**](docs/Api/ToolLpApi.md#toollpdataforcompetencyframeworksmanagepage) | **POST** /tool_lp_data_for_competency_frameworks_manage_page | Load the data for the competency frameworks manage page template
*ToolLpApi* | [**toolLpDataForCompetencySummary**](docs/Api/ToolLpApi.md#toollpdataforcompetencysummary) | **POST** /tool_lp_data_for_competency_summary | Load competency data for summary template.
*ToolLpApi* | [**toolLpDataForCourseCompetenciesPage**](docs/Api/ToolLpApi.md#toollpdataforcoursecompetenciespage) | **POST** /tool_lp_data_for_course_competencies_page | Load the data for the course competencies page template.
*ToolLpApi* | [**toolLpDataForPlanPage**](docs/Api/ToolLpApi.md#toollpdataforplanpage) | **POST** /tool_lp_data_for_plan_page | Load the data for the plan page template.
*ToolLpApi* | [**toolLpDataForPlansPage**](docs/Api/ToolLpApi.md#toollpdataforplanspage) | **POST** /tool_lp_data_for_plans_page | Load the data for the plans page template
*ToolLpApi* | [**toolLpDataForRelatedCompetenciesSection**](docs/Api/ToolLpApi.md#toollpdataforrelatedcompetenciessection) | **POST** /tool_lp_data_for_related_competencies_section | Load the data for the related competencies template.
*ToolLpApi* | [**toolLpDataForTemplateCompetenciesPage**](docs/Api/ToolLpApi.md#toollpdatafortemplatecompetenciespage) | **POST** /tool_lp_data_for_template_competencies_page | Load the data for the template competencies page template.
*ToolLpApi* | [**toolLpDataForTemplatesManagePage**](docs/Api/ToolLpApi.md#toollpdatafortemplatesmanagepage) | **POST** /tool_lp_data_for_templates_manage_page | Load the data for the learning plan templates manage page template
*ToolLpApi* | [**toolLpDataForUserCompetencySummary**](docs/Api/ToolLpApi.md#toollpdataforusercompetencysummary) | **POST** /tool_lp_data_for_user_competency_summary | Load a summary of a user competency.
*ToolLpApi* | [**toolLpDataForUserCompetencySummaryInCourse**](docs/Api/ToolLpApi.md#toollpdataforusercompetencysummaryincourse) | **POST** /tool_lp_data_for_user_competency_summary_in_course | Load a summary of a user competency.
*ToolLpApi* | [**toolLpDataForUserCompetencySummaryInPlan**](docs/Api/ToolLpApi.md#toollpdataforusercompetencysummaryinplan) | **POST** /tool_lp_data_for_user_competency_summary_in_plan | Load a summary of a user competency.
*ToolLpApi* | [**toolLpDataForUserEvidenceListPage**](docs/Api/ToolLpApi.md#toollpdataforuserevidencelistpage) | **POST** /tool_lp_data_for_user_evidence_list_page | Load the data for the user evidence list page template
*ToolLpApi* | [**toolLpDataForUserEvidencePage**](docs/Api/ToolLpApi.md#toollpdataforuserevidencepage) | **POST** /tool_lp_data_for_user_evidence_page | Load the data for the user evidence page template
*ToolLpApi* | [**toolLpListCoursesUsingCompetency**](docs/Api/ToolLpApi.md#toollplistcoursesusingcompetency) | **POST** /tool_lp_list_courses_using_competency | List the courses using a competency
*ToolLpApi* | [**toolLpSearchCohorts**](docs/Api/ToolLpApi.md#toollpsearchcohorts) | **POST** /tool_lp_search_cohorts | Search for cohorts. This method is deprecated, please call &#39;core_cohort_search_cohorts&#39; instead
*ToolLpApi* | [**toolLpSearchUsers**](docs/Api/ToolLpApi.md#toollpsearchusers) | **POST** /tool_lp_search_users | Search for users.
*ToolMobileApi* | [**toolMobileCallExternalFunctions**](docs/Api/ToolMobileApi.md#toolmobilecallexternalfunctions) | **POST** /tool_mobile_call_external_functions | Call multiple external functions and return all responses.
*ToolMobileApi* | [**toolMobileGetAutologinKey**](docs/Api/ToolMobileApi.md#toolmobilegetautologinkey) | **POST** /tool_mobile_get_autologin_key | Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.
*ToolMobileApi* | [**toolMobileGetConfig**](docs/Api/ToolMobileApi.md#toolmobilegetconfig) | **POST** /tool_mobile_get_config | Returns a list of the site configurations, filtering by section.
*ToolMobileApi* | [**toolMobileGetContent**](docs/Api/ToolMobileApi.md#toolmobilegetcontent) | **POST** /tool_mobile_get_content | Returns a piece of content to be displayed in the Mobile app.
*ToolMobileApi* | [**toolMobileGetPluginsSupportingMobile**](docs/Api/ToolMobileApi.md#toolmobilegetpluginssupportingmobile) | **POST** /tool_mobile_get_plugins_supporting_mobile | Returns a list of Moodle plugins supporting the mobile app.
*ToolMobileApi* | [**toolMobileGetPublicConfig**](docs/Api/ToolMobileApi.md#toolmobilegetpublicconfig) | **POST** /tool_mobile_get_public_config | Returns a list of the site public settings, those not requiring authentication.
*ToolMobileApi* | [**toolMobileGetTokensForQrLogin**](docs/Api/ToolMobileApi.md#toolmobilegettokensforqrlogin) | **POST** /tool_mobile_get_tokens_for_qr_login | Returns a WebService token (and private token) for QR login.
*ToolMobileApi* | [**toolMobileValidateSubscriptionKey**](docs/Api/ToolMobileApi.md#toolmobilevalidatesubscriptionkey) | **POST** /tool_mobile_validate_subscription_key | Check if the given site subscription key is valid.
*ToolMoodlenetApi* | [**toolMoodlenetSearchCourses**](docs/Api/ToolMoodlenetApi.md#toolmoodlenetsearchcourses) | **POST** /tool_moodlenet_search_courses | For some given input search for a course that matches
*ToolMoodlenetApi* | [**toolMoodlenetVerifyWebfinger**](docs/Api/ToolMoodlenetApi.md#toolmoodlenetverifywebfinger) | **POST** /tool_moodlenet_verify_webfinger | Verify if the passed information resolves into a WebFinger profile URL
*ToolPolicyApi* | [**toolPolicyGetPolicyVersion**](docs/Api/ToolPolicyApi.md#toolpolicygetpolicyversion) | **POST** /tool_policy_get_policy_version | Fetch the details of a policy version
*ToolPolicyApi* | [**toolPolicySubmitAcceptOnBehalf**](docs/Api/ToolPolicyApi.md#toolpolicysubmitacceptonbehalf) | **POST** /tool_policy_submit_accept_on_behalf | Accept policies on behalf of other users
*ToolTemplatelibraryApi* | [**toolTemplatelibraryListTemplates**](docs/Api/ToolTemplatelibraryApi.md#tooltemplatelibrarylisttemplates) | **POST** /tool_templatelibrary_list_templates | List/search templates by component.
*ToolTemplatelibraryApi* | [**toolTemplatelibraryLoadCanonicalTemplate**](docs/Api/ToolTemplatelibraryApi.md#tooltemplatelibraryloadcanonicaltemplate) | **POST** /tool_templatelibrary_load_canonical_template | Load a canonical template by name (not the theme overidden one).
*ToolUsertoursApi* | [**toolUsertoursCompleteTour**](docs/Api/ToolUsertoursApi.md#toolusertourscompletetour) | **POST** /tool_usertours_complete_tour | Mark the specified tour as completed for the current user
*ToolUsertoursApi* | [**toolUsertoursFetchAndStartTour**](docs/Api/ToolUsertoursApi.md#toolusertoursfetchandstarttour) | **POST** /tool_usertours_fetch_and_start_tour | Fetch the specified tour
*ToolUsertoursApi* | [**toolUsertoursResetTour**](docs/Api/ToolUsertoursApi.md#toolusertoursresettour) | **POST** /tool_usertours_reset_tour | Remove the specified tour
*ToolUsertoursApi* | [**toolUsertoursStepShown**](docs/Api/ToolUsertoursApi.md#toolusertoursstepshown) | **POST** /tool_usertours_step_shown | Mark the specified step as completed for the current user
*ToolXmldbApi* | [**toolXmldbInvokeMoveAction**](docs/Api/ToolXmldbApi.md#toolxmldbinvokemoveaction) | **POST** /tool_xmldb_invoke_move_action | moves element up/down

## Models

- [AuthEmailGetSignupSettings200Response](docs/Model/AuthEmailGetSignupSettings200Response.md)
- [AuthEmailGetSignupSettings200ResponseProfilefieldsInner](docs/Model/AuthEmailGetSignupSettings200ResponseProfilefieldsInner.md)
- [AuthEmailGetSignupSettings200ResponseWarningsInner](docs/Model/AuthEmailGetSignupSettings200ResponseWarningsInner.md)
- [AuthEmailSignupUser200Response](docs/Model/AuthEmailSignupUser200Response.md)
- [AuthEmailSignupUser200ResponseWarningsInner](docs/Model/AuthEmailSignupUser200ResponseWarningsInner.md)
- [AuthEmailSignupUserRequest](docs/Model/AuthEmailSignupUserRequest.md)
- [AuthEmailSignupUserRequestCustomprofilefieldsInner](docs/Model/AuthEmailSignupUserRequestCustomprofilefieldsInner.md)
- [BlockAccessreviewGetModuleDataRequest](docs/Model/BlockAccessreviewGetModuleDataRequest.md)
- [BlockAccessreviewGetSectionDataRequest](docs/Model/BlockAccessreviewGetSectionDataRequest.md)
- [BlockIomadCompanyAdminAllocateLicensesRequest](docs/Model/BlockIomadCompanyAdminAllocateLicensesRequest.md)
- [BlockIomadCompanyAdminAllocateLicensesRequestLicensesInner](docs/Model/BlockIomadCompanyAdminAllocateLicensesRequestLicensesInner.md)
- [BlockIomadCompanyAdminAssignCoursesRequest](docs/Model/BlockIomadCompanyAdminAssignCoursesRequest.md)
- [BlockIomadCompanyAdminAssignCoursesRequestCoursesInner](docs/Model/BlockIomadCompanyAdminAssignCoursesRequestCoursesInner.md)
- [BlockIomadCompanyAdminAssignUsers200Response](docs/Model/BlockIomadCompanyAdminAssignUsers200Response.md)
- [BlockIomadCompanyAdminAssignUsers200ResponseUsersInner](docs/Model/BlockIomadCompanyAdminAssignUsers200ResponseUsersInner.md)
- [BlockIomadCompanyAdminAssignUsers200ResponseWarningsInner](docs/Model/BlockIomadCompanyAdminAssignUsers200ResponseWarningsInner.md)
- [BlockIomadCompanyAdminAssignUsersRequest](docs/Model/BlockIomadCompanyAdminAssignUsersRequest.md)
- [BlockIomadCompanyAdminAssignUsersRequestUsersInner](docs/Model/BlockIomadCompanyAdminAssignUsersRequestUsersInner.md)
- [BlockIomadCompanyAdminCapabilityDeleteTemplateRequest](docs/Model/BlockIomadCompanyAdminCapabilityDeleteTemplateRequest.md)
- [BlockIomadCompanyAdminCheckToken200Response](docs/Model/BlockIomadCompanyAdminCheckToken200Response.md)
- [BlockIomadCompanyAdminCheckTokenRequest](docs/Model/BlockIomadCompanyAdminCheckTokenRequest.md)
- [BlockIomadCompanyAdminCheckTokenRequestKey0](docs/Model/BlockIomadCompanyAdminCheckTokenRequestKey0.md)
- [BlockIomadCompanyAdminCreateCompaniesRequest](docs/Model/BlockIomadCompanyAdminCreateCompaniesRequest.md)
- [BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner](docs/Model/BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner.md)
- [BlockIomadCompanyAdminCreateLicensesRequest](docs/Model/BlockIomadCompanyAdminCreateLicensesRequest.md)
- [BlockIomadCompanyAdminCreateLicensesRequestLicensesInner](docs/Model/BlockIomadCompanyAdminCreateLicensesRequestLicensesInner.md)
- [BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner](docs/Model/BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner.md)
- [BlockIomadCompanyAdminDeleteLicensesRequest](docs/Model/BlockIomadCompanyAdminDeleteLicensesRequest.md)
- [BlockIomadCompanyAdminDeleteLicensesRequestLicensesInner](docs/Model/BlockIomadCompanyAdminDeleteLicensesRequestLicensesInner.md)
- [BlockIomadCompanyAdminEditCompaniesRequest](docs/Model/BlockIomadCompanyAdminEditCompaniesRequest.md)
- [BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner](docs/Model/BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner.md)
- [BlockIomadCompanyAdminEditLicensesRequest](docs/Model/BlockIomadCompanyAdminEditLicensesRequest.md)
- [BlockIomadCompanyAdminEditLicensesRequestLicensesInner](docs/Model/BlockIomadCompanyAdminEditLicensesRequestLicensesInner.md)
- [BlockIomadCompanyAdminEnrolUsersRequest](docs/Model/BlockIomadCompanyAdminEnrolUsersRequest.md)
- [BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner](docs/Model/BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner.md)
- [BlockIomadCompanyAdminGetCompanies200Response](docs/Model/BlockIomadCompanyAdminGetCompanies200Response.md)
- [BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner](docs/Model/BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.md)
- [BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner](docs/Model/BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner.md)
- [BlockIomadCompanyAdminGetCompaniesRequest](docs/Model/BlockIomadCompanyAdminGetCompaniesRequest.md)
- [BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner](docs/Model/BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner.md)
- [BlockIomadCompanyAdminGetCompanyCourses200Response](docs/Model/BlockIomadCompanyAdminGetCompanyCourses200Response.md)
- [BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner](docs/Model/BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner.md)
- [BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner](docs/Model/BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner.md)
- [BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner](docs/Model/BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner.md)
- [BlockIomadCompanyAdminGetCompanyCoursesRequest](docs/Model/BlockIomadCompanyAdminGetCompanyCoursesRequest.md)
- [BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner](docs/Model/BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner.md)
- [BlockIomadCompanyAdminGetCourseInfoRequest](docs/Model/BlockIomadCompanyAdminGetCourseInfoRequest.md)
- [BlockIomadCompanyAdminGetDepartmentUsers200Response](docs/Model/BlockIomadCompanyAdminGetDepartmentUsers200Response.md)
- [BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner](docs/Model/BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner.md)
- [BlockIomadCompanyAdminGetDepartmentUsersRequest](docs/Model/BlockIomadCompanyAdminGetDepartmentUsersRequest.md)
- [BlockIomadCompanyAdminGetDepartments200Response](docs/Model/BlockIomadCompanyAdminGetDepartments200Response.md)
- [BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner](docs/Model/BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner.md)
- [BlockIomadCompanyAdminGetDepartmentsRequest](docs/Model/BlockIomadCompanyAdminGetDepartmentsRequest.md)
- [BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner](docs/Model/BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner.md)
- [BlockIomadCompanyAdminGetLicenseFromId200Response](docs/Model/BlockIomadCompanyAdminGetLicenseFromId200Response.md)
- [BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner](docs/Model/BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner.md)
- [BlockIomadCompanyAdminGetLicenseFromId200ResponseLicense](docs/Model/BlockIomadCompanyAdminGetLicenseFromId200ResponseLicense.md)
- [BlockIomadCompanyAdminGetLicenseFromIdRequest](docs/Model/BlockIomadCompanyAdminGetLicenseFromIdRequest.md)
- [BlockIomadCompanyAdminGetLicenseInfo200Response](docs/Model/BlockIomadCompanyAdminGetLicenseInfo200Response.md)
- [BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner](docs/Model/BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.md)
- [BlockIomadCompanyAdminGetLicenseInfoRequest](docs/Model/BlockIomadCompanyAdminGetLicenseInfoRequest.md)
- [BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner](docs/Model/BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner.md)
- [BlockIomadCompanyAdminMoveUsersRequest](docs/Model/BlockIomadCompanyAdminMoveUsersRequest.md)
- [BlockIomadCompanyAdminMoveUsersRequestUsersInner](docs/Model/BlockIomadCompanyAdminMoveUsersRequestUsersInner.md)
- [BlockIomadCompanyAdminRestrictCapabilityRequest](docs/Model/BlockIomadCompanyAdminRestrictCapabilityRequest.md)
- [BlockIomadCompanyAdminSyncUsers200Response](docs/Model/BlockIomadCompanyAdminSyncUsers200Response.md)
- [BlockIomadCompanyAdminSyncUsersRequest](docs/Model/BlockIomadCompanyAdminSyncUsersRequest.md)
- [BlockIomadCompanyAdminUnallocateLicensesRequest](docs/Model/BlockIomadCompanyAdminUnallocateLicensesRequest.md)
- [BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner](docs/Model/BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner.md)
- [BlockIomadCompanyAdminUnassignCoursesRequest](docs/Model/BlockIomadCompanyAdminUnassignCoursesRequest.md)
- [BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner](docs/Model/BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner.md)
- [BlockIomadCompanyAdminUnassignUsersRequest](docs/Model/BlockIomadCompanyAdminUnassignUsersRequest.md)
- [BlockIomadCompanyAdminUnassignUsersRequestUsersInner](docs/Model/BlockIomadCompanyAdminUnassignUsersRequestUsersInner.md)
- [BlockIomadCompanyAdminUpdateCoursesRequest](docs/Model/BlockIomadCompanyAdminUpdateCoursesRequest.md)
- [BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner](docs/Model/BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner.md)
- [BlockRecentlyaccesseditemsGetRecentItemsRequest](docs/Model/BlockRecentlyaccesseditemsGetRecentItemsRequest.md)
- [BlockStarredcoursesGetStarredCoursesRequest](docs/Model/BlockStarredcoursesGetStarredCoursesRequest.md)
- [CoreAdminSetBlockProtectionRequest](docs/Model/CoreAdminSetBlockProtectionRequest.md)
- [CoreAdminSetPluginOrderRequest](docs/Model/CoreAdminSetPluginOrderRequest.md)
- [CoreAdminSetPluginStateRequest](docs/Model/CoreAdminSetPluginStateRequest.md)
- [CoreAuthConfirmUser200Response](docs/Model/CoreAuthConfirmUser200Response.md)
- [CoreAuthConfirmUserRequest](docs/Model/CoreAuthConfirmUserRequest.md)
- [CoreAuthIsAgeDigitalConsentVerificationEnabled200Response](docs/Model/CoreAuthIsAgeDigitalConsentVerificationEnabled200Response.md)
- [CoreAuthIsMinor200Response](docs/Model/CoreAuthIsMinor200Response.md)
- [CoreAuthIsMinorRequest](docs/Model/CoreAuthIsMinorRequest.md)
- [CoreAuthRequestPasswordReset200Response](docs/Model/CoreAuthRequestPasswordReset200Response.md)
- [CoreAuthRequestPasswordResetRequest](docs/Model/CoreAuthRequestPasswordResetRequest.md)
- [CoreAuthResendConfirmationEmail200Response](docs/Model/CoreAuthResendConfirmationEmail200Response.md)
- [CoreAuthResendConfirmationEmailRequest](docs/Model/CoreAuthResendConfirmationEmailRequest.md)
- [CoreBackupGetAsyncBackupLinksBackup200Response](docs/Model/CoreBackupGetAsyncBackupLinksBackup200Response.md)
- [CoreBackupGetAsyncBackupLinksBackupRequest](docs/Model/CoreBackupGetAsyncBackupLinksBackupRequest.md)
- [CoreBackupGetAsyncBackupLinksRestore200Response](docs/Model/CoreBackupGetAsyncBackupLinksRestore200Response.md)
- [CoreBackupGetAsyncBackupLinksRestoreRequest](docs/Model/CoreBackupGetAsyncBackupLinksRestoreRequest.md)
- [CoreBackupGetAsyncBackupProgressRequest](docs/Model/CoreBackupGetAsyncBackupProgressRequest.md)
- [CoreBackupGetCopyProgressRequest](docs/Model/CoreBackupGetCopyProgressRequest.md)
- [CoreBackupGetCopyProgressRequestCopiesInner](docs/Model/CoreBackupGetCopyProgressRequestCopiesInner.md)
- [CoreBackupSubmitCopyFormRequest](docs/Model/CoreBackupSubmitCopyFormRequest.md)
- [CoreBadgesGetUserBadgeByHash200Response](docs/Model/CoreBadgesGetUserBadgeByHash200Response.md)
- [CoreBadgesGetUserBadgeByHash200ResponseBadgeInner](docs/Model/CoreBadgesGetUserBadgeByHash200ResponseBadgeInner.md)
- [CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerAlignmentInner](docs/Model/CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerAlignmentInner.md)
- [CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement](docs/Model/CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement.md)
- [CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner](docs/Model/CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner.md)
- [CoreBadgesGetUserBadgeByHashRequest](docs/Model/CoreBadgesGetUserBadgeByHashRequest.md)
- [CoreBadgesGetUserBadges200Response](docs/Model/CoreBadgesGetUserBadges200Response.md)
- [CoreBadgesGetUserBadges200ResponseBadgesInner](docs/Model/CoreBadgesGetUserBadges200ResponseBadgesInner.md)
- [CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner](docs/Model/CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner.md)
- [CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement](docs/Model/CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement.md)
- [CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner](docs/Model/CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner.md)
- [CoreBadgesGetUserBadgesRequest](docs/Model/CoreBadgesGetUserBadgesRequest.md)
- [CoreBlockFetchAddableBlocksRequest](docs/Model/CoreBlockFetchAddableBlocksRequest.md)
- [CoreBlockGetCourseBlocks200Response](docs/Model/CoreBlockGetCourseBlocks200Response.md)
- [CoreBlockGetCourseBlocks200ResponseBlocksInner](docs/Model/CoreBlockGetCourseBlocks200ResponseBlocksInner.md)
- [CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner](docs/Model/CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner.md)
- [CoreBlockGetCourseBlocks200ResponseBlocksInnerContents](docs/Model/CoreBlockGetCourseBlocks200ResponseBlocksInnerContents.md)
- [CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner](docs/Model/CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner.md)
- [CoreBlockGetCourseBlocksRequest](docs/Model/CoreBlockGetCourseBlocksRequest.md)
- [CoreBlockGetDashboardBlocks200Response](docs/Model/CoreBlockGetDashboardBlocks200Response.md)
- [CoreBlockGetDashboardBlocks200ResponseBlocksInner](docs/Model/CoreBlockGetDashboardBlocks200ResponseBlocksInner.md)
- [CoreBlockGetDashboardBlocks200ResponseBlocksInnerConfigsInner](docs/Model/CoreBlockGetDashboardBlocks200ResponseBlocksInnerConfigsInner.md)
- [CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents](docs/Model/CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents.md)
- [CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner](docs/Model/CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md)
- [CoreBlockGetDashboardBlocksRequest](docs/Model/CoreBlockGetDashboardBlocksRequest.md)
- [CoreBlogGetEntries200Response](docs/Model/CoreBlogGetEntries200Response.md)
- [CoreBlogGetEntries200ResponseEntriesInner](docs/Model/CoreBlogGetEntries200ResponseEntriesInner.md)
- [CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner](docs/Model/CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner.md)
- [CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner](docs/Model/CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md)
- [CoreBlogGetEntries200ResponseEntriesInnerTagsInner](docs/Model/CoreBlogGetEntries200ResponseEntriesInnerTagsInner.md)
- [CoreBlogGetEntriesRequest](docs/Model/CoreBlogGetEntriesRequest.md)
- [CoreBlogGetEntriesRequestFiltersInner](docs/Model/CoreBlogGetEntriesRequestFiltersInner.md)
- [CoreBlogViewEntries200Response](docs/Model/CoreBlogViewEntries200Response.md)
- [CoreBlogViewEntriesRequest](docs/Model/CoreBlogViewEntriesRequest.md)
- [CoreBlogViewEntriesRequestFiltersInner](docs/Model/CoreBlogViewEntriesRequestFiltersInner.md)
- [CoreCalendarCreateCalendarEvents200Response](docs/Model/CoreCalendarCreateCalendarEvents200Response.md)
- [CoreCalendarCreateCalendarEvents200ResponseEventsInner](docs/Model/CoreCalendarCreateCalendarEvents200ResponseEventsInner.md)
- [CoreCalendarCreateCalendarEventsRequest](docs/Model/CoreCalendarCreateCalendarEventsRequest.md)
- [CoreCalendarCreateCalendarEventsRequestEventsInner](docs/Model/CoreCalendarCreateCalendarEventsRequestEventsInner.md)
- [CoreCalendarDeleteCalendarEventsRequest](docs/Model/CoreCalendarDeleteCalendarEventsRequest.md)
- [CoreCalendarDeleteCalendarEventsRequestEventsInner](docs/Model/CoreCalendarDeleteCalendarEventsRequestEventsInner.md)
- [CoreCalendarDeleteSubscription200Response](docs/Model/CoreCalendarDeleteSubscription200Response.md)
- [CoreCalendarDeleteSubscriptionRequest](docs/Model/CoreCalendarDeleteSubscriptionRequest.md)
- [CoreCalendarGetActionEventsByCourse200Response](docs/Model/CoreCalendarGetActionEventsByCourse200Response.md)
- [CoreCalendarGetActionEventsByCourse200ResponseEventsInner](docs/Model/CoreCalendarGetActionEventsByCourse200ResponseEventsInner.md)
- [CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction](docs/Model/CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction.md)
- [CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory](docs/Model/CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory.md)
- [CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse](docs/Model/CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse.md)
- [CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon](docs/Model/CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon.md)
- [CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription](docs/Model/CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription.md)
- [CoreCalendarGetActionEventsByCourseRequest](docs/Model/CoreCalendarGetActionEventsByCourseRequest.md)
- [CoreCalendarGetActionEventsByCourses200Response](docs/Model/CoreCalendarGetActionEventsByCourses200Response.md)
- [CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner](docs/Model/CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner.md)
- [CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner](docs/Model/CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner.md)
- [CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction](docs/Model/CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction.md)
- [CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory](docs/Model/CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory.md)
- [CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse](docs/Model/CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse.md)
- [CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon](docs/Model/CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon.md)
- [CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription](docs/Model/CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription.md)
- [CoreCalendarGetActionEventsByCoursesRequest](docs/Model/CoreCalendarGetActionEventsByCoursesRequest.md)
- [CoreCalendarGetActionEventsByTimesort200Response](docs/Model/CoreCalendarGetActionEventsByTimesort200Response.md)
- [CoreCalendarGetActionEventsByTimesortRequest](docs/Model/CoreCalendarGetActionEventsByTimesortRequest.md)
- [CoreCalendarGetAllowedEventTypes200Response](docs/Model/CoreCalendarGetAllowedEventTypes200Response.md)
- [CoreCalendarGetAllowedEventTypesRequest](docs/Model/CoreCalendarGetAllowedEventTypesRequest.md)
- [CoreCalendarGetCalendarAccessInformation200Response](docs/Model/CoreCalendarGetCalendarAccessInformation200Response.md)
- [CoreCalendarGetCalendarAccessInformationRequest](docs/Model/CoreCalendarGetCalendarAccessInformationRequest.md)
- [CoreCalendarGetCalendarDayView200Response](docs/Model/CoreCalendarGetCalendarDayView200Response.md)
- [CoreCalendarGetCalendarDayView200ResponseDate](docs/Model/CoreCalendarGetCalendarDayView200ResponseDate.md)
- [CoreCalendarGetCalendarDayView200ResponseEventsInner](docs/Model/CoreCalendarGetCalendarDayView200ResponseEventsInner.md)
- [CoreCalendarGetCalendarDayView200ResponseNextperiod](docs/Model/CoreCalendarGetCalendarDayView200ResponseNextperiod.md)
- [CoreCalendarGetCalendarDayViewRequest](docs/Model/CoreCalendarGetCalendarDayViewRequest.md)
- [CoreCalendarGetCalendarEventById200Response](docs/Model/CoreCalendarGetCalendarEventById200Response.md)
- [CoreCalendarGetCalendarEventById200ResponseEvent](docs/Model/CoreCalendarGetCalendarEventById200ResponseEvent.md)
- [CoreCalendarGetCalendarEventByIdRequest](docs/Model/CoreCalendarGetCalendarEventByIdRequest.md)
- [CoreCalendarGetCalendarEvents200Response](docs/Model/CoreCalendarGetCalendarEvents200Response.md)
- [CoreCalendarGetCalendarEvents200ResponseEventsInner](docs/Model/CoreCalendarGetCalendarEvents200ResponseEventsInner.md)
- [CoreCalendarGetCalendarEventsRequest](docs/Model/CoreCalendarGetCalendarEventsRequest.md)
- [CoreCalendarGetCalendarEventsRequestEvents](docs/Model/CoreCalendarGetCalendarEventsRequestEvents.md)
- [CoreCalendarGetCalendarEventsRequestOptions](docs/Model/CoreCalendarGetCalendarEventsRequestOptions.md)
- [CoreCalendarGetCalendarExportToken200Response](docs/Model/CoreCalendarGetCalendarExportToken200Response.md)
- [CoreCalendarGetCalendarMonthlyView200Response](docs/Model/CoreCalendarGetCalendarMonthlyView200Response.md)
- [CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner](docs/Model/CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner.md)
- [CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner](docs/Model/CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner.md)
- [CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner](docs/Model/CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.md)
- [CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner](docs/Model/CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner.md)
- [CoreCalendarGetCalendarMonthlyViewRequest](docs/Model/CoreCalendarGetCalendarMonthlyViewRequest.md)
- [CoreCalendarGetCalendarUpcomingView200Response](docs/Model/CoreCalendarGetCalendarUpcomingView200Response.md)
- [CoreCalendarGetCalendarUpcomingViewRequest](docs/Model/CoreCalendarGetCalendarUpcomingViewRequest.md)
- [CoreCalendarGetTimestamps200Response](docs/Model/CoreCalendarGetTimestamps200Response.md)
- [CoreCalendarGetTimestamps200ResponseTimestampsInner](docs/Model/CoreCalendarGetTimestamps200ResponseTimestampsInner.md)
- [CoreCalendarGetTimestampsRequest](docs/Model/CoreCalendarGetTimestampsRequest.md)
- [CoreCalendarGetTimestampsRequestDataInner](docs/Model/CoreCalendarGetTimestampsRequestDataInner.md)
- [CoreCalendarSubmitCreateUpdateForm200Response](docs/Model/CoreCalendarSubmitCreateUpdateForm200Response.md)
- [CoreCalendarSubmitCreateUpdateFormRequest](docs/Model/CoreCalendarSubmitCreateUpdateFormRequest.md)
- [CoreCalendarUpdateEventStartDay200Response](docs/Model/CoreCalendarUpdateEventStartDay200Response.md)
- [CoreCalendarUpdateEventStartDayRequest](docs/Model/CoreCalendarUpdateEventStartDayRequest.md)
- [CoreChangeEditmode200Response](docs/Model/CoreChangeEditmode200Response.md)
- [CoreChangeEditmodeRequest](docs/Model/CoreChangeEditmodeRequest.md)
- [CoreCohortAddCohortMembers200Response](docs/Model/CoreCohortAddCohortMembers200Response.md)
- [CoreCohortAddCohortMembersRequest](docs/Model/CoreCohortAddCohortMembersRequest.md)
- [CoreCohortAddCohortMembersRequestMembersInner](docs/Model/CoreCohortAddCohortMembersRequestMembersInner.md)
- [CoreCohortAddCohortMembersRequestMembersInnerCohorttype](docs/Model/CoreCohortAddCohortMembersRequestMembersInnerCohorttype.md)
- [CoreCohortAddCohortMembersRequestMembersInnerUsertype](docs/Model/CoreCohortAddCohortMembersRequestMembersInnerUsertype.md)
- [CoreCohortCreateCohortsRequest](docs/Model/CoreCohortCreateCohortsRequest.md)
- [CoreCohortCreateCohortsRequestCohortsInner](docs/Model/CoreCohortCreateCohortsRequestCohortsInner.md)
- [CoreCohortCreateCohortsRequestCohortsInnerCategorytype](docs/Model/CoreCohortCreateCohortsRequestCohortsInnerCategorytype.md)
- [CoreCohortCreateCohortsRequestCohortsInnerCustomfieldsInner](docs/Model/CoreCohortCreateCohortsRequestCohortsInnerCustomfieldsInner.md)
- [CoreCohortDeleteCohortMembersRequest](docs/Model/CoreCohortDeleteCohortMembersRequest.md)
- [CoreCohortDeleteCohortMembersRequestMembersInner](docs/Model/CoreCohortDeleteCohortMembersRequestMembersInner.md)
- [CoreCohortDeleteCohortsRequest](docs/Model/CoreCohortDeleteCohortsRequest.md)
- [CoreCohortGetCohortMembersRequest](docs/Model/CoreCohortGetCohortMembersRequest.md)
- [CoreCohortGetCohortsRequest](docs/Model/CoreCohortGetCohortsRequest.md)
- [CoreCohortSearchCohorts200Response](docs/Model/CoreCohortSearchCohorts200Response.md)
- [CoreCohortSearchCohorts200ResponseCohortsInner](docs/Model/CoreCohortSearchCohorts200ResponseCohortsInner.md)
- [CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner](docs/Model/CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner.md)
- [CoreCohortSearchCohortsRequest](docs/Model/CoreCohortSearchCohortsRequest.md)
- [CoreCohortSearchCohortsRequestContext](docs/Model/CoreCohortSearchCohortsRequestContext.md)
- [CoreCohortUpdateCohortsRequest](docs/Model/CoreCohortUpdateCohortsRequest.md)
- [CoreCohortUpdateCohortsRequestCohortsInner](docs/Model/CoreCohortUpdateCohortsRequestCohortsInner.md)
- [CoreCohortUpdateCohortsRequestCohortsInnerCategorytype](docs/Model/CoreCohortUpdateCohortsRequestCohortsInnerCategorytype.md)
- [CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner](docs/Model/CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md)
- [CoreCommentAddCommentsRequest](docs/Model/CoreCommentAddCommentsRequest.md)
- [CoreCommentAddCommentsRequestCommentsInner](docs/Model/CoreCommentAddCommentsRequestCommentsInner.md)
- [CoreCommentDeleteCommentsRequest](docs/Model/CoreCommentDeleteCommentsRequest.md)
- [CoreCommentGetComments200Response](docs/Model/CoreCommentGetComments200Response.md)
- [CoreCommentGetComments200ResponseCommentsInner](docs/Model/CoreCommentGetComments200ResponseCommentsInner.md)
- [CoreCommentGetCommentsRequest](docs/Model/CoreCommentGetCommentsRequest.md)
- [CoreCompetencyAddCompetencyToCourseRequest](docs/Model/CoreCompetencyAddCompetencyToCourseRequest.md)
- [CoreCompetencyAddCompetencyToPlanRequest](docs/Model/CoreCompetencyAddCompetencyToPlanRequest.md)
- [CoreCompetencyAddCompetencyToTemplateRequest](docs/Model/CoreCompetencyAddCompetencyToTemplateRequest.md)
- [CoreCompetencyAddRelatedCompetencyRequest](docs/Model/CoreCompetencyAddRelatedCompetencyRequest.md)
- [CoreCompetencyApprovePlanRequest](docs/Model/CoreCompetencyApprovePlanRequest.md)
- [CoreCompetencyCompetencyFrameworkViewedRequest](docs/Model/CoreCompetencyCompetencyFrameworkViewedRequest.md)
- [CoreCompetencyCompetencyViewedRequest](docs/Model/CoreCompetencyCompetencyViewedRequest.md)
- [CoreCompetencyCompletePlanRequest](docs/Model/CoreCompetencyCompletePlanRequest.md)
- [CoreCompetencyCountCompetenciesInCourseRequest](docs/Model/CoreCompetencyCountCompetenciesInCourseRequest.md)
- [CoreCompetencyCountCompetenciesInTemplateRequest](docs/Model/CoreCompetencyCountCompetenciesInTemplateRequest.md)
- [CoreCompetencyCountCompetenciesRequest](docs/Model/CoreCompetencyCountCompetenciesRequest.md)
- [CoreCompetencyCountCompetenciesRequestFiltersInner](docs/Model/CoreCompetencyCountCompetenciesRequestFiltersInner.md)
- [CoreCompetencyCountCompetencyFrameworksRequest](docs/Model/CoreCompetencyCountCompetencyFrameworksRequest.md)
- [CoreCompetencyCountCourseModuleCompetenciesRequest](docs/Model/CoreCompetencyCountCourseModuleCompetenciesRequest.md)
- [CoreCompetencyCreateCompetency200Response](docs/Model/CoreCompetencyCreateCompetency200Response.md)
- [CoreCompetencyCreateCompetencyFramework200Response](docs/Model/CoreCompetencyCreateCompetencyFramework200Response.md)
- [CoreCompetencyCreateCompetencyFrameworkRequest](docs/Model/CoreCompetencyCreateCompetencyFrameworkRequest.md)
- [CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework](docs/Model/CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework.md)
- [CoreCompetencyCreateCompetencyRequest](docs/Model/CoreCompetencyCreateCompetencyRequest.md)
- [CoreCompetencyCreateCompetencyRequestCompetency](docs/Model/CoreCompetencyCreateCompetencyRequestCompetency.md)
- [CoreCompetencyCreatePlan200Response](docs/Model/CoreCompetencyCreatePlan200Response.md)
- [CoreCompetencyCreatePlan200ResponseCommentarea](docs/Model/CoreCompetencyCreatePlan200ResponseCommentarea.md)
- [CoreCompetencyCreatePlan200ResponseReviewer](docs/Model/CoreCompetencyCreatePlan200ResponseReviewer.md)
- [CoreCompetencyCreatePlan200ResponseTemplate](docs/Model/CoreCompetencyCreatePlan200ResponseTemplate.md)
- [CoreCompetencyCreatePlanRequest](docs/Model/CoreCompetencyCreatePlanRequest.md)
- [CoreCompetencyCreatePlanRequestPlan](docs/Model/CoreCompetencyCreatePlanRequestPlan.md)
- [CoreCompetencyCreateTemplate200Response](docs/Model/CoreCompetencyCreateTemplate200Response.md)
- [CoreCompetencyCreateTemplateRequest](docs/Model/CoreCompetencyCreateTemplateRequest.md)
- [CoreCompetencyCreateTemplateRequestTemplate](docs/Model/CoreCompetencyCreateTemplateRequestTemplate.md)
- [CoreCompetencyCreateUserEvidenceCompetency200Response](docs/Model/CoreCompetencyCreateUserEvidenceCompetency200Response.md)
- [CoreCompetencyCreateUserEvidenceCompetencyRequest](docs/Model/CoreCompetencyCreateUserEvidenceCompetencyRequest.md)
- [CoreCompetencyDeleteCompetencyFrameworkRequest](docs/Model/CoreCompetencyDeleteCompetencyFrameworkRequest.md)
- [CoreCompetencyDeleteCompetencyRequest](docs/Model/CoreCompetencyDeleteCompetencyRequest.md)
- [CoreCompetencyDeleteEvidenceRequest](docs/Model/CoreCompetencyDeleteEvidenceRequest.md)
- [CoreCompetencyDeletePlanRequest](docs/Model/CoreCompetencyDeletePlanRequest.md)
- [CoreCompetencyDeleteTemplateRequest](docs/Model/CoreCompetencyDeleteTemplateRequest.md)
- [CoreCompetencyDeleteUserEvidenceCompetencyRequest](docs/Model/CoreCompetencyDeleteUserEvidenceCompetencyRequest.md)
- [CoreCompetencyDeleteUserEvidenceRequest](docs/Model/CoreCompetencyDeleteUserEvidenceRequest.md)
- [CoreCompetencyDuplicateCompetencyFramework200Response](docs/Model/CoreCompetencyDuplicateCompetencyFramework200Response.md)
- [CoreCompetencyDuplicateCompetencyFrameworkRequest](docs/Model/CoreCompetencyDuplicateCompetencyFrameworkRequest.md)
- [CoreCompetencyGetScaleValuesRequest](docs/Model/CoreCompetencyGetScaleValuesRequest.md)
- [CoreCompetencyGradeCompetency200Response](docs/Model/CoreCompetencyGradeCompetency200Response.md)
- [CoreCompetencyGradeCompetency200ResponseActionuser](docs/Model/CoreCompetencyGradeCompetency200ResponseActionuser.md)
- [CoreCompetencyGradeCompetencyInCourse200Response](docs/Model/CoreCompetencyGradeCompetencyInCourse200Response.md)
- [CoreCompetencyGradeCompetencyInCourseRequest](docs/Model/CoreCompetencyGradeCompetencyInCourseRequest.md)
- [CoreCompetencyGradeCompetencyInPlanRequest](docs/Model/CoreCompetencyGradeCompetencyInPlanRequest.md)
- [CoreCompetencyGradeCompetencyRequest](docs/Model/CoreCompetencyGradeCompetencyRequest.md)
- [CoreCompetencyListCompetenciesRequest](docs/Model/CoreCompetencyListCompetenciesRequest.md)
- [CoreCompetencyListCompetenciesRequestFiltersInner](docs/Model/CoreCompetencyListCompetenciesRequestFiltersInner.md)
- [CoreCompetencyListCompetencyFrameworksRequest](docs/Model/CoreCompetencyListCompetencyFrameworksRequest.md)
- [CoreCompetencyListCourseModuleCompetenciesRequest](docs/Model/CoreCompetencyListCourseModuleCompetenciesRequest.md)
- [CoreCompetencyListPlanCompetenciesRequest](docs/Model/CoreCompetencyListPlanCompetenciesRequest.md)
- [CoreCompetencyListTemplatesRequest](docs/Model/CoreCompetencyListTemplatesRequest.md)
- [CoreCompetencyListUserPlansRequest](docs/Model/CoreCompetencyListUserPlansRequest.md)
- [CoreCompetencyPlanCancelReviewRequestRequest](docs/Model/CoreCompetencyPlanCancelReviewRequestRequest.md)
- [CoreCompetencyReadCompetencyRequest](docs/Model/CoreCompetencyReadCompetencyRequest.md)
- [CoreCompetencyReadPlan200Response](docs/Model/CoreCompetencyReadPlan200Response.md)
- [CoreCompetencyReadPlan200ResponseCommentarea](docs/Model/CoreCompetencyReadPlan200ResponseCommentarea.md)
- [CoreCompetencyReadPlanRequest](docs/Model/CoreCompetencyReadPlanRequest.md)
- [CoreCompetencyReadTemplateRequest](docs/Model/CoreCompetencyReadTemplateRequest.md)
- [CoreCompetencyReadUserEvidence200Response](docs/Model/CoreCompetencyReadUserEvidence200Response.md)
- [CoreCompetencyReadUserEvidence200ResponseCompetenciesInner](docs/Model/CoreCompetencyReadUserEvidence200ResponseCompetenciesInner.md)
- [CoreCompetencyReadUserEvidence200ResponseFilesInner](docs/Model/CoreCompetencyReadUserEvidence200ResponseFilesInner.md)
- [CoreCompetencyRemoveCompetencyFromCourseRequest](docs/Model/CoreCompetencyRemoveCompetencyFromCourseRequest.md)
- [CoreCompetencyRemoveCompetencyFromPlanRequest](docs/Model/CoreCompetencyRemoveCompetencyFromPlanRequest.md)
- [CoreCompetencyRemoveCompetencyFromTemplateRequest](docs/Model/CoreCompetencyRemoveCompetencyFromTemplateRequest.md)
- [CoreCompetencyRemoveRelatedCompetencyRequest](docs/Model/CoreCompetencyRemoveRelatedCompetencyRequest.md)
- [CoreCompetencyReorderCourseCompetencyRequest](docs/Model/CoreCompetencyReorderCourseCompetencyRequest.md)
- [CoreCompetencyReorderPlanCompetencyRequest](docs/Model/CoreCompetencyReorderPlanCompetencyRequest.md)
- [CoreCompetencyReorderTemplateCompetencyRequest](docs/Model/CoreCompetencyReorderTemplateCompetencyRequest.md)
- [CoreCompetencySearchCompetenciesRequest](docs/Model/CoreCompetencySearchCompetenciesRequest.md)
- [CoreCompetencySetCourseCompetencyRuleoutcomeRequest](docs/Model/CoreCompetencySetCourseCompetencyRuleoutcomeRequest.md)
- [CoreCompetencySetParentCompetencyRequest](docs/Model/CoreCompetencySetParentCompetencyRequest.md)
- [CoreCompetencyUnlinkPlanFromTemplateRequest](docs/Model/CoreCompetencyUnlinkPlanFromTemplateRequest.md)
- [CoreCompetencyUpdateCompetencyFrameworkRequest](docs/Model/CoreCompetencyUpdateCompetencyFrameworkRequest.md)
- [CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework](docs/Model/CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework.md)
- [CoreCompetencyUpdateCompetencyRequest](docs/Model/CoreCompetencyUpdateCompetencyRequest.md)
- [CoreCompetencyUpdateCompetencyRequestCompetency](docs/Model/CoreCompetencyUpdateCompetencyRequestCompetency.md)
- [CoreCompetencyUpdateCourseCompetencySettingsRequest](docs/Model/CoreCompetencyUpdateCourseCompetencySettingsRequest.md)
- [CoreCompetencyUpdateCourseCompetencySettingsRequestSettings](docs/Model/CoreCompetencyUpdateCourseCompetencySettingsRequestSettings.md)
- [CoreCompetencyUpdatePlanRequest](docs/Model/CoreCompetencyUpdatePlanRequest.md)
- [CoreCompetencyUpdatePlanRequestPlan](docs/Model/CoreCompetencyUpdatePlanRequestPlan.md)
- [CoreCompetencyUpdateTemplateRequest](docs/Model/CoreCompetencyUpdateTemplateRequest.md)
- [CoreCompetencyUpdateTemplateRequestTemplate](docs/Model/CoreCompetencyUpdateTemplateRequestTemplate.md)
- [CoreCompetencyUserCompetencyCancelReviewRequestRequest](docs/Model/CoreCompetencyUserCompetencyCancelReviewRequestRequest.md)
- [CoreCompetencyUserCompetencyPlanViewedRequest](docs/Model/CoreCompetencyUserCompetencyPlanViewedRequest.md)
- [CoreCompetencyUserCompetencyRequestReviewRequest](docs/Model/CoreCompetencyUserCompetencyRequestReviewRequest.md)
- [CoreCompetencyUserCompetencyViewedInCourseRequest](docs/Model/CoreCompetencyUserCompetencyViewedInCourseRequest.md)
- [CoreCompetencyUserCompetencyViewedRequest](docs/Model/CoreCompetencyUserCompetencyViewedRequest.md)
- [CoreCompletionGetActivitiesCompletionStatus200Response](docs/Model/CoreCompletionGetActivitiesCompletionStatus200Response.md)
- [CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner](docs/Model/CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner.md)
- [CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner](docs/Model/CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner.md)
- [CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue](docs/Model/CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue.md)
- [CoreCompletionGetActivitiesCompletionStatusRequest](docs/Model/CoreCompletionGetActivitiesCompletionStatusRequest.md)
- [CoreCompletionGetCourseCompletionStatus200Response](docs/Model/CoreCompletionGetCourseCompletionStatus200Response.md)
- [CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus](docs/Model/CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus.md)
- [CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner](docs/Model/CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner.md)
- [CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails](docs/Model/CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails.md)
- [CoreCompletionMarkCourseSelfCompleted200Response](docs/Model/CoreCompletionMarkCourseSelfCompleted200Response.md)
- [CoreCompletionMarkCourseSelfCompletedRequest](docs/Model/CoreCompletionMarkCourseSelfCompletedRequest.md)
- [CoreCompletionOverrideActivityCompletionStatus200Response](docs/Model/CoreCompletionOverrideActivityCompletionStatus200Response.md)
- [CoreCompletionOverrideActivityCompletionStatusRequest](docs/Model/CoreCompletionOverrideActivityCompletionStatusRequest.md)
- [CoreCompletionUpdateActivityCompletionStatusManually200Response](docs/Model/CoreCompletionUpdateActivityCompletionStatusManually200Response.md)
- [CoreCompletionUpdateActivityCompletionStatusManuallyRequest](docs/Model/CoreCompletionUpdateActivityCompletionStatusManuallyRequest.md)
- [CoreContentbankCopyContent200Response](docs/Model/CoreContentbankCopyContent200Response.md)
- [CoreContentbankCopyContentRequest](docs/Model/CoreContentbankCopyContentRequest.md)
- [CoreContentbankDeleteContent200Response](docs/Model/CoreContentbankDeleteContent200Response.md)
- [CoreContentbankDeleteContentRequest](docs/Model/CoreContentbankDeleteContentRequest.md)
- [CoreContentbankRenameContent200Response](docs/Model/CoreContentbankRenameContent200Response.md)
- [CoreContentbankRenameContentRequest](docs/Model/CoreContentbankRenameContentRequest.md)
- [CoreContentbankSetContentVisibilityRequest](docs/Model/CoreContentbankSetContentVisibilityRequest.md)
- [CoreCourseAddContentItemToUserFavourites200Response](docs/Model/CoreCourseAddContentItemToUserFavourites200Response.md)
- [CoreCourseAddContentItemToUserFavouritesRequest](docs/Model/CoreCourseAddContentItemToUserFavouritesRequest.md)
- [CoreCourseCheckUpdates200Response](docs/Model/CoreCourseCheckUpdates200Response.md)
- [CoreCourseCheckUpdates200ResponseInstancesInner](docs/Model/CoreCourseCheckUpdates200ResponseInstancesInner.md)
- [CoreCourseCheckUpdates200ResponseInstancesInnerUpdatesInner](docs/Model/CoreCourseCheckUpdates200ResponseInstancesInnerUpdatesInner.md)
- [CoreCourseCheckUpdatesRequest](docs/Model/CoreCourseCheckUpdatesRequest.md)
- [CoreCourseCheckUpdatesRequestTocheckInner](docs/Model/CoreCourseCheckUpdatesRequestTocheckInner.md)
- [CoreCourseCreateCategoriesRequest](docs/Model/CoreCourseCreateCategoriesRequest.md)
- [CoreCourseCreateCategoriesRequestCategoriesInner](docs/Model/CoreCourseCreateCategoriesRequestCategoriesInner.md)
- [CoreCourseCreateCoursesRequest](docs/Model/CoreCourseCreateCoursesRequest.md)
- [CoreCourseCreateCoursesRequestCoursesInner](docs/Model/CoreCourseCreateCoursesRequestCoursesInner.md)
- [CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner](docs/Model/CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner.md)
- [CoreCourseDeleteCategoriesRequest](docs/Model/CoreCourseDeleteCategoriesRequest.md)
- [CoreCourseDeleteCategoriesRequestCategoriesInner](docs/Model/CoreCourseDeleteCategoriesRequestCategoriesInner.md)
- [CoreCourseDeleteCoursesRequest](docs/Model/CoreCourseDeleteCoursesRequest.md)
- [CoreCourseDeleteModulesRequest](docs/Model/CoreCourseDeleteModulesRequest.md)
- [CoreCourseDuplicateCourse200Response](docs/Model/CoreCourseDuplicateCourse200Response.md)
- [CoreCourseDuplicateCourseRequest](docs/Model/CoreCourseDuplicateCourseRequest.md)
- [CoreCourseDuplicateCourseRequestOptionsInner](docs/Model/CoreCourseDuplicateCourseRequestOptionsInner.md)
- [CoreCourseEditModuleRequest](docs/Model/CoreCourseEditModuleRequest.md)
- [CoreCourseEditSectionRequest](docs/Model/CoreCourseEditSectionRequest.md)
- [CoreCourseGetActivityChooserFooter200Response](docs/Model/CoreCourseGetActivityChooserFooter200Response.md)
- [CoreCourseGetActivityChooserFooterRequest](docs/Model/CoreCourseGetActivityChooserFooterRequest.md)
- [CoreCourseGetCategoriesRequest](docs/Model/CoreCourseGetCategoriesRequest.md)
- [CoreCourseGetCategoriesRequestCriteriaInner](docs/Model/CoreCourseGetCategoriesRequestCriteriaInner.md)
- [CoreCourseGetContentsRequest](docs/Model/CoreCourseGetContentsRequest.md)
- [CoreCourseGetContentsRequestOptionsInner](docs/Model/CoreCourseGetContentsRequestOptionsInner.md)
- [CoreCourseGetCourseContentItems200Response](docs/Model/CoreCourseGetCourseContentItems200Response.md)
- [CoreCourseGetCourseContentItems200ResponseContentItemsInner](docs/Model/CoreCourseGetCourseContentItems200ResponseContentItemsInner.md)
- [CoreCourseGetCourseContentItemsRequest](docs/Model/CoreCourseGetCourseContentItemsRequest.md)
- [CoreCourseGetCourseModule200Response](docs/Model/CoreCourseGetCourseModule200Response.md)
- [CoreCourseGetCourseModule200ResponseCm](docs/Model/CoreCourseGetCourseModule200ResponseCm.md)
- [CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner](docs/Model/CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner.md)
- [CoreCourseGetCourseModule200ResponseCmOutcomesInner](docs/Model/CoreCourseGetCourseModule200ResponseCmOutcomesInner.md)
- [CoreCourseGetCourseModuleByInstance200Response](docs/Model/CoreCourseGetCourseModuleByInstance200Response.md)
- [CoreCourseGetCourseModuleByInstance200ResponseCm](docs/Model/CoreCourseGetCourseModuleByInstance200ResponseCm.md)
- [CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner](docs/Model/CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner.md)
- [CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner](docs/Model/CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner.md)
- [CoreCourseGetCourseModuleByInstanceRequest](docs/Model/CoreCourseGetCourseModuleByInstanceRequest.md)
- [CoreCourseGetCoursesByField200Response](docs/Model/CoreCourseGetCoursesByField200Response.md)
- [CoreCourseGetCoursesByField200ResponseCoursesInner](docs/Model/CoreCourseGetCoursesByField200ResponseCoursesInner.md)
- [CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner](docs/Model/CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner.md)
- [CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner](docs/Model/CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner.md)
- [CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner](docs/Model/CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.md)
- [CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner](docs/Model/CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner.md)
- [CoreCourseGetCoursesByFieldRequest](docs/Model/CoreCourseGetCoursesByFieldRequest.md)
- [CoreCourseGetCoursesRequest](docs/Model/CoreCourseGetCoursesRequest.md)
- [CoreCourseGetCoursesRequestOptions](docs/Model/CoreCourseGetCoursesRequestOptions.md)
- [CoreCourseGetEnrolledCoursesByTimelineClassification200Response](docs/Model/CoreCourseGetEnrolledCoursesByTimelineClassification200Response.md)
- [CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner](docs/Model/CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner.md)
- [CoreCourseGetEnrolledCoursesByTimelineClassificationRequest](docs/Model/CoreCourseGetEnrolledCoursesByTimelineClassificationRequest.md)
- [CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response](docs/Model/CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response.md)
- [CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest](docs/Model/CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.md)
- [CoreCourseGetEnrolledUsersByCmid200Response](docs/Model/CoreCourseGetEnrolledUsersByCmid200Response.md)
- [CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner](docs/Model/CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner.md)
- [CoreCourseGetEnrolledUsersByCmidRequest](docs/Model/CoreCourseGetEnrolledUsersByCmidRequest.md)
- [CoreCourseGetModuleRequest](docs/Model/CoreCourseGetModuleRequest.md)
- [CoreCourseGetRecentCoursesRequest](docs/Model/CoreCourseGetRecentCoursesRequest.md)
- [CoreCourseGetUpdatesSince200Response](docs/Model/CoreCourseGetUpdatesSince200Response.md)
- [CoreCourseGetUpdatesSince200ResponseInstancesInner](docs/Model/CoreCourseGetUpdatesSince200ResponseInstancesInner.md)
- [CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner](docs/Model/CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner.md)
- [CoreCourseGetUpdatesSinceRequest](docs/Model/CoreCourseGetUpdatesSinceRequest.md)
- [CoreCourseGetUserAdministrationOptions200Response](docs/Model/CoreCourseGetUserAdministrationOptions200Response.md)
- [CoreCourseGetUserAdministrationOptions200ResponseCoursesInner](docs/Model/CoreCourseGetUserAdministrationOptions200ResponseCoursesInner.md)
- [CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner](docs/Model/CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner.md)
- [CoreCourseGetUserAdministrationOptionsRequest](docs/Model/CoreCourseGetUserAdministrationOptionsRequest.md)
- [CoreCourseGetUserNavigationOptions200Response](docs/Model/CoreCourseGetUserNavigationOptions200Response.md)
- [CoreCourseGetUserNavigationOptions200ResponseCoursesInner](docs/Model/CoreCourseGetUserNavigationOptions200ResponseCoursesInner.md)
- [CoreCourseGetUserNavigationOptions200ResponseCoursesInnerOptionsInner](docs/Model/CoreCourseGetUserNavigationOptions200ResponseCoursesInnerOptionsInner.md)
- [CoreCourseGetUserNavigationOptionsRequest](docs/Model/CoreCourseGetUserNavigationOptionsRequest.md)
- [CoreCourseImportCourseRequest](docs/Model/CoreCourseImportCourseRequest.md)
- [CoreCourseImportCourseRequestOptionsInner](docs/Model/CoreCourseImportCourseRequestOptionsInner.md)
- [CoreCourseRemoveContentItemFromUserFavouritesRequest](docs/Model/CoreCourseRemoveContentItemFromUserFavouritesRequest.md)
- [CoreCourseSearchCourses200Response](docs/Model/CoreCourseSearchCourses200Response.md)
- [CoreCourseSearchCourses200ResponseCoursesInner](docs/Model/CoreCourseSearchCourses200ResponseCoursesInner.md)
- [CoreCourseSearchCourses200ResponseCoursesInnerContactsInner](docs/Model/CoreCourseSearchCourses200ResponseCoursesInnerContactsInner.md)
- [CoreCourseSearchCoursesRequest](docs/Model/CoreCourseSearchCoursesRequest.md)
- [CoreCourseSetFavouriteCoursesRequest](docs/Model/CoreCourseSetFavouriteCoursesRequest.md)
- [CoreCourseSetFavouriteCoursesRequestCoursesInner](docs/Model/CoreCourseSetFavouriteCoursesRequestCoursesInner.md)
- [CoreCourseToggleActivityRecommendation200Response](docs/Model/CoreCourseToggleActivityRecommendation200Response.md)
- [CoreCourseToggleActivityRecommendationRequest](docs/Model/CoreCourseToggleActivityRecommendationRequest.md)
- [CoreCourseUpdateCategoriesRequest](docs/Model/CoreCourseUpdateCategoriesRequest.md)
- [CoreCourseUpdateCategoriesRequestCategoriesInner](docs/Model/CoreCourseUpdateCategoriesRequestCategoriesInner.md)
- [CoreCourseUpdateCoursesRequest](docs/Model/CoreCourseUpdateCoursesRequest.md)
- [CoreCourseUpdateCoursesRequestCoursesInner](docs/Model/CoreCourseUpdateCoursesRequestCoursesInner.md)
- [CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner](docs/Model/CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner.md)
- [CoreCourseViewCourseRequest](docs/Model/CoreCourseViewCourseRequest.md)
- [CoreCourseformatFileHandlersRequest](docs/Model/CoreCourseformatFileHandlersRequest.md)
- [CoreCourseformatUpdateCourseRequest](docs/Model/CoreCourseformatUpdateCourseRequest.md)
- [CoreCreateUserfeedbackActionRecordRequest](docs/Model/CoreCreateUserfeedbackActionRecordRequest.md)
- [CoreCustomfieldCreateCategoryRequest](docs/Model/CoreCustomfieldCreateCategoryRequest.md)
- [CoreCustomfieldDeleteCategoryRequest](docs/Model/CoreCustomfieldDeleteCategoryRequest.md)
- [CoreCustomfieldDeleteFieldRequest](docs/Model/CoreCustomfieldDeleteFieldRequest.md)
- [CoreCustomfieldMoveCategoryRequest](docs/Model/CoreCustomfieldMoveCategoryRequest.md)
- [CoreCustomfieldMoveFieldRequest](docs/Model/CoreCustomfieldMoveFieldRequest.md)
- [CoreCustomfieldReloadTemplate200Response](docs/Model/CoreCustomfieldReloadTemplate200Response.md)
- [CoreCustomfieldReloadTemplate200ResponseCategoriesInner](docs/Model/CoreCustomfieldReloadTemplate200ResponseCategoriesInner.md)
- [CoreCustomfieldReloadTemplate200ResponseCategoriesInnerFieldsInner](docs/Model/CoreCustomfieldReloadTemplate200ResponseCategoriesInnerFieldsInner.md)
- [CoreCustomfieldReloadTemplateRequest](docs/Model/CoreCustomfieldReloadTemplateRequest.md)
- [CoreDynamicTabsGetContent200Response](docs/Model/CoreDynamicTabsGetContent200Response.md)
- [CoreDynamicTabsGetContentRequest](docs/Model/CoreDynamicTabsGetContentRequest.md)
- [CoreEnrolGetCourseEnrolmentMethodsRequest](docs/Model/CoreEnrolGetCourseEnrolmentMethodsRequest.md)
- [CoreEnrolGetEnrolledUsersRequest](docs/Model/CoreEnrolGetEnrolledUsersRequest.md)
- [CoreEnrolGetEnrolledUsersRequestOptionsInner](docs/Model/CoreEnrolGetEnrolledUsersRequestOptionsInner.md)
- [CoreEnrolGetEnrolledUsersWithCapabilityRequest](docs/Model/CoreEnrolGetEnrolledUsersWithCapabilityRequest.md)
- [CoreEnrolGetEnrolledUsersWithCapabilityRequestCoursecapabilitiesInner](docs/Model/CoreEnrolGetEnrolledUsersWithCapabilityRequestCoursecapabilitiesInner.md)
- [CoreEnrolGetEnrolledUsersWithCapabilityRequestOptionsInner](docs/Model/CoreEnrolGetEnrolledUsersWithCapabilityRequestOptionsInner.md)
- [CoreEnrolGetPotentialUsersRequest](docs/Model/CoreEnrolGetPotentialUsersRequest.md)
- [CoreEnrolGetUsersCoursesRequest](docs/Model/CoreEnrolGetUsersCoursesRequest.md)
- [CoreEnrolSearchUsersRequest](docs/Model/CoreEnrolSearchUsersRequest.md)
- [CoreEnrolSubmitUserEnrolmentForm200Response](docs/Model/CoreEnrolSubmitUserEnrolmentForm200Response.md)
- [CoreEnrolSubmitUserEnrolmentFormRequest](docs/Model/CoreEnrolSubmitUserEnrolmentFormRequest.md)
- [CoreEnrolUnenrolUserEnrolment200Response](docs/Model/CoreEnrolUnenrolUserEnrolment200Response.md)
- [CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner](docs/Model/CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner.md)
- [CoreEnrolUnenrolUserEnrolmentRequest](docs/Model/CoreEnrolUnenrolUserEnrolmentRequest.md)
- [CoreFetchNotificationsRequest](docs/Model/CoreFetchNotificationsRequest.md)
- [CoreFilesDeleteDraftFiles200Response](docs/Model/CoreFilesDeleteDraftFiles200Response.md)
- [CoreFilesDeleteDraftFilesRequest](docs/Model/CoreFilesDeleteDraftFilesRequest.md)
- [CoreFilesDeleteDraftFilesRequestFilesInner](docs/Model/CoreFilesDeleteDraftFilesRequestFilesInner.md)
- [CoreFilesGetFiles200Response](docs/Model/CoreFilesGetFiles200Response.md)
- [CoreFilesGetFiles200ResponseFilesInner](docs/Model/CoreFilesGetFiles200ResponseFilesInner.md)
- [CoreFilesGetFiles200ResponseParentsInner](docs/Model/CoreFilesGetFiles200ResponseParentsInner.md)
- [CoreFilesGetFilesRequest](docs/Model/CoreFilesGetFilesRequest.md)
- [CoreFilesGetUnusedDraftItemid200Response](docs/Model/CoreFilesGetUnusedDraftItemid200Response.md)
- [CoreFilesUpload200Response](docs/Model/CoreFilesUpload200Response.md)
- [CoreFilesUploadRequest](docs/Model/CoreFilesUploadRequest.md)
- [CoreFiltersGetAvailableInContext200Response](docs/Model/CoreFiltersGetAvailableInContext200Response.md)
- [CoreFiltersGetAvailableInContext200ResponseFiltersInner](docs/Model/CoreFiltersGetAvailableInContext200ResponseFiltersInner.md)
- [CoreFiltersGetAvailableInContextRequest](docs/Model/CoreFiltersGetAvailableInContextRequest.md)
- [CoreFiltersGetAvailableInContextRequestContextsInner](docs/Model/CoreFiltersGetAvailableInContextRequestContextsInner.md)
- [CoreFormDynamicForm200Response](docs/Model/CoreFormDynamicForm200Response.md)
- [CoreFormDynamicFormRequest](docs/Model/CoreFormDynamicFormRequest.md)
- [CoreFormGetFiletypesBrowserData200Response](docs/Model/CoreFormGetFiletypesBrowserData200Response.md)
- [CoreFormGetFiletypesBrowserData200ResponseGroupsInner](docs/Model/CoreFormGetFiletypesBrowserData200ResponseGroupsInner.md)
- [CoreFormGetFiletypesBrowserData200ResponseGroupsInnerTypesInner](docs/Model/CoreFormGetFiletypesBrowserData200ResponseGroupsInnerTypesInner.md)
- [CoreFormGetFiletypesBrowserDataRequest](docs/Model/CoreFormGetFiletypesBrowserDataRequest.md)
- [CoreGetComponentStringsRequest](docs/Model/CoreGetComponentStringsRequest.md)
- [CoreGetFragment200Response](docs/Model/CoreGetFragment200Response.md)
- [CoreGetFragmentRequest](docs/Model/CoreGetFragmentRequest.md)
- [CoreGetFragmentRequestArgsInner](docs/Model/CoreGetFragmentRequestArgsInner.md)
- [CoreGetStringRequest](docs/Model/CoreGetStringRequest.md)
- [CoreGetStringRequestStringparamsInner](docs/Model/CoreGetStringRequestStringparamsInner.md)
- [CoreGetStringsRequest](docs/Model/CoreGetStringsRequest.md)
- [CoreGetStringsRequestStringsInner](docs/Model/CoreGetStringsRequestStringsInner.md)
- [CoreGetStringsRequestStringsInnerStringparamsInner](docs/Model/CoreGetStringsRequestStringsInnerStringparamsInner.md)
- [CoreGetUserDates200Response](docs/Model/CoreGetUserDates200Response.md)
- [CoreGetUserDatesRequest](docs/Model/CoreGetUserDatesRequest.md)
- [CoreGetUserDatesRequestTimestampsInner](docs/Model/CoreGetUserDatesRequestTimestampsInner.md)
- [CoreGradesCreateGradecategories200Response](docs/Model/CoreGradesCreateGradecategories200Response.md)
- [CoreGradesCreateGradecategoriesRequest](docs/Model/CoreGradesCreateGradecategoriesRequest.md)
- [CoreGradesCreateGradecategoriesRequestCategoriesInner](docs/Model/CoreGradesCreateGradecategoriesRequestCategoriesInner.md)
- [CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions](docs/Model/CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions.md)
- [CoreGradesGetEnrolledUsersForSearchWidget200Response](docs/Model/CoreGradesGetEnrolledUsersForSearchWidget200Response.md)
- [CoreGradesGetEnrolledUsersForSearchWidget200ResponseUsersInner](docs/Model/CoreGradesGetEnrolledUsersForSearchWidget200ResponseUsersInner.md)
- [CoreGradesGetEnrolledUsersForSearchWidgetRequest](docs/Model/CoreGradesGetEnrolledUsersForSearchWidgetRequest.md)
- [CoreGradesGetEnrolledUsersForSelector200Response](docs/Model/CoreGradesGetEnrolledUsersForSelector200Response.md)
- [CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner](docs/Model/CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner.md)
- [CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner](docs/Model/CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.md)
- [CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner](docs/Model/CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner.md)
- [CoreGradesGetEnrolledUsersForSelectorRequest](docs/Model/CoreGradesGetEnrolledUsersForSelectorRequest.md)
- [CoreGradesGetFeedback200Response](docs/Model/CoreGradesGetFeedback200Response.md)
- [CoreGradesGetFeedbackRequest](docs/Model/CoreGradesGetFeedbackRequest.md)
- [CoreGradesGetGradableUsers200Response](docs/Model/CoreGradesGetGradableUsers200Response.md)
- [CoreGradesGetGradableUsers200ResponseUsersInner](docs/Model/CoreGradesGetGradableUsers200ResponseUsersInner.md)
- [CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner](docs/Model/CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner.md)
- [CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner](docs/Model/CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner.md)
- [CoreGradesGetGradableUsersRequest](docs/Model/CoreGradesGetGradableUsersRequest.md)
- [CoreGradesGetGradeitems200Response](docs/Model/CoreGradesGetGradeitems200Response.md)
- [CoreGradesGetGradeitems200ResponseGradeItemsInner](docs/Model/CoreGradesGetGradeitems200ResponseGradeItemsInner.md)
- [CoreGradesGetGroupsForSearchWidget200Response](docs/Model/CoreGradesGetGroupsForSearchWidget200Response.md)
- [CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner](docs/Model/CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner.md)
- [CoreGradesGetGroupsForSearchWidgetRequest](docs/Model/CoreGradesGetGroupsForSearchWidgetRequest.md)
- [CoreGradesGetGroupsForSelector200Response](docs/Model/CoreGradesGetGroupsForSelector200Response.md)
- [CoreGradesGetGroupsForSelector200ResponseGroupsInner](docs/Model/CoreGradesGetGroupsForSelector200ResponseGroupsInner.md)
- [CoreGradesGraderGradingpanelPointFetch200Response](docs/Model/CoreGradesGraderGradingpanelPointFetch200Response.md)
- [CoreGradesGraderGradingpanelPointFetch200ResponseGrade](docs/Model/CoreGradesGraderGradingpanelPointFetch200ResponseGrade.md)
- [CoreGradesGraderGradingpanelPointFetchRequest](docs/Model/CoreGradesGraderGradingpanelPointFetchRequest.md)
- [CoreGradesGraderGradingpanelPointStore200Response](docs/Model/CoreGradesGraderGradingpanelPointStore200Response.md)
- [CoreGradesGraderGradingpanelPointStore200ResponseGrade](docs/Model/CoreGradesGraderGradingpanelPointStore200ResponseGrade.md)
- [CoreGradesGraderGradingpanelPointStoreRequest](docs/Model/CoreGradesGraderGradingpanelPointStoreRequest.md)
- [CoreGradesGraderGradingpanelScaleFetch200Response](docs/Model/CoreGradesGraderGradingpanelScaleFetch200Response.md)
- [CoreGradesGraderGradingpanelScaleFetch200ResponseGrade](docs/Model/CoreGradesGraderGradingpanelScaleFetch200ResponseGrade.md)
- [CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner](docs/Model/CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner.md)
- [CoreGradesGraderGradingpanelScaleFetchRequest](docs/Model/CoreGradesGraderGradingpanelScaleFetchRequest.md)
- [CoreGradesGraderGradingpanelScaleStore200Response](docs/Model/CoreGradesGraderGradingpanelScaleStore200Response.md)
- [CoreGradesGraderGradingpanelScaleStore200ResponseGrade](docs/Model/CoreGradesGraderGradingpanelScaleStore200ResponseGrade.md)
- [CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner](docs/Model/CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner.md)
- [CoreGradesGraderGradingpanelScaleStoreRequest](docs/Model/CoreGradesGraderGradingpanelScaleStoreRequest.md)
- [CoreGradesUpdateGradesRequest](docs/Model/CoreGradesUpdateGradesRequest.md)
- [CoreGradesUpdateGradesRequestGradesInner](docs/Model/CoreGradesUpdateGradesRequestGradesInner.md)
- [CoreGradesUpdateGradesRequestItemdetails](docs/Model/CoreGradesUpdateGradesRequestItemdetails.md)
- [CoreGradingGetDefinitions200Response](docs/Model/CoreGradingGetDefinitions200Response.md)
- [CoreGradingGetDefinitions200ResponseAreasInner](docs/Model/CoreGradingGetDefinitions200ResponseAreasInner.md)
- [CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner](docs/Model/CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner.md)
- [CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide](docs/Model/CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide.md)
- [CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner](docs/Model/CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner.md)
- [CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCriteriaInner](docs/Model/CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCriteriaInner.md)
- [CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric](docs/Model/CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric.md)
- [CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInner](docs/Model/CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInner.md)
- [CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner](docs/Model/CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner.md)
- [CoreGradingGetDefinitionsRequest](docs/Model/CoreGradingGetDefinitionsRequest.md)
- [CoreGradingGetGradingformInstances200Response](docs/Model/CoreGradingGetGradingformInstances200Response.md)
- [CoreGradingGetGradingformInstances200ResponseInstancesInner](docs/Model/CoreGradingGetGradingformInstances200ResponseInstancesInner.md)
- [CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide](docs/Model/CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide.md)
- [CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner](docs/Model/CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner.md)
- [CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric](docs/Model/CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric.md)
- [CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner](docs/Model/CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner.md)
- [CoreGradingGetGradingformInstancesRequest](docs/Model/CoreGradingGetGradingformInstancesRequest.md)
- [CoreGradingSaveDefinitionsRequest](docs/Model/CoreGradingSaveDefinitionsRequest.md)
- [CoreGradingSaveDefinitionsRequestAreasInner](docs/Model/CoreGradingSaveDefinitionsRequestAreasInner.md)
- [CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner](docs/Model/CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner.md)
- [CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide](docs/Model/CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide.md)
- [CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner](docs/Model/CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner.md)
- [CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner](docs/Model/CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner.md)
- [CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric](docs/Model/CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric.md)
- [CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner](docs/Model/CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner.md)
- [CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner](docs/Model/CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner.md)
- [CoreGroupAddGroupMembersRequest](docs/Model/CoreGroupAddGroupMembersRequest.md)
- [CoreGroupAddGroupMembersRequestMembersInner](docs/Model/CoreGroupAddGroupMembersRequestMembersInner.md)
- [CoreGroupAssignGroupingRequest](docs/Model/CoreGroupAssignGroupingRequest.md)
- [CoreGroupAssignGroupingRequestAssignmentsInner](docs/Model/CoreGroupAssignGroupingRequestAssignmentsInner.md)
- [CoreGroupCreateGroupingsRequest](docs/Model/CoreGroupCreateGroupingsRequest.md)
- [CoreGroupCreateGroupingsRequestGroupingsInner](docs/Model/CoreGroupCreateGroupingsRequestGroupingsInner.md)
- [CoreGroupCreateGroupsRequest](docs/Model/CoreGroupCreateGroupsRequest.md)
- [CoreGroupCreateGroupsRequestGroupsInner](docs/Model/CoreGroupCreateGroupsRequestGroupsInner.md)
- [CoreGroupDeleteGroupMembersRequest](docs/Model/CoreGroupDeleteGroupMembersRequest.md)
- [CoreGroupDeleteGroupMembersRequestMembersInner](docs/Model/CoreGroupDeleteGroupMembersRequestMembersInner.md)
- [CoreGroupDeleteGroupingsRequest](docs/Model/CoreGroupDeleteGroupingsRequest.md)
- [CoreGroupDeleteGroupsRequest](docs/Model/CoreGroupDeleteGroupsRequest.md)
- [CoreGroupGetActivityAllowedGroups200Response](docs/Model/CoreGroupGetActivityAllowedGroups200Response.md)
- [CoreGroupGetActivityAllowedGroups200ResponseGroupsInner](docs/Model/CoreGroupGetActivityAllowedGroups200ResponseGroupsInner.md)
- [CoreGroupGetActivityAllowedGroupsRequest](docs/Model/CoreGroupGetActivityAllowedGroupsRequest.md)
- [CoreGroupGetActivityGroupmode200Response](docs/Model/CoreGroupGetActivityGroupmode200Response.md)
- [CoreGroupGetActivityGroupmodeRequest](docs/Model/CoreGroupGetActivityGroupmodeRequest.md)
- [CoreGroupGetCourseGroupingsRequest](docs/Model/CoreGroupGetCourseGroupingsRequest.md)
- [CoreGroupGetCourseUserGroups200Response](docs/Model/CoreGroupGetCourseUserGroups200Response.md)
- [CoreGroupGetCourseUserGroups200ResponseGroupsInner](docs/Model/CoreGroupGetCourseUserGroups200ResponseGroupsInner.md)
- [CoreGroupGetCourseUserGroupsRequest](docs/Model/CoreGroupGetCourseUserGroupsRequest.md)
- [CoreGroupGetGroupMembersRequest](docs/Model/CoreGroupGetGroupMembersRequest.md)
- [CoreGroupGetGroupingsRequest](docs/Model/CoreGroupGetGroupingsRequest.md)
- [CoreGroupUnassignGroupingRequest](docs/Model/CoreGroupUnassignGroupingRequest.md)
- [CoreGroupUnassignGroupingRequestUnassignmentsInner](docs/Model/CoreGroupUnassignGroupingRequestUnassignmentsInner.md)
- [CoreGroupUpdateGroupingsRequest](docs/Model/CoreGroupUpdateGroupingsRequest.md)
- [CoreGroupUpdateGroupingsRequestGroupingsInner](docs/Model/CoreGroupUpdateGroupingsRequestGroupingsInner.md)
- [CoreGroupUpdateGroupsRequest](docs/Model/CoreGroupUpdateGroupsRequest.md)
- [CoreGroupUpdateGroupsRequestGroupsInner](docs/Model/CoreGroupUpdateGroupsRequestGroupsInner.md)
- [CoreH5pGetTrustedH5pFile200Response](docs/Model/CoreH5pGetTrustedH5pFile200Response.md)
- [CoreH5pGetTrustedH5pFileRequest](docs/Model/CoreH5pGetTrustedH5pFileRequest.md)
- [CoreMessageBlockUserRequest](docs/Model/CoreMessageBlockUserRequest.md)
- [CoreMessageConfirmContactRequestRequest](docs/Model/CoreMessageConfirmContactRequestRequest.md)
- [CoreMessageCreateContactRequest200Response](docs/Model/CoreMessageCreateContactRequest200Response.md)
- [CoreMessageCreateContactRequest200ResponseRequest](docs/Model/CoreMessageCreateContactRequest200ResponseRequest.md)
- [CoreMessageCreateContactRequestRequest](docs/Model/CoreMessageCreateContactRequestRequest.md)
- [CoreMessageDataForMessageareaSearchMessages200Response](docs/Model/CoreMessageDataForMessageareaSearchMessages200Response.md)
- [CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner](docs/Model/CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner.md)
- [CoreMessageDataForMessageareaSearchMessagesRequest](docs/Model/CoreMessageDataForMessageareaSearchMessagesRequest.md)
- [CoreMessageDeleteContactsRequest](docs/Model/CoreMessageDeleteContactsRequest.md)
- [CoreMessageDeleteConversationsByIdRequest](docs/Model/CoreMessageDeleteConversationsByIdRequest.md)
- [CoreMessageDeleteMessage200Response](docs/Model/CoreMessageDeleteMessage200Response.md)
- [CoreMessageDeleteMessageForAllUsersRequest](docs/Model/CoreMessageDeleteMessageForAllUsersRequest.md)
- [CoreMessageDeleteMessageRequest](docs/Model/CoreMessageDeleteMessageRequest.md)
- [CoreMessageGetBlockedUsers200Response](docs/Model/CoreMessageGetBlockedUsers200Response.md)
- [CoreMessageGetBlockedUsers200ResponseUsersInner](docs/Model/CoreMessageGetBlockedUsers200ResponseUsersInner.md)
- [CoreMessageGetBlockedUsersRequest](docs/Model/CoreMessageGetBlockedUsersRequest.md)
- [CoreMessageGetContactRequestsRequest](docs/Model/CoreMessageGetContactRequestsRequest.md)
- [CoreMessageGetConversation200Response](docs/Model/CoreMessageGetConversation200Response.md)
- [CoreMessageGetConversation200ResponseMembersInner](docs/Model/CoreMessageGetConversation200ResponseMembersInner.md)
- [CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner](docs/Model/CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner.md)
- [CoreMessageGetConversation200ResponseMembersInnerConversationsInner](docs/Model/CoreMessageGetConversation200ResponseMembersInnerConversationsInner.md)
- [CoreMessageGetConversation200ResponseMessagesInner](docs/Model/CoreMessageGetConversation200ResponseMessagesInner.md)
- [CoreMessageGetConversationBetweenUsers200Response](docs/Model/CoreMessageGetConversationBetweenUsers200Response.md)
- [CoreMessageGetConversationBetweenUsers200ResponseMembersInner](docs/Model/CoreMessageGetConversationBetweenUsers200ResponseMembersInner.md)
- [CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner](docs/Model/CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner.md)
- [CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner](docs/Model/CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner.md)
- [CoreMessageGetConversationBetweenUsers200ResponseMessagesInner](docs/Model/CoreMessageGetConversationBetweenUsers200ResponseMessagesInner.md)
- [CoreMessageGetConversationBetweenUsersRequest](docs/Model/CoreMessageGetConversationBetweenUsersRequest.md)
- [CoreMessageGetConversationCounts200Response](docs/Model/CoreMessageGetConversationCounts200Response.md)
- [CoreMessageGetConversationCounts200ResponseTypes](docs/Model/CoreMessageGetConversationCounts200ResponseTypes.md)
- [CoreMessageGetConversationCountsRequest](docs/Model/CoreMessageGetConversationCountsRequest.md)
- [CoreMessageGetConversationMembersRequest](docs/Model/CoreMessageGetConversationMembersRequest.md)
- [CoreMessageGetConversationMessages200Response](docs/Model/CoreMessageGetConversationMessages200Response.md)
- [CoreMessageGetConversationMessagesRequest](docs/Model/CoreMessageGetConversationMessagesRequest.md)
- [CoreMessageGetConversationRequest](docs/Model/CoreMessageGetConversationRequest.md)
- [CoreMessageGetConversations200Response](docs/Model/CoreMessageGetConversations200Response.md)
- [CoreMessageGetConversations200ResponseConversationsInner](docs/Model/CoreMessageGetConversations200ResponseConversationsInner.md)
- [CoreMessageGetConversationsRequest](docs/Model/CoreMessageGetConversationsRequest.md)
- [CoreMessageGetMemberInfoRequest](docs/Model/CoreMessageGetMemberInfoRequest.md)
- [CoreMessageGetMessageProcessor200Response](docs/Model/CoreMessageGetMessageProcessor200Response.md)
- [CoreMessageGetMessageProcessorRequest](docs/Model/CoreMessageGetMessageProcessorRequest.md)
- [CoreMessageGetMessages200Response](docs/Model/CoreMessageGetMessages200Response.md)
- [CoreMessageGetMessages200ResponseMessagesInner](docs/Model/CoreMessageGetMessages200ResponseMessagesInner.md)
- [CoreMessageGetMessagesRequest](docs/Model/CoreMessageGetMessagesRequest.md)
- [CoreMessageGetReceivedContactRequestsCountRequest](docs/Model/CoreMessageGetReceivedContactRequestsCountRequest.md)
- [CoreMessageGetSelfConversationRequest](docs/Model/CoreMessageGetSelfConversationRequest.md)
- [CoreMessageGetUnreadConversationCounts200Response](docs/Model/CoreMessageGetUnreadConversationCounts200Response.md)
- [CoreMessageGetUnreadConversationCounts200ResponseTypes](docs/Model/CoreMessageGetUnreadConversationCounts200ResponseTypes.md)
- [CoreMessageGetUnreadConversationsCountRequest](docs/Model/CoreMessageGetUnreadConversationsCountRequest.md)
- [CoreMessageGetUnreadNotificationCountRequest](docs/Model/CoreMessageGetUnreadNotificationCountRequest.md)
- [CoreMessageGetUserContactsRequest](docs/Model/CoreMessageGetUserContactsRequest.md)
- [CoreMessageGetUserMessagePreferences200Response](docs/Model/CoreMessageGetUserMessagePreferences200Response.md)
- [CoreMessageGetUserMessagePreferences200ResponsePreferences](docs/Model/CoreMessageGetUserMessagePreferences200ResponsePreferences.md)
- [CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner](docs/Model/CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner.md)
- [CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner](docs/Model/CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner.md)
- [CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner](docs/Model/CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner.md)
- [CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedin](docs/Model/CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedin.md)
- [CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff](docs/Model/CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff.md)
- [CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner](docs/Model/CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner.md)
- [CoreMessageGetUserNotificationPreferences200Response](docs/Model/CoreMessageGetUserNotificationPreferences200Response.md)
- [CoreMessageGetUserNotificationPreferences200ResponsePreferences](docs/Model/CoreMessageGetUserNotificationPreferences200ResponsePreferences.md)
- [CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner](docs/Model/CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner.md)
- [CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner](docs/Model/CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner.md)
- [CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner](docs/Model/CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner.md)
- [CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner](docs/Model/CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner.md)
- [CoreMessageMarkAllConversationMessagesAsReadRequest](docs/Model/CoreMessageMarkAllConversationMessagesAsReadRequest.md)
- [CoreMessageMarkAllNotificationsAsReadRequest](docs/Model/CoreMessageMarkAllNotificationsAsReadRequest.md)
- [CoreMessageMarkMessageRead200Response](docs/Model/CoreMessageMarkMessageRead200Response.md)
- [CoreMessageMarkMessageReadRequest](docs/Model/CoreMessageMarkMessageReadRequest.md)
- [CoreMessageMarkNotificationRead200Response](docs/Model/CoreMessageMarkNotificationRead200Response.md)
- [CoreMessageMarkNotificationReadRequest](docs/Model/CoreMessageMarkNotificationReadRequest.md)
- [CoreMessageMessageProcessorConfigFormRequest](docs/Model/CoreMessageMessageProcessorConfigFormRequest.md)
- [CoreMessageMessageProcessorConfigFormRequestFormvaluesInner](docs/Model/CoreMessageMessageProcessorConfigFormRequestFormvaluesInner.md)
- [CoreMessageMessageSearchUsers200Response](docs/Model/CoreMessageMessageSearchUsers200Response.md)
- [CoreMessageMessageSearchUsersRequest](docs/Model/CoreMessageMessageSearchUsersRequest.md)
- [CoreMessageMuteConversationsRequest](docs/Model/CoreMessageMuteConversationsRequest.md)
- [CoreMessageSearchContactsRequest](docs/Model/CoreMessageSearchContactsRequest.md)
- [CoreMessageSendInstantMessagesRequest](docs/Model/CoreMessageSendInstantMessagesRequest.md)
- [CoreMessageSendInstantMessagesRequestMessagesInner](docs/Model/CoreMessageSendInstantMessagesRequestMessagesInner.md)
- [CoreMessageSendMessagesToConversationRequest](docs/Model/CoreMessageSendMessagesToConversationRequest.md)
- [CoreMessageSendMessagesToConversationRequestMessagesInner](docs/Model/CoreMessageSendMessagesToConversationRequestMessagesInner.md)
- [CoreMessageSetFavouriteConversationsRequest](docs/Model/CoreMessageSetFavouriteConversationsRequest.md)
- [CoreMessageUnblockUserRequest](docs/Model/CoreMessageUnblockUserRequest.md)
- [CoreMessageUnmuteConversationsRequest](docs/Model/CoreMessageUnmuteConversationsRequest.md)
- [CoreMoodlenetAuthCheck200Response](docs/Model/CoreMoodlenetAuthCheck200Response.md)
- [CoreMoodlenetAuthCheckRequest](docs/Model/CoreMoodlenetAuthCheckRequest.md)
- [CoreMoodlenetGetShareInfoActivity200Response](docs/Model/CoreMoodlenetGetShareInfoActivity200Response.md)
- [CoreMoodlenetGetShareInfoActivityRequest](docs/Model/CoreMoodlenetGetShareInfoActivityRequest.md)
- [CoreMoodlenetGetSharedCourseInfo200Response](docs/Model/CoreMoodlenetGetSharedCourseInfo200Response.md)
- [CoreMoodlenetGetSharedCourseInfoRequest](docs/Model/CoreMoodlenetGetSharedCourseInfoRequest.md)
- [CoreMoodlenetSendActivity200Response](docs/Model/CoreMoodlenetSendActivity200Response.md)
- [CoreMoodlenetSendActivityRequest](docs/Model/CoreMoodlenetSendActivityRequest.md)
- [CoreMoodlenetSendCourse200Response](docs/Model/CoreMoodlenetSendCourse200Response.md)
- [CoreMoodlenetSendCourseRequest](docs/Model/CoreMoodlenetSendCourseRequest.md)
- [CoreMyViewPageRequest](docs/Model/CoreMyViewPageRequest.md)
- [CoreNotesCreateNotesRequest](docs/Model/CoreNotesCreateNotesRequest.md)
- [CoreNotesCreateNotesRequestNotesInner](docs/Model/CoreNotesCreateNotesRequestNotesInner.md)
- [CoreNotesDeleteNotesRequest](docs/Model/CoreNotesDeleteNotesRequest.md)
- [CoreNotesGetCourseNotes200Response](docs/Model/CoreNotesGetCourseNotes200Response.md)
- [CoreNotesGetCourseNotes200ResponseCoursenotesInner](docs/Model/CoreNotesGetCourseNotes200ResponseCoursenotesInner.md)
- [CoreNotesGetCourseNotes200ResponsePersonalnotesInner](docs/Model/CoreNotesGetCourseNotes200ResponsePersonalnotesInner.md)
- [CoreNotesGetCourseNotesRequest](docs/Model/CoreNotesGetCourseNotesRequest.md)
- [CoreNotesGetNotes200Response](docs/Model/CoreNotesGetNotes200Response.md)
- [CoreNotesGetNotes200ResponseNotesInner](docs/Model/CoreNotesGetNotes200ResponseNotesInner.md)
- [CoreNotesGetNotes200ResponseWarningsInner](docs/Model/CoreNotesGetNotes200ResponseWarningsInner.md)
- [CoreNotesGetNotesRequest](docs/Model/CoreNotesGetNotesRequest.md)
- [CoreNotesUpdateNotesRequest](docs/Model/CoreNotesUpdateNotesRequest.md)
- [CoreNotesUpdateNotesRequestNotesInner](docs/Model/CoreNotesUpdateNotesRequestNotesInner.md)
- [CoreNotesViewNotesRequest](docs/Model/CoreNotesViewNotesRequest.md)
- [CoreOutputLoadFontawesomeIconSystemMapRequest](docs/Model/CoreOutputLoadFontawesomeIconSystemMapRequest.md)
- [CoreOutputLoadTemplateRequest](docs/Model/CoreOutputLoadTemplateRequest.md)
- [CoreOutputLoadTemplateWithDependencies200Response](docs/Model/CoreOutputLoadTemplateWithDependencies200Response.md)
- [CoreOutputLoadTemplateWithDependencies200ResponseStringsInner](docs/Model/CoreOutputLoadTemplateWithDependencies200ResponseStringsInner.md)
- [CoreOutputLoadTemplateWithDependencies200ResponseTemplatesInner](docs/Model/CoreOutputLoadTemplateWithDependencies200ResponseTemplatesInner.md)
- [CoreOutputLoadTemplateWithDependenciesRequest](docs/Model/CoreOutputLoadTemplateWithDependenciesRequest.md)
- [CorePaymentGetAvailableGatewaysRequest](docs/Model/CorePaymentGetAvailableGatewaysRequest.md)
- [CoreQuestionGetRandomQuestionSummaries200Response](docs/Model/CoreQuestionGetRandomQuestionSummaries200Response.md)
- [CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner](docs/Model/CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner.md)
- [CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon](docs/Model/CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon.md)
- [CoreQuestionGetRandomQuestionSummariesRequest](docs/Model/CoreQuestionGetRandomQuestionSummariesRequest.md)
- [CoreQuestionSubmitTagsForm200Response](docs/Model/CoreQuestionSubmitTagsForm200Response.md)
- [CoreQuestionSubmitTagsFormRequest](docs/Model/CoreQuestionSubmitTagsFormRequest.md)
- [CoreQuestionUpdateFlagRequest](docs/Model/CoreQuestionUpdateFlagRequest.md)
- [CoreRatingAddRating200Response](docs/Model/CoreRatingAddRating200Response.md)
- [CoreRatingAddRatingRequest](docs/Model/CoreRatingAddRatingRequest.md)
- [CoreRatingGetItemRatings200Response](docs/Model/CoreRatingGetItemRatings200Response.md)
- [CoreRatingGetItemRatings200ResponseRatingsInner](docs/Model/CoreRatingGetItemRatings200ResponseRatingsInner.md)
- [CoreRatingGetItemRatingsRequest](docs/Model/CoreRatingGetItemRatingsRequest.md)
- [CoreReportbuilderAudiencesDeleteRequest](docs/Model/CoreReportbuilderAudiencesDeleteRequest.md)
- [CoreReportbuilderCanViewSystemReportRequest](docs/Model/CoreReportbuilderCanViewSystemReportRequest.md)
- [CoreReportbuilderCanViewSystemReportRequestParametersInner](docs/Model/CoreReportbuilderCanViewSystemReportRequestParametersInner.md)
- [CoreReportbuilderColumnsAdd200Response](docs/Model/CoreReportbuilderColumnsAdd200Response.md)
- [CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner](docs/Model/CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner.md)
- [CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon](docs/Model/CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon.md)
- [CoreReportbuilderColumnsAddRequest](docs/Model/CoreReportbuilderColumnsAddRequest.md)
- [CoreReportbuilderColumnsDelete200Response](docs/Model/CoreReportbuilderColumnsDelete200Response.md)
- [CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner](docs/Model/CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner.md)
- [CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon](docs/Model/CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon.md)
- [CoreReportbuilderColumnsDeleteRequest](docs/Model/CoreReportbuilderColumnsDeleteRequest.md)
- [CoreReportbuilderColumnsReorderRequest](docs/Model/CoreReportbuilderColumnsReorderRequest.md)
- [CoreReportbuilderColumnsSortGetRequest](docs/Model/CoreReportbuilderColumnsSortGetRequest.md)
- [CoreReportbuilderColumnsSortReorderRequest](docs/Model/CoreReportbuilderColumnsSortReorderRequest.md)
- [CoreReportbuilderColumnsSortToggleRequest](docs/Model/CoreReportbuilderColumnsSortToggleRequest.md)
- [CoreReportbuilderConditionsAdd200Response](docs/Model/CoreReportbuilderConditionsAdd200Response.md)
- [CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner](docs/Model/CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner.md)
- [CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroup](docs/Model/CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroup.md)
- [CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInner](docs/Model/CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInner.md)
- [CoreReportbuilderConditionsAddRequest](docs/Model/CoreReportbuilderConditionsAddRequest.md)
- [CoreReportbuilderConditionsDelete200Response](docs/Model/CoreReportbuilderConditionsDelete200Response.md)
- [CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner](docs/Model/CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner.md)
- [CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup](docs/Model/CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup.md)
- [CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupValuesInner](docs/Model/CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupValuesInner.md)
- [CoreReportbuilderConditionsDeleteRequest](docs/Model/CoreReportbuilderConditionsDeleteRequest.md)
- [CoreReportbuilderConditionsReorderRequest](docs/Model/CoreReportbuilderConditionsReorderRequest.md)
- [CoreReportbuilderFiltersAdd200Response](docs/Model/CoreReportbuilderFiltersAdd200Response.md)
- [CoreReportbuilderFiltersAdd200ResponseActivefiltersInner](docs/Model/CoreReportbuilderFiltersAdd200ResponseActivefiltersInner.md)
- [CoreReportbuilderFiltersAddRequest](docs/Model/CoreReportbuilderFiltersAddRequest.md)
- [CoreReportbuilderFiltersDelete200Response](docs/Model/CoreReportbuilderFiltersDelete200Response.md)
- [CoreReportbuilderFiltersDelete200ResponseActivefiltersInner](docs/Model/CoreReportbuilderFiltersDelete200ResponseActivefiltersInner.md)
- [CoreReportbuilderFiltersDeleteRequest](docs/Model/CoreReportbuilderFiltersDeleteRequest.md)
- [CoreReportbuilderFiltersReorderRequest](docs/Model/CoreReportbuilderFiltersReorderRequest.md)
- [CoreReportbuilderFiltersResetRequest](docs/Model/CoreReportbuilderFiltersResetRequest.md)
- [CoreReportbuilderListReports200Response](docs/Model/CoreReportbuilderListReports200Response.md)
- [CoreReportbuilderListReports200ResponseReportsInner](docs/Model/CoreReportbuilderListReports200ResponseReportsInner.md)
- [CoreReportbuilderListReportsRequest](docs/Model/CoreReportbuilderListReportsRequest.md)
- [CoreReportbuilderReportsGet200Response](docs/Model/CoreReportbuilderReportsGet200Response.md)
- [CoreReportbuilderReportsGet200ResponseAttributesInner](docs/Model/CoreReportbuilderReportsGet200ResponseAttributesInner.md)
- [CoreReportbuilderReportsGet200ResponseCardview](docs/Model/CoreReportbuilderReportsGet200ResponseCardview.md)
- [CoreReportbuilderReportsGet200ResponseSidebarmenucards](docs/Model/CoreReportbuilderReportsGet200ResponseSidebarmenucards.md)
- [CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInner](docs/Model/CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInner.md)
- [CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner](docs/Model/CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner.md)
- [CoreReportbuilderReportsGetRequest](docs/Model/CoreReportbuilderReportsGetRequest.md)
- [CoreReportbuilderRetrieveReport200Response](docs/Model/CoreReportbuilderRetrieveReport200Response.md)
- [CoreReportbuilderRetrieveReport200ResponseData](docs/Model/CoreReportbuilderRetrieveReport200ResponseData.md)
- [CoreReportbuilderRetrieveReport200ResponseDataRowsInner](docs/Model/CoreReportbuilderRetrieveReport200ResponseDataRowsInner.md)
- [CoreReportbuilderRetrieveReport200ResponseDetails](docs/Model/CoreReportbuilderRetrieveReport200ResponseDetails.md)
- [CoreReportbuilderRetrieveReportRequest](docs/Model/CoreReportbuilderRetrieveReportRequest.md)
- [CoreReportbuilderRetrieveSystemReport200Response](docs/Model/CoreReportbuilderRetrieveSystemReport200Response.md)
- [CoreReportbuilderRetrieveSystemReport200ResponseData](docs/Model/CoreReportbuilderRetrieveSystemReport200ResponseData.md)
- [CoreReportbuilderRetrieveSystemReport200ResponseDataRowsInner](docs/Model/CoreReportbuilderRetrieveSystemReport200ResponseDataRowsInner.md)
- [CoreReportbuilderRetrieveSystemReportRequest](docs/Model/CoreReportbuilderRetrieveSystemReportRequest.md)
- [CoreReportbuilderSchedulesDeleteRequest](docs/Model/CoreReportbuilderSchedulesDeleteRequest.md)
- [CoreReportbuilderSchedulesSendRequest](docs/Model/CoreReportbuilderSchedulesSendRequest.md)
- [CoreReportbuilderSchedulesToggleRequest](docs/Model/CoreReportbuilderSchedulesToggleRequest.md)
- [CoreReportbuilderSetFiltersRequest](docs/Model/CoreReportbuilderSetFiltersRequest.md)
- [CoreReportbuilderViewReport200Response](docs/Model/CoreReportbuilderViewReport200Response.md)
- [CoreRoleAssignRolesRequest](docs/Model/CoreRoleAssignRolesRequest.md)
- [CoreRoleAssignRolesRequestAssignmentsInner](docs/Model/CoreRoleAssignRolesRequestAssignmentsInner.md)
- [CoreRoleUnassignRolesRequest](docs/Model/CoreRoleUnassignRolesRequest.md)
- [CoreRoleUnassignRolesRequestUnassignmentsInner](docs/Model/CoreRoleUnassignRolesRequestUnassignmentsInner.md)
- [CoreSearchGetRelevantUsersRequest](docs/Model/CoreSearchGetRelevantUsersRequest.md)
- [CoreSearchGetResults200Response](docs/Model/CoreSearchGetResults200Response.md)
- [CoreSearchGetResults200ResponseResultsInner](docs/Model/CoreSearchGetResults200ResponseResultsInner.md)
- [CoreSearchGetResultsRequest](docs/Model/CoreSearchGetResultsRequest.md)
- [CoreSearchGetResultsRequestFilters](docs/Model/CoreSearchGetResultsRequestFilters.md)
- [CoreSearchGetSearchAreasList200Response](docs/Model/CoreSearchGetSearchAreasList200Response.md)
- [CoreSearchGetSearchAreasList200ResponseAreasInner](docs/Model/CoreSearchGetSearchAreasList200ResponseAreasInner.md)
- [CoreSearchGetSearchAreasListRequest](docs/Model/CoreSearchGetSearchAreasListRequest.md)
- [CoreSearchGetTopResults200Response](docs/Model/CoreSearchGetTopResults200Response.md)
- [CoreSearchGetTopResults200ResponseResultsInner](docs/Model/CoreSearchGetTopResults200ResponseResultsInner.md)
- [CoreSearchGetTopResultsRequest](docs/Model/CoreSearchGetTopResultsRequest.md)
- [CoreSearchGetTopResultsRequestFilters](docs/Model/CoreSearchGetTopResultsRequestFilters.md)
- [CoreSearchViewResultsRequest](docs/Model/CoreSearchViewResultsRequest.md)
- [CoreSearchViewResultsRequestFilters](docs/Model/CoreSearchViewResultsRequestFilters.md)
- [CoreSessionTimeRemaining200Response](docs/Model/CoreSessionTimeRemaining200Response.md)
- [CoreTableGetDynamicTableContent200Response](docs/Model/CoreTableGetDynamicTableContent200Response.md)
- [CoreTableGetDynamicTableContentRequest](docs/Model/CoreTableGetDynamicTableContentRequest.md)
- [CoreTableGetDynamicTableContentRequestFiltersInner](docs/Model/CoreTableGetDynamicTableContentRequestFiltersInner.md)
- [CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner](docs/Model/CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner.md)
- [CoreTableGetDynamicTableContentRequestSortdataInner](docs/Model/CoreTableGetDynamicTableContentRequestSortdataInner.md)
- [CoreTagGetTagAreas200Response](docs/Model/CoreTagGetTagAreas200Response.md)
- [CoreTagGetTagAreas200ResponseAreasInner](docs/Model/CoreTagGetTagAreas200ResponseAreasInner.md)
- [CoreTagGetTagCloud200Response](docs/Model/CoreTagGetTagCloud200Response.md)
- [CoreTagGetTagCloud200ResponseTagsInner](docs/Model/CoreTagGetTagCloud200ResponseTagsInner.md)
- [CoreTagGetTagCloudRequest](docs/Model/CoreTagGetTagCloudRequest.md)
- [CoreTagGetTagCollections200Response](docs/Model/CoreTagGetTagCollections200Response.md)
- [CoreTagGetTagCollections200ResponseCollectionsInner](docs/Model/CoreTagGetTagCollections200ResponseCollectionsInner.md)
- [CoreTagGetTagindex200Response](docs/Model/CoreTagGetTagindex200Response.md)
- [CoreTagGetTagindexPerAreaRequest](docs/Model/CoreTagGetTagindexPerAreaRequest.md)
- [CoreTagGetTagindexPerAreaRequestTagindex](docs/Model/CoreTagGetTagindexPerAreaRequestTagindex.md)
- [CoreTagGetTagindexRequest](docs/Model/CoreTagGetTagindexRequest.md)
- [CoreTagGetTagindexRequestTagindex](docs/Model/CoreTagGetTagindexRequestTagindex.md)
- [CoreTagGetTags200Response](docs/Model/CoreTagGetTags200Response.md)
- [CoreTagGetTags200ResponseTagsInner](docs/Model/CoreTagGetTags200ResponseTagsInner.md)
- [CoreTagGetTagsRequest](docs/Model/CoreTagGetTagsRequest.md)
- [CoreTagGetTagsRequestTagsInner](docs/Model/CoreTagGetTagsRequestTagsInner.md)
- [CoreTagUpdateTagsRequest](docs/Model/CoreTagUpdateTagsRequest.md)
- [CoreTagUpdateTagsRequestTagsInner](docs/Model/CoreTagUpdateTagsRequestTagsInner.md)
- [CoreUpdateInplaceEditable200Response](docs/Model/CoreUpdateInplaceEditable200Response.md)
- [CoreUpdateInplaceEditable200ResponseEditicon](docs/Model/CoreUpdateInplaceEditable200ResponseEditicon.md)
- [CoreUpdateInplaceEditableRequest](docs/Model/CoreUpdateInplaceEditableRequest.md)
- [CoreUserAddUserDeviceRequest](docs/Model/CoreUserAddUserDeviceRequest.md)
- [CoreUserAddUserPrivateFilesRequest](docs/Model/CoreUserAddUserPrivateFilesRequest.md)
- [CoreUserAgreeSitePolicy200Response](docs/Model/CoreUserAgreeSitePolicy200Response.md)
- [CoreUserCreateUsersRequest](docs/Model/CoreUserCreateUsersRequest.md)
- [CoreUserCreateUsersRequestUsersInner](docs/Model/CoreUserCreateUsersRequestUsersInner.md)
- [CoreUserCreateUsersRequestUsersInnerCustomfieldsInner](docs/Model/CoreUserCreateUsersRequestUsersInnerCustomfieldsInner.md)
- [CoreUserCreateUsersRequestUsersInnerPreferencesInner](docs/Model/CoreUserCreateUsersRequestUsersInnerPreferencesInner.md)
- [CoreUserDeleteUsersRequest](docs/Model/CoreUserDeleteUsersRequest.md)
- [CoreUserGetCourseUserProfilesRequest](docs/Model/CoreUserGetCourseUserProfilesRequest.md)
- [CoreUserGetCourseUserProfilesRequestUserlistInner](docs/Model/CoreUserGetCourseUserProfilesRequestUserlistInner.md)
- [CoreUserGetPrivateFilesInfo200Response](docs/Model/CoreUserGetPrivateFilesInfo200Response.md)
- [CoreUserGetPrivateFilesInfoRequest](docs/Model/CoreUserGetPrivateFilesInfoRequest.md)
- [CoreUserGetUserPreferences200Response](docs/Model/CoreUserGetUserPreferences200Response.md)
- [CoreUserGetUserPreferences200ResponsePreferencesInner](docs/Model/CoreUserGetUserPreferences200ResponsePreferencesInner.md)
- [CoreUserGetUserPreferencesRequest](docs/Model/CoreUserGetUserPreferencesRequest.md)
- [CoreUserGetUsers200Response](docs/Model/CoreUserGetUsers200Response.md)
- [CoreUserGetUsersByFieldRequest](docs/Model/CoreUserGetUsersByFieldRequest.md)
- [CoreUserGetUsersRequest](docs/Model/CoreUserGetUsersRequest.md)
- [CoreUserGetUsersRequestCriteriaInner](docs/Model/CoreUserGetUsersRequestCriteriaInner.md)
- [CoreUserRemoveUserDevice200Response](docs/Model/CoreUserRemoveUserDevice200Response.md)
- [CoreUserRemoveUserDeviceRequest](docs/Model/CoreUserRemoveUserDeviceRequest.md)
- [CoreUserSearchIdentity200Response](docs/Model/CoreUserSearchIdentity200Response.md)
- [CoreUserSearchIdentity200ResponseListInner](docs/Model/CoreUserSearchIdentity200ResponseListInner.md)
- [CoreUserSearchIdentity200ResponseListInnerExtrafieldsInner](docs/Model/CoreUserSearchIdentity200ResponseListInnerExtrafieldsInner.md)
- [CoreUserSearchIdentityRequest](docs/Model/CoreUserSearchIdentityRequest.md)
- [CoreUserSetUserPreferences200Response](docs/Model/CoreUserSetUserPreferences200Response.md)
- [CoreUserSetUserPreferences200ResponseSavedInner](docs/Model/CoreUserSetUserPreferences200ResponseSavedInner.md)
- [CoreUserSetUserPreferencesRequest](docs/Model/CoreUserSetUserPreferencesRequest.md)
- [CoreUserSetUserPreferencesRequestPreferencesInner](docs/Model/CoreUserSetUserPreferencesRequestPreferencesInner.md)
- [CoreUserUpdatePicture200Response](docs/Model/CoreUserUpdatePicture200Response.md)
- [CoreUserUpdatePictureRequest](docs/Model/CoreUserUpdatePictureRequest.md)
- [CoreUserUpdateUserDevicePublicKey200Response](docs/Model/CoreUserUpdateUserDevicePublicKey200Response.md)
- [CoreUserUpdateUserDevicePublicKeyRequest](docs/Model/CoreUserUpdateUserDevicePublicKeyRequest.md)
- [CoreUserUpdateUserPreferencesRequest](docs/Model/CoreUserUpdateUserPreferencesRequest.md)
- [CoreUserUpdateUserPreferencesRequestPreferencesInner](docs/Model/CoreUserUpdateUserPreferencesRequestPreferencesInner.md)
- [CoreUserUpdateUsersRequest](docs/Model/CoreUserUpdateUsersRequest.md)
- [CoreUserUpdateUsersRequestUsersInner](docs/Model/CoreUserUpdateUsersRequestUsersInner.md)
- [CoreUserUpdateUsersRequestUsersInnerPreferencesInner](docs/Model/CoreUserUpdateUsersRequestUsersInnerPreferencesInner.md)
- [CoreUserViewUserListRequest](docs/Model/CoreUserViewUserListRequest.md)
- [CoreUserViewUserProfileRequest](docs/Model/CoreUserViewUserProfileRequest.md)
- [CoreWebserviceGetSiteInfo200Response](docs/Model/CoreWebserviceGetSiteInfo200Response.md)
- [CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner](docs/Model/CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner.md)
- [CoreWebserviceGetSiteInfo200ResponseFunctionsInner](docs/Model/CoreWebserviceGetSiteInfo200ResponseFunctionsInner.md)
- [CoreWebserviceGetSiteInfoRequest](docs/Model/CoreWebserviceGetSiteInfoRequest.md)
- [CoreXapiDeleteStateRequest](docs/Model/CoreXapiDeleteStateRequest.md)
- [CoreXapiDeleteStatesRequest](docs/Model/CoreXapiDeleteStatesRequest.md)
- [CoreXapiGetStateRequest](docs/Model/CoreXapiGetStateRequest.md)
- [CoreXapiGetStatesRequest](docs/Model/CoreXapiGetStatesRequest.md)
- [CoreXapiPostStateRequest](docs/Model/CoreXapiPostStateRequest.md)
- [CoreXapiStatementPostRequest](docs/Model/CoreXapiStatementPostRequest.md)
- [EnrolGuestGetInstanceInfo200Response](docs/Model/EnrolGuestGetInstanceInfo200Response.md)
- [EnrolGuestGetInstanceInfo200ResponseInstanceinfo](docs/Model/EnrolGuestGetInstanceInfo200ResponseInstanceinfo.md)
- [EnrolGuestGetInstanceInfoRequest](docs/Model/EnrolGuestGetInstanceInfoRequest.md)
- [EnrolGuestValidatePassword200Response](docs/Model/EnrolGuestValidatePassword200Response.md)
- [EnrolGuestValidatePasswordRequest](docs/Model/EnrolGuestValidatePasswordRequest.md)
- [EnrolLicenseEnrolUser200Response](docs/Model/EnrolLicenseEnrolUser200Response.md)
- [EnrolLicenseEnrolUserRequest](docs/Model/EnrolLicenseEnrolUserRequest.md)
- [EnrolLicenseGetInstanceInfo200Response](docs/Model/EnrolLicenseGetInstanceInfo200Response.md)
- [EnrolLicenseGetInstanceInfoRequest](docs/Model/EnrolLicenseGetInstanceInfoRequest.md)
- [EnrolManualEnrolUsersRequest](docs/Model/EnrolManualEnrolUsersRequest.md)
- [EnrolManualEnrolUsersRequestEnrolmentsInner](docs/Model/EnrolManualEnrolUsersRequestEnrolmentsInner.md)
- [EnrolManualUnenrolUsersRequest](docs/Model/EnrolManualUnenrolUsersRequest.md)
- [EnrolManualUnenrolUsersRequestEnrolmentsInner](docs/Model/EnrolManualUnenrolUsersRequestEnrolmentsInner.md)
- [EnrolMetaAddInstancesRequest](docs/Model/EnrolMetaAddInstancesRequest.md)
- [EnrolMetaAddInstancesRequestInstancesInner](docs/Model/EnrolMetaAddInstancesRequestInstancesInner.md)
- [EnrolMetaDeleteInstancesRequest](docs/Model/EnrolMetaDeleteInstancesRequest.md)
- [EnrolMetaDeleteInstancesRequestInstancesInner](docs/Model/EnrolMetaDeleteInstancesRequestInstancesInner.md)
- [EnrolSelfEnrolUser200Response](docs/Model/EnrolSelfEnrolUser200Response.md)
- [EnrolSelfEnrolUserRequest](docs/Model/EnrolSelfEnrolUserRequest.md)
- [EnrolSelfGetInstanceInfo200Response](docs/Model/EnrolSelfGetInstanceInfo200Response.md)
- [EnrolSelfGetInstanceInfoRequest](docs/Model/EnrolSelfGetInstanceInfoRequest.md)
- [ErrorResponse](docs/Model/ErrorResponse.md)
- [GradereportOverviewGetCourseGrades200Response](docs/Model/GradereportOverviewGetCourseGrades200Response.md)
- [GradereportOverviewGetCourseGrades200ResponseGradesInner](docs/Model/GradereportOverviewGetCourseGrades200ResponseGradesInner.md)
- [GradereportOverviewGetCourseGradesRequest](docs/Model/GradereportOverviewGetCourseGradesRequest.md)
- [GradereportOverviewViewGradeReportRequest](docs/Model/GradereportOverviewViewGradeReportRequest.md)
- [GradereportSingleviewGetGradeItemsForSearchWidget200Response](docs/Model/GradereportSingleviewGetGradeItemsForSearchWidget200Response.md)
- [GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner](docs/Model/GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner.md)
- [GradereportUserGetAccessInformation200Response](docs/Model/GradereportUserGetAccessInformation200Response.md)
- [GradereportUserGetAccessInformationRequest](docs/Model/GradereportUserGetAccessInformationRequest.md)
- [GradereportUserGetGradeItems200Response](docs/Model/GradereportUserGetGradeItems200Response.md)
- [GradereportUserGetGradeItems200ResponseUsergradesInner](docs/Model/GradereportUserGetGradeItems200ResponseUsergradesInner.md)
- [GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner](docs/Model/GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner.md)
- [GradereportUserGetGradeItemsRequest](docs/Model/GradereportUserGetGradeItemsRequest.md)
- [GradereportUserGetGradesTable200Response](docs/Model/GradereportUserGetGradesTable200Response.md)
- [GradereportUserGetGradesTable200ResponseTablesInner](docs/Model/GradereportUserGetGradesTable200ResponseTablesInner.md)
- [GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner](docs/Model/GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.md)
- [GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage](docs/Model/GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage.md)
- [GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal](docs/Model/GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.md)
- [GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname](docs/Model/GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname.md)
- [GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader](docs/Model/GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader.md)
- [GradingformGuideGraderGradingpanelFetch200Response](docs/Model/GradingformGuideGraderGradingpanelFetch200Response.md)
- [GradingformGuideGraderGradingpanelFetch200ResponseGrade](docs/Model/GradingformGuideGraderGradingpanelFetch200ResponseGrade.md)
- [GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner](docs/Model/GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner.md)
- [GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner](docs/Model/GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner.md)
- [GradingformGuideGraderGradingpanelStore200Response](docs/Model/GradingformGuideGraderGradingpanelStore200Response.md)
- [GradingformGuideGraderGradingpanelStore200ResponseGrade](docs/Model/GradingformGuideGraderGradingpanelStore200ResponseGrade.md)
- [GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner](docs/Model/GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner.md)
- [GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner](docs/Model/GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner.md)
- [GradingformRubricGraderGradingpanelFetch200Response](docs/Model/GradingformRubricGraderGradingpanelFetch200Response.md)
- [GradingformRubricGraderGradingpanelFetch200ResponseGrade](docs/Model/GradingformRubricGraderGradingpanelFetch200ResponseGrade.md)
- [GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInner](docs/Model/GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInner.md)
- [GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInnerLevelsInner](docs/Model/GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInnerLevelsInner.md)
- [GradingformRubricGraderGradingpanelStore200Response](docs/Model/GradingformRubricGraderGradingpanelStore200Response.md)
- [GradingformRubricGraderGradingpanelStore200ResponseGrade](docs/Model/GradingformRubricGraderGradingpanelStore200ResponseGrade.md)
- [GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner](docs/Model/GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner.md)
- [GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInnerLevelsInner](docs/Model/GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInnerLevelsInner.md)
- [LocalIomadLearningpathActivateRequest](docs/Model/LocalIomadLearningpathActivateRequest.md)
- [LocalIomadLearningpathAddcoursesRequest](docs/Model/LocalIomadLearningpathAddcoursesRequest.md)
- [LocalIomadLearningpathAddusersRequest](docs/Model/LocalIomadLearningpathAddusersRequest.md)
- [LocalIomadLearningpathCopypathRequest](docs/Model/LocalIomadLearningpathCopypathRequest.md)
- [LocalIomadLearningpathGetcoursesRequest](docs/Model/LocalIomadLearningpathGetcoursesRequest.md)
- [LocalIomadLearningpathGetprospectivecoursesRequest](docs/Model/LocalIomadLearningpathGetprospectivecoursesRequest.md)
- [LocalIomadLearningpathGetprospectiveusersRequest](docs/Model/LocalIomadLearningpathGetprospectiveusersRequest.md)
- [LocalIomadLearningpathGetusersRequest](docs/Model/LocalIomadLearningpathGetusersRequest.md)
- [LocalIomadLearningpathOrdercoursesRequest](docs/Model/LocalIomadLearningpathOrdercoursesRequest.md)
- [LocalIomadLearningpathOrdercoursesRequestCoursesInner](docs/Model/LocalIomadLearningpathOrdercoursesRequestCoursesInner.md)
- [LocalIomadLearningpathRemovecoursesRequest](docs/Model/LocalIomadLearningpathRemovecoursesRequest.md)
- [LocalIomadLearningpathRemoveusersRequest](docs/Model/LocalIomadLearningpathRemoveusersRequest.md)
- [MediaVideojsGetLanguageRequest](docs/Model/MediaVideojsGetLanguageRequest.md)
- [MessageAirnotifierAreNotificationPreferencesConfigured200Response](docs/Model/MessageAirnotifierAreNotificationPreferencesConfigured200Response.md)
- [MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner](docs/Model/MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner.md)
- [MessageAirnotifierAreNotificationPreferencesConfiguredRequest](docs/Model/MessageAirnotifierAreNotificationPreferencesConfiguredRequest.md)
- [MessageAirnotifierEnableDevice200Response](docs/Model/MessageAirnotifierEnableDevice200Response.md)
- [MessageAirnotifierEnableDeviceRequest](docs/Model/MessageAirnotifierEnableDeviceRequest.md)
- [MessageAirnotifierGetUserDevices200Response](docs/Model/MessageAirnotifierGetUserDevices200Response.md)
- [MessageAirnotifierGetUserDevices200ResponseDevicesInner](docs/Model/MessageAirnotifierGetUserDevices200ResponseDevicesInner.md)
- [MessageAirnotifierGetUserDevicesRequest](docs/Model/MessageAirnotifierGetUserDevicesRequest.md)
- [MessagePopupGetPopupNotifications200Response](docs/Model/MessagePopupGetPopupNotifications200Response.md)
- [MessagePopupGetPopupNotifications200ResponseNotificationsInner](docs/Model/MessagePopupGetPopupNotifications200ResponseNotificationsInner.md)
- [MessagePopupGetPopupNotificationsRequest](docs/Model/MessagePopupGetPopupNotificationsRequest.md)
- [ModAssignCopyPreviousAttemptRequest](docs/Model/ModAssignCopyPreviousAttemptRequest.md)
- [ModAssignGetAssignments200Response](docs/Model/ModAssignGetAssignments200Response.md)
- [ModAssignGetAssignments200ResponseCoursesInner](docs/Model/ModAssignGetAssignments200ResponseCoursesInner.md)
- [ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner](docs/Model/ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner.md)
- [ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner](docs/Model/ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner.md)
- [ModAssignGetAssignments200ResponseWarningsInner](docs/Model/ModAssignGetAssignments200ResponseWarningsInner.md)
- [ModAssignGetAssignmentsRequest](docs/Model/ModAssignGetAssignmentsRequest.md)
- [ModAssignGetGrades200Response](docs/Model/ModAssignGetGrades200Response.md)
- [ModAssignGetGrades200ResponseAssignmentsInner](docs/Model/ModAssignGetGrades200ResponseAssignmentsInner.md)
- [ModAssignGetGrades200ResponseAssignmentsInnerGradesInner](docs/Model/ModAssignGetGrades200ResponseAssignmentsInnerGradesInner.md)
- [ModAssignGetGrades200ResponseWarningsInner](docs/Model/ModAssignGetGrades200ResponseWarningsInner.md)
- [ModAssignGetGradesRequest](docs/Model/ModAssignGetGradesRequest.md)
- [ModAssignGetParticipant200Response](docs/Model/ModAssignGetParticipant200Response.md)
- [ModAssignGetParticipant200ResponseUser](docs/Model/ModAssignGetParticipant200ResponseUser.md)
- [ModAssignGetParticipantRequest](docs/Model/ModAssignGetParticipantRequest.md)
- [ModAssignGetSubmissionStatus200Response](docs/Model/ModAssignGetSubmissionStatus200Response.md)
- [ModAssignGetSubmissionStatus200ResponseAssignmentdata](docs/Model/ModAssignGetSubmissionStatus200ResponseAssignmentdata.md)
- [ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments](docs/Model/ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments.md)
- [ModAssignGetSubmissionStatus200ResponseFeedback](docs/Model/ModAssignGetSubmissionStatus200ResponseFeedback.md)
- [ModAssignGetSubmissionStatus200ResponseFeedbackGrade](docs/Model/ModAssignGetSubmissionStatus200ResponseFeedbackGrade.md)
- [ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner](docs/Model/ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner.md)
- [ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner](docs/Model/ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner.md)
- [ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner](docs/Model/ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner.md)
- [ModAssignGetSubmissionStatus200ResponseGradingsummary](docs/Model/ModAssignGetSubmissionStatus200ResponseGradingsummary.md)
- [ModAssignGetSubmissionStatus200ResponseLastattempt](docs/Model/ModAssignGetSubmissionStatus200ResponseLastattempt.md)
- [ModAssignGetSubmissionStatus200ResponseLastattemptSubmission](docs/Model/ModAssignGetSubmissionStatus200ResponseLastattemptSubmission.md)
- [ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner](docs/Model/ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner.md)
- [ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner](docs/Model/ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner.md)
- [ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission](docs/Model/ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.md)
- [ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner](docs/Model/ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner.md)
- [ModAssignGetSubmissionStatusRequest](docs/Model/ModAssignGetSubmissionStatusRequest.md)
- [ModAssignGetSubmissions200Response](docs/Model/ModAssignGetSubmissions200Response.md)
- [ModAssignGetSubmissions200ResponseAssignmentsInner](docs/Model/ModAssignGetSubmissions200ResponseAssignmentsInner.md)
- [ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner](docs/Model/ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner.md)
- [ModAssignGetSubmissionsRequest](docs/Model/ModAssignGetSubmissionsRequest.md)
- [ModAssignGetUserFlags200Response](docs/Model/ModAssignGetUserFlags200Response.md)
- [ModAssignGetUserFlags200ResponseAssignmentsInner](docs/Model/ModAssignGetUserFlags200ResponseAssignmentsInner.md)
- [ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner](docs/Model/ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner.md)
- [ModAssignGetUserFlags200ResponseWarningsInner](docs/Model/ModAssignGetUserFlags200ResponseWarningsInner.md)
- [ModAssignGetUserFlagsRequest](docs/Model/ModAssignGetUserFlagsRequest.md)
- [ModAssignGetUserMappings200Response](docs/Model/ModAssignGetUserMappings200Response.md)
- [ModAssignGetUserMappings200ResponseAssignmentsInner](docs/Model/ModAssignGetUserMappings200ResponseAssignmentsInner.md)
- [ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner](docs/Model/ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner.md)
- [ModAssignGetUserMappings200ResponseWarningsInner](docs/Model/ModAssignGetUserMappings200ResponseWarningsInner.md)
- [ModAssignListParticipantsRequest](docs/Model/ModAssignListParticipantsRequest.md)
- [ModAssignLockSubmissionsRequest](docs/Model/ModAssignLockSubmissionsRequest.md)
- [ModAssignRevealIdentitiesRequest](docs/Model/ModAssignRevealIdentitiesRequest.md)
- [ModAssignRevertSubmissionsToDraftRequest](docs/Model/ModAssignRevertSubmissionsToDraftRequest.md)
- [ModAssignSaveGradeRequest](docs/Model/ModAssignSaveGradeRequest.md)
- [ModAssignSaveGradeRequestAdvancedgradingdata](docs/Model/ModAssignSaveGradeRequestAdvancedgradingdata.md)
- [ModAssignSaveGradeRequestAdvancedgradingdataGuide](docs/Model/ModAssignSaveGradeRequestAdvancedgradingdataGuide.md)
- [ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner](docs/Model/ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner.md)
- [ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner](docs/Model/ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner.md)
- [ModAssignSaveGradeRequestAdvancedgradingdataRubric](docs/Model/ModAssignSaveGradeRequestAdvancedgradingdataRubric.md)
- [ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInner](docs/Model/ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInner.md)
- [ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInner](docs/Model/ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInner.md)
- [ModAssignSaveGradeRequestPlugindata](docs/Model/ModAssignSaveGradeRequestPlugindata.md)
- [ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor](docs/Model/ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor.md)
- [ModAssignSaveGradesRequest](docs/Model/ModAssignSaveGradesRequest.md)
- [ModAssignSaveGradesRequestGradesInner](docs/Model/ModAssignSaveGradesRequestGradesInner.md)
- [ModAssignSaveGradesRequestGradesInnerPlugindata](docs/Model/ModAssignSaveGradesRequestGradesInnerPlugindata.md)
- [ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor](docs/Model/ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor.md)
- [ModAssignSaveSubmissionRequest](docs/Model/ModAssignSaveSubmissionRequest.md)
- [ModAssignSaveSubmissionRequestPlugindata](docs/Model/ModAssignSaveSubmissionRequestPlugindata.md)
- [ModAssignSaveSubmissionRequestPlugindataOnlinetextEditor](docs/Model/ModAssignSaveSubmissionRequestPlugindataOnlinetextEditor.md)
- [ModAssignSaveUserExtensionsRequest](docs/Model/ModAssignSaveUserExtensionsRequest.md)
- [ModAssignSetUserFlagsRequest](docs/Model/ModAssignSetUserFlagsRequest.md)
- [ModAssignSetUserFlagsRequestUserflagsInner](docs/Model/ModAssignSetUserFlagsRequestUserflagsInner.md)
- [ModAssignStartSubmission200Response](docs/Model/ModAssignStartSubmission200Response.md)
- [ModAssignStartSubmissionRequest](docs/Model/ModAssignStartSubmissionRequest.md)
- [ModAssignSubmitForGradingRequest](docs/Model/ModAssignSubmitForGradingRequest.md)
- [ModAssignSubmitGradingFormRequest](docs/Model/ModAssignSubmitGradingFormRequest.md)
- [ModAssignViewAssignRequest](docs/Model/ModAssignViewAssignRequest.md)
- [ModBigbluebuttonbnCanJoin200Response](docs/Model/ModBigbluebuttonbnCanJoin200Response.md)
- [ModBigbluebuttonbnCanJoinRequest](docs/Model/ModBigbluebuttonbnCanJoinRequest.md)
- [ModBigbluebuttonbnCompletionValidateRequest](docs/Model/ModBigbluebuttonbnCompletionValidateRequest.md)
- [ModBigbluebuttonbnEndMeetingRequest](docs/Model/ModBigbluebuttonbnEndMeetingRequest.md)
- [ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response](docs/Model/ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response.md)
- [ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner](docs/Model/ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.md)
- [ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest](docs/Model/ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md)
- [ModBigbluebuttonbnGetJoinUrl200Response](docs/Model/ModBigbluebuttonbnGetJoinUrl200Response.md)
- [ModBigbluebuttonbnGetRecordings200Response](docs/Model/ModBigbluebuttonbnGetRecordings200Response.md)
- [ModBigbluebuttonbnGetRecordings200ResponseTabledata](docs/Model/ModBigbluebuttonbnGetRecordings200ResponseTabledata.md)
- [ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner](docs/Model/ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner.md)
- [ModBigbluebuttonbnGetRecordingsRequest](docs/Model/ModBigbluebuttonbnGetRecordingsRequest.md)
- [ModBigbluebuttonbnGetRecordingsToImport200Response](docs/Model/ModBigbluebuttonbnGetRecordingsToImport200Response.md)
- [ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata](docs/Model/ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata.md)
- [ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner](docs/Model/ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner.md)
- [ModBigbluebuttonbnGetRecordingsToImportRequest](docs/Model/ModBigbluebuttonbnGetRecordingsToImportRequest.md)
- [ModBigbluebuttonbnMeetingInfo200Response](docs/Model/ModBigbluebuttonbnMeetingInfo200Response.md)
- [ModBigbluebuttonbnMeetingInfo200ResponseFeaturesInner](docs/Model/ModBigbluebuttonbnMeetingInfo200ResponseFeaturesInner.md)
- [ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner](docs/Model/ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner.md)
- [ModBigbluebuttonbnMeetingInfoRequest](docs/Model/ModBigbluebuttonbnMeetingInfoRequest.md)
- [ModBigbluebuttonbnUpdateRecordingRequest](docs/Model/ModBigbluebuttonbnUpdateRecordingRequest.md)
- [ModBigbluebuttonbnViewBigbluebuttonbnRequest](docs/Model/ModBigbluebuttonbnViewBigbluebuttonbnRequest.md)
- [ModBookGetBooksByCourses200Response](docs/Model/ModBookGetBooksByCourses200Response.md)
- [ModBookGetBooksByCourses200ResponseBooksInner](docs/Model/ModBookGetBooksByCourses200ResponseBooksInner.md)
- [ModBookGetBooksByCoursesRequest](docs/Model/ModBookGetBooksByCoursesRequest.md)
- [ModBookViewBookRequest](docs/Model/ModBookViewBookRequest.md)
- [ModChatGetChatLatestMessages200Response](docs/Model/ModChatGetChatLatestMessages200Response.md)
- [ModChatGetChatLatestMessages200ResponseMessagesInner](docs/Model/ModChatGetChatLatestMessages200ResponseMessagesInner.md)
- [ModChatGetChatLatestMessagesRequest](docs/Model/ModChatGetChatLatestMessagesRequest.md)
- [ModChatGetChatUsers200Response](docs/Model/ModChatGetChatUsers200Response.md)
- [ModChatGetChatUsers200ResponseUsersInner](docs/Model/ModChatGetChatUsers200ResponseUsersInner.md)
- [ModChatGetChatUsersRequest](docs/Model/ModChatGetChatUsersRequest.md)
- [ModChatGetChatsByCourses200Response](docs/Model/ModChatGetChatsByCourses200Response.md)
- [ModChatGetChatsByCourses200ResponseChatsInner](docs/Model/ModChatGetChatsByCourses200ResponseChatsInner.md)
- [ModChatGetChatsByCoursesRequest](docs/Model/ModChatGetChatsByCoursesRequest.md)
- [ModChatGetSessionMessages200Response](docs/Model/ModChatGetSessionMessages200Response.md)
- [ModChatGetSessionMessages200ResponseMessagesInner](docs/Model/ModChatGetSessionMessages200ResponseMessagesInner.md)
- [ModChatGetSessionMessagesRequest](docs/Model/ModChatGetSessionMessagesRequest.md)
- [ModChatGetSessions200Response](docs/Model/ModChatGetSessions200Response.md)
- [ModChatGetSessions200ResponseSessionsInner](docs/Model/ModChatGetSessions200ResponseSessionsInner.md)
- [ModChatGetSessions200ResponseSessionsInnerSessionusersInner](docs/Model/ModChatGetSessions200ResponseSessionsInnerSessionusersInner.md)
- [ModChatGetSessionsRequest](docs/Model/ModChatGetSessionsRequest.md)
- [ModChatLoginUser200Response](docs/Model/ModChatLoginUser200Response.md)
- [ModChatLoginUserRequest](docs/Model/ModChatLoginUserRequest.md)
- [ModChatSendChatMessage200Response](docs/Model/ModChatSendChatMessage200Response.md)
- [ModChatSendChatMessageRequest](docs/Model/ModChatSendChatMessageRequest.md)
- [ModChatViewChatRequest](docs/Model/ModChatViewChatRequest.md)
- [ModChatViewSessionsRequest](docs/Model/ModChatViewSessionsRequest.md)
- [ModChoiceDeleteChoiceResponses200Response](docs/Model/ModChoiceDeleteChoiceResponses200Response.md)
- [ModChoiceDeleteChoiceResponsesRequest](docs/Model/ModChoiceDeleteChoiceResponsesRequest.md)
- [ModChoiceGetChoiceOptions200Response](docs/Model/ModChoiceGetChoiceOptions200Response.md)
- [ModChoiceGetChoiceOptions200ResponseOptionsInner](docs/Model/ModChoiceGetChoiceOptions200ResponseOptionsInner.md)
- [ModChoiceGetChoiceOptionsRequest](docs/Model/ModChoiceGetChoiceOptionsRequest.md)
- [ModChoiceGetChoiceResults200Response](docs/Model/ModChoiceGetChoiceResults200Response.md)
- [ModChoiceGetChoiceResults200ResponseOptionsInner](docs/Model/ModChoiceGetChoiceResults200ResponseOptionsInner.md)
- [ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner](docs/Model/ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner.md)
- [ModChoiceGetChoicesByCourses200Response](docs/Model/ModChoiceGetChoicesByCourses200Response.md)
- [ModChoiceGetChoicesByCourses200ResponseChoicesInner](docs/Model/ModChoiceGetChoicesByCourses200ResponseChoicesInner.md)
- [ModChoiceSubmitChoiceResponse200Response](docs/Model/ModChoiceSubmitChoiceResponse200Response.md)
- [ModChoiceSubmitChoiceResponse200ResponseAnswersInner](docs/Model/ModChoiceSubmitChoiceResponse200ResponseAnswersInner.md)
- [ModChoiceSubmitChoiceResponseRequest](docs/Model/ModChoiceSubmitChoiceResponseRequest.md)
- [ModDataAddEntry200Response](docs/Model/ModDataAddEntry200Response.md)
- [ModDataAddEntry200ResponseFieldnotificationsInner](docs/Model/ModDataAddEntry200ResponseFieldnotificationsInner.md)
- [ModDataAddEntryRequest](docs/Model/ModDataAddEntryRequest.md)
- [ModDataAddEntryRequestDataInner](docs/Model/ModDataAddEntryRequestDataInner.md)
- [ModDataApproveEntryRequest](docs/Model/ModDataApproveEntryRequest.md)
- [ModDataDeleteEntry200Response](docs/Model/ModDataDeleteEntry200Response.md)
- [ModDataDeleteEntryRequest](docs/Model/ModDataDeleteEntryRequest.md)
- [ModDataDeleteSavedPresetRequest](docs/Model/ModDataDeleteSavedPresetRequest.md)
- [ModDataGetDataAccessInformation200Response](docs/Model/ModDataGetDataAccessInformation200Response.md)
- [ModDataGetDataAccessInformationRequest](docs/Model/ModDataGetDataAccessInformationRequest.md)
- [ModDataGetDatabasesByCourses200Response](docs/Model/ModDataGetDatabasesByCourses200Response.md)
- [ModDataGetDatabasesByCourses200ResponseDatabasesInner](docs/Model/ModDataGetDatabasesByCourses200ResponseDatabasesInner.md)
- [ModDataGetEntries200Response](docs/Model/ModDataGetEntries200Response.md)
- [ModDataGetEntries200ResponseEntriesInner](docs/Model/ModDataGetEntries200ResponseEntriesInner.md)
- [ModDataGetEntries200ResponseEntriesInnerContentsInner](docs/Model/ModDataGetEntries200ResponseEntriesInnerContentsInner.md)
- [ModDataGetEntries200ResponseEntriesInnerTagsInner](docs/Model/ModDataGetEntries200ResponseEntriesInnerTagsInner.md)
- [ModDataGetEntriesRequest](docs/Model/ModDataGetEntriesRequest.md)
- [ModDataGetEntry200Response](docs/Model/ModDataGetEntry200Response.md)
- [ModDataGetEntry200ResponseEntry](docs/Model/ModDataGetEntry200ResponseEntry.md)
- [ModDataGetEntry200ResponseEntryContentsInner](docs/Model/ModDataGetEntry200ResponseEntryContentsInner.md)
- [ModDataGetEntry200ResponseRatinginfo](docs/Model/ModDataGetEntry200ResponseRatinginfo.md)
- [ModDataGetEntry200ResponseRatinginfoRatingsInner](docs/Model/ModDataGetEntry200ResponseRatinginfoRatingsInner.md)
- [ModDataGetEntry200ResponseRatinginfoScalesInner](docs/Model/ModDataGetEntry200ResponseRatinginfoScalesInner.md)
- [ModDataGetEntry200ResponseRatinginfoScalesInnerItemsInner](docs/Model/ModDataGetEntry200ResponseRatinginfoScalesInnerItemsInner.md)
- [ModDataGetEntryRequest](docs/Model/ModDataGetEntryRequest.md)
- [ModDataGetFields200Response](docs/Model/ModDataGetFields200Response.md)
- [ModDataGetFields200ResponseFieldsInner](docs/Model/ModDataGetFields200ResponseFieldsInner.md)
- [ModDataGetFieldsRequest](docs/Model/ModDataGetFieldsRequest.md)
- [ModDataGetMappingInformation200Response](docs/Model/ModDataGetMappingInformation200Response.md)
- [ModDataGetMappingInformation200ResponseData](docs/Model/ModDataGetMappingInformation200ResponseData.md)
- [ModDataGetMappingInformationRequest](docs/Model/ModDataGetMappingInformationRequest.md)
- [ModDataSearchEntries200Response](docs/Model/ModDataSearchEntries200Response.md)
- [ModDataSearchEntries200ResponseEntriesInner](docs/Model/ModDataSearchEntries200ResponseEntriesInner.md)
- [ModDataSearchEntriesRequest](docs/Model/ModDataSearchEntriesRequest.md)
- [ModDataSearchEntriesRequestAdvsearchInner](docs/Model/ModDataSearchEntriesRequestAdvsearchInner.md)
- [ModDataUpdateEntry200Response](docs/Model/ModDataUpdateEntry200Response.md)
- [ModDataUpdateEntry200ResponseFieldnotificationsInner](docs/Model/ModDataUpdateEntry200ResponseFieldnotificationsInner.md)
- [ModDataUpdateEntryRequest](docs/Model/ModDataUpdateEntryRequest.md)
- [ModDataUpdateEntryRequestDataInner](docs/Model/ModDataUpdateEntryRequestDataInner.md)
- [ModDataViewDatabaseRequest](docs/Model/ModDataViewDatabaseRequest.md)
- [ModFeedbackGetAnalysis200Response](docs/Model/ModFeedbackGetAnalysis200Response.md)
- [ModFeedbackGetAnalysis200ResponseItemsdataInner](docs/Model/ModFeedbackGetAnalysis200ResponseItemsdataInner.md)
- [ModFeedbackGetAnalysis200ResponseItemsdataInnerItem](docs/Model/ModFeedbackGetAnalysis200ResponseItemsdataInnerItem.md)
- [ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner](docs/Model/ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.md)
- [ModFeedbackGetAnalysisRequest](docs/Model/ModFeedbackGetAnalysisRequest.md)
- [ModFeedbackGetCurrentCompletedTmp200Response](docs/Model/ModFeedbackGetCurrentCompletedTmp200Response.md)
- [ModFeedbackGetCurrentCompletedTmp200ResponseFeedback](docs/Model/ModFeedbackGetCurrentCompletedTmp200ResponseFeedback.md)
- [ModFeedbackGetCurrentCompletedTmpRequest](docs/Model/ModFeedbackGetCurrentCompletedTmpRequest.md)
- [ModFeedbackGetFeedbackAccessInformation200Response](docs/Model/ModFeedbackGetFeedbackAccessInformation200Response.md)
- [ModFeedbackGetFeedbackAccessInformationRequest](docs/Model/ModFeedbackGetFeedbackAccessInformationRequest.md)
- [ModFeedbackGetFeedbacksByCourses200Response](docs/Model/ModFeedbackGetFeedbacksByCourses200Response.md)
- [ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner](docs/Model/ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.md)
- [ModFeedbackGetFinishedResponses200Response](docs/Model/ModFeedbackGetFinishedResponses200Response.md)
- [ModFeedbackGetFinishedResponses200ResponseResponsesInner](docs/Model/ModFeedbackGetFinishedResponses200ResponseResponsesInner.md)
- [ModFeedbackGetFinishedResponsesRequest](docs/Model/ModFeedbackGetFinishedResponsesRequest.md)
- [ModFeedbackGetItems200Response](docs/Model/ModFeedbackGetItems200Response.md)
- [ModFeedbackGetItems200ResponseItemsInner](docs/Model/ModFeedbackGetItems200ResponseItemsInner.md)
- [ModFeedbackGetLastCompleted200Response](docs/Model/ModFeedbackGetLastCompleted200Response.md)
- [ModFeedbackGetLastCompleted200ResponseCompleted](docs/Model/ModFeedbackGetLastCompleted200ResponseCompleted.md)
- [ModFeedbackGetNonRespondents200Response](docs/Model/ModFeedbackGetNonRespondents200Response.md)
- [ModFeedbackGetNonRespondents200ResponseUsersInner](docs/Model/ModFeedbackGetNonRespondents200ResponseUsersInner.md)
- [ModFeedbackGetNonRespondentsRequest](docs/Model/ModFeedbackGetNonRespondentsRequest.md)
- [ModFeedbackGetPageItems200Response](docs/Model/ModFeedbackGetPageItems200Response.md)
- [ModFeedbackGetPageItemsRequest](docs/Model/ModFeedbackGetPageItemsRequest.md)
- [ModFeedbackGetResponsesAnalysis200Response](docs/Model/ModFeedbackGetResponsesAnalysis200Response.md)
- [ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner](docs/Model/ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner.md)
- [ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner](docs/Model/ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner.md)
- [ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner](docs/Model/ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner.md)
- [ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner](docs/Model/ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner.md)
- [ModFeedbackGetResponsesAnalysisRequest](docs/Model/ModFeedbackGetResponsesAnalysisRequest.md)
- [ModFeedbackGetUnfinishedResponses200Response](docs/Model/ModFeedbackGetUnfinishedResponses200Response.md)
- [ModFeedbackGetUnfinishedResponses200ResponseResponsesInner](docs/Model/ModFeedbackGetUnfinishedResponses200ResponseResponsesInner.md)
- [ModFeedbackLaunchFeedback200Response](docs/Model/ModFeedbackLaunchFeedback200Response.md)
- [ModFeedbackProcessPage200Response](docs/Model/ModFeedbackProcessPage200Response.md)
- [ModFeedbackProcessPageRequest](docs/Model/ModFeedbackProcessPageRequest.md)
- [ModFeedbackProcessPageRequestResponsesInner](docs/Model/ModFeedbackProcessPageRequestResponsesInner.md)
- [ModFeedbackViewFeedbackRequest](docs/Model/ModFeedbackViewFeedbackRequest.md)
- [ModFolderGetFoldersByCourses200Response](docs/Model/ModFolderGetFoldersByCourses200Response.md)
- [ModFolderGetFoldersByCourses200ResponseFoldersInner](docs/Model/ModFolderGetFoldersByCourses200ResponseFoldersInner.md)
- [ModFolderViewFolderRequest](docs/Model/ModFolderViewFolderRequest.md)
- [ModForumAddDiscussion200Response](docs/Model/ModForumAddDiscussion200Response.md)
- [ModForumAddDiscussionPost200Response](docs/Model/ModForumAddDiscussionPost200Response.md)
- [ModForumAddDiscussionPost200ResponseMessagesInner](docs/Model/ModForumAddDiscussionPost200ResponseMessagesInner.md)
- [ModForumAddDiscussionPost200ResponsePost](docs/Model/ModForumAddDiscussionPost200ResponsePost.md)
- [ModForumAddDiscussionPost200ResponsePostAttachmentsInner](docs/Model/ModForumAddDiscussionPost200ResponsePostAttachmentsInner.md)
- [ModForumAddDiscussionPost200ResponsePostAttachmentsInnerHtml](docs/Model/ModForumAddDiscussionPost200ResponsePostAttachmentsInnerHtml.md)
- [ModForumAddDiscussionPost200ResponsePostAttachmentsInnerUrls](docs/Model/ModForumAddDiscussionPost200ResponsePostAttachmentsInnerUrls.md)
- [ModForumAddDiscussionPost200ResponsePostAuthor](docs/Model/ModForumAddDiscussionPost200ResponsePostAuthor.md)
- [ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner](docs/Model/ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner.md)
- [ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls](docs/Model/ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls.md)
- [ModForumAddDiscussionPost200ResponsePostAuthorUrls](docs/Model/ModForumAddDiscussionPost200ResponsePostAuthorUrls.md)
- [ModForumAddDiscussionPost200ResponsePostCapabilities](docs/Model/ModForumAddDiscussionPost200ResponsePostCapabilities.md)
- [ModForumAddDiscussionPost200ResponsePostHtml](docs/Model/ModForumAddDiscussionPost200ResponsePostHtml.md)
- [ModForumAddDiscussionPost200ResponsePostTagsInner](docs/Model/ModForumAddDiscussionPost200ResponsePostTagsInner.md)
- [ModForumAddDiscussionPost200ResponsePostTagsInnerUrls](docs/Model/ModForumAddDiscussionPost200ResponsePostTagsInnerUrls.md)
- [ModForumAddDiscussionPost200ResponsePostUrls](docs/Model/ModForumAddDiscussionPost200ResponsePostUrls.md)
- [ModForumAddDiscussionPostRequest](docs/Model/ModForumAddDiscussionPostRequest.md)
- [ModForumAddDiscussionPostRequestOptionsInner](docs/Model/ModForumAddDiscussionPostRequestOptionsInner.md)
- [ModForumAddDiscussionRequest](docs/Model/ModForumAddDiscussionRequest.md)
- [ModForumAddDiscussionRequestOptionsInner](docs/Model/ModForumAddDiscussionRequestOptionsInner.md)
- [ModForumCanAddDiscussion200Response](docs/Model/ModForumCanAddDiscussion200Response.md)
- [ModForumCanAddDiscussionRequest](docs/Model/ModForumCanAddDiscussionRequest.md)
- [ModForumDeletePost200Response](docs/Model/ModForumDeletePost200Response.md)
- [ModForumDeletePostRequest](docs/Model/ModForumDeletePostRequest.md)
- [ModForumGetDiscussionPost200Response](docs/Model/ModForumGetDiscussionPost200Response.md)
- [ModForumGetDiscussionPost200ResponsePost](docs/Model/ModForumGetDiscussionPost200ResponsePost.md)
- [ModForumGetDiscussionPost200ResponsePostAttachmentsInner](docs/Model/ModForumGetDiscussionPost200ResponsePostAttachmentsInner.md)
- [ModForumGetDiscussionPost200ResponsePostAttachmentsInnerHtml](docs/Model/ModForumGetDiscussionPost200ResponsePostAttachmentsInnerHtml.md)
- [ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls](docs/Model/ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls.md)
- [ModForumGetDiscussionPost200ResponsePostAuthor](docs/Model/ModForumGetDiscussionPost200ResponsePostAuthor.md)
- [ModForumGetDiscussionPost200ResponsePostAuthorGroupsInner](docs/Model/ModForumGetDiscussionPost200ResponsePostAuthorGroupsInner.md)
- [ModForumGetDiscussionPost200ResponsePostAuthorGroupsInnerUrls](docs/Model/ModForumGetDiscussionPost200ResponsePostAuthorGroupsInnerUrls.md)
- [ModForumGetDiscussionPost200ResponsePostAuthorUrls](docs/Model/ModForumGetDiscussionPost200ResponsePostAuthorUrls.md)
- [ModForumGetDiscussionPost200ResponsePostCapabilities](docs/Model/ModForumGetDiscussionPost200ResponsePostCapabilities.md)
- [ModForumGetDiscussionPost200ResponsePostHtml](docs/Model/ModForumGetDiscussionPost200ResponsePostHtml.md)
- [ModForumGetDiscussionPost200ResponsePostTagsInner](docs/Model/ModForumGetDiscussionPost200ResponsePostTagsInner.md)
- [ModForumGetDiscussionPost200ResponsePostTagsInnerUrls](docs/Model/ModForumGetDiscussionPost200ResponsePostTagsInnerUrls.md)
- [ModForumGetDiscussionPost200ResponsePostUrls](docs/Model/ModForumGetDiscussionPost200ResponsePostUrls.md)
- [ModForumGetDiscussionPostRequest](docs/Model/ModForumGetDiscussionPostRequest.md)
- [ModForumGetDiscussionPosts200Response](docs/Model/ModForumGetDiscussionPosts200Response.md)
- [ModForumGetDiscussionPosts200ResponsePostsInner](docs/Model/ModForumGetDiscussionPosts200ResponsePostsInner.md)
- [ModForumGetDiscussionPosts200ResponseRatinginfo](docs/Model/ModForumGetDiscussionPosts200ResponseRatinginfo.md)
- [ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner](docs/Model/ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner.md)
- [ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner](docs/Model/ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner.md)
- [ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerItemsInner](docs/Model/ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerItemsInner.md)
- [ModForumGetDiscussionPostsByUserid200Response](docs/Model/ModForumGetDiscussionPostsByUserid200Response.md)
- [ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner](docs/Model/ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner.md)
- [ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts](docs/Model/ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts.md)
- [ModForumGetDiscussionPostsByUseridRequest](docs/Model/ModForumGetDiscussionPostsByUseridRequest.md)
- [ModForumGetDiscussionPostsRequest](docs/Model/ModForumGetDiscussionPostsRequest.md)
- [ModForumGetForumAccessInformation200Response](docs/Model/ModForumGetForumAccessInformation200Response.md)
- [ModForumGetForumAccessInformationRequest](docs/Model/ModForumGetForumAccessInformationRequest.md)
- [ModForumGetForumDiscussions200Response](docs/Model/ModForumGetForumDiscussions200Response.md)
- [ModForumGetForumDiscussions200ResponseDiscussionsInner](docs/Model/ModForumGetForumDiscussions200ResponseDiscussionsInner.md)
- [ModForumGetForumDiscussionsPaginated200Response](docs/Model/ModForumGetForumDiscussionsPaginated200Response.md)
- [ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner](docs/Model/ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner.md)
- [ModForumGetForumDiscussionsPaginatedRequest](docs/Model/ModForumGetForumDiscussionsPaginatedRequest.md)
- [ModForumGetForumDiscussionsRequest](docs/Model/ModForumGetForumDiscussionsRequest.md)
- [ModForumGetForumsByCoursesRequest](docs/Model/ModForumGetForumsByCoursesRequest.md)
- [ModForumPrepareDraftAreaForPost200Response](docs/Model/ModForumPrepareDraftAreaForPost200Response.md)
- [ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner](docs/Model/ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner.md)
- [ModForumPrepareDraftAreaForPostRequest](docs/Model/ModForumPrepareDraftAreaForPostRequest.md)
- [ModForumPrepareDraftAreaForPostRequestFilestokeepInner](docs/Model/ModForumPrepareDraftAreaForPostRequestFilestokeepInner.md)
- [ModForumSetLockState200Response](docs/Model/ModForumSetLockState200Response.md)
- [ModForumSetLockState200ResponseTimes](docs/Model/ModForumSetLockState200ResponseTimes.md)
- [ModForumSetLockStateRequest](docs/Model/ModForumSetLockStateRequest.md)
- [ModForumSetPinState200Response](docs/Model/ModForumSetPinState200Response.md)
- [ModForumSetPinState200ResponseCapabilities](docs/Model/ModForumSetPinState200ResponseCapabilities.md)
- [ModForumSetPinState200ResponseGroup](docs/Model/ModForumSetPinState200ResponseGroup.md)
- [ModForumSetPinState200ResponseGroupUrls](docs/Model/ModForumSetPinState200ResponseGroupUrls.md)
- [ModForumSetPinState200ResponseTimed](docs/Model/ModForumSetPinState200ResponseTimed.md)
- [ModForumSetPinState200ResponseTimes](docs/Model/ModForumSetPinState200ResponseTimes.md)
- [ModForumSetPinState200ResponseUrls](docs/Model/ModForumSetPinState200ResponseUrls.md)
- [ModForumSetPinState200ResponseUserstate](docs/Model/ModForumSetPinState200ResponseUserstate.md)
- [ModForumSetPinStateRequest](docs/Model/ModForumSetPinStateRequest.md)
- [ModForumSetSubscriptionState200Response](docs/Model/ModForumSetSubscriptionState200Response.md)
- [ModForumSetSubscriptionState200ResponseCapabilities](docs/Model/ModForumSetSubscriptionState200ResponseCapabilities.md)
- [ModForumSetSubscriptionState200ResponseGroup](docs/Model/ModForumSetSubscriptionState200ResponseGroup.md)
- [ModForumSetSubscriptionState200ResponseGroupUrls](docs/Model/ModForumSetSubscriptionState200ResponseGroupUrls.md)
- [ModForumSetSubscriptionState200ResponseTimed](docs/Model/ModForumSetSubscriptionState200ResponseTimed.md)
- [ModForumSetSubscriptionState200ResponseTimes](docs/Model/ModForumSetSubscriptionState200ResponseTimes.md)
- [ModForumSetSubscriptionState200ResponseUrls](docs/Model/ModForumSetSubscriptionState200ResponseUrls.md)
- [ModForumSetSubscriptionState200ResponseUserstate](docs/Model/ModForumSetSubscriptionState200ResponseUserstate.md)
- [ModForumSetSubscriptionStateRequest](docs/Model/ModForumSetSubscriptionStateRequest.md)
- [ModForumToggleFavouriteStateRequest](docs/Model/ModForumToggleFavouriteStateRequest.md)
- [ModForumUpdateDiscussionPost200Response](docs/Model/ModForumUpdateDiscussionPost200Response.md)
- [ModForumUpdateDiscussionPostRequest](docs/Model/ModForumUpdateDiscussionPostRequest.md)
- [ModForumUpdateDiscussionPostRequestOptionsInner](docs/Model/ModForumUpdateDiscussionPostRequestOptionsInner.md)
- [ModForumViewForumDiscussionRequest](docs/Model/ModForumViewForumDiscussionRequest.md)
- [ModForumViewForumRequest](docs/Model/ModForumViewForumRequest.md)
- [ModGlossaryAddEntry200Response](docs/Model/ModGlossaryAddEntry200Response.md)
- [ModGlossaryAddEntryRequest](docs/Model/ModGlossaryAddEntryRequest.md)
- [ModGlossaryAddEntryRequestOptionsInner](docs/Model/ModGlossaryAddEntryRequestOptionsInner.md)
- [ModGlossaryDeleteEntryRequest](docs/Model/ModGlossaryDeleteEntryRequest.md)
- [ModGlossaryGetAuthors200Response](docs/Model/ModGlossaryGetAuthors200Response.md)
- [ModGlossaryGetAuthors200ResponseAuthorsInner](docs/Model/ModGlossaryGetAuthors200ResponseAuthorsInner.md)
- [ModGlossaryGetAuthorsRequest](docs/Model/ModGlossaryGetAuthorsRequest.md)
- [ModGlossaryGetAuthorsRequestOptions](docs/Model/ModGlossaryGetAuthorsRequestOptions.md)
- [ModGlossaryGetCategories200Response](docs/Model/ModGlossaryGetCategories200Response.md)
- [ModGlossaryGetCategories200ResponseCategoriesInner](docs/Model/ModGlossaryGetCategories200ResponseCategoriesInner.md)
- [ModGlossaryGetCategoriesRequest](docs/Model/ModGlossaryGetCategoriesRequest.md)
- [ModGlossaryGetEntriesByAuthor200Response](docs/Model/ModGlossaryGetEntriesByAuthor200Response.md)
- [ModGlossaryGetEntriesByAuthor200ResponseEntriesInner](docs/Model/ModGlossaryGetEntriesByAuthor200ResponseEntriesInner.md)
- [ModGlossaryGetEntriesByAuthorId200Response](docs/Model/ModGlossaryGetEntriesByAuthorId200Response.md)
- [ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner](docs/Model/ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner.md)
- [ModGlossaryGetEntriesByAuthorIdRequest](docs/Model/ModGlossaryGetEntriesByAuthorIdRequest.md)
- [ModGlossaryGetEntriesByAuthorRequest](docs/Model/ModGlossaryGetEntriesByAuthorRequest.md)
- [ModGlossaryGetEntriesByAuthorRequestOptions](docs/Model/ModGlossaryGetEntriesByAuthorRequestOptions.md)
- [ModGlossaryGetEntriesByCategory200Response](docs/Model/ModGlossaryGetEntriesByCategory200Response.md)
- [ModGlossaryGetEntriesByCategory200ResponseEntriesInner](docs/Model/ModGlossaryGetEntriesByCategory200ResponseEntriesInner.md)
- [ModGlossaryGetEntriesByCategoryRequest](docs/Model/ModGlossaryGetEntriesByCategoryRequest.md)
- [ModGlossaryGetEntriesByDateRequest](docs/Model/ModGlossaryGetEntriesByDateRequest.md)
- [ModGlossaryGetEntriesByLetterRequest](docs/Model/ModGlossaryGetEntriesByLetterRequest.md)
- [ModGlossaryGetEntriesBySearchRequest](docs/Model/ModGlossaryGetEntriesBySearchRequest.md)
- [ModGlossaryGetEntriesByTermRequest](docs/Model/ModGlossaryGetEntriesByTermRequest.md)
- [ModGlossaryGetEntriesToApproveRequest](docs/Model/ModGlossaryGetEntriesToApproveRequest.md)
- [ModGlossaryGetEntryById200Response](docs/Model/ModGlossaryGetEntryById200Response.md)
- [ModGlossaryGetEntryById200ResponseEntry](docs/Model/ModGlossaryGetEntryById200ResponseEntry.md)
- [ModGlossaryGetEntryById200ResponsePermissions](docs/Model/ModGlossaryGetEntryById200ResponsePermissions.md)
- [ModGlossaryGetEntryByIdRequest](docs/Model/ModGlossaryGetEntryByIdRequest.md)
- [ModGlossaryGetGlossariesByCourses200Response](docs/Model/ModGlossaryGetGlossariesByCourses200Response.md)
- [ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner](docs/Model/ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner.md)
- [ModGlossaryPrepareEntryForEdition200Response](docs/Model/ModGlossaryPrepareEntryForEdition200Response.md)
- [ModGlossaryPrepareEntryForEdition200ResponseAreasInner](docs/Model/ModGlossaryPrepareEntryForEdition200ResponseAreasInner.md)
- [ModGlossaryPrepareEntryForEdition200ResponseAreasInnerOptionsInner](docs/Model/ModGlossaryPrepareEntryForEdition200ResponseAreasInnerOptionsInner.md)
- [ModGlossaryPrepareEntryForEditionRequest](docs/Model/ModGlossaryPrepareEntryForEditionRequest.md)
- [ModGlossaryUpdateEntry200Response](docs/Model/ModGlossaryUpdateEntry200Response.md)
- [ModGlossaryUpdateEntryRequest](docs/Model/ModGlossaryUpdateEntryRequest.md)
- [ModGlossaryUpdateEntryRequestOptionsInner](docs/Model/ModGlossaryUpdateEntryRequestOptionsInner.md)
- [ModGlossaryViewEntry200Response](docs/Model/ModGlossaryViewEntry200Response.md)
- [ModGlossaryViewGlossary200Response](docs/Model/ModGlossaryViewGlossary200Response.md)
- [ModGlossaryViewGlossaryRequest](docs/Model/ModGlossaryViewGlossaryRequest.md)
- [ModH5pactivityGetAttempts200Response](docs/Model/ModH5pactivityGetAttempts200Response.md)
- [ModH5pactivityGetAttempts200ResponseUsersattemptsInner](docs/Model/ModH5pactivityGetAttempts200ResponseUsersattemptsInner.md)
- [ModH5pactivityGetAttempts200ResponseUsersattemptsInnerAttemptsInner](docs/Model/ModH5pactivityGetAttempts200ResponseUsersattemptsInnerAttemptsInner.md)
- [ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored](docs/Model/ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored.md)
- [ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner](docs/Model/ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.md)
- [ModH5pactivityGetAttemptsRequest](docs/Model/ModH5pactivityGetAttemptsRequest.md)
- [ModH5pactivityGetH5pactivitiesByCourses200Response](docs/Model/ModH5pactivityGetH5pactivitiesByCourses200Response.md)
- [ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner](docs/Model/ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.md)
- [ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile](docs/Model/ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile.md)
- [ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings](docs/Model/ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings.md)
- [ModH5pactivityGetH5pactivityAccessInformation200Response](docs/Model/ModH5pactivityGetH5pactivityAccessInformation200Response.md)
- [ModH5pactivityGetH5pactivityAccessInformationRequest](docs/Model/ModH5pactivityGetH5pactivityAccessInformationRequest.md)
- [ModH5pactivityGetResults200Response](docs/Model/ModH5pactivityGetResults200Response.md)
- [ModH5pactivityGetResults200ResponseAttemptsInner](docs/Model/ModH5pactivityGetResults200ResponseAttemptsInner.md)
- [ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner](docs/Model/ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner.md)
- [ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner](docs/Model/ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner.md)
- [ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer](docs/Model/ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer.md)
- [ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer](docs/Model/ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer.md)
- [ModH5pactivityGetResultsRequest](docs/Model/ModH5pactivityGetResultsRequest.md)
- [ModH5pactivityGetUserAttempts200Response](docs/Model/ModH5pactivityGetUserAttempts200Response.md)
- [ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner](docs/Model/ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner.md)
- [ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScored](docs/Model/ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScored.md)
- [ModH5pactivityGetUserAttemptsRequest](docs/Model/ModH5pactivityGetUserAttemptsRequest.md)
- [ModH5pactivityLogReportViewedRequest](docs/Model/ModH5pactivityLogReportViewedRequest.md)
- [ModH5pactivityViewH5pactivityRequest](docs/Model/ModH5pactivityViewH5pactivityRequest.md)
- [ModImscpGetImscpsByCourses200Response](docs/Model/ModImscpGetImscpsByCourses200Response.md)
- [ModImscpGetImscpsByCourses200ResponseImscpsInner](docs/Model/ModImscpGetImscpsByCourses200ResponseImscpsInner.md)
- [ModImscpViewImscpRequest](docs/Model/ModImscpViewImscpRequest.md)
- [ModIomadcertificateGetIomadcertificatesByCourses200Response](docs/Model/ModIomadcertificateGetIomadcertificatesByCourses200Response.md)
- [ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner](docs/Model/ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner.md)
- [ModIomadcertificateGetIssuedIomadcertificates200Response](docs/Model/ModIomadcertificateGetIssuedIomadcertificates200Response.md)
- [ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner](docs/Model/ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner.md)
- [ModIomadcertificateGetIssuedIomadcertificatesRequest](docs/Model/ModIomadcertificateGetIssuedIomadcertificatesRequest.md)
- [ModIomadcertificateIssueIomadcertificate200Response](docs/Model/ModIomadcertificateIssueIomadcertificate200Response.md)
- [ModIomadcertificateIssueIomadcertificate200ResponseIssue](docs/Model/ModIomadcertificateIssueIomadcertificate200ResponseIssue.md)
- [ModIomadcertificateIssueIomadcertificateRequest](docs/Model/ModIomadcertificateIssueIomadcertificateRequest.md)
- [ModLabelGetLabelsByCourses200Response](docs/Model/ModLabelGetLabelsByCourses200Response.md)
- [ModLabelGetLabelsByCourses200ResponseLabelsInner](docs/Model/ModLabelGetLabelsByCourses200ResponseLabelsInner.md)
- [ModLessonFinishAttempt200Response](docs/Model/ModLessonFinishAttempt200Response.md)
- [ModLessonFinishAttempt200ResponseDataInner](docs/Model/ModLessonFinishAttempt200ResponseDataInner.md)
- [ModLessonFinishAttempt200ResponseMessagesInner](docs/Model/ModLessonFinishAttempt200ResponseMessagesInner.md)
- [ModLessonFinishAttemptRequest](docs/Model/ModLessonFinishAttemptRequest.md)
- [ModLessonGetAttemptsOverview200Response](docs/Model/ModLessonGetAttemptsOverview200Response.md)
- [ModLessonGetAttemptsOverview200ResponseData](docs/Model/ModLessonGetAttemptsOverview200ResponseData.md)
- [ModLessonGetAttemptsOverview200ResponseDataStudentsInner](docs/Model/ModLessonGetAttemptsOverview200ResponseDataStudentsInner.md)
- [ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner](docs/Model/ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner.md)
- [ModLessonGetAttemptsOverviewRequest](docs/Model/ModLessonGetAttemptsOverviewRequest.md)
- [ModLessonGetContentPagesViewed200Response](docs/Model/ModLessonGetContentPagesViewed200Response.md)
- [ModLessonGetContentPagesViewed200ResponsePagesInner](docs/Model/ModLessonGetContentPagesViewed200ResponsePagesInner.md)
- [ModLessonGetContentPagesViewedRequest](docs/Model/ModLessonGetContentPagesViewedRequest.md)
- [ModLessonGetLesson200Response](docs/Model/ModLessonGetLesson200Response.md)
- [ModLessonGetLesson200ResponseLesson](docs/Model/ModLessonGetLesson200ResponseLesson.md)
- [ModLessonGetLessonAccessInformation200Response](docs/Model/ModLessonGetLessonAccessInformation200Response.md)
- [ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner](docs/Model/ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner.md)
- [ModLessonGetLessonAccessInformationRequest](docs/Model/ModLessonGetLessonAccessInformationRequest.md)
- [ModLessonGetLessonRequest](docs/Model/ModLessonGetLessonRequest.md)
- [ModLessonGetLessonsByCourses200Response](docs/Model/ModLessonGetLessonsByCourses200Response.md)
- [ModLessonGetLessonsByCourses200ResponseLessonsInner](docs/Model/ModLessonGetLessonsByCourses200ResponseLessonsInner.md)
- [ModLessonGetPageData200Response](docs/Model/ModLessonGetPageData200Response.md)
- [ModLessonGetPageData200ResponseAnswersInner](docs/Model/ModLessonGetPageData200ResponseAnswersInner.md)
- [ModLessonGetPageData200ResponseMessagesInner](docs/Model/ModLessonGetPageData200ResponseMessagesInner.md)
- [ModLessonGetPageData200ResponsePage](docs/Model/ModLessonGetPageData200ResponsePage.md)
- [ModLessonGetPageDataRequest](docs/Model/ModLessonGetPageDataRequest.md)
- [ModLessonGetPages200Response](docs/Model/ModLessonGetPages200Response.md)
- [ModLessonGetPages200ResponsePagesInner](docs/Model/ModLessonGetPages200ResponsePagesInner.md)
- [ModLessonGetPages200ResponsePagesInnerPage](docs/Model/ModLessonGetPages200ResponsePagesInnerPage.md)
- [ModLessonGetPagesPossibleJumps200Response](docs/Model/ModLessonGetPagesPossibleJumps200Response.md)
- [ModLessonGetPagesPossibleJumps200ResponseJumpsInner](docs/Model/ModLessonGetPagesPossibleJumps200ResponseJumpsInner.md)
- [ModLessonGetPagesRequest](docs/Model/ModLessonGetPagesRequest.md)
- [ModLessonGetQuestionsAttempts200Response](docs/Model/ModLessonGetQuestionsAttempts200Response.md)
- [ModLessonGetQuestionsAttempts200ResponseAttemptsInner](docs/Model/ModLessonGetQuestionsAttempts200ResponseAttemptsInner.md)
- [ModLessonGetQuestionsAttemptsRequest](docs/Model/ModLessonGetQuestionsAttemptsRequest.md)
- [ModLessonGetUserAttempt200Response](docs/Model/ModLessonGetUserAttempt200Response.md)
- [ModLessonGetUserAttempt200ResponseAnswerpagesInner](docs/Model/ModLessonGetUserAttempt200ResponseAnswerpagesInner.md)
- [ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata](docs/Model/ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata.md)
- [ModLessonGetUserAttempt200ResponseUserstats](docs/Model/ModLessonGetUserAttempt200ResponseUserstats.md)
- [ModLessonGetUserAttempt200ResponseUserstatsGradeinfo](docs/Model/ModLessonGetUserAttempt200ResponseUserstatsGradeinfo.md)
- [ModLessonGetUserAttemptGrade200Response](docs/Model/ModLessonGetUserAttemptGrade200Response.md)
- [ModLessonGetUserAttemptGrade200ResponseGrade](docs/Model/ModLessonGetUserAttemptGrade200ResponseGrade.md)
- [ModLessonGetUserAttemptGradeRequest](docs/Model/ModLessonGetUserAttemptGradeRequest.md)
- [ModLessonGetUserAttemptRequest](docs/Model/ModLessonGetUserAttemptRequest.md)
- [ModLessonGetUserGrade200Response](docs/Model/ModLessonGetUserGrade200Response.md)
- [ModLessonGetUserGradeRequest](docs/Model/ModLessonGetUserGradeRequest.md)
- [ModLessonGetUserTimers200Response](docs/Model/ModLessonGetUserTimers200Response.md)
- [ModLessonGetUserTimers200ResponseTimersInner](docs/Model/ModLessonGetUserTimers200ResponseTimersInner.md)
- [ModLessonLaunchAttempt200Response](docs/Model/ModLessonLaunchAttempt200Response.md)
- [ModLessonLaunchAttemptRequest](docs/Model/ModLessonLaunchAttemptRequest.md)
- [ModLessonProcessPage200Response](docs/Model/ModLessonProcessPage200Response.md)
- [ModLessonProcessPageRequest](docs/Model/ModLessonProcessPageRequest.md)
- [ModLessonProcessPageRequestDataInner](docs/Model/ModLessonProcessPageRequestDataInner.md)
- [ModLtiCreateToolProxy200Response](docs/Model/ModLtiCreateToolProxy200Response.md)
- [ModLtiCreateToolProxyRequest](docs/Model/ModLtiCreateToolProxyRequest.md)
- [ModLtiCreateToolType200Response](docs/Model/ModLtiCreateToolType200Response.md)
- [ModLtiCreateToolType200ResponseState](docs/Model/ModLtiCreateToolType200ResponseState.md)
- [ModLtiCreateToolType200ResponseUrls](docs/Model/ModLtiCreateToolType200ResponseUrls.md)
- [ModLtiCreateToolTypeRequest](docs/Model/ModLtiCreateToolTypeRequest.md)
- [ModLtiDeleteCourseToolTypeRequest](docs/Model/ModLtiDeleteCourseToolTypeRequest.md)
- [ModLtiDeleteToolProxy200Response](docs/Model/ModLtiDeleteToolProxy200Response.md)
- [ModLtiDeleteToolProxyRequest](docs/Model/ModLtiDeleteToolProxyRequest.md)
- [ModLtiDeleteToolTypeRequest](docs/Model/ModLtiDeleteToolTypeRequest.md)
- [ModLtiGetLtisByCourses200Response](docs/Model/ModLtiGetLtisByCourses200Response.md)
- [ModLtiGetLtisByCourses200ResponseLtisInner](docs/Model/ModLtiGetLtisByCourses200ResponseLtisInner.md)
- [ModLtiGetToolLaunchData200Response](docs/Model/ModLtiGetToolLaunchData200Response.md)
- [ModLtiGetToolLaunchData200ResponseParametersInner](docs/Model/ModLtiGetToolLaunchData200ResponseParametersInner.md)
- [ModLtiGetToolLaunchDataRequest](docs/Model/ModLtiGetToolLaunchDataRequest.md)
- [ModLtiGetToolProxiesRequest](docs/Model/ModLtiGetToolProxiesRequest.md)
- [ModLtiGetToolProxyRegistrationRequest200Response](docs/Model/ModLtiGetToolProxyRegistrationRequest200Response.md)
- [ModLtiGetToolTypesAndProxies200Response](docs/Model/ModLtiGetToolTypesAndProxies200Response.md)
- [ModLtiGetToolTypesAndProxies200ResponseProxiesInner](docs/Model/ModLtiGetToolTypesAndProxies200ResponseProxiesInner.md)
- [ModLtiGetToolTypesAndProxies200ResponseTypesInner](docs/Model/ModLtiGetToolTypesAndProxies200ResponseTypesInner.md)
- [ModLtiGetToolTypesAndProxies200ResponseTypesInnerState](docs/Model/ModLtiGetToolTypesAndProxies200ResponseTypesInnerState.md)
- [ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls](docs/Model/ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.md)
- [ModLtiGetToolTypesAndProxiesCount200Response](docs/Model/ModLtiGetToolTypesAndProxiesCount200Response.md)
- [ModLtiGetToolTypesAndProxiesCountRequest](docs/Model/ModLtiGetToolTypesAndProxiesCountRequest.md)
- [ModLtiGetToolTypesAndProxiesRequest](docs/Model/ModLtiGetToolTypesAndProxiesRequest.md)
- [ModLtiGetToolTypesRequest](docs/Model/ModLtiGetToolTypesRequest.md)
- [ModLtiIsCartridge200Response](docs/Model/ModLtiIsCartridge200Response.md)
- [ModLtiIsCartridgeRequest](docs/Model/ModLtiIsCartridgeRequest.md)
- [ModLtiToggleShowinactivitychooserRequest](docs/Model/ModLtiToggleShowinactivitychooserRequest.md)
- [ModLtiUpdateToolType200Response](docs/Model/ModLtiUpdateToolType200Response.md)
- [ModLtiUpdateToolTypeRequest](docs/Model/ModLtiUpdateToolTypeRequest.md)
- [ModLtiViewLtiRequest](docs/Model/ModLtiViewLtiRequest.md)
- [ModPageGetPagesByCourses200Response](docs/Model/ModPageGetPagesByCourses200Response.md)
- [ModPageGetPagesByCourses200ResponsePagesInner](docs/Model/ModPageGetPagesByCourses200ResponsePagesInner.md)
- [ModPageViewPageRequest](docs/Model/ModPageViewPageRequest.md)
- [ModQuizAddRandomQuestions200Response](docs/Model/ModQuizAddRandomQuestions200Response.md)
- [ModQuizAddRandomQuestionsRequest](docs/Model/ModQuizAddRandomQuestionsRequest.md)
- [ModQuizGetAttemptAccessInformation200Response](docs/Model/ModQuizGetAttemptAccessInformation200Response.md)
- [ModQuizGetAttemptAccessInformationRequest](docs/Model/ModQuizGetAttemptAccessInformationRequest.md)
- [ModQuizGetAttemptData200Response](docs/Model/ModQuizGetAttemptData200Response.md)
- [ModQuizGetAttemptData200ResponseAttempt](docs/Model/ModQuizGetAttemptData200ResponseAttempt.md)
- [ModQuizGetAttemptData200ResponseQuestionsInner](docs/Model/ModQuizGetAttemptData200ResponseQuestionsInner.md)
- [ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner](docs/Model/ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner.md)
- [ModQuizGetAttemptDataRequest](docs/Model/ModQuizGetAttemptDataRequest.md)
- [ModQuizGetAttemptDataRequestPreflightdataInner](docs/Model/ModQuizGetAttemptDataRequestPreflightdataInner.md)
- [ModQuizGetAttemptReview200Response](docs/Model/ModQuizGetAttemptReview200Response.md)
- [ModQuizGetAttemptReview200ResponseAdditionaldataInner](docs/Model/ModQuizGetAttemptReview200ResponseAdditionaldataInner.md)
- [ModQuizGetAttemptReview200ResponseAttempt](docs/Model/ModQuizGetAttemptReview200ResponseAttempt.md)
- [ModQuizGetAttemptReview200ResponseQuestionsInner](docs/Model/ModQuizGetAttemptReview200ResponseQuestionsInner.md)
- [ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner](docs/Model/ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner.md)
- [ModQuizGetAttemptReviewRequest](docs/Model/ModQuizGetAttemptReviewRequest.md)
- [ModQuizGetAttemptSummary200Response](docs/Model/ModQuizGetAttemptSummary200Response.md)
- [ModQuizGetAttemptSummaryRequest](docs/Model/ModQuizGetAttemptSummaryRequest.md)
- [ModQuizGetCombinedReviewOptions200Response](docs/Model/ModQuizGetCombinedReviewOptions200Response.md)
- [ModQuizGetCombinedReviewOptions200ResponseAlloptionsInner](docs/Model/ModQuizGetCombinedReviewOptions200ResponseAlloptionsInner.md)
- [ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner](docs/Model/ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner.md)
- [ModQuizGetCombinedReviewOptionsRequest](docs/Model/ModQuizGetCombinedReviewOptionsRequest.md)
- [ModQuizGetQuizAccessInformation200Response](docs/Model/ModQuizGetQuizAccessInformation200Response.md)
- [ModQuizGetQuizAccessInformationRequest](docs/Model/ModQuizGetQuizAccessInformationRequest.md)
- [ModQuizGetQuizFeedbackForGrade200Response](docs/Model/ModQuizGetQuizFeedbackForGrade200Response.md)
- [ModQuizGetQuizFeedbackForGradeRequest](docs/Model/ModQuizGetQuizFeedbackForGradeRequest.md)
- [ModQuizGetQuizRequiredQtypes200Response](docs/Model/ModQuizGetQuizRequiredQtypes200Response.md)
- [ModQuizGetQuizzesByCourses200Response](docs/Model/ModQuizGetQuizzesByCourses200Response.md)
- [ModQuizGetQuizzesByCourses200ResponseQuizzesInner](docs/Model/ModQuizGetQuizzesByCourses200ResponseQuizzesInner.md)
- [ModQuizGetReopenAttemptConfirmationRequest](docs/Model/ModQuizGetReopenAttemptConfirmationRequest.md)
- [ModQuizGetUserAttempts200Response](docs/Model/ModQuizGetUserAttempts200Response.md)
- [ModQuizGetUserAttempts200ResponseAttemptsInner](docs/Model/ModQuizGetUserAttempts200ResponseAttemptsInner.md)
- [ModQuizGetUserAttemptsRequest](docs/Model/ModQuizGetUserAttemptsRequest.md)
- [ModQuizGetUserBestGrade200Response](docs/Model/ModQuizGetUserBestGrade200Response.md)
- [ModQuizGetUserBestGradeRequest](docs/Model/ModQuizGetUserBestGradeRequest.md)
- [ModQuizProcessAttempt200Response](docs/Model/ModQuizProcessAttempt200Response.md)
- [ModQuizProcessAttemptRequest](docs/Model/ModQuizProcessAttemptRequest.md)
- [ModQuizReopenAttemptRequest](docs/Model/ModQuizReopenAttemptRequest.md)
- [ModQuizSaveAttemptRequest](docs/Model/ModQuizSaveAttemptRequest.md)
- [ModQuizSetQuestionVersion200Response](docs/Model/ModQuizSetQuestionVersion200Response.md)
- [ModQuizSetQuestionVersionRequest](docs/Model/ModQuizSetQuestionVersionRequest.md)
- [ModQuizStartAttempt200Response](docs/Model/ModQuizStartAttempt200Response.md)
- [ModQuizStartAttemptRequest](docs/Model/ModQuizStartAttemptRequest.md)
- [ModQuizUpdateFilterConditionRequest](docs/Model/ModQuizUpdateFilterConditionRequest.md)
- [ModQuizViewAttemptRequest](docs/Model/ModQuizViewAttemptRequest.md)
- [ModQuizViewAttemptReviewRequest](docs/Model/ModQuizViewAttemptReviewRequest.md)
- [ModResourceGetResourcesByCourses200Response](docs/Model/ModResourceGetResourcesByCourses200Response.md)
- [ModResourceGetResourcesByCourses200ResponseResourcesInner](docs/Model/ModResourceGetResourcesByCourses200ResponseResourcesInner.md)
- [ModResourceViewResourceRequest](docs/Model/ModResourceViewResourceRequest.md)
- [ModScormGetScormAccessInformation200Response](docs/Model/ModScormGetScormAccessInformation200Response.md)
- [ModScormGetScormAccessInformationRequest](docs/Model/ModScormGetScormAccessInformationRequest.md)
- [ModScormGetScormAttemptCount200Response](docs/Model/ModScormGetScormAttemptCount200Response.md)
- [ModScormGetScormAttemptCountRequest](docs/Model/ModScormGetScormAttemptCountRequest.md)
- [ModScormGetScormScoTracks200Response](docs/Model/ModScormGetScormScoTracks200Response.md)
- [ModScormGetScormScoTracks200ResponseData](docs/Model/ModScormGetScormScoTracks200ResponseData.md)
- [ModScormGetScormScoTracks200ResponseDataTracksInner](docs/Model/ModScormGetScormScoTracks200ResponseDataTracksInner.md)
- [ModScormGetScormScoTracksRequest](docs/Model/ModScormGetScormScoTracksRequest.md)
- [ModScormGetScormScoes200Response](docs/Model/ModScormGetScormScoes200Response.md)
- [ModScormGetScormScoes200ResponseScoesInner](docs/Model/ModScormGetScormScoes200ResponseScoesInner.md)
- [ModScormGetScormScoes200ResponseScoesInnerExtradataInner](docs/Model/ModScormGetScormScoes200ResponseScoesInnerExtradataInner.md)
- [ModScormGetScormScoesRequest](docs/Model/ModScormGetScormScoesRequest.md)
- [ModScormGetScormUserData200Response](docs/Model/ModScormGetScormUserData200Response.md)
- [ModScormGetScormUserData200ResponseDataInner](docs/Model/ModScormGetScormUserData200ResponseDataInner.md)
- [ModScormGetScormUserData200ResponseDataInnerDefaultdataInner](docs/Model/ModScormGetScormUserData200ResponseDataInnerDefaultdataInner.md)
- [ModScormGetScormUserDataRequest](docs/Model/ModScormGetScormUserDataRequest.md)
- [ModScormGetScormsByCourses200Response](docs/Model/ModScormGetScormsByCourses200Response.md)
- [ModScormGetScormsByCourses200ResponseOptionsInner](docs/Model/ModScormGetScormsByCourses200ResponseOptionsInner.md)
- [ModScormGetScormsByCourses200ResponseScormsInner](docs/Model/ModScormGetScormsByCourses200ResponseScormsInner.md)
- [ModScormInsertScormTracks200Response](docs/Model/ModScormInsertScormTracks200Response.md)
- [ModScormInsertScormTracksRequest](docs/Model/ModScormInsertScormTracksRequest.md)
- [ModScormLaunchScoRequest](docs/Model/ModScormLaunchScoRequest.md)
- [ModScormViewScormRequest](docs/Model/ModScormViewScormRequest.md)
- [ModSurveyGetQuestions200Response](docs/Model/ModSurveyGetQuestions200Response.md)
- [ModSurveyGetQuestions200ResponseQuestionsInner](docs/Model/ModSurveyGetQuestions200ResponseQuestionsInner.md)
- [ModSurveyGetQuestionsRequest](docs/Model/ModSurveyGetQuestionsRequest.md)
- [ModSurveyGetSurveysByCourses200Response](docs/Model/ModSurveyGetSurveysByCourses200Response.md)
- [ModSurveyGetSurveysByCourses200ResponseSurveysInner](docs/Model/ModSurveyGetSurveysByCourses200ResponseSurveysInner.md)
- [ModSurveySubmitAnswersRequest](docs/Model/ModSurveySubmitAnswersRequest.md)
- [ModSurveySubmitAnswersRequestAnswersInner](docs/Model/ModSurveySubmitAnswersRequestAnswersInner.md)
- [ModSurveyViewSurveyRequest](docs/Model/ModSurveyViewSurveyRequest.md)
- [ModUrlGetUrlsByCourses200Response](docs/Model/ModUrlGetUrlsByCourses200Response.md)
- [ModUrlGetUrlsByCourses200ResponseUrlsInner](docs/Model/ModUrlGetUrlsByCourses200ResponseUrlsInner.md)
- [ModUrlViewUrlRequest](docs/Model/ModUrlViewUrlRequest.md)
- [ModWikiEditPage200Response](docs/Model/ModWikiEditPage200Response.md)
- [ModWikiEditPageRequest](docs/Model/ModWikiEditPageRequest.md)
- [ModWikiGetPageContents200Response](docs/Model/ModWikiGetPageContents200Response.md)
- [ModWikiGetPageContents200ResponsePage](docs/Model/ModWikiGetPageContents200ResponsePage.md)
- [ModWikiGetPageContentsRequest](docs/Model/ModWikiGetPageContentsRequest.md)
- [ModWikiGetPageForEditing200Response](docs/Model/ModWikiGetPageForEditing200Response.md)
- [ModWikiGetPageForEditing200ResponsePagesection](docs/Model/ModWikiGetPageForEditing200ResponsePagesection.md)
- [ModWikiGetPageForEditingRequest](docs/Model/ModWikiGetPageForEditingRequest.md)
- [ModWikiGetSubwikiFilesRequest](docs/Model/ModWikiGetSubwikiFilesRequest.md)
- [ModWikiGetSubwikiPages200Response](docs/Model/ModWikiGetSubwikiPages200Response.md)
- [ModWikiGetSubwikiPages200ResponsePagesInner](docs/Model/ModWikiGetSubwikiPages200ResponsePagesInner.md)
- [ModWikiGetSubwikiPagesRequest](docs/Model/ModWikiGetSubwikiPagesRequest.md)
- [ModWikiGetSubwikiPagesRequestOptions](docs/Model/ModWikiGetSubwikiPagesRequestOptions.md)
- [ModWikiGetSubwikis200Response](docs/Model/ModWikiGetSubwikis200Response.md)
- [ModWikiGetSubwikis200ResponseSubwikisInner](docs/Model/ModWikiGetSubwikis200ResponseSubwikisInner.md)
- [ModWikiGetSubwikisRequest](docs/Model/ModWikiGetSubwikisRequest.md)
- [ModWikiGetWikisByCourses200Response](docs/Model/ModWikiGetWikisByCourses200Response.md)
- [ModWikiGetWikisByCourses200ResponseWikisInner](docs/Model/ModWikiGetWikisByCourses200ResponseWikisInner.md)
- [ModWikiGetWikisByCoursesRequest](docs/Model/ModWikiGetWikisByCoursesRequest.md)
- [ModWikiNewPage200Response](docs/Model/ModWikiNewPage200Response.md)
- [ModWikiNewPageRequest](docs/Model/ModWikiNewPageRequest.md)
- [ModWikiViewPage200Response](docs/Model/ModWikiViewPage200Response.md)
- [ModWikiViewPageRequest](docs/Model/ModWikiViewPageRequest.md)
- [ModWikiViewWiki200Response](docs/Model/ModWikiViewWiki200Response.md)
- [ModWorkshopAddSubmission200Response](docs/Model/ModWorkshopAddSubmission200Response.md)
- [ModWorkshopAddSubmissionRequest](docs/Model/ModWorkshopAddSubmissionRequest.md)
- [ModWorkshopDeleteSubmission200Response](docs/Model/ModWorkshopDeleteSubmission200Response.md)
- [ModWorkshopDeleteSubmissionRequest](docs/Model/ModWorkshopDeleteSubmissionRequest.md)
- [ModWorkshopEvaluateAssessment200Response](docs/Model/ModWorkshopEvaluateAssessment200Response.md)
- [ModWorkshopEvaluateAssessmentRequest](docs/Model/ModWorkshopEvaluateAssessmentRequest.md)
- [ModWorkshopEvaluateSubmission200Response](docs/Model/ModWorkshopEvaluateSubmission200Response.md)
- [ModWorkshopEvaluateSubmissionRequest](docs/Model/ModWorkshopEvaluateSubmissionRequest.md)
- [ModWorkshopGetAssessment200Response](docs/Model/ModWorkshopGetAssessment200Response.md)
- [ModWorkshopGetAssessment200ResponseAssessment](docs/Model/ModWorkshopGetAssessment200ResponseAssessment.md)
- [ModWorkshopGetAssessmentFormDefinition200Response](docs/Model/ModWorkshopGetAssessmentFormDefinition200Response.md)
- [ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner](docs/Model/ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner.md)
- [ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner](docs/Model/ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner.md)
- [ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner](docs/Model/ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner.md)
- [ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner](docs/Model/ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner.md)
- [ModWorkshopGetAssessmentFormDefinitionRequest](docs/Model/ModWorkshopGetAssessmentFormDefinitionRequest.md)
- [ModWorkshopGetAssessmentRequest](docs/Model/ModWorkshopGetAssessmentRequest.md)
- [ModWorkshopGetGrades200Response](docs/Model/ModWorkshopGetGrades200Response.md)
- [ModWorkshopGetGradesReport200Response](docs/Model/ModWorkshopGetGradesReport200Response.md)
- [ModWorkshopGetGradesReport200ResponseReport](docs/Model/ModWorkshopGetGradesReport200ResponseReport.md)
- [ModWorkshopGetGradesReport200ResponseReportGradesInner](docs/Model/ModWorkshopGetGradesReport200ResponseReportGradesInner.md)
- [ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner](docs/Model/ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner.md)
- [ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner](docs/Model/ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner.md)
- [ModWorkshopGetGradesReportRequest](docs/Model/ModWorkshopGetGradesReportRequest.md)
- [ModWorkshopGetGradesRequest](docs/Model/ModWorkshopGetGradesRequest.md)
- [ModWorkshopGetReviewerAssessments200Response](docs/Model/ModWorkshopGetReviewerAssessments200Response.md)
- [ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner](docs/Model/ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner.md)
- [ModWorkshopGetReviewerAssessmentsRequest](docs/Model/ModWorkshopGetReviewerAssessmentsRequest.md)
- [ModWorkshopGetSubmission200Response](docs/Model/ModWorkshopGetSubmission200Response.md)
- [ModWorkshopGetSubmission200ResponseSubmission](docs/Model/ModWorkshopGetSubmission200ResponseSubmission.md)
- [ModWorkshopGetSubmissionRequest](docs/Model/ModWorkshopGetSubmissionRequest.md)
- [ModWorkshopGetSubmissions200Response](docs/Model/ModWorkshopGetSubmissions200Response.md)
- [ModWorkshopGetSubmissions200ResponseSubmissionsInner](docs/Model/ModWorkshopGetSubmissions200ResponseSubmissionsInner.md)
- [ModWorkshopGetSubmissionsRequest](docs/Model/ModWorkshopGetSubmissionsRequest.md)
- [ModWorkshopGetUserPlan200Response](docs/Model/ModWorkshopGetUserPlan200Response.md)
- [ModWorkshopGetUserPlan200ResponseUserplan](docs/Model/ModWorkshopGetUserPlan200ResponseUserplan.md)
- [ModWorkshopGetUserPlan200ResponseUserplanExamplesInner](docs/Model/ModWorkshopGetUserPlan200ResponseUserplanExamplesInner.md)
- [ModWorkshopGetUserPlan200ResponseUserplanPhasesInner](docs/Model/ModWorkshopGetUserPlan200ResponseUserplanPhasesInner.md)
- [ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerActionsInner](docs/Model/ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerActionsInner.md)
- [ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner](docs/Model/ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner.md)
- [ModWorkshopGetUserPlanRequest](docs/Model/ModWorkshopGetUserPlanRequest.md)
- [ModWorkshopGetWorkshopAccessInformation200Response](docs/Model/ModWorkshopGetWorkshopAccessInformation200Response.md)
- [ModWorkshopGetWorkshopAccessInformationRequest](docs/Model/ModWorkshopGetWorkshopAccessInformationRequest.md)
- [ModWorkshopGetWorkshopsByCourses200Response](docs/Model/ModWorkshopGetWorkshopsByCourses200Response.md)
- [ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner](docs/Model/ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner.md)
- [ModWorkshopUpdateAssessment200Response](docs/Model/ModWorkshopUpdateAssessment200Response.md)
- [ModWorkshopUpdateAssessmentRequest](docs/Model/ModWorkshopUpdateAssessmentRequest.md)
- [ModWorkshopUpdateAssessmentRequestDataInner](docs/Model/ModWorkshopUpdateAssessmentRequestDataInner.md)
- [ModWorkshopUpdateSubmission200Response](docs/Model/ModWorkshopUpdateSubmission200Response.md)
- [ModWorkshopUpdateSubmissionRequest](docs/Model/ModWorkshopUpdateSubmissionRequest.md)
- [ModWorkshopViewWorkshopRequest](docs/Model/ModWorkshopViewWorkshopRequest.md)
- [PaygwPaypalCreateTransactionComplete200Response](docs/Model/PaygwPaypalCreateTransactionComplete200Response.md)
- [PaygwPaypalCreateTransactionCompleteRequest](docs/Model/PaygwPaypalCreateTransactionCompleteRequest.md)
- [PaygwPaypalGetConfigForJs200Response](docs/Model/PaygwPaypalGetConfigForJs200Response.md)
- [PaygwPaypalGetConfigForJsRequest](docs/Model/PaygwPaypalGetConfigForJsRequest.md)
- [QbankColumnsortorderSetColumnSizeRequest](docs/Model/QbankColumnsortorderSetColumnSizeRequest.md)
- [QbankColumnsortorderSetColumnbankOrderRequest](docs/Model/QbankColumnsortorderSetColumnbankOrderRequest.md)
- [QbankColumnsortorderSetHiddenColumnsRequest](docs/Model/QbankColumnsortorderSetHiddenColumnsRequest.md)
- [QbankEditquestionSetStatus200Response](docs/Model/QbankEditquestionSetStatus200Response.md)
- [QbankEditquestionSetStatusRequest](docs/Model/QbankEditquestionSetStatusRequest.md)
- [QbankTagquestionSubmitTagsFormRequest](docs/Model/QbankTagquestionSubmitTagsFormRequest.md)
- [QbankViewquestiontextSetQuestionTextFormatRequest](docs/Model/QbankViewquestiontextSetQuestionTextFormatRequest.md)
- [QuizaccessSebValidateQuizKeys200Response](docs/Model/QuizaccessSebValidateQuizKeys200Response.md)
- [QuizaccessSebValidateQuizKeysRequest](docs/Model/QuizaccessSebValidateQuizKeysRequest.md)
- [ReportCompetencyDataForReport200Response](docs/Model/ReportCompetencyDataForReport200Response.md)
- [ReportCompetencyDataForReport200ResponseUsercompetenciesInner](docs/Model/ReportCompetencyDataForReport200ResponseUsercompetenciesInner.md)
- [ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency](docs/Model/ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency.md)
- [ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath](docs/Model/ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath.md)
- [ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner](docs/Model/ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner.md)
- [ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework](docs/Model/ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework.md)
- [ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse](docs/Model/ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse.md)
- [ReportCompetencyDataForReportRequest](docs/Model/ReportCompetencyDataForReportRequest.md)
- [ReportInsightsActionExecutedRequest](docs/Model/ReportInsightsActionExecutedRequest.md)
- [ReportInsightsSetFixedPrediction200Response](docs/Model/ReportInsightsSetFixedPrediction200Response.md)
- [ReportInsightsSetFixedPredictionRequest](docs/Model/ReportInsightsSetFixedPredictionRequest.md)
- [ReportInsightsSetNotusefulPrediction200Response](docs/Model/ReportInsightsSetNotusefulPrediction200Response.md)
- [ReportInsightsSetNotusefulPredictionRequest](docs/Model/ReportInsightsSetNotusefulPredictionRequest.md)
- [TinyAutosaveResetSessionRequest](docs/Model/TinyAutosaveResetSessionRequest.md)
- [TinyAutosaveResumeSession200Response](docs/Model/TinyAutosaveResumeSession200Response.md)
- [TinyAutosaveResumeSessionRequest](docs/Model/TinyAutosaveResumeSessionRequest.md)
- [TinyAutosaveUpdateSessionRequest](docs/Model/TinyAutosaveUpdateSessionRequest.md)
- [TinyEquationFilter200Response](docs/Model/TinyEquationFilter200Response.md)
- [TinyEquationFilterRequest](docs/Model/TinyEquationFilterRequest.md)
- [TinyPremiumGetApiKey200Response](docs/Model/TinyPremiumGetApiKey200Response.md)
- [TinyPremiumGetApiKeyRequest](docs/Model/TinyPremiumGetApiKeyRequest.md)
- [ToolAnalyticsPotentialContextsRequest](docs/Model/ToolAnalyticsPotentialContextsRequest.md)
- [ToolBehatGetEntityGenerator200Response](docs/Model/ToolBehatGetEntityGenerator200Response.md)
- [ToolBehatGetEntityGeneratorRequest](docs/Model/ToolBehatGetEntityGeneratorRequest.md)
- [ToolDataprivacyApproveDataRequestRequest](docs/Model/ToolDataprivacyApproveDataRequestRequest.md)
- [ToolDataprivacyBulkApproveDataRequestsRequest](docs/Model/ToolDataprivacyBulkApproveDataRequestsRequest.md)
- [ToolDataprivacyBulkDenyDataRequestsRequest](docs/Model/ToolDataprivacyBulkDenyDataRequestsRequest.md)
- [ToolDataprivacyCancelDataRequestRequest](docs/Model/ToolDataprivacyCancelDataRequestRequest.md)
- [ToolDataprivacyConfirmContextsForDeletion200Response](docs/Model/ToolDataprivacyConfirmContextsForDeletion200Response.md)
- [ToolDataprivacyConfirmContextsForDeletionRequest](docs/Model/ToolDataprivacyConfirmContextsForDeletionRequest.md)
- [ToolDataprivacyContactDpoRequest](docs/Model/ToolDataprivacyContactDpoRequest.md)
- [ToolDataprivacyCreateCategoryForm200Response](docs/Model/ToolDataprivacyCreateCategoryForm200Response.md)
- [ToolDataprivacyCreateCategoryForm200ResponseCategory](docs/Model/ToolDataprivacyCreateCategoryForm200ResponseCategory.md)
- [ToolDataprivacyCreateCategoryFormRequest](docs/Model/ToolDataprivacyCreateCategoryFormRequest.md)
- [ToolDataprivacyCreatePurposeForm200Response](docs/Model/ToolDataprivacyCreatePurposeForm200Response.md)
- [ToolDataprivacyCreatePurposeForm200ResponsePurpose](docs/Model/ToolDataprivacyCreatePurposeForm200ResponsePurpose.md)
- [ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner](docs/Model/ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner.md)
- [ToolDataprivacyCreatePurposeFormRequest](docs/Model/ToolDataprivacyCreatePurposeFormRequest.md)
- [ToolDataprivacyDeleteCategoryRequest](docs/Model/ToolDataprivacyDeleteCategoryRequest.md)
- [ToolDataprivacyDeletePurposeRequest](docs/Model/ToolDataprivacyDeletePurposeRequest.md)
- [ToolDataprivacyGetActivityOptions200Response](docs/Model/ToolDataprivacyGetActivityOptions200Response.md)
- [ToolDataprivacyGetActivityOptions200ResponseOptionsInner](docs/Model/ToolDataprivacyGetActivityOptions200ResponseOptionsInner.md)
- [ToolDataprivacyGetActivityOptionsRequest](docs/Model/ToolDataprivacyGetActivityOptionsRequest.md)
- [ToolDataprivacyGetCategoryOptions200Response](docs/Model/ToolDataprivacyGetCategoryOptions200Response.md)
- [ToolDataprivacyGetCategoryOptions200ResponseOptionsInner](docs/Model/ToolDataprivacyGetCategoryOptions200ResponseOptionsInner.md)
- [ToolDataprivacyGetCategoryOptionsRequest](docs/Model/ToolDataprivacyGetCategoryOptionsRequest.md)
- [ToolDataprivacyGetDataRequest200Response](docs/Model/ToolDataprivacyGetDataRequest200Response.md)
- [ToolDataprivacyGetDataRequest200ResponseResult](docs/Model/ToolDataprivacyGetDataRequest200ResponseResult.md)
- [ToolDataprivacyGetPurposeOptions200Response](docs/Model/ToolDataprivacyGetPurposeOptions200Response.md)
- [ToolDataprivacyGetPurposeOptions200ResponseOptionsInner](docs/Model/ToolDataprivacyGetPurposeOptions200ResponseOptionsInner.md)
- [ToolDataprivacyGetUsersRequest](docs/Model/ToolDataprivacyGetUsersRequest.md)
- [ToolDataprivacySetContextDefaults200Response](docs/Model/ToolDataprivacySetContextDefaults200Response.md)
- [ToolDataprivacySetContextDefaultsRequest](docs/Model/ToolDataprivacySetContextDefaultsRequest.md)
- [ToolDataprivacySetContextForm200Response](docs/Model/ToolDataprivacySetContextForm200Response.md)
- [ToolDataprivacySetContextFormRequest](docs/Model/ToolDataprivacySetContextFormRequest.md)
- [ToolDataprivacySetContextlevelForm200Response](docs/Model/ToolDataprivacySetContextlevelForm200Response.md)
- [ToolDataprivacySetContextlevelFormRequest](docs/Model/ToolDataprivacySetContextlevelFormRequest.md)
- [ToolDataprivacySubmitSelectedCoursesFormRequest](docs/Model/ToolDataprivacySubmitSelectedCoursesFormRequest.md)
- [ToolDataprivacyTreeExtraBranches200Response](docs/Model/ToolDataprivacyTreeExtraBranches200Response.md)
- [ToolDataprivacyTreeExtraBranches200ResponseBranchesInner](docs/Model/ToolDataprivacyTreeExtraBranches200ResponseBranchesInner.md)
- [ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner](docs/Model/ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner.md)
- [ToolDataprivacyTreeExtraBranchesRequest](docs/Model/ToolDataprivacyTreeExtraBranchesRequest.md)
- [ToolIomadpolicyGetIomadpolicyVersion200Response](docs/Model/ToolIomadpolicyGetIomadpolicyVersion200Response.md)
- [ToolIomadpolicyGetIomadpolicyVersion200ResponseResult](docs/Model/ToolIomadpolicyGetIomadpolicyVersion200ResponseResult.md)
- [ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy](docs/Model/ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy.md)
- [ToolIomadpolicyGetIomadpolicyVersionRequest](docs/Model/ToolIomadpolicyGetIomadpolicyVersionRequest.md)
- [ToolIomadpolicySubmitAcceptOnBehalfRequest](docs/Model/ToolIomadpolicySubmitAcceptOnBehalfRequest.md)
- [ToolLpDataForCompetenciesManagePage200Response](docs/Model/ToolLpDataForCompetenciesManagePage200Response.md)
- [ToolLpDataForCompetenciesManagePageRequest](docs/Model/ToolLpDataForCompetenciesManagePageRequest.md)
- [ToolLpDataForCompetencyFrameworksManagePage200Response](docs/Model/ToolLpDataForCompetencyFrameworksManagePage200Response.md)
- [ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner](docs/Model/ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.md)
- [ToolLpDataForCompetencyFrameworksManagePageRequest](docs/Model/ToolLpDataForCompetencyFrameworksManagePageRequest.md)
- [ToolLpDataForCompetencySummary200Response](docs/Model/ToolLpDataForCompetencySummary200Response.md)
- [ToolLpDataForCompetencySummary200ResponseComppath](docs/Model/ToolLpDataForCompetencySummary200ResponseComppath.md)
- [ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner](docs/Model/ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner.md)
- [ToolLpDataForCompetencySummaryRequest](docs/Model/ToolLpDataForCompetencySummaryRequest.md)
- [ToolLpDataForCourseCompetenciesPage200Response](docs/Model/ToolLpDataForCourseCompetenciesPage200Response.md)
- [ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner](docs/Model/ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner.md)
- [ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency](docs/Model/ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency.md)
- [ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner](docs/Model/ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner.md)
- [ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner](docs/Model/ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner.md)
- [ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerRuleoutcomeoptionsInner](docs/Model/ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerRuleoutcomeoptionsInner.md)
- [ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse](docs/Model/ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse.md)
- [ToolLpDataForCourseCompetenciesPage200ResponseSettings](docs/Model/ToolLpDataForCourseCompetenciesPage200ResponseSettings.md)
- [ToolLpDataForCourseCompetenciesPage200ResponseStatistics](docs/Model/ToolLpDataForCourseCompetenciesPage200ResponseStatistics.md)
- [ToolLpDataForCourseCompetenciesPageRequest](docs/Model/ToolLpDataForCourseCompetenciesPageRequest.md)
- [ToolLpDataForPlanPage200Response](docs/Model/ToolLpDataForPlanPage200Response.md)
- [ToolLpDataForPlanPage200ResponseCompetenciesInner](docs/Model/ToolLpDataForPlanPage200ResponseCompetenciesInner.md)
- [ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency](docs/Model/ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.md)
- [ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan](docs/Model/ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.md)
- [ToolLpDataForPlansPage200Response](docs/Model/ToolLpDataForPlansPage200Response.md)
- [ToolLpDataForPlansPageRequest](docs/Model/ToolLpDataForPlansPageRequest.md)
- [ToolLpDataForRelatedCompetenciesSection200Response](docs/Model/ToolLpDataForRelatedCompetenciesSection200Response.md)
- [ToolLpDataForRelatedCompetenciesSectionRequest](docs/Model/ToolLpDataForRelatedCompetenciesSectionRequest.md)
- [ToolLpDataForTemplateCompetenciesPage200Response](docs/Model/ToolLpDataForTemplateCompetenciesPage200Response.md)
- [ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner](docs/Model/ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner.md)
- [ToolLpDataForTemplateCompetenciesPage200ResponseStatistics](docs/Model/ToolLpDataForTemplateCompetenciesPage200ResponseStatistics.md)
- [ToolLpDataForTemplateCompetenciesPageRequest](docs/Model/ToolLpDataForTemplateCompetenciesPageRequest.md)
- [ToolLpDataForTemplatesManagePage200Response](docs/Model/ToolLpDataForTemplatesManagePage200Response.md)
- [ToolLpDataForTemplatesManagePage200ResponseTemplatesInner](docs/Model/ToolLpDataForTemplatesManagePage200ResponseTemplatesInner.md)
- [ToolLpDataForUserCompetencySummary200Response](docs/Model/ToolLpDataForUserCompetencySummary200Response.md)
- [ToolLpDataForUserCompetencySummary200ResponseEvidenceInner](docs/Model/ToolLpDataForUserCompetencySummary200ResponseEvidenceInner.md)
- [ToolLpDataForUserCompetencySummary200ResponseUsercompetency](docs/Model/ToolLpDataForUserCompetencySummary200ResponseUsercompetency.md)
- [ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan](docs/Model/ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan.md)
- [ToolLpDataForUserCompetencySummaryInCourse200Response](docs/Model/ToolLpDataForUserCompetencySummaryInCourse200Response.md)
- [ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary](docs/Model/ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary.md)
- [ToolLpDataForUserCompetencySummaryInCourseRequest](docs/Model/ToolLpDataForUserCompetencySummaryInCourseRequest.md)
- [ToolLpDataForUserCompetencySummaryInPlan200Response](docs/Model/ToolLpDataForUserCompetencySummaryInPlan200Response.md)
- [ToolLpDataForUserCompetencySummaryInPlanRequest](docs/Model/ToolLpDataForUserCompetencySummaryInPlanRequest.md)
- [ToolLpDataForUserCompetencySummaryRequest](docs/Model/ToolLpDataForUserCompetencySummaryRequest.md)
- [ToolLpDataForUserEvidenceListPage200Response](docs/Model/ToolLpDataForUserEvidenceListPage200Response.md)
- [ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner](docs/Model/ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner.md)
- [ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner](docs/Model/ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner.md)
- [ToolLpDataForUserEvidenceListPageRequest](docs/Model/ToolLpDataForUserEvidenceListPageRequest.md)
- [ToolLpDataForUserEvidencePage200Response](docs/Model/ToolLpDataForUserEvidencePage200Response.md)
- [ToolLpDataForUserEvidencePage200ResponseUserevidence](docs/Model/ToolLpDataForUserEvidencePage200ResponseUserevidence.md)
- [ToolLpDataForUserEvidencePageRequest](docs/Model/ToolLpDataForUserEvidencePageRequest.md)
- [ToolLpSearchCohorts200Response](docs/Model/ToolLpSearchCohorts200Response.md)
- [ToolLpSearchCohorts200ResponseCohortsInner](docs/Model/ToolLpSearchCohorts200ResponseCohortsInner.md)
- [ToolLpSearchCohortsRequest](docs/Model/ToolLpSearchCohortsRequest.md)
- [ToolLpSearchUsers200Response](docs/Model/ToolLpSearchUsers200Response.md)
- [ToolLpSearchUsers200ResponseUsersInner](docs/Model/ToolLpSearchUsers200ResponseUsersInner.md)
- [ToolLpSearchUsersRequest](docs/Model/ToolLpSearchUsersRequest.md)
- [ToolMobileCallExternalFunctions200Response](docs/Model/ToolMobileCallExternalFunctions200Response.md)
- [ToolMobileCallExternalFunctions200ResponseResponsesInner](docs/Model/ToolMobileCallExternalFunctions200ResponseResponsesInner.md)
- [ToolMobileCallExternalFunctionsRequest](docs/Model/ToolMobileCallExternalFunctionsRequest.md)
- [ToolMobileCallExternalFunctionsRequestRequestsInner](docs/Model/ToolMobileCallExternalFunctionsRequestRequestsInner.md)
- [ToolMobileGetAutologinKey200Response](docs/Model/ToolMobileGetAutologinKey200Response.md)
- [ToolMobileGetAutologinKeyRequest](docs/Model/ToolMobileGetAutologinKeyRequest.md)
- [ToolMobileGetConfig200Response](docs/Model/ToolMobileGetConfig200Response.md)
- [ToolMobileGetConfig200ResponseSettingsInner](docs/Model/ToolMobileGetConfig200ResponseSettingsInner.md)
- [ToolMobileGetConfigRequest](docs/Model/ToolMobileGetConfigRequest.md)
- [ToolMobileGetContent200Response](docs/Model/ToolMobileGetContent200Response.md)
- [ToolMobileGetContent200ResponseOtherdataInner](docs/Model/ToolMobileGetContent200ResponseOtherdataInner.md)
- [ToolMobileGetContent200ResponseRestrict](docs/Model/ToolMobileGetContent200ResponseRestrict.md)
- [ToolMobileGetContent200ResponseTemplatesInner](docs/Model/ToolMobileGetContent200ResponseTemplatesInner.md)
- [ToolMobileGetContentRequest](docs/Model/ToolMobileGetContentRequest.md)
- [ToolMobileGetContentRequestArgsInner](docs/Model/ToolMobileGetContentRequestArgsInner.md)
- [ToolMobileGetPluginsSupportingMobile200Response](docs/Model/ToolMobileGetPluginsSupportingMobile200Response.md)
- [ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner](docs/Model/ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner.md)
- [ToolMobileGetPublicConfig200Response](docs/Model/ToolMobileGetPublicConfig200Response.md)
- [ToolMobileGetPublicConfig200ResponseIdentityprovidersInner](docs/Model/ToolMobileGetPublicConfig200ResponseIdentityprovidersInner.md)
- [ToolMobileGetTokensForQrLogin200Response](docs/Model/ToolMobileGetTokensForQrLogin200Response.md)
- [ToolMobileGetTokensForQrLoginRequest](docs/Model/ToolMobileGetTokensForQrLoginRequest.md)
- [ToolMobileValidateSubscriptionKey200Response](docs/Model/ToolMobileValidateSubscriptionKey200Response.md)
- [ToolMobileValidateSubscriptionKeyRequest](docs/Model/ToolMobileValidateSubscriptionKeyRequest.md)
- [ToolMoodlenetSearchCourses200Response](docs/Model/ToolMoodlenetSearchCourses200Response.md)
- [ToolMoodlenetSearchCourses200ResponseCoursesInner](docs/Model/ToolMoodlenetSearchCourses200ResponseCoursesInner.md)
- [ToolMoodlenetSearchCoursesRequest](docs/Model/ToolMoodlenetSearchCoursesRequest.md)
- [ToolMoodlenetVerifyWebfinger200Response](docs/Model/ToolMoodlenetVerifyWebfinger200Response.md)
- [ToolMoodlenetVerifyWebfingerRequest](docs/Model/ToolMoodlenetVerifyWebfingerRequest.md)
- [ToolPolicyGetPolicyVersion200Response](docs/Model/ToolPolicyGetPolicyVersion200Response.md)
- [ToolPolicyGetPolicyVersion200ResponseResult](docs/Model/ToolPolicyGetPolicyVersion200ResponseResult.md)
- [ToolPolicyGetPolicyVersion200ResponseResultPolicy](docs/Model/ToolPolicyGetPolicyVersion200ResponseResultPolicy.md)
- [ToolPolicyGetPolicyVersionRequest](docs/Model/ToolPolicyGetPolicyVersionRequest.md)
- [ToolPolicySubmitAcceptOnBehalfRequest](docs/Model/ToolPolicySubmitAcceptOnBehalfRequest.md)
- [ToolTemplatelibraryListTemplatesRequest](docs/Model/ToolTemplatelibraryListTemplatesRequest.md)
- [ToolTemplatelibraryLoadCanonicalTemplateRequest](docs/Model/ToolTemplatelibraryLoadCanonicalTemplateRequest.md)
- [ToolUsertoursCompleteTourRequest](docs/Model/ToolUsertoursCompleteTourRequest.md)
- [ToolUsertoursFetchAndStartTour200Response](docs/Model/ToolUsertoursFetchAndStartTour200Response.md)
- [ToolUsertoursFetchAndStartTour200ResponseTourconfig](docs/Model/ToolUsertoursFetchAndStartTour200ResponseTourconfig.md)
- [ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner](docs/Model/ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner.md)
- [ToolUsertoursFetchAndStartTourRequest](docs/Model/ToolUsertoursFetchAndStartTourRequest.md)
- [ToolUsertoursResetTour200Response](docs/Model/ToolUsertoursResetTour200Response.md)
- [ToolUsertoursResetTourRequest](docs/Model/ToolUsertoursResetTourRequest.md)
- [ToolUsertoursStepShownRequest](docs/Model/ToolUsertoursStepShownRequest.md)
- [ToolXmldbInvokeMoveActionRequest](docs/Model/ToolXmldbInvokeMoveActionRequest.md)

## Authorization

Authentication schemes defined for the API:
### apiKey

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Tests

To run the tests, use:

```bash
composer install
vendor/bin/phpunit
```

## Author



## About this package

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `4.3.4`
    - Generator version: `7.5.0`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
