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
    /// CoreSearchViewResultsRequest
    /// </summary>
    [DataContract(Name = "core_search_view_results_request")]
    public partial class CoreSearchViewResultsRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreSearchViewResultsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreSearchViewResultsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreSearchViewResultsRequest" /> class.
        /// </summary>
        /// <param name="filters">filters.</param>
        /// <param name="page">results page number starting from 0, defaults to the first page (default to 0).</param>
        /// <param name="query">the search query (required).</param>
        public CoreSearchViewResultsRequest(CoreSearchViewResultsRequestFilters filters = default(CoreSearchViewResultsRequestFilters), int page = 0, string query = default(string))
        {
            // to ensure "query" is required (not null)
            if (query == null)
            {
                throw new ArgumentNullException("query is a required property for CoreSearchViewResultsRequest and cannot be null");
            }
            this.Query = query;
            this.Filters = filters;
            this.Page = page;
        }

        /// <summary>
        /// Gets or Sets Filters
        /// </summary>
        [DataMember(Name = "filters", EmitDefaultValue = false)]
        public CoreSearchViewResultsRequestFilters Filters { get; set; }

        /// <summary>
        /// results page number starting from 0, defaults to the first page
        /// </summary>
        /// <value>results page number starting from 0, defaults to the first page</value>
        [DataMember(Name = "page", EmitDefaultValue = false)]
        public int Page { get; set; }

        /// <summary>
        /// the search query
        /// </summary>
        /// <value>the search query</value>
        [DataMember(Name = "query", IsRequired = true, EmitDefaultValue = true)]
        public string Query { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreSearchViewResultsRequest {\n");
            sb.Append("  Filters: ").Append(Filters).Append("\n");
            sb.Append("  Page: ").Append(Page).Append("\n");
            sb.Append("  Query: ").Append(Query).Append("\n");
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
