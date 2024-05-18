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
    /// CoreReportbuilderFiltersAdd200Response
    /// </summary>
    [DataContract(Name = "core_reportbuilder_filters_add_200_response")]
    public partial class CoreReportbuilderFiltersAdd200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreReportbuilderFiltersAdd200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreReportbuilderFiltersAdd200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreReportbuilderFiltersAdd200Response" /> class.
        /// </summary>
        /// <param name="activefilters">activefilters (required).</param>
        /// <param name="availablefilters">availablefilters (required).</param>
        /// <param name="hasactivefilters">hasactivefilters (required) (default to null).</param>
        /// <param name="hasavailablefilters">hasavailablefilters (required) (default to null).</param>
        /// <param name="helpicon">helpicon (required).</param>
        public CoreReportbuilderFiltersAdd200Response(List<CoreReportbuilderFiltersAdd200ResponseActivefiltersInner> activefilters = default(List<CoreReportbuilderFiltersAdd200ResponseActivefiltersInner>), List<CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner> availablefilters = default(List<CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner>), bool hasactivefilters = null, bool hasavailablefilters = null, string helpicon = default(string))
        {
            // to ensure "activefilters" is required (not null)
            if (activefilters == null)
            {
                throw new ArgumentNullException("activefilters is a required property for CoreReportbuilderFiltersAdd200Response and cannot be null");
            }
            this.Activefilters = activefilters;
            // to ensure "availablefilters" is required (not null)
            if (availablefilters == null)
            {
                throw new ArgumentNullException("availablefilters is a required property for CoreReportbuilderFiltersAdd200Response and cannot be null");
            }
            this.Availablefilters = availablefilters;
            this.Hasactivefilters = hasactivefilters;
            this.Hasavailablefilters = hasavailablefilters;
            // to ensure "helpicon" is required (not null)
            if (helpicon == null)
            {
                throw new ArgumentNullException("helpicon is a required property for CoreReportbuilderFiltersAdd200Response and cannot be null");
            }
            this.Helpicon = helpicon;
        }

        /// <summary>
        /// Gets or Sets Activefilters
        /// </summary>
        [DataMember(Name = "activefilters", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreReportbuilderFiltersAdd200ResponseActivefiltersInner> Activefilters { get; set; }

        /// <summary>
        /// Gets or Sets Availablefilters
        /// </summary>
        [DataMember(Name = "availablefilters", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner> Availablefilters { get; set; }

        /// <summary>
        /// hasactivefilters
        /// </summary>
        /// <value>hasactivefilters</value>
        [DataMember(Name = "hasactivefilters", IsRequired = true, EmitDefaultValue = true)]
        public bool Hasactivefilters { get; set; }

        /// <summary>
        /// hasavailablefilters
        /// </summary>
        /// <value>hasavailablefilters</value>
        [DataMember(Name = "hasavailablefilters", IsRequired = true, EmitDefaultValue = true)]
        public bool Hasavailablefilters { get; set; }

        /// <summary>
        /// helpicon
        /// </summary>
        /// <value>helpicon</value>
        [DataMember(Name = "helpicon", IsRequired = true, EmitDefaultValue = true)]
        public string Helpicon { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreReportbuilderFiltersAdd200Response {\n");
            sb.Append("  Activefilters: ").Append(Activefilters).Append("\n");
            sb.Append("  Availablefilters: ").Append(Availablefilters).Append("\n");
            sb.Append("  Hasactivefilters: ").Append(Hasactivefilters).Append("\n");
            sb.Append("  Hasavailablefilters: ").Append(Hasavailablefilters).Append("\n");
            sb.Append("  Helpicon: ").Append(Helpicon).Append("\n");
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
