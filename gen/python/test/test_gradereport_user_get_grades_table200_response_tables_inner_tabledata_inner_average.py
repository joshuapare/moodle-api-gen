# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.gradereport_user_get_grades_table200_response_tables_inner_tabledata_inner_average import GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage

class TestGradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage(unittest.TestCase):
    """GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage:
        """Test GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage`
        """
        model = GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage()
        if include_optional:
            return GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage(
                var_class = 'null',
                content = 'null',
                headers = 'null'
            )
        else:
            return GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage(
                var_class = 'null',
                content = 'null',
                headers = 'null',
        )
        """

    def testGradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage(self):
        """Test GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()