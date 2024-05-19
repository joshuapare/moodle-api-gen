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
    /// CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon
    /// </summary>
    [DataContract(Name = "core_calendar_get_action_events_by_courses_200_response_groupedbycourse_inner_events_inner_icon")]
    public partial class CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon" /> class.
        /// </summary>
        /// <param name="alttext">alttext (required).</param>
        /// <param name="component">component (required).</param>
        /// <param name="iconclass">iconclass (required).</param>
        /// <param name="iconurl">iconurl (required).</param>
        /// <param name="key">key (required).</param>
        public CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon(string alttext = default(string), string component = default(string), string iconclass = default(string), string iconurl = default(string), string key = default(string))
        {
            // to ensure "alttext" is required (not null)
            if (alttext == null)
            {
                throw new ArgumentNullException("alttext is a required property for CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon and cannot be null");
            }
            this.Alttext = alttext;
            // to ensure "component" is required (not null)
            if (component == null)
            {
                throw new ArgumentNullException("component is a required property for CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon and cannot be null");
            }
            this.Component = component;
            // to ensure "iconclass" is required (not null)
            if (iconclass == null)
            {
                throw new ArgumentNullException("iconclass is a required property for CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon and cannot be null");
            }
            this.Iconclass = iconclass;
            // to ensure "iconurl" is required (not null)
            if (iconurl == null)
            {
                throw new ArgumentNullException("iconurl is a required property for CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon and cannot be null");
            }
            this.Iconurl = iconurl;
            // to ensure "key" is required (not null)
            if (key == null)
            {
                throw new ArgumentNullException("key is a required property for CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon and cannot be null");
            }
            this.Key = key;
        }

        /// <summary>
        /// alttext
        /// </summary>
        /// <value>alttext</value>
        [DataMember(Name = "alttext", IsRequired = true, EmitDefaultValue = true)]
        public string Alttext { get; set; }

        /// <summary>
        /// component
        /// </summary>
        /// <value>component</value>
        [DataMember(Name = "component", IsRequired = true, EmitDefaultValue = true)]
        public string Component { get; set; }

        /// <summary>
        /// iconclass
        /// </summary>
        /// <value>iconclass</value>
        [DataMember(Name = "iconclass", IsRequired = true, EmitDefaultValue = true)]
        public string Iconclass { get; set; }

        /// <summary>
        /// iconurl
        /// </summary>
        /// <value>iconurl</value>
        [DataMember(Name = "iconurl", IsRequired = true, EmitDefaultValue = true)]
        public string Iconurl { get; set; }

        /// <summary>
        /// key
        /// </summary>
        /// <value>key</value>
        [DataMember(Name = "key", IsRequired = true, EmitDefaultValue = true)]
        public string Key { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon {\n");
            sb.Append("  Alttext: ").Append(Alttext).Append("\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Iconclass: ").Append(Iconclass).Append("\n");
            sb.Append("  Iconurl: ").Append(Iconurl).Append("\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
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
