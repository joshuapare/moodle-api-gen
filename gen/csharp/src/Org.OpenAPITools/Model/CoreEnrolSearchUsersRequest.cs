/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// CoreEnrolSearchUsersRequest
    /// </summary>
    [DataContract(Name = "core_enrol_search_users_request")]
    public partial class CoreEnrolSearchUsersRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreEnrolSearchUsersRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreEnrolSearchUsersRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreEnrolSearchUsersRequest" /> class.
        /// </summary>
        /// <param name="contextid">Context ID (default to null).</param>
        /// <param name="courseid">course id (required).</param>
        /// <param name="page">Page number (required).</param>
        /// <param name="perpage">Number per page (required).</param>
        /// <param name="search">query (required).</param>
        /// <param name="searchanywhere">find a match anywhere, or only at the beginning (required).</param>
        public CoreEnrolSearchUsersRequest(int contextid = null, int courseid = default(int), int page = default(int), int perpage = default(int), string search = default(string), bool searchanywhere = default(bool))
        {
            this.Courseid = courseid;
            this.Page = page;
            this.Perpage = perpage;
            // to ensure "search" is required (not null)
            if (search == null)
            {
                throw new ArgumentNullException("search is a required property for CoreEnrolSearchUsersRequest and cannot be null");
            }
            this.Search = search;
            this.Searchanywhere = searchanywhere;
            this.Contextid = contextid;
        }

        /// <summary>
        /// Context ID
        /// </summary>
        /// <value>Context ID</value>
        [DataMember(Name = "contextid", EmitDefaultValue = false)]
        public int Contextid { get; set; }

        /// <summary>
        /// course id
        /// </summary>
        /// <value>course id</value>
        [DataMember(Name = "courseid", IsRequired = true, EmitDefaultValue = true)]
        public int Courseid { get; set; }

        /// <summary>
        /// Page number
        /// </summary>
        /// <value>Page number</value>
        [DataMember(Name = "page", IsRequired = true, EmitDefaultValue = true)]
        public int Page { get; set; }

        /// <summary>
        /// Number per page
        /// </summary>
        /// <value>Number per page</value>
        [DataMember(Name = "perpage", IsRequired = true, EmitDefaultValue = true)]
        public int Perpage { get; set; }

        /// <summary>
        /// query
        /// </summary>
        /// <value>query</value>
        [DataMember(Name = "search", IsRequired = true, EmitDefaultValue = true)]
        public string Search { get; set; }

        /// <summary>
        /// find a match anywhere, or only at the beginning
        /// </summary>
        /// <value>find a match anywhere, or only at the beginning</value>
        [DataMember(Name = "searchanywhere", IsRequired = true, EmitDefaultValue = true)]
        public bool Searchanywhere { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreEnrolSearchUsersRequest {\n");
            sb.Append("  Contextid: ").Append(Contextid).Append("\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Page: ").Append(Page).Append("\n");
            sb.Append("  Perpage: ").Append(Perpage).Append("\n");
            sb.Append("  Search: ").Append(Search).Append("\n");
            sb.Append("  Searchanywhere: ").Append(Searchanywhere).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
