# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.mod_wiki_api import ModWikiApi


class TestModWikiApi(unittest.TestCase):
    """ModWikiApi unit test stubs"""

    def setUp(self) -> None:
        self.api = ModWikiApi()

    def tearDown(self) -> None:
        pass

    def test_mod_wiki_edit_page(self) -> None:
        """Test case for mod_wiki_edit_page

        Save the contents of a page.
        """
        pass

    def test_mod_wiki_get_page_contents(self) -> None:
        """Test case for mod_wiki_get_page_contents

        Returns the contents of a page.
        """
        pass

    def test_mod_wiki_get_page_for_editing(self) -> None:
        """Test case for mod_wiki_get_page_for_editing

        Locks and retrieves info of page-section to be edited.
        """
        pass

    def test_mod_wiki_get_subwiki_files(self) -> None:
        """Test case for mod_wiki_get_subwiki_files

        Returns the list of files for a specific subwiki.
        """
        pass

    def test_mod_wiki_get_subwiki_pages(self) -> None:
        """Test case for mod_wiki_get_subwiki_pages

        Returns the list of pages for a specific subwiki.
        """
        pass

    def test_mod_wiki_get_subwikis(self) -> None:
        """Test case for mod_wiki_get_subwikis

        Returns the list of subwikis the user can see in a specific wiki.
        """
        pass

    def test_mod_wiki_get_wikis_by_courses(self) -> None:
        """Test case for mod_wiki_get_wikis_by_courses

        Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.
        """
        pass

    def test_mod_wiki_new_page(self) -> None:
        """Test case for mod_wiki_new_page

        Create a new page in a subwiki.
        """
        pass

    def test_mod_wiki_view_page(self) -> None:
        """Test case for mod_wiki_view_page

        Trigger the page viewed event and update the module completion status.
        """
        pass

    def test_mod_wiki_view_wiki(self) -> None:
        """Test case for mod_wiki_view_wiki

        Trigger the course module viewed event and update the module completion status.
        """
        pass


if __name__ == '__main__':
    unittest.main()