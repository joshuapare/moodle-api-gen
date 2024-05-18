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
    /// CoreSearchViewResultsRequestFilters
    /// </summary>
    [DataContract(Name = "core_search_view_results_request_filters")]
    public partial class CoreSearchViewResultsRequestFilters : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreSearchViewResultsRequestFilters" /> class.
        /// </summary>
        /// <param name="areaids">areaids.</param>
        /// <param name="courseids">courseids.</param>
        /// <param name="timeend">docs modified before this date (default to 0).</param>
        /// <param name="timestart">docs modified after this date (default to 0).</param>
        /// <param name="title">result title.</param>
        public CoreSearchViewResultsRequestFilters(List<Object> areaids = default(List<Object>), List<Object> courseids = default(List<Object>), int timeend = 0, int timestart = 0, string title = default(string))
        {
            this.Areaids = areaids;
            this.Courseids = courseids;
            this.Timeend = timeend;
            this.Timestart = timestart;
            this.Title = title;
        }

        /// <summary>
        /// Gets or Sets Areaids
        /// </summary>
        [DataMember(Name = "areaids", EmitDefaultValue = false)]
        public List<Object> Areaids { get; set; }

        /// <summary>
        /// Gets or Sets Courseids
        /// </summary>
        [DataMember(Name = "courseids", EmitDefaultValue = false)]
        public List<Object> Courseids { get; set; }

        /// <summary>
        /// docs modified before this date
        /// </summary>
        /// <value>docs modified before this date</value>
        [DataMember(Name = "timeend", EmitDefaultValue = false)]
        public int Timeend { get; set; }

        /// <summary>
        /// docs modified after this date
        /// </summary>
        /// <value>docs modified after this date</value>
        [DataMember(Name = "timestart", EmitDefaultValue = false)]
        public int Timestart { get; set; }

        /// <summary>
        /// result title
        /// </summary>
        /// <value>result title</value>
        [DataMember(Name = "title", EmitDefaultValue = false)]
        public string Title { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreSearchViewResultsRequestFilters {\n");
            sb.Append("  Areaids: ").Append(Areaids).Append("\n");
            sb.Append("  Courseids: ").Append(Courseids).Append("\n");
            sb.Append("  Timeend: ").Append(Timeend).Append("\n");
            sb.Append("  Timestart: ").Append(Timestart).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
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
