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
    /// CoreGradingGetDefinitions200ResponseAreasInner
    /// </summary>
    [DataContract(Name = "core_grading_get_definitions_200_response_areas_inner")]
    public partial class CoreGradingGetDefinitions200ResponseAreasInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGradingGetDefinitions200ResponseAreasInner" /> class.
        /// </summary>
        /// <param name="activemethod">active method (default to &quot;null&quot;).</param>
        /// <param name="areaname">area name.</param>
        /// <param name="cmid">course module id.</param>
        /// <param name="component">component name (default to &quot;null&quot;).</param>
        /// <param name="contextid">context id.</param>
        /// <param name="definitions">definitions.</param>
        public CoreGradingGetDefinitions200ResponseAreasInner(string activemethod = @"null", string areaname = default(string), int cmid = default(int), string component = @"null", int contextid = default(int), List<CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner> definitions = default(List<CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner>))
        {
            // use default value if no "activemethod" provided
            this.Activemethod = activemethod ?? @"null";
            this.Areaname = areaname;
            this.Cmid = cmid;
            // use default value if no "component" provided
            this.Component = component ?? @"null";
            this.Contextid = contextid;
            this.Definitions = definitions;
        }

        /// <summary>
        /// active method
        /// </summary>
        /// <value>active method</value>
        [DataMember(Name = "activemethod", EmitDefaultValue = false)]
        public string Activemethod { get; set; }

        /// <summary>
        /// area name
        /// </summary>
        /// <value>area name</value>
        [DataMember(Name = "areaname", EmitDefaultValue = false)]
        public string Areaname { get; set; }

        /// <summary>
        /// course module id
        /// </summary>
        /// <value>course module id</value>
        [DataMember(Name = "cmid", EmitDefaultValue = false)]
        public int Cmid { get; set; }

        /// <summary>
        /// component name
        /// </summary>
        /// <value>component name</value>
        [DataMember(Name = "component", EmitDefaultValue = false)]
        public string Component { get; set; }

        /// <summary>
        /// context id
        /// </summary>
        /// <value>context id</value>
        [DataMember(Name = "contextid", EmitDefaultValue = false)]
        public int Contextid { get; set; }

        /// <summary>
        /// Gets or Sets Definitions
        /// </summary>
        [DataMember(Name = "definitions", EmitDefaultValue = false)]
        public List<CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner> Definitions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGradingGetDefinitions200ResponseAreasInner {\n");
            sb.Append("  Activemethod: ").Append(Activemethod).Append("\n");
            sb.Append("  Areaname: ").Append(Areaname).Append("\n");
            sb.Append("  Cmid: ").Append(Cmid).Append("\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Contextid: ").Append(Contextid).Append("\n");
            sb.Append("  Definitions: ").Append(Definitions).Append("\n");
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
