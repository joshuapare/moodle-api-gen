# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_grades_get_gradeitems200_response import CoreGradesGetGradeitems200Response

class TestCoreGradesGetGradeitems200Response(unittest.TestCase):
    """CoreGradesGetGradeitems200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreGradesGetGradeitems200Response:
        """Test CoreGradesGetGradeitems200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreGradesGetGradeitems200Response`
        """
        model = CoreGradesGetGradeitems200Response()
        if include_optional:
            return CoreGradesGetGradeitems200Response(
                grade_items = [
                    openapi_client.models.core_grades_get_gradeitems_200_response_grade_items_inner.core_grades_get_gradeitems_200_response_gradeItems_inner(
                        category = 'null', 
                        id = 'null', 
                        itemname = 'null', )
                    ],
                warnings = [
                    openapi_client.models.auth_email_signup_user_200_response_warnings_inner.auth_email_signup_user_200_response_warnings_inner(
                        item = '', 
                        itemid = 56, 
                        message = '', 
                        warningcode = '', )
                    ]
            )
        else:
            return CoreGradesGetGradeitems200Response(
                grade_items = [
                    openapi_client.models.core_grades_get_gradeitems_200_response_grade_items_inner.core_grades_get_gradeitems_200_response_gradeItems_inner(
                        category = 'null', 
                        id = 'null', 
                        itemname = 'null', )
                    ],
        )
        """

    def testCoreGradesGetGradeitems200Response(self):
        """Test CoreGradesGetGradeitems200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()