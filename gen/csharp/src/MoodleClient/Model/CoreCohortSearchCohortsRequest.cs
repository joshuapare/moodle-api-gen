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
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// CoreCohortSearchCohortsRequest
    /// </summary>
    [DataContract(Name = "core_cohort_search_cohorts_request")]
    public partial class CoreCohortSearchCohortsRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCohortSearchCohortsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCohortSearchCohortsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCohortSearchCohortsRequest" /> class.
        /// </summary>
        /// <param name="context">context (required).</param>
        /// <param name="includes">What other contexts to fetch the frameworks from. (all, parents, self) (default to &quot;parents&quot;).</param>
        /// <param name="limitfrom">limitfrom we are fetching the records from (default to 0).</param>
        /// <param name="limitnum">Number of records to fetch (default to 25).</param>
        /// <param name="query">Query string (required) (default to &quot;null&quot;).</param>
        public CoreCohortSearchCohortsRequest(CoreCohortSearchCohortsRequestContext context = default(CoreCohortSearchCohortsRequestContext), string includes = @"parents", int limitfrom = 0, int limitnum = 25, string query = @"null")
        {
            // to ensure "context" is required (not null)
            if (context == null)
            {
                throw new ArgumentNullException("context is a required property for CoreCohortSearchCohortsRequest and cannot be null");
            }
            this.Context = context;
            // to ensure "query" is required (not null)
            if (query == null)
            {
                throw new ArgumentNullException("query is a required property for CoreCohortSearchCohortsRequest and cannot be null");
            }
            this.Query = query;
            // use default value if no "includes" provided
            this.Includes = includes ?? @"parents";
            this.Limitfrom = limitfrom;
            this.Limitnum = limitnum;
        }

        /// <summary>
        /// Gets or Sets Context
        /// </summary>
        [DataMember(Name = "context", IsRequired = true, EmitDefaultValue = true)]
        public CoreCohortSearchCohortsRequestContext Context { get; set; }

        /// <summary>
        /// What other contexts to fetch the frameworks from. (all, parents, self)
        /// </summary>
        /// <value>What other contexts to fetch the frameworks from. (all, parents, self)</value>
        [DataMember(Name = "includes", EmitDefaultValue = false)]
        public string Includes { get; set; }

        /// <summary>
        /// limitfrom we are fetching the records from
        /// </summary>
        /// <value>limitfrom we are fetching the records from</value>
        [DataMember(Name = "limitfrom", EmitDefaultValue = false)]
        public int Limitfrom { get; set; }

        /// <summary>
        /// Number of records to fetch
        /// </summary>
        /// <value>Number of records to fetch</value>
        [DataMember(Name = "limitnum", EmitDefaultValue = false)]
        public int Limitnum { get; set; }

        /// <summary>
        /// Query string
        /// </summary>
        /// <value>Query string</value>
        [DataMember(Name = "query", IsRequired = true, EmitDefaultValue = true)]
        public string Query { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCohortSearchCohortsRequest {\n");
            sb.Append("  Context: ").Append(Context).Append("\n");
            sb.Append("  Includes: ").Append(Includes).Append("\n");
            sb.Append("  Limitfrom: ").Append(Limitfrom).Append("\n");
            sb.Append("  Limitnum: ").Append(Limitnum).Append("\n");
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
