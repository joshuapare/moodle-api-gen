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
    /// CoreCompetencyListCompetenciesRequest
    /// </summary>
    [DataContract(Name = "core_competency_list_competencies_request")]
    public partial class CoreCompetencyListCompetenciesRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyListCompetenciesRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCompetencyListCompetenciesRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyListCompetenciesRequest" /> class.
        /// </summary>
        /// <param name="filters">filters (required).</param>
        /// <param name="limit">Return this number of records at most. (default to 0).</param>
        /// <param name="order">Sort direction. Should be either ASC or DESC (default to &quot;&quot;).</param>
        /// <param name="skip">Skip this number of records before returning results (default to 0).</param>
        /// <param name="sort">Column to sort by. (default to &quot;&quot;).</param>
        public CoreCompetencyListCompetenciesRequest(List<CoreCompetencyListCompetenciesRequestFiltersInner> filters = default(List<CoreCompetencyListCompetenciesRequestFiltersInner>), int limit = 0, string order = @"", int skip = 0, string sort = @"")
        {
            // to ensure "filters" is required (not null)
            if (filters == null)
            {
                throw new ArgumentNullException("filters is a required property for CoreCompetencyListCompetenciesRequest and cannot be null");
            }
            this.Filters = filters;
            this.Limit = limit;
            // use default value if no "order" provided
            this.Order = order ?? @"";
            this.Skip = skip;
            // use default value if no "sort" provided
            this.Sort = sort ?? @"";
        }

        /// <summary>
        /// Gets or Sets Filters
        /// </summary>
        [DataMember(Name = "filters", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreCompetencyListCompetenciesRequestFiltersInner> Filters { get; set; }

        /// <summary>
        /// Return this number of records at most.
        /// </summary>
        /// <value>Return this number of records at most.</value>
        [DataMember(Name = "limit", EmitDefaultValue = false)]
        public int Limit { get; set; }

        /// <summary>
        /// Sort direction. Should be either ASC or DESC
        /// </summary>
        /// <value>Sort direction. Should be either ASC or DESC</value>
        [DataMember(Name = "order", EmitDefaultValue = false)]
        public string Order { get; set; }

        /// <summary>
        /// Skip this number of records before returning results
        /// </summary>
        /// <value>Skip this number of records before returning results</value>
        [DataMember(Name = "skip", EmitDefaultValue = false)]
        public int Skip { get; set; }

        /// <summary>
        /// Column to sort by.
        /// </summary>
        /// <value>Column to sort by.</value>
        [DataMember(Name = "sort", EmitDefaultValue = false)]
        public string Sort { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCompetencyListCompetenciesRequest {\n");
            sb.Append("  Filters: ").Append(Filters).Append("\n");
            sb.Append("  Limit: ").Append(Limit).Append("\n");
            sb.Append("  Order: ").Append(Order).Append("\n");
            sb.Append("  Skip: ").Append(Skip).Append("\n");
            sb.Append("  Sort: ").Append(Sort).Append("\n");
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