# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_grades_get_enrolled_users_for_selector200_response_users_inner import CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner

class TestCoreGradesGetEnrolledUsersForSelector200ResponseUsersInner(unittest.TestCase):
    """CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner:
        """Test CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner`
        """
        model = CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner()
        if include_optional:
            return CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner(
                address = 'null',
                auth = 'null',
                calendartype = 'null',
                city = 'null',
                confirmed = True,
                country = 'null',
                customfields = [
                    openapi_client.models.core_grades_get_enrolled_users_for_selector_200_response_users_inner_customfields_inner.core_grades_get_enrolled_users_for_selector_200_response_users_inner_customfields_inner(
                        displayvalue = 'null', 
                        name = '', 
                        shortname = '', 
                        type = '', 
                        value = 'null', )
                    ],
                department = 'null',
                description = 'null',
                descriptionformat = 56,
                email = '',
                firstaccess = 56,
                firstname = '',
                fullname = 'null',
                id = 56,
                idnumber = 'null',
                institution = 'null',
                interests = 'null',
                lang = 'null',
                lastaccess = 56,
                lastname = '',
                mailformat = 56,
                phone1 = 'null',
                phone2 = 'null',
                preferences = [
                    openapi_client.models.core_grades_get_enrolled_users_for_selector_200_response_users_inner_preferences_inner.core_grades_get_enrolled_users_for_selector_200_response_users_inner_preferences_inner(
                        name = 'null', 
                        value = 'null', )
                    ],
                profileimageurl = 'null',
                profileimageurlsmall = 'null',
                suspended = True,
                theme = 'null',
                timezone = 'null',
                username = 'null'
            )
        else:
            return CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner(
        )
        """

    def testCoreGradesGetEnrolledUsersForSelector200ResponseUsersInner(self):
        """Test CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()